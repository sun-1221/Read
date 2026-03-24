# Read

基于 [Legado / 开源阅读](https://github.com/gedoor/legado) 的个人定制版本。

## 简介

Read 是一款免费开源的 Android 阅读应用，基于 Legado 3.0 进行二次开发。支持自定义书源规则，抓取网页数据进行阅读。

## 主要功能

- 自定义书源规则，抓取网页数据
- 列表/网格书架自由切换
- 支持搜索及发现功能
- 订阅内容，RSS 阅读
- 替换净化，去除广告
- 支持本地 TXT、EPUB 阅读
- 高度自定义阅读界面（字体、颜色、背景、行距等）
- 多种翻页模式（覆盖、仿真、滑动、滚动）

## 技术栈

- 语言：Kotlin
- 最低 SDK：21 (Android 5.0)
- 目标 SDK：36
- 架构：arm64-v8a
- 构建工具：Gradle + KSP

## 改动说明

- 新增默认阅读源
- 修复后台听书暂停的问题

## 构建

```bash
./gradlew assembleAppRelease
```

## 致谢

本项目基于 [gedoor/legado](https://github.com/gedoor/legado) 开源项目。
