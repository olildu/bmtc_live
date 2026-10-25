package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.compose.ChaloHeaderTextComposableKt;
import app.chalo.constants.Source;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.ChaloTextDataKt;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetDataKt;
import app.chalo.data.GridWidgetItemData;
import app.chalo.data.TextStyleAppModel;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.domain.GetHomePageItemsUseCase;
import app.chalo.home.domain.GetHomePageItemsUseCase$aboveSearchImages$$inlined$sortedBy$1;
import app.chalo.home.domain.GetHomePageItemsUseCase$getHomePageGridItems$$inlined$sortedBy$1;
import app.chalo.home.domain.GetHomePageItemsUseCase$invoke$$inlined$sortedBy$1;
import app.chalo.home.ui.home.HomePageDisplayItemData;
import app.chalo.home.ui.home.HomePageGridItemData;
import app.chalo.home.ui.home.HomePageSectionDisplayType;
import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.homescreen.data.model.app.CardSectionAppModel;
import app.chalo.homescreen.data.model.app.FooterSectionAppModel;
import app.chalo.homescreen.data.model.app.GamBannerAdSectionAppModel;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.HomePageSectionType;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel;
import app.chalo.homescreen.data.model.app.HomeScreenAppModel;
import app.chalo.homescreen.data.model.app.HomeTabHooksCardSectionData;
import app.chalo.homescreen.data.model.app.HomeTabHooksSectionAppModel;
import app.chalo.homescreen.data.model.app.ImageResourceCtaType;
import app.chalo.homescreen.data.model.app.ImageResourcePlacement;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.ItemTextDataAppModel;
import app.chalo.homescreen.data.model.app.PlotlineWidgetSectionAppModel;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.models.bookinghelp.BookingHelpAvailabilityAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenType;
import defpackage.pk0;
import io.github.alexzhirkevich.compottie.internal.AnimationState;
import io.github.alexzhirkevich.compottie.internal.animation.expressions.LayerKt;
import io.github.alexzhirkevich.compottie.internal.layers.Layer;
import io.github.alexzhirkevich.keight.ScriptRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11175a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b80(Object obj, Object obj2, Object obj3, boolean z, boolean z2, int i) {
        this.f11175a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x061d  */
    /* JADX WARN: Code duplicated, block: B:175:0x05c2 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        JuspayControllerProvider juspayControllerProvider;
        HomeScreenViewState homeScreenViewState;
        ProfileDrawerCardData profileDrawerCardData;
        ArrayList arrayList3;
        TabMetaDataAppModel tabMetaDataAppModel;
        String str;
        String strB;
        ArrayList arrayList4;
        ArrayList arrayList5;
        TextStyleAppModel textStyleAppModel;
        boolean z;
        int i2 = this.f11175a;
        boolean z2 = true;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i2) {
            case 0:
                HomeScreenComponent homeScreenComponent = (HomeScreenComponent) obj4;
                HomeScreenAppModel homeScreenAppModel = (HomeScreenAppModel) obj3;
                ProfileDrawerCardData profileDrawerCardData2 = (ProfileDrawerCardData) obj2;
                HomeScreenViewState it = (HomeScreenViewState) obj;
                Intrinsics.i(it, "it");
                CityProvider cityProvider = homeScreenComponent.l;
                JuspayControllerProvider juspayControllerProvider2 = homeScreenComponent.T;
                GetHomePageItemsUseCase getHomePageItemsUseCase = homeScreenComponent.n;
                CityAppModel cityAppModel = (CityAppModel) cityProvider.getE().getValue();
                String str2 = cityAppModel != null ? cityAppModel.s : null;
                TabMetaDataAppModel tabMetaDataAppModel2 = homeScreenAppModel.b;
                List sections = homeScreenAppModel.f3747a;
                getHomePageItemsUseCase.getClass();
                HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = getHomePageItemsUseCase.f3036a;
                Intrinsics.i(sections, "sections");
                List list = sections;
                List listV0 = CollectionsKt.v0(new GetHomePageItemsUseCase$aboveSearchImages$$inlined$sortedBy$1(), list);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : listV0) {
                    HomePageSectionWidgetAppModel homePageSectionWidgetAppModel = (HomePageSectionWidgetAppModel) obj5;
                    if ((homePageSectionWidgetAppModel instanceof HomePageSectionWidgetAppModel.ImageResourceSection) && ((HomePageSectionWidgetAppModel.ImageResourceSection) homePageSectionWidgetAppModel).k.d == ImageResourcePlacement.ABOVE_SEARCH) {
                        arrayList6.add(obj5);
                    }
                }
                ArrayList arrayList7 = new ArrayList(CollectionsKt.v(arrayList6, 10));
                int size = arrayList6.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj6 = arrayList6.get(i3);
                    i3++;
                    HomePageSectionWidgetAppModel homePageSectionWidgetAppModel2 = (HomePageSectionWidgetAppModel) obj6;
                    Intrinsics.g(homePageSectionWidgetAppModel2, "null cannot be cast to non-null type app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel.ImageResourceSection");
                    arrayList7.add(((HomePageSectionWidgetAppModel.ImageResourceSection) homePageSectionWidgetAppModel2).k);
                }
                if (juspayControllerProvider2.e()) {
                    arrayList = arrayList7;
                } else {
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.v(arrayList7, 10));
                    int size2 = arrayList7.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj7 = arrayList7.get(i4);
                        i4++;
                        ImageResourceSectionAppModel imageResourceSectionAppModelA = (ImageResourceSectionAppModel) obj7;
                        boolean z3 = z2;
                        if (imageResourceSectionAppModelA.f == ImageResourceCtaType.SCAN_AND_PAY) {
                            imageResourceSectionAppModelA = ImageResourceSectionAppModel.a(imageResourceSectionAppModelA);
                        }
                        arrayList8.add(imageResourceSectionAppModelA);
                        z2 = z3;
                    }
                    arrayList = arrayList8;
                }
                boolean z4 = z2;
                ArrayList arrayList9 = new ArrayList();
                List listV1 = CollectionsKt.v0(new GetHomePageItemsUseCase$invoke$$inlined$sortedBy$1(), list);
                ArrayList arrayList10 = new ArrayList();
                for (Object obj8 : listV1) {
                    HomePageSectionWidgetAppModel homePageSectionWidgetAppModel3 = (HomePageSectionWidgetAppModel) obj8;
                    if (!(homePageSectionWidgetAppModel3 instanceof HomePageSectionWidgetAppModel.ImageResourceSection) || ((HomePageSectionWidgetAppModel.ImageResourceSection) homePageSectionWidgetAppModel3).k.d != ImageResourcePlacement.ABOVE_SEARCH) {
                        arrayList10.add(obj8);
                    }
                }
                int i5 = 0;
                while (i5 < arrayList10.size()) {
                    HomePageSectionWidgetAppModel homePageSectionWidgetAppModel4 = (HomePageSectionWidgetAppModel) arrayList10.get(i5);
                    if (homePageSectionWidgetAppModel4 instanceof HomePageSectionWidgetAppModel.ImageResourceSection) {
                        arrayList9.add(new HomePageDisplayItemData(null, null, null, null, null, null, HomePageFeature.IMAGE_RESOURCE, HomePageSectionDisplayType.IMAGE_RESOURCE, homePageSectionWidgetAppModel4.d, null, homePageSectionWidgetAppModel4.f3739a, ((HomePageSectionWidgetAppModel.ImageResourceSection) homePageSectionWidgetAppModel4).k, 575));
                        i = i5;
                        juspayControllerProvider = juspayControllerProvider2;
                        homeScreenViewState = it;
                        profileDrawerCardData = profileDrawerCardData2;
                        arrayList3 = arrayList;
                        tabMetaDataAppModel = tabMetaDataAppModel2;
                        str = str2;
                    } else {
                        i = i5;
                        if (homePageSectionWidgetAppModel4 instanceof HomePageSectionWidgetAppModel.HomeTabHooksSection) {
                            HomeTabHooksSectionAppModel homeTabHooksSectionAppModel = ((HomePageSectionWidgetAppModel.HomeTabHooksSection) homePageSectionWidgetAppModel4).j;
                            ArrayList arrayList11 = new ArrayList();
                            juspayControllerProvider = juspayControllerProvider2;
                            homeScreenViewState = it;
                            Iterator it2 = CollectionsKt.v0(new GetHomePageItemsUseCase$getHomePageGridItems$$inlined$sortedBy$1(), homeTabHooksSectionAppModel.b).iterator();
                            while (it2.hasNext()) {
                                HomeTabHooksCardSectionData homeTabHooksCardSectionData = (HomeTabHooksCardSectionData) it2.next();
                                Iterator it3 = it2;
                                Source source = Source.HOME_SCREEN_TAB;
                                ProfileDrawerCardData profileDrawerCardData3 = profileDrawerCardData2;
                                HomePageFeature homePageFeature = homeTabHooksCardSectionData.e;
                                String str3 = homeTabHooksCardSectionData.b;
                                ArrayList arrayList12 = arrayList;
                                ItemTextDataAppModel itemTextDataAppModel = homeTabHooksCardSectionData.d;
                                TabMetaDataAppModel tabMetaDataAppModel3 = tabMetaDataAppModel2;
                                String str4 = str2;
                                Pair pair = new Pair("type", homePageFeature.getFeatureType());
                                Pair pair2 = new Pair("position", String.valueOf(homeTabHooksCardSectionData.c));
                                ChaloTextDataAppModel chaloTextDataAppModel = itemTextDataAppModel.c;
                                List list2 = itemTextDataAppModel.b;
                                List list3 = itemTextDataAppModel.f3757a;
                                if (chaloTextDataAppModel == null || (textStyleAppModel = chaloTextDataAppModel.f) == null || (strB = ChaloTextDataKt.b(textStyleAppModel)) == null) {
                                    strB = "";
                                }
                                Pair pair3 = new Pair("title", strB);
                                Pair pair4 = new Pair("desc list", list3 != null ? GridWidgetDataKt.a(list3) : EmptyList.f17557a);
                                Pair pair5 = new Pair("tag list", list2 != null ? GridWidgetDataKt.a(list2) : EmptyList.f17557a);
                                Pair pair6 = new Pair("image url", str3 == null ? "" : str3);
                                Pair[] pairArr = new Pair[6];
                                pairArr[0] = pair;
                                pairArr[z4 ? 1 : 0] = pair2;
                                pairArr[2] = pair3;
                                pairArr[3] = pair4;
                                pairArr[4] = pair5;
                                pairArr[5] = pair6;
                                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "home page hook rendered", MapsKt.i(pairArr), source, 12);
                                String str5 = homeTabHooksCardSectionData.f3751a;
                                ChaloTextWithBackgroundData chaloTextWithBackgroundDataA = GetHomePageItemsUseCase.a(itemTextDataAppModel.c);
                                if (list3 != null) {
                                    List list4 = list3;
                                    arrayList4 = new ArrayList(CollectionsKt.v(list4, 10));
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        arrayList4.add(GetHomePageItemsUseCase.a((ChaloTextDataAppModel) it4.next()));
                                    }
                                } else {
                                    arrayList4 = null;
                                }
                                if (list2 != null) {
                                    List list5 = list2;
                                    arrayList5 = new ArrayList(CollectionsKt.v(list5, 10));
                                    Iterator it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        arrayList5.add(GetHomePageItemsUseCase.a((ChaloTextDataAppModel) it5.next()));
                                    }
                                } else {
                                    arrayList5 = null;
                                }
                                arrayList11.add(new HomePageGridItemData(new GridWidgetCardData(new GridWidgetItemData(arrayList4, arrayList5, chaloTextWithBackgroundDataA), str3, homeTabHooksCardSectionData.f, (str5 == 0 || str5.length() == 0) ? "0x00000000" : str5), homeTabHooksCardSectionData.e));
                                it2 = it3;
                                profileDrawerCardData2 = profileDrawerCardData3;
                                arrayList = arrayList12;
                                tabMetaDataAppModel2 = tabMetaDataAppModel3;
                                str2 = str4;
                                arrayList10 = arrayList10;
                            }
                            profileDrawerCardData = profileDrawerCardData2;
                            arrayList3 = arrayList;
                            tabMetaDataAppModel = tabMetaDataAppModel2;
                            str = str2;
                            arrayList9.add(new HomePageDisplayItemData(homeTabHooksSectionAppModel.f3753a, null, null, null, arrayList11, null, null, HomePageSectionDisplayType.GRID, false, null, null, null, 3950));
                            arrayList9.add(new HomePageDisplayItemData(null, null, null, null, null, null, null, HomePageSectionDisplayType.DIVIDER, false, null, null, null, 3967));
                        } else {
                            ArrayList arrayList13 = arrayList10;
                            juspayControllerProvider = juspayControllerProvider2;
                            homeScreenViewState = it;
                            profileDrawerCardData = profileDrawerCardData2;
                            arrayList3 = arrayList;
                            tabMetaDataAppModel = tabMetaDataAppModel2;
                            str = str2;
                            if (homePageSectionWidgetAppModel4 instanceof HomePageSectionWidgetAppModel.TicketPassesSection) {
                                Source source2 = Source.HOME_SCREEN_TAB;
                                Pair pair7 = new Pair("type", HomePageSectionType.TICKETS_PASSES.getSectionType());
                                Pair pair8 = new Pair("position", String.valueOf(listV1.indexOf(homePageSectionWidgetAppModel4)));
                                CardSectionAppModel cardSectionAppModel = ((HomePageSectionWidgetAppModel.TicketPassesSection) homePageSectionWidgetAppModel4).j;
                                Pair pair9 = new Pair("title", cardSectionAppModel.f3719a);
                                Pair[] pairArr2 = new Pair[3];
                                pairArr2[0] = pair7;
                                pairArr2[z4 ? 1 : 0] = pair8;
                                pairArr2[2] = pair9;
                                HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "home page card item rendered", MapsKt.i(pairArr2), source2, 12);
                                arrayList9.add(new HomePageDisplayItemData(null, null, cardSectionAppModel.f3719a, null, null, cardSectionAppModel.b, HomePageFeature.TICKETS_PASSES, HomePageSectionDisplayType.CARD, homePageSectionWidgetAppModel4.d, null, null, null, 3611));
                                arrayList9.add(new HomePageDisplayItemData(null, null, null, null, null, null, null, HomePageSectionDisplayType.DIVIDER, false, null, null, null, 3967));
                                arrayList10 = arrayList13;
                            } else {
                                if (homePageSectionWidgetAppModel4 instanceof HomePageSectionWidgetAppModel.PlotlineWidgetSection) {
                                    boolean z5 = z4 ? 1 : 0;
                                    i5 = i;
                                    while (true) {
                                        if (i5 < arrayList13.size()) {
                                            arrayList10 = arrayList13;
                                            if (arrayList10.get(i5) instanceof HomePageSectionWidgetAppModel.PlotlineWidgetSection) {
                                                Object obj9 = arrayList10.get(i5);
                                                Intrinsics.g(obj9, "null cannot be cast to non-null type app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel.PlotlineWidgetSection");
                                                PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel = ((HomePageSectionWidgetAppModel.PlotlineWidgetSection) obj9).j;
                                                if (plotlineWidgetSectionAppModel.d.length() > 0) {
                                                    arrayList9.add(new HomePageDisplayItemData(plotlineWidgetSectionAppModel.b, plotlineWidgetSectionAppModel.d, plotlineWidgetSectionAppModel.f3776a, plotlineWidgetSectionAppModel.c, null, null, null, HomePageSectionDisplayType.PLOTLINE_WIDGET, false, null, null, null, 3952));
                                                }
                                                i5++;
                                                arrayList13 = arrayList10;
                                                z5 = false;
                                            }
                                        } else {
                                            arrayList10 = arrayList13;
                                        }
                                    }
                                    arrayList9.add(new HomePageDisplayItemData(null, ((HomePageSectionWidgetAppModel.PlotlineWidgetSection) homePageSectionWidgetAppModel4).j.d, null, null, null, null, null, HomePageSectionDisplayType.DIVIDER, false, null, null, null, 3965));
                                    z = z5;
                                } else {
                                    arrayList10 = arrayList13;
                                    if (homePageSectionWidgetAppModel4 instanceof HomePageSectionWidgetAppModel.HomeFooterSection) {
                                        FooterSectionAppModel footerSectionAppModel = ((HomePageSectionWidgetAppModel.HomeFooterSection) homePageSectionWidgetAppModel4).k;
                                        arrayList9.add(new HomePageDisplayItemData(null, null, footerSectionAppModel.f3735a, footerSectionAppModel.b, null, footerSectionAppModel.c, HomePageFeature.FOOTER, HomePageSectionDisplayType.FOOTER, false, null, null, null, 3859));
                                        arrayList9.add(new HomePageDisplayItemData(null, null, null, null, null, null, null, HomePageSectionDisplayType.DIVIDER, false, null, null, null, 3967));
                                    } else if (homePageSectionWidgetAppModel4 instanceof HomePageSectionWidgetAppModel.GamBannerAdSection) {
                                        GamBannerAdSectionAppModel gamBannerAdSectionAppModel = ((HomePageSectionWidgetAppModel.GamBannerAdSection) homePageSectionWidgetAppModel4).k;
                                        arrayList9.add(new HomePageDisplayItemData(gamBannerAdSectionAppModel.b, null, gamBannerAdSectionAppModel.f3737a, gamBannerAdSectionAppModel.c, null, null, null, HomePageSectionDisplayType.GAM_BANNER_AD, false, Integer.valueOf(gamBannerAdSectionAppModel.d), homePageSectionWidgetAppModel4.f3739a, null, 2418));
                                        arrayList9.add(new HomePageDisplayItemData(null, null, null, null, null, null, null, HomePageSectionDisplayType.DIVIDER, false, null, homePageSectionWidgetAppModel4.f3739a, null, 2943));
                                    } else {
                                        if (!(homePageSectionWidgetAppModel4 instanceof HomePageSectionWidgetAppModel.AdsterUnifiedAdSection)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        arrayList9.add(new HomePageDisplayItemData(null, null, null, null, null, null, null, HomePageSectionDisplayType.ADSTER_UNIFIED_AD, false, null, homePageSectionWidgetAppModel4.f3739a, null, 2943));
                                        arrayList9.add(new HomePageDisplayItemData(null, null, null, null, null, null, null, HomePageSectionDisplayType.DIVIDER, false, null, homePageSectionWidgetAppModel4.f3739a, null, 2943));
                                    }
                                }
                                if (z) {
                                    i5++;
                                }
                                juspayControllerProvider2 = juspayControllerProvider;
                                it = homeScreenViewState;
                                profileDrawerCardData2 = profileDrawerCardData;
                                arrayList = arrayList3;
                                tabMetaDataAppModel2 = tabMetaDataAppModel;
                                str2 = str;
                            }
                        }
                    }
                    z = z4 ? 1 : 0;
                    i5 = i;
                    if (z) {
                        i5++;
                    }
                    juspayControllerProvider2 = juspayControllerProvider;
                    it = homeScreenViewState;
                    profileDrawerCardData2 = profileDrawerCardData;
                    arrayList = arrayList3;
                    tabMetaDataAppModel2 = tabMetaDataAppModel;
                    str2 = str;
                }
                HomeScreenViewState homeScreenViewState2 = it;
                ProfileDrawerCardData profileDrawerCardData4 = profileDrawerCardData2;
                ArrayList arrayList14 = arrayList;
                TabMetaDataAppModel tabMetaDataAppModel4 = tabMetaDataAppModel2;
                String str6 = str2;
                if (juspayControllerProvider2.e()) {
                    arrayList2 = arrayList9;
                } else {
                    ArrayList arrayList15 = new ArrayList(CollectionsKt.v(arrayList9, 10));
                    int size3 = arrayList9.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj10 = arrayList9.get(i6);
                        i6++;
                        HomePageDisplayItemData homePageDisplayItemData = (HomePageDisplayItemData) obj10;
                        ImageResourceSectionAppModel imageResourceSectionAppModel = homePageDisplayItemData.l;
                        if (imageResourceSectionAppModel != null) {
                            ImageResourceSectionAppModel imageResourceSectionAppModelA2 = imageResourceSectionAppModel.f == ImageResourceCtaType.SCAN_AND_PAY ? ImageResourceSectionAppModel.a(imageResourceSectionAppModel) : imageResourceSectionAppModel;
                            if (imageResourceSectionAppModelA2 != imageResourceSectionAppModel) {
                                String str7 = homePageDisplayItemData.f3532a;
                                String str8 = homePageDisplayItemData.b;
                                String str9 = homePageDisplayItemData.c;
                                String str10 = homePageDisplayItemData.d;
                                List list6 = homePageDisplayItemData.e;
                                IconType iconType = homePageDisplayItemData.f;
                                HomePageFeature homePageFeature2 = homePageDisplayItemData.g;
                                HomePageSectionDisplayType displayType = homePageDisplayItemData.h;
                                boolean z6 = homePageDisplayItemData.i;
                                Integer num = homePageDisplayItemData.j;
                                String str11 = homePageDisplayItemData.k;
                                Intrinsics.i(displayType, "displayType");
                                homePageDisplayItemData = new HomePageDisplayItemData(str7, str8, str9, str10, list6, iconType, homePageFeature2, displayType, z6, num, str11, imageResourceSectionAppModelA2);
                            }
                        }
                        arrayList15.add(homePageDisplayItemData);
                        arrayList9 = arrayList9;
                    }
                    arrayList2 = arrayList15;
                }
                return HomeScreenViewState.a(homeScreenViewState2, profileDrawerCardData4, arrayList14, arrayList2, tabMetaDataAppModel4, null, str6, null, null, this.b, null, null, null, null, null, null, this.c, false, false, 458146);
            case 1:
                return LayerKt.c((ScriptRuntime) obj4, (Layer) obj3, (List) obj2, (AnimationState) obj, this.b, this.c);
            case 2:
                BookingHelpAvailabilityAppModel bookingHelpAvailabilityAppModel = (BookingHelpAvailabilityAppModel) obj2;
                return QRValidationDataState.a((QRValidationDataState) obj, (ProductValidationData) obj4, false, QRValidationScreenType.QR_AND_PRODUCT_DETAILS, ((QRValidationComponent) obj3).k.b.b, 0L, 0L, null, null, null, null, this.b, bookingHelpAvailabilityAppModel != null, bookingHelpAvailabilityAppModel != null ? bookingHelpAvailabilityAppModel.f5602a : null, null, null, this.c, false, 91122);
            case 3:
                return SheetState.Companion.Saver$lambda$1(this.b, (Function0) obj4, (Function0) obj3, (Function1) obj2, this.c, (SheetValue) obj);
            default:
                final List list7 = (List) obj4;
                final TextFieldValue textFieldValue = (TextFieldValue) obj3;
                final Function1 function1 = (Function1) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                int size4 = list7.size();
                Function1<Integer, Object> function2 = new Function1<Integer, Object>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposableKt$UniversalSearchListComposable$lambda$1$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        list7.get(((Number) obj11).intValue());
                        return null;
                    }
                };
                final boolean z7 = this.b;
                final boolean z8 = this.c;
                LazyColumn.items(size4, null, function2, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposableKt$UniversalSearchListComposable$lambda$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj11, Object obj12, Object obj13, Object obj14) {
                        int i7;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj11;
                        int iIntValue = ((Number) obj12).intValue();
                        Composer composer = (Composer) obj13;
                        int iIntValue2 = ((Number) obj14).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i7 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i7 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i7 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i7 & 147) != 146, i7 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i7, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            UniversalSearchItem universalSearchItem = (UniversalSearchItem) list7.get(iIntValue);
                            composer.startReplaceGroup(1990107344);
                            if (universalSearchItem instanceof UniversalSearchItem.HeaderItem) {
                                composer.startReplaceGroup(64197794);
                                ChaloHeaderTextComposableKt.c(((UniversalSearchItem.HeaderItem) universalSearchItem).f5000a, composer, 0, 0);
                                composer.endReplaceGroup();
                            } else if (universalSearchItem instanceof UniversalSearchItem.RouteList) {
                                composer.startReplaceGroup(1990272356);
                                UniversalSearchItem.RouteList routeList = (UniversalSearchItem.RouteList) universalSearchItem;
                                final Function1 function3 = function1;
                                boolean zChanged = composer.changed(function3);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposableKt$UniversalSearchListComposable$2$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function3.invoke(UniversalPickerIntent.SeeMoreOrSeeLessItemClickIntent.f5076a);
                                            return Unit.f17538a;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                boolean zChanged2 = composer.changed(function3);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function2<String, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchListComposableKt$UniversalSearchListComposable$2$1$1$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj15, Object obj16) {
                                            String routeId = (String) obj15;
                                            int iIntValue3 = ((Number) obj16).intValue();
                                            Intrinsics.i(routeId, "routeId");
                                            function3.invoke(new UniversalPickerIntent.UniversalSearchRouteItemClick(routeId, iIntValue3 + 1));
                                            return Unit.f17538a;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                UniversalSearchListComposableKt.b(routeList, z7, z8, textFieldValue, function0, (Function2) objRememberedValue2, composer, 0);
                                composer = composer;
                                composer.endReplaceGroup();
                            } else {
                                if (!(universalSearchItem instanceof UniversalSearchItem.PlacesAndStopsItem)) {
                                    throw pk0.p(composer, 64197011);
                                }
                                composer.startReplaceGroup(1991151516);
                                UniversalSearchListComposableKt.a((UniversalSearchItem.PlacesAndStopsItem) universalSearchItem, function1, z8, textFieldValue, composer, 0);
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ b80(List list, boolean z, boolean z2, TextFieldValue textFieldValue, Function1 function1) {
        this.f11175a = 4;
        this.d = list;
        this.b = z;
        this.c = z2;
        this.e = textFieldValue;
        this.f = function1;
    }

    public /* synthetic */ b80(boolean z, Function0 function0, Function0 function1, Function1 function2, boolean z2) {
        this.f11175a = 3;
        this.b = z;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.c = z2;
    }
}
