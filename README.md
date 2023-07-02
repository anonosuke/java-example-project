# Java Eclipse IDE 2023の環境構築方法

## 1. Eclipse IDE 2023のダウンロード

Eclipse本体と、日本語化を行うためのPleiades プラグイン、いくつかの便利なプラグインがまとまった、パッケージ Pleiades All in Oneを使用します。ダウンロード先は以下のリンクから行います。

- [Download Eclipse](https://mergedoc.osdn.jp/)

## 2. ダウンロードしたexeファイルを実行

1でダウンロードしたexeファイルを実行します。表示された画面に従って、任意のＣドライブ上に解凍します。

例： `C:\java\pleiades\2023-03`

## 3. eclipse.exeの実行

2で解凍したファイルの `/eclipse/eclipse.exe` を実行し、eclipseを起動します。初めての実行であれば、数分時間がかかります。

## 4. oracleJDKのインストール

oracleJDK（Javs20）を下記サイトよりインストールします。

- [Download Oracle JDK](https://www.oracle.com/java/technologies/downloads/#jdk20-windows)

任意の場所にインストールしたzipを解凍します。

例： `C:\java\jdk`

## 5. JDKをEclipseに設定

下記手順で、JDKをEclipseに設定します。

1. メニューバーから、`ウィンドウ` → `設定` をクリック
2. 左のツリーメニューから、`Javs` → `インストール済みのJRE` をクリックし、`追加` ボタンをクリック
3. `標準VM` を選択し `次へ` をクリック
4. `JREホーム` のディレクトリを4でインストールしたOracleJDKのパスを設定、`完了` をクリック
    - 例) `C:\java\jdk\jdk-20`
5. 追加したOracleJDKを選択して、`適応して閉じる`。

## Servlet、JSPを用いたHello World

Servletはファイルの作成手順で、内容自体に意味はありません。

1. Eclipseのメニューバーから、`ファイル` → `新規` → `動的Webプロジェクト` を選択
2. プロジェクト名は任意（例：HelloWorld）、ターゲットランタイムは今回はTomcat9 (Java17)、動的Webモジュールパッケージは4.0その他はデフォルト設定で `次へ` をクリック
3. ビルドパス上のソース・フォルダはデフォルトのまま `次へ` → `web.xml` デプロイメント記述子の生成にチェック → `完了`
4. サーブレットを作成します。プロジェクト内の、`src/main/java` を右クリック → `新規` → `その他` をクリック
5. 検索ウィンドウに `サーブレット` と入力 → `サーブレット` を選択 → `次へ`
6. Javaパッケージは、`controller` と入力、クラス名は任意（例：HelloWorld） → `次へ` → `次へ`
7. スーパークラスからのコンストラクターと、`doPost` のチェックを外して、 `完了` をクリック
8. JSPを作成します。プロジェクト内の `src/main/webapp` の `webapp` を右クリック → `新規` → `その他` をクリック
9. 検索ウィンドウに `JSP` と入力 → `JSPファイル` トを選択 → `次へ` → `webapp` を選択して `完了` をクリック
10. 作成されたJSPのHTMLのbodyに `Hello World` を入力
11. メニューバーの `実行` → `実行` をクリック
12. tomcatのデフォルト設定の `http://localhost:8080/` にて、webサーバーが立ち上がり、ブラウザで `http://localhost:8080/HelloWorld/HelloWorld.jsp` にアクセスするとHelloWorldを確認出来ます。
13. webサーバーを閉じるには、コンソールの右上の `中止` をクリック。

参考サイト：
- [Eclipse Web App Guide](https://uha-blog.com/java/2022-eclipse-web-app/)
