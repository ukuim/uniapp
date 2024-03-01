<template>
	<view class="head">
		<view class="" style="margin-top: 100px;">
			<uni-card :title="userData.name" thumbnail="/static/c1.png" :isFull="true" :sub-title="userData.id"
				@click="login">
				<text class="uni-body">{{userData.info}}</text>
			</uni-card>
		</view>

	</view>


</template>

<script>
	export default {
		data() {
			return {
				userData: {
					name: uni.getStorageInfoSync("userData").name || "未登录",
					id: uni.getStorageInfoSync("userData").id || "未登录",
					info: uni.getStorageInfoSync("userData").info || "未登录",
					cover: uni.getStorageInfoSync("userData").cover || "/static/c1.png",
				}

			}
		},
		methods: {
			login() {
				wx.login({
					success(res) {
						if (res.code) {
							console.log(res.code)
							wx.request({
								url:'https://1dd63ee4.r24.cpolar.top/login/user', 
								method: "GET",
								data: {
									js_code: res.code,
								},
								success(res) {
									console.log('登录成功', res.data);
									uni.setStorageSync("userData")
									
								},
								fail(err) {
									console.error('登录失败', err);
								}
							});
						} else {
							console.log('登录失败！' + res.errMsg)
						}
					}
				})

			}

		}
	}
</script>

<style>
	@import url('MyList.css');

	.head {}

	page {
		background-image: linear-gradient(0deg, #fbc2eb 0%, #a6c1ee 100%)
	}
</style>