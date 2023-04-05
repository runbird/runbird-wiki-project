<template>
  <a-layout>
    <a-layout-sider width="200" style="background: #fff">
      <a-menu
          v-model:selectedKeys="selectedKeys2"
          v-model:openKeys="openKeys"
          mode="inline"
          :style="{ height: '100%', borderRight: 0 }"
      >
        <a-sub-menu key="sub1">
          <template #title>
              <span>
                <user-outlined/>
                subnav 1
              </span>
          </template>
          <a-menu-item key="1">option1</a-menu-item>
          <a-menu-item key="2">option2</a-menu-item>
          <a-menu-item key="3">option3</a-menu-item>
          <a-menu-item key="4">option4</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub2">
          <template #title>
              <span>
                <laptop-outlined/>
                subnav 2
              </span>
          </template>
          <a-menu-item key="5">option5</a-menu-item>
          <a-menu-item key="6">option6</a-menu-item>
          <a-menu-item key="7">option7</a-menu-item>
          <a-menu-item key="8">option8</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub3">
          <template #title>
              <span>
                <notification-outlined/>
                subnav 3
              </span>
          </template>
          <a-menu-item key="9">option9</a-menu-item>
          <a-menu-item key="10">option10</a-menu-item>
          <a-menu-item key="11">option11</a-menu-item>
          <a-menu-item key="12">option12</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout style="padding: 0 24px 24px">
      <a-breadcrumb style="margin: 16px 0">
        <a-breadcrumb-item>Home</a-breadcrumb-item>
        <a-breadcrumb-item>List</a-breadcrumb-item>
        <a-breadcrumb-item>App</a-breadcrumb-item>
      </a-breadcrumb>
      <a-layout-content
          :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
      >
        <pre>
{{ ebooks }}
{{ ebooks2 }}
        </pre>
      </a-layout-content>
    </a-layout>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, onMounted, reactive, ref, toRef} from 'vue';
// import HelloWorld from '@/components/HelloWorld.vue'; // @ is an alias to /src
import axios from 'axios';

export default defineComponent({
  name: 'HomeView',
  components: {
    // HelloWorld,
  },
  //setup执行的时候界面还没渲染好
  setup() {
    console.log("setup")
    // axios.get("/hello").then(
    //     (function (response) {
    //       console.log(response);
    //     })
    // )
    //ref和reactive都可以使用
    const ebooks = ref();
    const ebooks1 = reactive({books: []})
    //初始化的参数方法尽量进入 onMounted
    onMounted(() => {
      axios.get("http://127.0.0.1:8880/ebook/list?name=Spring").then((response) => {
        const data = response.data;
        ebooks.value = data.content;
        ebooks1.books = data.content;
        console.log(response);
      });
    })

    return {
      ebooks,
      ebooks2: toRef(ebooks1, "books")
    }
  },
});
</script>
