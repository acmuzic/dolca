  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>VideoPlayer/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java at master · macdonst/VideoPlayer · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <link rel="logo" type="image/svg" href="https://github-media-downloads.s3.amazonaws.com/github-logo.svg" />
    <meta property="og:image" content="https://a248.e.akamai.net/assets.github.com/images/modules/logos_page/Octocat.png">
    <link rel="assets" href="https://a248.e.akamai.net/assets.github.com/">
    <link rel="xhr-socket" href="/_sockets" />
    


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" />

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="XOxQ7oqG0gbTS6Wz9Jbzdhs4gLSsEVanpSBpTEA5mkI=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-da8afabe263d649ce7be36e0f4e768844066f8a4.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-2754cbe12e8c1e1497ed7ebed2c656fe406187dc.css" media="all" rel="stylesheet" type="text/css" />
    


      <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-44b089a6ca2f9a826ab869bed554e38863117420.js" type="text/javascript"></script>
      <script src="https://a248.e.akamai.net/assets.github.com/assets/github-f95f8aaa8ed7687ee7ab69f3f53fe33dc375b9bf.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="8a3921d0cd627cea5e6fd05be069481f">

        <link data-pjax-transient rel='permalink' href='/macdonst/VideoPlayer/blob/656a8c5fbc2c60ec3e354bf097cd904153a4e869/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java'>
    <meta property="og:title" content="VideoPlayer"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/macdonst/VideoPlayer"/>
    <meta property="og:image" content="https://secure.gravatar.com/avatar/b8dadcd56f71bf5e126bd937601f03fd?s=420&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="Contribute to VideoPlayer development by creating an account on GitHub."/>
    <meta property="twitter:card" content="summary"/>
    <meta property="twitter:site" content="@GitHub">
    <meta property="twitter:title" content="macdonst/VideoPlayer"/>

    <meta name="description" content="Contribute to VideoPlayer development by creating an account on GitHub." />


    <meta content="353180" name="octolytics-dimension-user_id" /><meta content="macdonst" name="octolytics-dimension-user_login" /><meta content="6604011" name="octolytics-dimension-repository_id" /><meta content="macdonst/VideoPlayer" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="6604011" name="octolytics-dimension-repository_network_root_id" /><meta content="macdonst/VideoPlayer" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/macdonst/VideoPlayer/commits/master.atom" rel="alternate" title="Recent Commits to VideoPlayer:master" type="application/atom+xml" />

  </head>


  <body class="logged_out page-blob macintosh vis-public env-production  ">

    <div class="wrapper">
      
      
      

      
      <div class="header header-logged-out">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/">
      <span class="mega-octicon octicon-logo-github"></span>
    </a>

    <div class="header-actions">
      <a class="button primary" href="/signup">Sign up</a>
      <a class="button" href="/login?return_to=%2Fmacdonst%2FVideoPlayer%2Fblob%2Fmaster%2F2.2.0%2Fsrc%2Fcom%2Fphonegap%2Fplugins%2Fvideo%2FVideoPlayer.java">Sign in</a>
    </div>

    <div class="command-bar js-command-bar  in-repository">


      <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
        <li class="features"><a href="/features">Features</a></li>
          <li class="enterprise"><a href="https://enterprise.github.com/">Enterprise</a></li>
          <li class="blog"><a href="/blog">Blog</a></li>
      </ul>
        <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
      data-repo="macdonst/VideoPlayer"
      data-branch="master"
      data-sha="3d527e5c900756e65db1566357d1be39c10ac31a"
  >

    <input type="hidden" name="nwo" value="macdonst/VideoPlayer" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="octicon help tooltipped downwards" title="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
    </div>

  </div>
</div>


      


            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu ">
          <div class="container">
            <div class="title-actions-bar">
              

