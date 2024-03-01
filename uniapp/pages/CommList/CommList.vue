<template>
	<div class="title_head"></div>
	<view class="head">
		<uni-row class="demo-uni-row">
			<uni-col :span="4">
			</uni-col>
			<uni-col :span="16">
				<view>
					<uni-search-bar radius="100" placeholder="搜索" clearButton="none" cancelButton="none"
						@confirm="search" />
				</view>
			</uni-col>
		</uni-row>
		<scroll-view class="scroll-view" scroll-x="true" scroll-left="100%" @scrolltolower="scrolltolower">
			<view class="item" v-for="(item,index) in ListTab" :key="index">
				<div class="ImgwithText" @click="isactive(index)">
					<div class="img" :class="{ 'isactive': isActiveIndex === index }">
						<image src="../../static/c1.png"></image>
					</div>
					<p class="Text">{{item.name}}</p>
				</div>

			</view>
		</scroll-view>
	</view>
	<view class="body">

		<div class="seall">
			<scroll-view class="scroll-view" scroll-x="true" @scrolltolower="scrolltolower">
				<view class="item" v-for="(item,index) in ListTab1" :key="index">
					<div class="ImgwithText" @click="isactiveseall(index)">
						<div class="img-seall">
							<p style="float: left; color: black;">{{item.name}}</p>
							<image src="../../static/c2.png" style="float: right;"></image>
						</div>
					</div>
				</view>
			</scroll-view>
		</div>
		<div class="tuijian-news">
			<view class="item">
				<div class="ImgwithText">
					<div class="tuijian" @click='tuijian(1)' :class="{'isactive-tuijian-news':isactive12==1}">
						<p>推荐</p>
					</div>
					<div class="news" @click='news(2)' :class="{'isactive-tuijian-news':isactive12==2}">
						<p>最新</p>
					</div>
				</div>
			</view>
			<view class="">
				<scroll-view class="scroll-view" @scrolltolower="scrolltolower">
					<view class="newsortuijianitem" v-for="(item,index) in ListTab" :key="index">
						<div class="newsortuijian" @click="isactive(index)">
							<div class="newsortuijianimg" :style="{ width: this.Syswidth + 'px' }">
								<image src="../../static/c1.png" :style="{ width: this.Syswidth + 'px' }"></image>
								<p class="">{{item.name}}</p>
							</div>
						</div>

					</view>
				</scroll-view>
			</view>
		</div>


	</view>

</template>

<script>
	export default {
		data() {
			return {
				Syswidth: uni.getSystemInfoSync().screenWidth / 2 - 20,
				Sysheight: null,

				ListTab: [{
					name: '111111'
				}, {
					name: '11111'
				}, {
					name: '111111'
				}, {
					name: '111111'
				}, {
					name: '11111'
				}, {
					name: '11111'
				}],
				ListTab1: [{
					name: '111111'
				}, {
					name: '11111'
				}, {
					name: '111111'
				}, {
					name: '111111'
				}, {
					name: '11111'
				}, {
					name: '11111'
				}],
				isActiveIndex: 1,
				isactive12: 1,
			}
		},
		onLoad() {

		},
		mounted() {
			console.log(this.Syswidth)
		},
		methods: {

			search(res) {
				console.log(res.value)
			},
			isactive(index) {
				console.log(index)
				this.isActiveIndex = index
			},
			isactiveseall(index) {

			},
			tuijian(res) {
				this.isactive12 = res
			},
			news(res) {
				this.isactive12 = res
			},


		}
	}
</script>

<style>
	@import url("ComList.css");

	.title_head {}

	.head {
		margin-top: 20px;
	}

	.body {
		background-color: white;
		border: 0px solid;
		border-radius: 5px;
	}

	page {
		background-image: linear-gradient(0deg, #fbc2eb 0%, #a6c1ee 100%)
	}
</style>