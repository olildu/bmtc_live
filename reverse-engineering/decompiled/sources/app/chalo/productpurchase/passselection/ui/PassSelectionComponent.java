package app.chalo.productpurchase.passselection.ui;

import androidx.compose.ui.graphics.Color;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.extensions.StringExtsKt;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.productbooking.common.data.models.app.PassOfferTagAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModelKt;
import app.chalo.productbooking.common.data.models.app.ProductConfigSubCategorySelectionAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModelKt;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductFareInfoResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.productselection.ui.RecentProductItemTagText;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.productpurchase.utils.BookingHelper$getSortedProductCategoryList$$inlined$sortedBy$1;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIStateFactory;
import app.chalo.utils.SuperPassUIStateUtils;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ej0;
import defpackage.gf;
import defpackage.np0;
import defpackage.vo1;
import defpackage.ym0;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionDataState;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionUIState;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassSelectionComponent extends ChaloBaseStateMviComponent<PassSelectionIntent, PassSelectionDataState, PassSelectionUIState, PassSelectionEffect> {
    public final ChaloNavigationManager k;
    public final ProductPurchaseRepository l;
    public final BookingHelper m;
    public final StringProvider n;
    public final CurrencyFeature o;
    public final AnalyticsContract p;
    public final TimeUtilsContract q;
    public final BasicInfoContract r;
    public final PassPurchaseSceneResolverUseCase s;
    public PassSelectionRestoreState t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionComponent$Companion;", "", "", "PASS_SELECTION_STATE_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PassSelectionComponent(ComponentContext componentContext, PassSelectionArgs passSelectionArgs, ChaloNavigationManager chaloNavigationManager, ProductPurchaseRepository productPurchaseRepository, BookingHelper bookingHelper, StringProvider stringProvider, CurrencyFeature currencyFeature, AnalyticsContract analyticsContract, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract, PassPurchaseSceneResolverUseCase passPurchaseSceneResolverUseCase) {
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        super(componentContext);
        this.k = chaloNavigationManager;
        this.l = productPurchaseRepository;
        this.m = bookingHelper;
        this.n = stringProvider;
        this.o = currencyFeature;
        this.p = analyticsContract;
        this.q = timeUtilsContract;
        this.r = basicInfoContract;
        this.s = passPurchaseSceneResolverUseCase;
        componentContext.getB().d("passSelectionStateKey", PassSelectionRestoreState.INSTANCE.serializer(), new np0(this, 0));
        Source source = passSelectionArgs.c;
        Source source2 = source == null ? Source.UNKNOWN : source;
        Source source3 = passSelectionArgs.d;
        Source source4 = source3 == null ? Source.UNKNOWN : source3;
        String str = passSelectionArgs.b;
        String str2 = passSelectionArgs.e;
        if (str2 != null) {
            Json json = ChaloJson.b;
            json.getClass();
            superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) json.b(str2, BuiltinSerializersKt.c(SuperPassPurchaseStopsInfo.INSTANCE.serializer()));
        } else {
            superPassPurchaseStopsInfo = null;
        }
        N0(new PassSelectionIntent.InitializationIntent(source2, source4, str, superPassPurchaseStopsInfo, passSelectionArgs.f, passSelectionArgs.g));
    }

    public static final DerivedPassSelectionScreenState F0(PassSelectionComponent passSelectionComponent, ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel) {
        String str;
        passSelectionComponent.m.getClass();
        HashMap mapC = BookingHelper.c(superPassConfigAppModel);
        LinkedHashMap linkedHashMapE = BookingHelper.e(superPassConfigAppModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel : CollectionsKt.v0(new BookingHelper$getSortedProductCategoryList$$inlined$sortedBy$1(), superPassConfigAppModel.t)) {
            if (superPassProductConfigCategoryResponseAppModel.j) {
                linkedHashMap.put(superPassProductConfigCategoryResponseAppModel.f8639a, superPassProductConfigCategoryResponseAppModel);
            }
        }
        List list = superPassConfigAppModel.K;
        String strA = list != null ? ProductConfigCompleteDetailsListAppModelKt.a(list, ProductImageType.PRODUCT_SOCIAL_VALIDATION_URL) : null;
        return new DerivedPassSelectionScreenState(mapC, linkedHashMap, linkedHashMapE.isEmpty() ? new PassSelectionScreenType.PassSelection("", BookingHelper.b("", mapC), linkedHashMap, null, strA) : (linkedHashMapE.size() != 1 || (str = (String) CollectionsKt.G(linkedHashMapE.keySet())) == null) ? new PassSelectionScreenType.SubCategorySelection(linkedHashMapE) : new PassSelectionScreenType.PassSelection(str, BookingHelper.b(str, mapC), linkedHashMap, O0(superPassConfigAppModel, str), strA));
    }

    public static final boolean G0(PassSelectionComponent passSelectionComponent, ProductConfigResponseAppModel productConfigResponseAppModel) {
        passSelectionComponent.getClass();
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            return true;
        }
        if ((productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) || (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object H0(PassSelectionComponent passSelectionComponent, BookableSuperPassConfiguration bookableSuperPassConfiguration, ContinuationImpl continuationImpl) {
        PassSelectionComponent$raiseBookableItemClickedEvent$1 passSelectionComponent$raiseBookableItemClickedEvent$1;
        Pair[] pairArr;
        String str;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        TimeUtilsContract timeUtilsContract;
        AnalyticsContract analyticsContract;
        String str2;
        String str3;
        Pair[] pairArr2;
        int i;
        StateFlow stateFlow = passSelectionComponent.f;
        if (continuationImpl instanceof PassSelectionComponent$raiseBookableItemClickedEvent$1) {
            passSelectionComponent$raiseBookableItemClickedEvent$1 = (PassSelectionComponent$raiseBookableItemClickedEvent$1) continuationImpl;
            int i2 = passSelectionComponent$raiseBookableItemClickedEvent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passSelectionComponent$raiseBookableItemClickedEvent$1.label = i2 - Integer.MIN_VALUE;
            } else {
                passSelectionComponent$raiseBookableItemClickedEvent$1 = new PassSelectionComponent$raiseBookableItemClickedEvent$1(passSelectionComponent, continuationImpl);
            }
        } else {
            passSelectionComponent$raiseBookableItemClickedEvent$1 = new PassSelectionComponent$raiseBookableItemClickedEvent$1(passSelectionComponent, continuationImpl);
        }
        Object obj = passSelectionComponent$raiseBookableItemClickedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = passSelectionComponent$raiseBookableItemClickedEvent$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            AnalyticsContract analyticsContract2 = passSelectionComponent.p;
            pairArr = new Pair[10];
            pairArr[0] = new Pair("isSuperPass", Boolean.TRUE);
            String str4 = bookableSuperPassConfiguration.d.f8639a;
            pairArr[1] = new Pair("passengerType", str4);
            pairArr[2] = new Pair("categoryId", str4);
            TimeUtilsContract timeUtilsContract2 = passSelectionComponent.q;
            BasicInfoContract basicInfoContract = passSelectionComponent.r;
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$0 = bookableSuperPassConfiguration;
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$1 = pairArr;
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$2 = analyticsContract2;
            str = "pass details selected";
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$3 = "pass details selected";
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$4 = "";
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$5 = pairArr;
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$6 = "bookingDate";
            passSelectionComponent$raiseBookableItemClickedEvent$1.L$7 = timeUtilsContract2;
            passSelectionComponent$raiseBookableItemClickedEvent$1.I$0 = 3;
            passSelectionComponent$raiseBookableItemClickedEvent$1.label = 1;
            Object objC = basicInfoContract.c(passSelectionComponent$raiseBookableItemClickedEvent$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            bookableSuperPassConfiguration2 = bookableSuperPassConfiguration;
            timeUtilsContract = timeUtilsContract2;
            analyticsContract = analyticsContract2;
            str2 = "";
            str3 = "bookingDate";
            obj = objC;
            pairArr2 = pairArr;
            i = 3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = passSelectionComponent$raiseBookableItemClickedEvent$1.I$0;
            timeUtilsContract = (TimeUtilsContract) passSelectionComponent$raiseBookableItemClickedEvent$1.L$7;
            str3 = (String) passSelectionComponent$raiseBookableItemClickedEvent$1.L$6;
            pairArr = (Pair[]) passSelectionComponent$raiseBookableItemClickedEvent$1.L$5;
            String str5 = (String) passSelectionComponent$raiseBookableItemClickedEvent$1.L$4;
            str = (String) passSelectionComponent$raiseBookableItemClickedEvent$1.L$3;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) passSelectionComponent$raiseBookableItemClickedEvent$1.L$2;
            pairArr2 = (Pair[]) passSelectionComponent$raiseBookableItemClickedEvent$1.L$1;
            bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) passSelectionComponent$raiseBookableItemClickedEvent$1.L$0;
            ResultKt.b(obj);
            str2 = str5;
            analyticsContract = analyticsContract3;
        }
        pairArr[i] = new Pair(str3, timeUtilsContract.Q(((Number) obj).longValue()));
        pairArr2[4] = new Pair("fare", String.valueOf(bookableSuperPassConfiguration2.c.o.b));
        pairArr2[5] = new Pair("numDays", String.valueOf(AllProductConfigsResponseAppModelKt.i(bookableSuperPassConfiguration2.c)));
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties = bookableSuperPassConfiguration2.b;
        pairArr2[6] = new Pair("productType", superPassProductConfigurationProperties.i);
        pairArr2[7] = new Pair("productSubType", superPassProductConfigurationProperties.j);
        pairArr2[8] = new Pair("productId", ((PassSelectionDataState) stateFlow.getValue()).f8533a);
        pairArr2[9] = new Pair("previousScreen", ((PassSelectionDataState) stateFlow.getValue()).b.name());
        AnalyticsContract.DefaultImpls.a(analyticsContract, str, str2, MapsKt.i(pairArr2), null, true, 8);
        return Unit.f17538a;
    }

    public static ArrayList M0(PassSelectionComponent passSelectionComponent, List list, boolean z) {
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        OfferTagUIState offerTagUIState;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ArrayList arrayList;
        Pair pair;
        Object next;
        ym0 ym0Var = new ym0(passSelectionComponent, 8);
        List<BookableSuperPassConfiguration> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
        for (BookableSuperPassConfiguration bookableSuperPassConfiguration : list2) {
            SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c;
            String str = superPassProductConfigFareMappingResponseAppModel.h;
            SuperPassProductFareInfoResponseAppModel superPassProductFareInfoResponseAppModel = superPassProductConfigFareMappingResponseAppModel.o;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            UITextStyle uITextStyle = UITextStyle.HeadlineMedium;
            String strConcat = "PL_".concat(str2);
            ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
            TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState(str2, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, strConcat, 4088);
            String str3 = superPassProductConfigFareMappingResponseAppModel.f8642a;
            if (superPassProductFareInfoResponseAppModel.c) {
                double d = superPassProductFareInfoResponseAppModel.d;
                int i = (int) d;
                String str4 = (String) ym0Var.invoke(d - ((double) i) == 0.0d ? String.valueOf(i) : String.valueOf(d));
                chaloTextUIState = new TextUIState.ChaloTextUIState(str4, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, vo1.m("PL_", str4), 4088);
            } else {
                double d2 = superPassProductFareInfoResponseAppModel.b;
                int i2 = (int) d2;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) ym0Var.invoke(d2 - ((double) i2) == 0.0d ? String.valueOf(i2) : String.valueOf(d2)), uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            }
            if (superPassProductFareInfoResponseAppModel.c) {
                double d3 = superPassProductFareInfoResponseAppModel.b;
                int i3 = (int) d3;
                chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) ym0Var.invoke(d3 - ((double) i3) == 0.0d ? String.valueOf(i3) : String.valueOf(d3)), uITextStyle, ChaloColorToken.StrikeOffFontColor.f9857a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, UITextDecoration.LineThrough, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7672);
            } else {
                chaloTextUIState2 = null;
            }
            if (z) {
                List list3 = superPassProductConfigFareMappingResponseAppModel.u;
                if (list3 != null) {
                    FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
                    do {
                        if (!anonymousClass1.hasNext()) {
                            next = null;
                            break;
                        }
                        next = anonymousClass1.next();
                    } while (StringsKt.F((String) ((Pair) next).getSecond()));
                    pair = (Pair) next;
                } else {
                    pair = null;
                }
                String str5 = pair != null ? (String) pair.e() : null;
                offerTagUIState = (str5 == null || StringsKt.F(str5)) ? null : new OfferTagUIState(new TextUIState.ChaloTextUIState(str5, UITextStyle.LabelSmall, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_OFFER_GREEN, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 9);
            } else {
                offerTagUIState = null;
            }
            String str6 = superPassProductConfigFareMappingResponseAppModel.s;
            if (str6 == null || str6.length() == 0) {
                chaloTextUIState3 = null;
            } else {
                String str7 = superPassProductConfigFareMappingResponseAppModel.s;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState(str7, UITextStyle.BodySmall, ChaloColorToken.Black_60.f9766a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, vo1.m("PL_", str7), 4088);
            }
            if (str3 == null || str3.length() == 0) {
                chaloTextUIState4 = null;
            } else {
                String str8 = superPassProductConfigFareMappingResponseAppModel.f8642a;
                chaloTextUIState4 = new TextUIState.ChaloTextUIState(str8, UITextStyle.BodyMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, vo1.m("PL_", str8), 4088);
            }
            String str9 = superPassProductConfigFareMappingResponseAppModel.p;
            TextUIState.ChaloTextUIState chaloTextUIState6 = (str9 == null || str9.length() == 0) ? null : new TextUIState.ChaloTextUIState(superPassProductConfigFareMappingResponseAppModel.p, UITextStyle.BodyMedium, ChaloColorToken.DiscountGreen.f9789a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, vo1.m("PL_", str3), 4088);
            List list4 = superPassProductConfigFareMappingResponseAppModel.n;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                RecentProductItemTagText recentProductItemTagTextA = SuperPassUIStateUtils.a((String) it.next());
                if (recentProductItemTagTextA != null) {
                    arrayList3.add(recentProductItemTagTextA);
                }
            }
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = z ? UiEventHandler.Companion.a(new zf0(21, passSelectionComponent, bookableSuperPassConfiguration)) : null;
            float f = z ? 1.0f : 0.4f;
            List list5 = superPassProductConfigFareMappingResponseAppModel.t;
            if (list5 != null) {
                List<PassOfferTagAppModel> list6 = list5;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list6, 10));
                for (PassOfferTagAppModel passOfferTagAppModel : list6) {
                    String str10 = passOfferTagAppModel.c;
                    UITextStyle uITextStyle2 = UITextStyle.BodySmall;
                    Color.Companion companion = Color.INSTANCE;
                    arrayList4.add(new PassCategoryTagUIState(new TextUIState.ChaloTextUIState(str10, uITextStyle2, new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(companion, passOfferTagAppModel.b, Color.INSTANCE.m4640getTransparent0d7_KjU())), 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(companion, passOfferTagAppModel.f8192a, Color.INSTANCE.m4640getTransparent0d7_KjU()))));
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            arrayList2.add(new PassCategorySectionItemUIState.BookableConfigItemUIState(chaloTextUIState5, chaloTextUIState, chaloTextUIState2, offerTagUIState, chaloTextUIState6, chaloTextUIState4, chaloTextUIState3, arrayList3, uiEventHandler$Companion$fromLambda$1A, f, arrayList));
        }
        ArrayList arrayListE0 = CollectionsKt.E0(arrayList2);
        arrayListE0.add(new PassCategorySectionItemUIState.PWidgetUIState());
        return arrayListE0;
    }

    public static SuperPassProductConfigSubCategoryResponseAppModel O0(ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel, String str) {
        Object next;
        Iterator it = superPassConfigAppModel.E.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((SuperPassProductConfigSubCategoryResponseAppModel) next).f8644a, str)) {
                return (SuperPassProductConfigSubCategoryResponseAppModel) next;
            }
        }
        next = null;
        return (SuperPassProductConfigSubCategoryResponseAppModel) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object I0(SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel, SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel, ContinuationImpl continuationImpl) {
        PassSelectionComponent$categoryLevelDisabledBanner$1 passSelectionComponent$categoryLevelDisabledBanner$1;
        String str;
        if (continuationImpl instanceof PassSelectionComponent$categoryLevelDisabledBanner$1) {
            passSelectionComponent$categoryLevelDisabledBanner$1 = (PassSelectionComponent$categoryLevelDisabledBanner$1) continuationImpl;
            int i = passSelectionComponent$categoryLevelDisabledBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passSelectionComponent$categoryLevelDisabledBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                passSelectionComponent$categoryLevelDisabledBanner$1 = new PassSelectionComponent$categoryLevelDisabledBanner$1(this, continuationImpl);
            }
        } else {
            passSelectionComponent$categoryLevelDisabledBanner$1 = new PassSelectionComponent$categoryLevelDisabledBanner$1(this, continuationImpl);
        }
        Object objB = passSelectionComponent$categoryLevelDisabledBanner$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passSelectionComponent$categoryLevelDisabledBanner$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String str2 = (superPassProductConfigSubCategoryResponseAppModel == null || superPassProductConfigSubCategoryResponseAppModel.d) ? null : superPassProductConfigSubCategoryResponseAppModel.i;
            str = ((str2 == null || str2.length() == 0) && !superPassProductConfigCategoryResponseAppModel.e) ? superPassProductConfigCategoryResponseAppModel.i : str2;
            passSelectionComponent$categoryLevelDisabledBanner$1.L$0 = str;
            passSelectionComponent$categoryLevelDisabledBanner$1.label = 1;
            objB = this.n.b(StringEnum.MULTIPLE_DURATION_DISABLED_TEXT, new Object[0], passSelectionComponent$categoryLevelDisabledBanner$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) passSelectionComponent$categoryLevelDisabledBanner$1.L$0;
            ResultKt.b(objB);
        }
        String text = StringExtsKt.b(str, (String) objB);
        Intrinsics.i(text, "text");
        return new ProductDisabledBannerUIState(new ImageUIState(IconType.ALERT_ICON_ORANGE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().j), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), new TextUIState.ChaloTextUIState(text, UITextStyle.HeadlineSmall, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x031a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0321  */
    /* JADX WARN: Code duplicated, block: B:107:0x0327  */
    /* JADX WARN: Code duplicated, block: B:108:0x0329  */
    /* JADX WARN: Code duplicated, block: B:109:0x032b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0331  */
    /* JADX WARN: Code duplicated, block: B:114:0x0338  */
    /* JADX WARN: Code duplicated, block: B:116:0x0340  */
    /* JADX WARN: Code duplicated, block: B:117:0x0345  */
    /* JADX WARN: Code duplicated, block: B:121:0x0350  */
    /* JADX WARN: Code duplicated, block: B:124:0x0381  */
    /* JADX WARN: Code duplicated, block: B:125:0x0390  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:130:0x03df  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:134:0x0441  */
    /* JADX WARN: Code duplicated, block: B:135:0x0446  */
    /* JADX WARN: Code duplicated, block: B:139:0x0470  */
    /* JADX WARN: Code duplicated, block: B:141:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0183  */
    /* JADX WARN: Code duplicated, block: B:33:0x0194  */
    /* JADX WARN: Code duplicated, block: B:36:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x021e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0224  */
    /* JADX WARN: Code duplicated, block: B:59:0x0239  */
    /* JADX WARN: Code duplicated, block: B:61:0x023d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0243  */
    /* JADX WARN: Code duplicated, block: B:64:0x0249  */
    /* JADX WARN: Code duplicated, block: B:66:0x024d  */
    /* JADX WARN: Code duplicated, block: B:67:0x028f  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0305  */
    /* JADX WARN: Code duplicated, block: B:92:0x0309  */
    /* JADX WARN: Code duplicated, block: B:94:0x030d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0310  */
    /* JADX WARN: Code duplicated, block: B:98:0x0314  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0470 -> B:140:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x04a6 -> B:142:0x04b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object J0(app.chalo.productpurchase.passselection.ui.PassSelectionScreenType.PassSelection r40, kotlin.coroutines.jvm.internal.ContinuationImpl r41) {
        /*
            Method dump skipped, instruction units count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passselection.ui.PassSelectionComponent.J0(app.chalo.productpurchase.passselection.ui.PassSelectionScreenType$PassSelection, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final Object p0(PassSelectionDataState passSelectionDataState, ContinuationImpl continuationImpl) {
        PassSelectionComponent$convertToUiState$1 passSelectionComponent$convertToUiState$1;
        ToolbarUIState toolbarUIState;
        PassSelectionScreenTypeUIState subCategorySelection;
        ToolbarUIState toolbarUIState2;
        SubCategoryBubbleUIState subCategoryBubbleUIState;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel;
        String str;
        ProductConfigSubCategorySelectionAppModel productConfigSubCategorySelectionAppModel2;
        String str2;
        PassSelectionDataState passSelectionDataState2 = passSelectionDataState;
        if (continuationImpl instanceof PassSelectionComponent$convertToUiState$1) {
            passSelectionComponent$convertToUiState$1 = (PassSelectionComponent$convertToUiState$1) continuationImpl;
            int i = passSelectionComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passSelectionComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                passSelectionComponent$convertToUiState$1 = new PassSelectionComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            passSelectionComponent$convertToUiState$1 = new PassSelectionComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objP0 = passSelectionComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passSelectionComponent$convertToUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objP0);
            passSelectionComponent$convertToUiState$1.L$0 = passSelectionDataState2;
            passSelectionComponent$convertToUiState$1.label = 1;
            objP0 = P0(passSelectionDataState2, passSelectionComponent$convertToUiState$1);
            if (objP0 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            passSelectionDataState2 = (PassSelectionDataState) passSelectionComponent$convertToUiState$1.L$0;
            ResultKt.b(objP0);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toolbarUIState2 = (ToolbarUIState) passSelectionComponent$convertToUiState$1.L$0;
            ResultKt.b(objP0);
        }
        subCategorySelection = (PassSelectionScreenTypeUIState) objP0;
        toolbarUIState = toolbarUIState2;
        return new PassSelectionUIState(toolbarUIState, subCategorySelection);
        toolbarUIState = (ToolbarUIState) objP0;
        PassSelectionScreenType passSelectionScreenType = passSelectionDataState2.h;
        subCategorySelection = null;
        if (passSelectionScreenType instanceof PassSelectionScreenType.SubCategorySelection) {
            ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = passSelectionDataState2.e;
            PassSelectionScreenType.SubCategorySelection subCategorySelection2 = (PassSelectionScreenType.SubCategorySelection) passSelectionScreenType;
            ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
            TextUIState.ChaloTextUIState chaloTextUIState = (superPassConfigAppModel == null || (productConfigSubCategorySelectionAppModel2 = superPassConfigAppModel.F) == null || (str2 = productConfigSubCategorySelectionAppModel2.f8220a) == null) ? null : new TextUIState.ChaloTextUIState(str2, UITextStyle.DisplaySmall, black_87, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
            TextUIState.ChaloTextUIState chaloTextUIState2 = (superPassConfigAppModel == null || (productConfigSubCategorySelectionAppModel = superPassConfigAppModel.F) == null || (str = productConfigSubCategorySelectionAppModel.b) == null) ? null : new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            Collection<SuperPassProductConfigSubCategoryResponseAppModel> collectionValues = subCategorySelection2.f8547a.values();
            ArrayList arrayList = new ArrayList();
            for (SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel : collectionValues) {
                if (superPassProductConfigSubCategoryResponseAppModel.e) {
                    String text = superPassProductConfigSubCategoryResponseAppModel.b;
                    boolean z = superPassProductConfigSubCategoryResponseAppModel.d;
                    zf0 zf0Var = z ? new zf0(23, this, superPassProductConfigSubCategoryResponseAppModel) : null;
                    float f = z ? 1.0f : 0.4f;
                    Intrinsics.i(text, "text");
                    subCategoryBubbleUIState = new SubCategoryBubbleUIState(new TextUIState.ChaloTextUIState(text, UITextStyle.HeadlineSmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), ChaloColorToken.ShimmerBackground.f9852a, f, zf0Var != null ? UiEventHandler.Companion.a(zf0Var) : null);
                } else {
                    subCategoryBubbleUIState = null;
                }
                if (subCategoryBubbleUIState != null) {
                    arrayList.add(subCategoryBubbleUIState);
                }
            }
            subCategorySelection = new PassSelectionScreenTypeUIState.SubCategorySelection(chaloTextUIState, chaloTextUIState2, new SubCategoryGridListUIState(arrayList));
        } else {
            if (passSelectionScreenType instanceof PassSelectionScreenType.PassSelection) {
                passSelectionComponent$convertToUiState$1.L$0 = toolbarUIState;
                passSelectionComponent$convertToUiState$1.label = 2;
                Object objJ0 = J0((PassSelectionScreenType.PassSelection) passSelectionScreenType, passSelectionComponent$convertToUiState$1);
                if (objJ0 != obj) {
                    objP0 = objJ0;
                    toolbarUIState2 = toolbarUIState;
                    subCategorySelection = (PassSelectionScreenTypeUIState) objP0;
                    toolbarUIState = toolbarUIState2;
                }
                return obj;
            }
            if (passSelectionScreenType != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new PassSelectionUIState(toolbarUIState, subCategorySelection);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L0(String str, ContinuationImpl continuationImpl) {
        PassSelectionComponent$inactivePlansAnnouncement$1 passSelectionComponent$inactivePlansAnnouncement$1;
        if (continuationImpl instanceof PassSelectionComponent$inactivePlansAnnouncement$1) {
            passSelectionComponent$inactivePlansAnnouncement$1 = (PassSelectionComponent$inactivePlansAnnouncement$1) continuationImpl;
            int i = passSelectionComponent$inactivePlansAnnouncement$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passSelectionComponent$inactivePlansAnnouncement$1.label = i - Integer.MIN_VALUE;
            } else {
                passSelectionComponent$inactivePlansAnnouncement$1 = new PassSelectionComponent$inactivePlansAnnouncement$1(this, continuationImpl);
            }
        } else {
            passSelectionComponent$inactivePlansAnnouncement$1 = new PassSelectionComponent$inactivePlansAnnouncement$1(this, continuationImpl);
        }
        Object objB = passSelectionComponent$inactivePlansAnnouncement$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passSelectionComponent$inactivePlansAnnouncement$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            passSelectionComponent$inactivePlansAnnouncement$1.L$0 = str;
            passSelectionComponent$inactivePlansAnnouncement$1.label = 1;
            objB = this.n.b(StringEnum.INACTIVE_PLANS_DESC, new Object[0], passSelectionComponent$inactivePlansAnnouncement$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) passSelectionComponent$inactivePlansAnnouncement$1.L$0;
            ResultKt.b(objB);
        }
        return PassSelectionContractKt.a(StringExtsKt.b(str, (String) objB), false);
    }

    public final void N0(PassSelectionIntent passSelectionIntent) {
        C0(passSelectionIntent);
        boolean z = passSelectionIntent instanceof PassSelectionIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new PassSelectionComponent$handleInitializationIntent$1(this, (PassSelectionIntent.InitializationIntent) passSelectionIntent, null), 3);
            return;
        }
        boolean z2 = passSelectionIntent instanceof PassSelectionIntent.SubCategorySelectedIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            PassSelectionIntent.SubCategorySelectedIntent subCategorySelectedIntent = (PassSelectionIntent.SubCategorySelectedIntent) passSelectionIntent;
            String str = subCategorySelectedIntent.f8539a;
            ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = ((PassSelectionDataState) stateFlow.getValue()).e;
            AnalyticsContract.DefaultImpls.a(this.p, "subCategory selected", "", MapsKt.i(new Pair("configId", String.valueOf(superPassConfigAppModel != null ? superPassConfigAppModel.j : null)), new Pair("selected subCategory", str), new Pair("isSuperPass", Boolean.TRUE)), null, true, 8);
            E0(new ej0(22, subCategorySelectedIntent, this));
            return;
        }
        if (!passSelectionIntent.equals(PassSelectionIntent.BackClickedIntent.f8534a)) {
            if (passSelectionIntent instanceof PassSelectionIntent.PassFareMappingSelectedIntent) {
                BuildersKt.d(contextScope, null, null, new PassSelectionComponent$handlePassFareMappingSelectedIntent$1((PassSelectionIntent.PassFareMappingSelectedIntent) passSelectionIntent, this, null), 3);
                return;
            }
            if (!(passSelectionIntent instanceof PassSelectionIntent.CategoryPageSelectedIntent)) {
                if (!(passSelectionIntent instanceof PassSelectionIntent.FAQClickedIntent)) {
                    throw new NoWhenBranchMatchedException();
                }
                BuildersKt.d(contextScope, null, null, new PassSelectionComponent$handleFAQClickedIntent$1(this, (PassSelectionIntent.FAQClickedIntent) passSelectionIntent, null), 3);
                return;
            }
            PassSelectionIntent.CategoryPageSelectedIntent categoryPageSelectedIntent = (PassSelectionIntent.CategoryPageSelectedIntent) passSelectionIntent;
            Pair pair = new Pair("categoryName", categoryPageSelectedIntent.f8535a);
            ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel2 = ((PassSelectionDataState) stateFlow.getValue()).e;
            Pair pair2 = new Pair("productType", String.valueOf(superPassConfigAppModel2 != null ? superPassConfigAppModel2.j : null));
            ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel3 = ((PassSelectionDataState) stateFlow.getValue()).e;
            AnalyticsContract.DefaultImpls.a(this.p, "category selected", "", MapsKt.i(pair, pair2, new Pair("configId", String.valueOf(superPassConfigAppModel3 != null ? superPassConfigAppModel3.j : null)), new Pair("isSuperPass", Boolean.TRUE), new Pair("previousScreen", ((PassSelectionDataState) stateFlow.getValue()).b.getSourceName())), null, true, 8);
            AnalyticsContractImplKt.b(this.p, "page selected", Source.PASS_SELECTION_ACTIVITY, MapsKt.h(new Pair("position", Integer.valueOf(categoryPageSelectedIntent.b))), false, 24);
            return;
        }
        PassSelectionDataState passSelectionDataState = (PassSelectionDataState) stateFlow.getValue();
        PassSelectionScreenType passSelectionScreenType = passSelectionDataState.h;
        boolean z3 = passSelectionScreenType instanceof PassSelectionScreenType.PassSelection;
        ChaloNavigationManager chaloNavigationManager = this.k;
        if (!z3) {
            if (!(passSelectionScreenType instanceof PassSelectionScreenType.SubCategorySelection) && passSelectionScreenType != null) {
                throw new NoWhenBranchMatchedException();
            }
            gf.u(null, chaloNavigationManager);
            return;
        }
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel4 = passSelectionDataState.e;
        this.m.getClass();
        if (BookingHelper.e(superPassConfigAppModel4).size() <= 1) {
            gf.u(null, chaloNavigationManager);
        } else {
            E0(new ej0(21, this, passSelectionDataState));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object P0(PassSelectionDataState passSelectionDataState, ContinuationImpl continuationImpl) {
        PassSelectionComponent$toolbar$1 passSelectionComponent$toolbar$1;
        String str;
        ToolbarUIStateFactory toolbarUIStateFactory;
        String str2;
        List list;
        TextUIState textUIState;
        List listR;
        TextUIState textUIState2;
        String str3;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PassSelectionComponent$toolbar$1) {
            passSelectionComponent$toolbar$1 = (PassSelectionComponent$toolbar$1) continuationImpl;
            int i = passSelectionComponent$toolbar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passSelectionComponent$toolbar$1.label = i - Integer.MIN_VALUE;
            } else {
                passSelectionComponent$toolbar$1 = new PassSelectionComponent$toolbar$1(this, continuationImpl);
            }
        } else {
            passSelectionComponent$toolbar$1 = new PassSelectionComponent$toolbar$1(this, continuationImpl);
        }
        Object objB = passSelectionComponent$toolbar$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passSelectionComponent$toolbar$1.label;
        StringProvider stringProvider = this.n;
        if (i2 != 0) {
            if (i2 == 1) {
                toolbarUIStateFactory = (ToolbarUIStateFactory) passSelectionComponent$toolbar$1.L$1;
                str = (String) passSelectionComponent$toolbar$1.L$0;
                ResultKt.b(objB);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChaloTextStyleHelper chaloTextStyleHelper2 = (ChaloTextStyleHelper) passSelectionComponent$toolbar$1.L$2;
                textUIState2 = (TextUIState) passSelectionComponent$toolbar$1.L$1;
                str3 = (String) passSelectionComponent$toolbar$1.L$0;
                ResultKt.b(objB);
                chaloTextStyleHelper = chaloTextStyleHelper2;
            }
            TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) objB, ChaloColorToken.AlmostBlackColor.f9756a, null, null, null, null, 124);
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new zf0(22, this, str3));
            BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c);
            float f = ChaloThemeHelper.a().f;
            listR = CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(null, chaloTextUIStateC, uiEventHandler$Companion$fromLambda$1A, borderUISpec, new ChaloPadding(f, f, f, f), 24));
            textUIState = textUIState2;
            return new ToolbarUIState(null, textUIState, null, null, listR, 0.0f, null, null, 237);
        }
        ResultKt.b(objB);
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = passSelectionDataState.e;
        String strA = (superPassConfigAppModel == null || (list = superPassConfigAppModel.K) == null) ? null : ProductConfigCompleteDetailsListAppModelKt.a(list, ProductImageType.PLAN_SCREEN_FAQS_URL);
        PassSelectionScreenType passSelectionScreenType = passSelectionDataState.h;
        boolean z = passSelectionScreenType instanceof PassSelectionScreenType.SubCategorySelection;
        ToolbarUIStateFactory toolbarUIStateFactory2 = ToolbarUIStateFactory.f10120a;
        if (z) {
            ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel2 = passSelectionDataState.e;
            if (superPassConfigAppModel2 == null || (str2 = superPassConfigAppModel2.m) == null) {
                str2 = "";
            }
            return new ToolbarUIState(null, ToolbarUIStateFactory.a(toolbarUIStateFactory2, str2, 14), null, null, null, 0.0f, null, null, 253);
        }
        if (!(passSelectionScreenType instanceof PassSelectionScreenType.PassSelection)) {
            if (passSelectionScreenType == null) {
                return new ToolbarUIState(null, null, null, null, null, 0.0f, null, null, 255);
            }
            throw new NoWhenBranchMatchedException();
        }
        passSelectionComponent$toolbar$1.L$0 = strA;
        passSelectionComponent$toolbar$1.L$1 = toolbarUIStateFactory2;
        passSelectionComponent$toolbar$1.label = 1;
        Object objB2 = stringProvider.b(StringEnum.PASS_HEADER, new Object[0], passSelectionComponent$toolbar$1);
        if (objB2 != coroutineSingletons) {
            str = strA;
            objB = objB2;
            toolbarUIStateFactory = toolbarUIStateFactory2;
        }
        return coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIStateA = ToolbarUIStateFactory.a(toolbarUIStateFactory, (String) objB, 14);
        if (str != null && str.length() != 0) {
            passSelectionComponent$toolbar$1.L$0 = str;
            passSelectionComponent$toolbar$1.L$1 = chaloTextUIStateA;
            ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
            passSelectionComponent$toolbar$1.L$2 = chaloTextStyleHelper3;
            passSelectionComponent$toolbar$1.label = 2;
            objB = stringProvider.b(StringEnum.FAQS, new Object[0], passSelectionComponent$toolbar$1);
            if (objB != coroutineSingletons) {
                textUIState2 = chaloTextUIStateA;
                str3 = str;
                chaloTextStyleHelper = chaloTextStyleHelper3;
                TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) objB, ChaloColorToken.AlmostBlackColor.f9756a, null, null, null, null, 124);
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new zf0(22, this, str3));
                BorderUISpec borderUISpec2 = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, UIShape.c);
                float f2 = ChaloThemeHelper.a().f;
                listR = CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(null, chaloTextUIStateC2, uiEventHandler$Companion$fromLambda$1A2, borderUISpec2, new ChaloPadding(f2, f2, f2, f2), 24));
                textUIState = textUIState2;
            }
            return coroutineSingletons;
        }
        textUIState = chaloTextUIStateA;
        listR = EmptyList.f17557a;
        return new ToolbarUIState(null, textUIState, null, null, listR, 0.0f, null, null, 237);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        if (this.t == null) {
            this.t = (PassSelectionRestoreState) this.f5983a.getB().a("passSelectionStateKey", PassSelectionRestoreState.INSTANCE.serializer());
        }
        PassSelectionRestoreState passSelectionRestoreState = this.t;
        if (passSelectionRestoreState == null) {
            return new PassSelectionDataState(FrameMetricsAggregator.EVERY_DURATION, null, null, null, null);
        }
        String str = passSelectionRestoreState.f8540a;
        Source source = passSelectionRestoreState.b;
        if (source == null) {
            source = Source.UNKNOWN;
        }
        Source source2 = source;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = passSelectionRestoreState.c;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType = passSelectionRestoreState.d;
        if (postPassPurchaseSuccessFlowType == null) {
            postPassPurchaseSuccessFlowType = PostPassPurchaseSuccessFlowType.ACTIVATION;
        }
        return new PassSelectionDataState(496, source2, superPassPurchaseStopsInfo, postPassPurchaseSuccessFlowType, str);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        StateFlow stateFlow = this.f;
        String str = ((PassSelectionDataState) stateFlow.getValue()).f8533a;
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = ((PassSelectionDataState) stateFlow.getValue()).e;
        if (str.length() == 0 || superPassConfigAppModel == null) {
            return;
        }
        BuildersKt.d(this.j, null, null, new PassSelectionComponent$onViewStateActive$1(this, str, superPassConfigAppModel, null), 3);
    }
}