<ul class="pagehead-actions">



    <li>
      <a href="/login?return_to=%2Fmacdonst%2FVideoPlayer"
        class="minibutton with-count js-toggler-target star-button entice tooltipped upwards"
        title="You must be signed in to use this feature" rel="nofollow">
        <span class="octicon octicon-star"></span>Star
      </a>
      <a class="social-count js-social-count" href="/macdonst/VideoPlayer/stargazers">
        23
      </a>
    </li>
    <li>
      <a href="/login?return_to=%2Fmacdonst%2FVideoPlayer"
        class="minibutton with-count js-toggler-target fork-button entice tooltipped upwards"
        title="You must be signed in to fork a repository" rel="nofollow">
        <span class="octicon octicon-git-branch"></span>Fork
      </a>
      <a href="/macdonst/VideoPlayer/network" class="social-count">
        42
      </a>
    </li>
</ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
                <span class="repo-label"><span>public</span></span>
                <span class="mega-octicon octicon-repo"></span>
                <span class="author vcard">
                  <a href="/macdonst" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">macdonst</span>
                  </a></span> /
                <strong><a href="/macdonst/VideoPlayer" class="js-current-repository">VideoPlayer</a></strong>
              </h1>
            </div>

            
  <ul class="tabs">
    <li class="pulse-nav"><a href="/macdonst/VideoPlayer/pulse" class="js-selected-navigation-item " data-selected-links="pulse /macdonst/VideoPlayer/pulse" rel="nofollow"><span class="octicon octicon-pulse"></span></a></li>
    <li><a href="/macdonst/VideoPlayer" class="js-selected-navigation-item selected" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /macdonst/VideoPlayer">Code</a></li>
    <li><a href="/macdonst/VideoPlayer/network" class="js-selected-navigation-item " data-selected-links="repo_network /macdonst/VideoPlayer/network">Network</a></li>
    <li><a href="/macdonst/VideoPlayer/pulls" class="js-selected-navigation-item " data-selected-links="repo_pulls /macdonst/VideoPlayer/pulls">Pull Requests <span class='counter'>1</span></a></li>

      <li><a href="/macdonst/VideoPlayer/issues" class="js-selected-navigation-item " data-selected-links="repo_issues /macdonst/VideoPlayer/issues">Issues <span class='counter'>8</span></a></li>



    <li><a href="/macdonst/VideoPlayer/graphs" class="js-selected-navigation-item " data-selected-links="repo_graphs repo_contributors /macdonst/VideoPlayer/graphs">Graphs</a></li>


  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
          <li><a href="/macdonst/VideoPlayer/tags" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_tags /macdonst/VideoPlayer/tags">Tags <span class="counter blank">0</span></a></li>
    </ul>
  </span>

  <div class="tabnav-widget scope">


    <div class="select-menu js-menu-container js-select-menu js-branch-menu">
      <a class="minibutton select-menu-button js-menu-target" data-hotkey="w" data-ref="master">
        <span class="octicon octicon-git-branch"></span>
        <i>branch:</i>
        <span class="js-select-button">master</span>
      </a>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">

        <div class="select-menu-modal">
          <div class="select-menu-header">
            <span class="select-menu-title">Switch branches/tags</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-filters">
            <div class="select-menu-text-filter">
              <input type="text" id="commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
            </div>
            <div class="select-menu-tabs">
              <ul>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
                </li>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
                </li>
              </ul>
            </div><!-- /.select-menu-tabs -->
          </div><!-- /.select-menu-filters -->

          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="branches">

            <div data-filterable-for="commitish-filter-field" data-filterable-type="substring">

                <div class="select-menu-item js-navigation-item selected">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <a href="/macdonst/VideoPlayer/blob/master/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="master" rel="nofollow" title="master">master</a>
                </div> <!-- /.select-menu-item -->
            </div>

              <div class="select-menu-no-results">Nothing to show</div>
          </div> <!-- /.select-menu-list -->


          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="tags">
            <div data-filterable-for="commitish-filter-field" data-filterable-type="substring">

            </div>

            <div class="select-menu-no-results">Nothing to show</div>

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

  </div> <!-- /.scope -->

  <ul class="tabnav-tabs">
    <li><a href="/macdonst/VideoPlayer" class="selected js-selected-navigation-item tabnav-tab" data-selected-links="repo_source /macdonst/VideoPlayer">Files</a></li>
    <li><a href="/macdonst/VideoPlayer/commits/master" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_commits /macdonst/VideoPlayer/commits/master">Commits</a></li>
    <li><a href="/macdonst/VideoPlayer/branches" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_branches /macdonst/VideoPlayer/branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:746a9b3d9ce8e6ebb5ba0ed12066e594 -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:746a9b3d9ce8e6ebb5ba0ed12066e594 -->

