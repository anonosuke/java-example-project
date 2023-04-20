■Java Eclipse IDE 2023の環境構築方法

1. Eclipse IDE 2023のダウンロード
　今回はEclipse本体と、日本語化を行うためのPleiades プラグイン、いくつかの便利なプラグインが、
　まとまった、パッケージ Pleiades All in Oneを使用した。ダウンロード先は以下。
	https://mergedoc.osdn.jp/
	
2.1でダウンロードしたexeファイルを実行する。表示された画面に従って、任意のＣドライブ上に解凍する。
  例)C:\java\pleiades\2023-03
  
3.2で解凍したファイルの/eclipse/eclipse.exeを実行しeclipseを実行する。
　初めての実行であれば、数分時間がかかる。

4.oracleJDKをインストールする。
　今回はJavs20を下記サイトよりインストール。
　https://www.oracle.com/java/technologies/downloads/#jdk20-windows
  任意の場所にインストールしたzipを解凍
  例)C:\java\jdk
  
5.下記手順で、JDKをEclipseに設定する。
　1.メニューバーから、ウィンドウ→設定をクリック
　2.左のツリーメニューから、Javs→インストール済みのJREをクリックし、追加ボタンをクリック
　3.標準VMを選択し次へをクリック
　4.JREホームのディレクトリを4でインストールしたOracleJDKのパスを設定、完了をクリック
　　例)C:\java\jdk\jdk-20
　5.追加OracleJDKを選択して、適応して閉じる。


■サーブレット、JSPを用いたHello World

1.Eclipseのメニューバーから、ファイル→新規→動的Webプロジェクトを選択

2.プロジェクト名は任意 例)HelloWorld、ターゲットランタイムは今回はTomcat9(Java17)、動的Webモジュールパッケージは4.0
　他はデフォルト設定で次へをクリック

3.ビルドパス上のソース・フォルダはデフォルトのまま次へ→web.xmlデプロイメント記述子の生成にチェック完了

4.サーブレットを作成する。プロジェクト内の、src/main/javaを右クリック→新規→その他をクリック

5.検索ウィンドウにサーブレットと入力→サーブレットを選択→次へ

6.Javaパッケージは、controllerと入力、クラス名は任意　例)HelloWorld→次へ→次へ
　→スーパークラスからのコンストラクターと、doPostのチェックを外して、完了をクリック

7.JSPを作成する。プロジェクト内のsrc/main/webappのwebappを右クリック→新規→その他をクリック

8.検索ウィンドウにJSPと入力→JSPファイルトを選択→次へ→webappを選択して完了をクリック

9作成されたJSPのHTMLのbodyにHello Worldを入力

10.メニューバーの実行→実行をクリック

11.tomcatのデフォルト設定のhttp://localhost:8080/にて、webサーバーが立ち上がり、
　ブラウザでhttp://localhost:8080/HelloWorld/HelloWorld.jspにアクセスするとHelloWorldを確認出来る。

12.webサーバーを閉じるには、コンソールの右上の中止をクリック。

参考サイト：
https://uha-blog.com/java/2022-eclipse-web-app/