<div id="slider">
    <div class="frame-meta">

      <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

        <a href="/macdonst/VideoPlayer/find/master" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>

        <div class="breadcrumb">
          <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/macdonst/VideoPlayer" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">VideoPlayer</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/macdonst/VideoPlayer/tree/master/2.2.0" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">2.2.0</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/macdonst/VideoPlayer/tree/master/2.2.0/src" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/macdonst/VideoPlayer/tree/master/2.2.0/src/com" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">com</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/macdonst/VideoPlayer/tree/master/2.2.0/src/com/phonegap" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">phonegap</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/macdonst/VideoPlayer/tree/master/2.2.0/src/com/phonegap/plugins" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">plugins</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/macdonst/VideoPlayer/tree/master/2.2.0/src/com/phonegap/plugins/video" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">video</span></a></span><span class="separator"> / </span><strong class="final-path">VideoPlayer.java</strong> <span class="js-zeroclipboard zeroclipboard-button" data-clipboard-text="2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
        </div>


        
  <div class="commit file-history-tease">
    <img class="main-avatar" height="24" src="https://secure.gravatar.com/avatar/b8dadcd56f71bf5e126bd937601f03fd?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
    <span class="author"><a href="/macdonst" rel="author">macdonst</a></span>
    <time class="js-relative-date" datetime="2013-01-14T17:29:50-08:00" title="2013-01-14 17:29:50">January 14, 2013</time>
    <div class="commit-title">
        <a href="/macdonst/VideoPlayer/commit/5bf635f183e17755e506fa51c182fa934fc9e26f" class="message">If YouTube is not installed send the user to the market</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>1</strong> contributor</a></p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
        <li class="facebox-user-list-item">
          <img height="24" src="https://secure.gravatar.com/avatar/b8dadcd56f71bf5e126bd937601f03fd?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
          <a href="/macdonst">macdonst</a>
        </li>
      </ul>
    </div>
  </div>


    </div><!-- ./.frame-meta -->

    <div class="frames">
      <div class="frame" data-permalink-url="/macdonst/VideoPlayer/blob/656a8c5fbc2c60ec3e354bf097cd904153a4e869/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java" data-title="VideoPlayer/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java at master · macdonst/VideoPlayer · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="octicon octicon-file-text"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>133 lines (114 sloc)</span>
                <span>4.999 kb</span>
              </div>
              <div class="actions">
                <div class="button-group">
                      <a class="minibutton js-entice" href=""
                         data-entice="You must be signed in and on a branch to make or propose changes">Edit</a>
                  <a href="/macdonst/VideoPlayer/raw/master/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java" class="button minibutton " id="raw-url">Raw</a>
                    <a href="/macdonst/VideoPlayer/blame/master/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java" class="button minibutton ">Blame</a>
                  <a href="/macdonst/VideoPlayer/commits/master/2.2.0/src/com/phonegap/plugins/video/VideoPlayer.java" class="button minibutton " rel="nofollow">History</a>
                </div><!-- /.button-group -->
              </div><!-- /.actions -->

            </div>
                <div class="blob-wrapper data type-java js-blob-data">
      <table class="file-code file-diff">
        <tr class="file-code-line">
          <td class="blob-line-nums">
            <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>

          </td>
          <td class="blob-line-code">
                  <div class="highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * PhoneGap is available under *either* the terms of the modified BSD license *or* the</span></div><div class='line' id='LC3'><span class="cm"> * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.</span></div><div class='line' id='LC4'><span class="cm"> *</span></div><div class='line' id='LC5'><span class="cm"> * Copyright (c) 2005-2010, Nitobi Software Inc.</span></div><div class='line' id='LC6'><span class="cm"> * Copyright (c) 2011, IBM Corporation</span></div><div class='line' id='LC7'><span class="cm"> */</span></div><div class='line' id='LC8'><br/></div><div class='line' id='LC9'><span class="kn">package</span> <span class="n">com</span><span class="o">.</span><span class="na">phonegap</span><span class="o">.</span><span class="na">plugins</span><span class="o">.</span><span class="na">video</span><span class="o">;</span></div><div class='line' id='LC10'><br/></div><div class='line' id='LC11'><span class="kn">import</span> <span class="nn">java.io.File</span><span class="o">;</span></div><div class='line' id='LC12'><span class="kn">import</span> <span class="nn">java.io.FileOutputStream</span><span class="o">;</span></div><div class='line' id='LC13'><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></div><div class='line' id='LC14'><span class="kn">import</span> <span class="nn">java.io.InputStream</span><span class="o">;</span></div><div class='line' id='LC15'><span class="kn">import</span> <span class="nn">java.net.URL</span><span class="o">;</span></div><div class='line' id='LC16'><span class="kn">import</span> <span class="nn">java.net.URLConnection</span><span class="o">;</span></div><div class='line' id='LC17'><br/></div><div class='line' id='LC18'><span class="kn">import</span> <span class="nn">org.json.JSONArray</span><span class="o">;</span></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">org.json.JSONException</span><span class="o">;</span></div><div class='line' id='LC20'><br/></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">android.content.Context</span><span class="o">;</span></div><div class='line' id='LC22'><span class="kn">import</span> <span class="nn">android.content.Intent</span><span class="o">;</span></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">android.content.pm.PackageManager</span><span class="o">;</span></div><div class='line' id='LC24'><span class="kn">import</span> <span class="nn">android.net.Uri</span><span class="o">;</span></div><div class='line' id='LC25'><br/></div><div class='line' id='LC26'><span class="kn">import</span> <span class="nn">org.apache.cordova.api.CallbackContext</span><span class="o">;</span></div><div class='line' id='LC27'><span class="kn">import</span> <span class="nn">org.apache.cordova.api.CordovaPlugin</span><span class="o">;</span></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">org.apache.cordova.api.PluginResult</span><span class="o">;</span></div><div class='line' id='LC29'><br/></div><div class='line' id='LC30'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">VideoPlayer</span> <span class="kd">extends</span> <span class="n">CordovaPlugin</span> <span class="o">{</span></div><div class='line' id='LC31'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">YOU_TUBE</span> <span class="o">=</span> <span class="s">&quot;youtube.com&quot;</span><span class="o">;</span></div><div class='line' id='LC32'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="n">String</span> <span class="n">ASSETS</span> <span class="o">=</span> <span class="s">&quot;file:///android_asset/&quot;</span><span class="o">;</span></div><div class='line' id='LC33'><br/></div><div class='line' id='LC34'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nd">@Override</span></div><div class='line' id='LC35'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">execute</span><span class="o">(</span><span class="n">String</span> <span class="n">action</span><span class="o">,</span> <span class="n">JSONArray</span> <span class="n">args</span><span class="o">,</span> <span class="n">CallbackContext</span> <span class="n">callbackContext</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC36'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">PluginResult</span><span class="o">.</span><span class="na">Status</span> <span class="n">status</span> <span class="o">=</span> <span class="n">PluginResult</span><span class="o">.</span><span class="na">Status</span><span class="o">.</span><span class="na">OK</span><span class="o">;</span></div><div class='line' id='LC37'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">result</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC38'><br/></div><div class='line' id='LC39'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC40'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">action</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;playVideo&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC41'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">playVideo</span><span class="o">(</span><span class="n">args</span><span class="o">.</span><span class="na">getString</span><span class="o">(</span><span class="mi">0</span><span class="o">));</span></div><div class='line' id='LC42'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC43'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC44'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">status</span> <span class="o">=</span> <span class="n">PluginResult</span><span class="o">.</span><span class="na">Status</span><span class="o">.</span><span class="na">INVALID_ACTION</span><span class="o">;</span></div><div class='line' id='LC45'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC46'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">callbackContext</span><span class="o">.</span><span class="na">sendPluginResult</span><span class="o">(</span><span class="k">new</span> <span class="n">PluginResult</span><span class="o">(</span><span class="n">status</span><span class="o">,</span> <span class="n">result</span><span class="o">));</span></div><div class='line' id='LC47'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">JSONException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC48'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">callbackContext</span><span class="o">.</span><span class="na">sendPluginResult</span><span class="o">(</span><span class="k">new</span> <span class="n">PluginResult</span><span class="o">(</span><span class="n">PluginResult</span><span class="o">.</span><span class="na">Status</span><span class="o">.</span><span class="na">JSON_EXCEPTION</span><span class="o">));</span></div><div class='line' id='LC49'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">IOException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC50'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">callbackContext</span><span class="o">.</span><span class="na">sendPluginResult</span><span class="o">(</span><span class="k">new</span> <span class="n">PluginResult</span><span class="o">(</span><span class="n">PluginResult</span><span class="o">.</span><span class="na">Status</span><span class="o">.</span><span class="na">IO_EXCEPTION</span><span class="o">));</span></div><div class='line' id='LC51'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC52'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC53'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC54'><br/></div><div class='line' id='LC55'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">playVideo</span><span class="o">(</span><span class="n">String</span> <span class="n">url</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC56'>&nbsp;&nbsp;&nbsp;&nbsp;	<span class="k">if</span> <span class="o">(</span><span class="n">url</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="s">&quot;bit.ly/&quot;</span><span class="o">)</span> <span class="o">||</span> <span class="n">url</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="s">&quot;goo.gl/&quot;</span><span class="o">)</span> <span class="o">||</span> <span class="n">url</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="s">&quot;tinyurl.com/&quot;</span><span class="o">)</span> <span class="o">||</span> <span class="n">url</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="s">&quot;youtu.be/&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC57'>			<span class="c1">//support for google / bitly / tinyurl / youtube shortens</span></div><div class='line' id='LC58'>			<span class="n">URLConnection</span> <span class="n">con</span> <span class="o">=</span> <span class="k">new</span> <span class="n">URL</span><span class="o">(</span><span class="n">url</span><span class="o">).</span><span class="na">openConnection</span><span class="o">();</span></div><div class='line' id='LC59'>			<span class="n">con</span><span class="o">.</span><span class="na">connect</span><span class="o">();</span></div><div class='line' id='LC60'>			<span class="n">InputStream</span> <span class="n">is</span> <span class="o">=</span> <span class="n">con</span><span class="o">.</span><span class="na">getInputStream</span><span class="o">();</span></div><div class='line' id='LC61'>			<span class="c1">//new redirected url</span></div><div class='line' id='LC62'>	        <span class="n">url</span> <span class="o">=</span> <span class="n">con</span><span class="o">.</span><span class="na">getURL</span><span class="o">().</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC63'>			<span class="n">is</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC64'>		<span class="o">}</span></div><div class='line' id='LC65'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC66'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Create URI</span></div><div class='line' id='LC67'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Uri</span> <span class="n">uri</span> <span class="o">=</span> <span class="n">Uri</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="n">url</span><span class="o">);</span></div><div class='line' id='LC68'><br/></div><div class='line' id='LC69'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">Intent</span> <span class="n">intent</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC70'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Check to see if someone is trying to play a YouTube page.</span></div><div class='line' id='LC71'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">url</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">YOU_TUBE</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC72'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// If we don&#39;t do it this way you don&#39;t have the option for youtube</span></div><div class='line' id='LC73'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">uri</span> <span class="o">=</span> <span class="n">Uri</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="s">&quot;vnd.youtube:&quot;</span> <span class="o">+</span> <span class="n">uri</span><span class="o">.</span><span class="na">getQueryParameter</span><span class="o">(</span><span class="s">&quot;v&quot;</span><span class="o">));</span></div><div class='line' id='LC74'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(</span><span class="n">isYouTubeInstalled</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC75'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Intent</span><span class="o">(</span><span class="n">Intent</span><span class="o">.</span><span class="na">ACTION_VIEW</span><span class="o">,</span> <span class="n">uri</span><span class="o">);</span></div><div class='line' id='LC76'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC77'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Intent</span><span class="o">(</span><span class="n">Intent</span><span class="o">.</span><span class="na">ACTION_VIEW</span><span class="o">);</span></div><div class='line' id='LC78'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span><span class="o">.</span><span class="na">setData</span><span class="o">(</span><span class="n">Uri</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="s">&quot;market://details?id=com.google.android.youtube&quot;</span><span class="o">));</span></div><div class='line' id='LC79'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC80'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">url</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">ASSETS</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC81'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// get file path in assets folder</span></div><div class='line' id='LC82'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">filepath</span> <span class="o">=</span> <span class="n">url</span><span class="o">.</span><span class="na">replace</span><span class="o">(</span><span class="n">ASSETS</span><span class="o">,</span> <span class="s">&quot;&quot;</span><span class="o">);</span></div><div class='line' id='LC83'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// get actual filename from path as command to write to internal storage doesn&#39;t like folders</span></div><div class='line' id='LC84'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">String</span> <span class="n">filename</span> <span class="o">=</span> <span class="n">filepath</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">filepath</span><span class="o">.</span><span class="na">lastIndexOf</span><span class="o">(</span><span class="s">&quot;/&quot;</span><span class="o">)+</span><span class="mi">1</span><span class="o">,</span> <span class="n">filepath</span><span class="o">.</span><span class="na">length</span><span class="o">());</span></div><div class='line' id='LC85'><br/></div><div class='line' id='LC86'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Don&#39;t copy the file if it already exists</span></div><div class='line' id='LC87'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">File</span> <span class="n">fp</span> <span class="o">=</span> <span class="k">new</span> <span class="n">File</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">cordova</span><span class="o">.</span><span class="na">getActivity</span><span class="o">().</span><span class="na">getFilesDir</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;/&quot;</span> <span class="o">+</span> <span class="n">filename</span><span class="o">);</span></div><div class='line' id='LC88'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">if</span> <span class="o">(!</span><span class="n">fp</span><span class="o">.</span><span class="na">exists</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC89'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">copy</span><span class="o">(</span><span class="n">filepath</span><span class="o">,</span> <span class="n">filename</span><span class="o">);</span></div><div class='line' id='LC90'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC91'><br/></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// change uri to be to the new file in internal storage</span></div><div class='line' id='LC93'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">uri</span> <span class="o">=</span> <span class="n">Uri</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="s">&quot;file://&quot;</span> <span class="o">+</span> <span class="k">this</span><span class="o">.</span><span class="na">cordova</span><span class="o">.</span><span class="na">getActivity</span><span class="o">().</span><span class="na">getFilesDir</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;/&quot;</span> <span class="o">+</span> <span class="n">filename</span><span class="o">);</span></div><div class='line' id='LC94'><br/></div><div class='line' id='LC95'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Display video player</span></div><div class='line' id='LC96'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Intent</span><span class="o">(</span><span class="n">Intent</span><span class="o">.</span><span class="na">ACTION_VIEW</span><span class="o">);</span></div><div class='line' id='LC97'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span><span class="o">.</span><span class="na">setDataAndType</span><span class="o">(</span><span class="n">uri</span><span class="o">,</span> <span class="s">&quot;video/*&quot;</span><span class="o">);</span></div><div class='line' id='LC98'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC99'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Display video player</span></div><div class='line' id='LC100'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Intent</span><span class="o">(</span><span class="n">Intent</span><span class="o">.</span><span class="na">ACTION_VIEW</span><span class="o">);</span></div><div class='line' id='LC101'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">intent</span><span class="o">.</span><span class="na">setDataAndType</span><span class="o">(</span><span class="n">uri</span><span class="o">,</span> <span class="s">&quot;video/*&quot;</span><span class="o">);</span></div><div class='line' id='LC102'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC103'><br/></div><div class='line' id='LC104'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">this</span><span class="o">.</span><span class="na">cordova</span><span class="o">.</span><span class="na">getActivity</span><span class="o">().</span><span class="na">startActivity</span><span class="o">(</span><span class="n">intent</span><span class="o">);</span></div><div class='line' id='LC105'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC106'><br/></div><div class='line' id='LC107'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">void</span> <span class="nf">copy</span><span class="o">(</span><span class="n">String</span> <span class="n">fileFrom</span><span class="o">,</span> <span class="n">String</span> <span class="n">fileTo</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">IOException</span> <span class="o">{</span></div><div class='line' id='LC108'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// get file to be copied from assets</span></div><div class='line' id='LC109'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">InputStream</span> <span class="n">in</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">cordova</span><span class="o">.</span><span class="na">getActivity</span><span class="o">().</span><span class="na">getAssets</span><span class="o">().</span><span class="na">open</span><span class="o">(</span><span class="n">fileFrom</span><span class="o">);</span></div><div class='line' id='LC110'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// get file where copied too, in internal storage.</span></div><div class='line' id='LC111'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// must be MODE_WORLD_READABLE or Android can&#39;t play it</span></div><div class='line' id='LC112'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">FileOutputStream</span> <span class="n">out</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">cordova</span><span class="o">.</span><span class="na">getActivity</span><span class="o">().</span><span class="na">openFileOutput</span><span class="o">(</span><span class="n">fileTo</span><span class="o">,</span> <span class="n">Context</span><span class="o">.</span><span class="na">MODE_WORLD_READABLE</span><span class="o">);</span></div><div class='line' id='LC113'><br/></div><div class='line' id='LC114'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">// Transfer bytes from in to out</span></div><div class='line' id='LC115'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">byte</span><span class="o">[]</span> <span class="n">buf</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">byte</span><span class="o">[</span><span class="mi">1024</span><span class="o">];</span></div><div class='line' id='LC116'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="kt">int</span> <span class="n">len</span><span class="o">;</span></div><div class='line' id='LC117'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">while</span> <span class="o">((</span><span class="n">len</span> <span class="o">=</span> <span class="n">in</span><span class="o">.</span><span class="na">read</span><span class="o">(</span><span class="n">buf</span><span class="o">))</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span></div><div class='line' id='LC118'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">out</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">buf</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="n">len</span><span class="o">);</span></div><div class='line' id='LC119'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">in</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC120'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">out</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC121'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC122'>&nbsp;&nbsp;&nbsp;&nbsp;</div><div class='line' id='LC123'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="kd">private</span> <span class="kt">boolean</span> <span class="nf">isYouTubeInstalled</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC124'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">PackageManager</span> <span class="n">pm</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">cordova</span><span class="o">.</span><span class="na">getActivity</span><span class="o">().</span><span class="na">getPackageManager</span><span class="o">();</span></div><div class='line' id='LC125'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC126'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="n">pm</span><span class="o">.</span><span class="na">getPackageInfo</span><span class="o">(</span><span class="s">&quot;com.google.android.youtube&quot;</span><span class="o">,</span> <span class="n">PackageManager</span><span class="o">.</span><span class="na">GET_ACTIVITIES</span><span class="o">);</span></div><div class='line' id='LC127'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">true</span><span class="o">;</span></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">PackageManager</span><span class="o">.</span><span class="na">NameNotFoundException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC129'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="k">return</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC130'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC131'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">}</span></div><div class='line' id='LC132'><span class="o">}</span></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>

        <a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
        <div id="jump-to-line" style="display:none">
          <form accept-charset="UTF-8" class="js-jump-to-line-form">
            <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;">
            <button type="submit" class="button">Go</button>
          </form>
        </div>

      </div>
    </div>
</div>

<div id="js-frame-loading-template" class="frame frame-loading large-loading-area" style="display:none;">
  <img class="js-frame-loading-spinner" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif" height="64" width="64">
</div>


        </div>
      </div>
      <div class="modal-backdrop"></div>
    </div>

    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">Developer</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>
    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2013 <span title="0.05385s from fe18.rs.github.com">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
          <div class="suggester-container">
              <div class="suggester fullscreen-suggester js-navigation-container" id="fullscreen_suggester"
                 data-url="/macdonst/VideoPlayer/suggestions/commit">
              </div>
          </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped leftwards" title="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped leftwards"
      title="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

    
    <span id='server_response_time' data-time='0.05426' data-host='fe18'></span>
    
  </body>
</html>

