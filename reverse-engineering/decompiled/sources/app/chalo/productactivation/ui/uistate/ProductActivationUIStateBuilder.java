package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.ChaloRouteTagsPalette;
import app.chalo.compose.components.userprofile.UserProfilePicComposableKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUISpecs;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.helper.HomeScreenConfigDataHelper;
import app.chalo.instantticket.data.model.app.InstantTicketPassengerDetailsAppModel;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntityKt;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketPassengerDetails;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketSequenceInfo;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import app.chalo.multimodalticket.ui.MultiModalGroupTicketChildUIStateMapperKt;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.productactivation.data.ActivationProductDataKt;
import app.chalo.productactivation.ui.ProductActivationIntent;
import app.chalo.productactivation.ui.SetUpProfileBtnUIState;
import app.chalo.productactivation.ui.UserProfilingTicketActivationBannerUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetContentUiSpecs;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.DrawType;
import app.chalo.uistate.branding.ImageResourceBrandingUISpecs;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureDataUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.userprofile.Gender;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.gf;
import defpackage.iw0;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ProductActivationUIStateBuilder;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductActivationUIStateBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f8070a;
    public final CurrencyFeature b;
    public final TimeUtilsContract c;
    public final BasicInfoContract d;
    public final MTicketUtilsHelper e;
    public final HomeScreenConfigDataHelper f;
    public final ChaloAppFeatureHelper g;
    public final StepTicketModeBasedInfoUIStateFactory h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8071a;

        static {
            int[] iArr = new int[BannerStatus.values().length];
            try {
                iArr[BannerStatus.IN_PROCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerStatus.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8071a = iArr;
        }
    }

    public ProductActivationUIStateBuilder(StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, BasicInfoContract basicInfoContract, MTicketUtilsHelper mTicketUtilsHelper, HomeScreenConfigDataHelper homeScreenConfigDataHelper, ChaloAppFeatureHelper chaloAppFeatureHelper, StepTicketModeBasedInfoUIStateFactory stepTicketModeBasedInfoUIStateFactory) {
        this.f8070a = stringProvider;
        this.b = currencyFeature;
        this.c = timeUtilsContract;
        this.d = basicInfoContract;
        this.e = mTicketUtilsHelper;
        this.f = homeScreenConfigDataHelper;
        this.g = chaloAppFeatureHelper;
        this.h = stepTicketModeBasedInfoUIStateFactory;
    }

    public static TextUIState.ChaloTextUIState B(String str) {
        return new TextUIState.ChaloTextUIState(str, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    public static Map D(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InstantTicketPassengerDetailsAppModel instantTicketPassengerDetailsAppModel = (InstantTicketPassengerDetailsAppModel) it.next();
                String str = instantTicketPassengerDetailsAppModel.b;
                if (StringsKt.F(str)) {
                    str = null;
                }
                Pair pair = str == null ? null : new Pair(str, Integer.valueOf(instantTicketPassengerDetailsAppModel.c));
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map mapQ = MapsKt.q(arrayList);
            if (!mapQ.isEmpty()) {
                return mapQ;
            }
        }
        return null;
    }

    public static StyledTextDataUIState b(String str) {
        return new StyledTextDataUIState(str, ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012);
    }

    public static ActivationTicketRouteDetailsUIState d(String str, String str2, String str3, List spf, List specialFeatures, Map map) {
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState;
        Intrinsics.i(spf, "spf");
        Intrinsics.i(specialFeatures, "specialFeatures");
        ArrayList arrayListC0 = CollectionsKt.c0(spf, specialFeatures);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(arrayListC0, 10));
        int size = arrayListC0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListC0.get(i2);
            i2++;
            String str4 = (String) obj;
            arrayList.add(new TextWithSpecialFeatureDataUIState.SpecialFeature(ChaloRouteTagsPalette.a(str4), new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloRouteTagsPalette.b(str4), 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
        }
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new TextWithSpecialFeatureDataUIState.SimpleText(new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120)));
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add((TextWithSpecialFeatureDataUIState.SpecialFeature) obj2);
            }
            textWithSpecialFeaturesTagsUIState = new TextWithSpecialFeaturesTagsUIState(arrayList2);
        } else {
            textWithSpecialFeaturesTagsUIState = null;
        }
        TextUIState.ChaloTextUIState chaloTextUIStateN = map != null ? n(map) : null;
        ActivationTicketRouteDetailsHeader.SingleTicket singleTicket = new ActivationTicketRouteDetailsHeader.SingleTicket(new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), textWithSpecialFeaturesTagsUIState);
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        return new ActivationTicketRouteDetailsUIState(singleTicket, str2 != null ? new TextUIState.ChaloTextUIState(str2, UITextStyle.BodySmall, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null, str3 != null ? new TextUIState.ChaloTextUIState(str3, UITextStyle.BodySmall, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null, null, chaloTextUIStateN, 77);
    }

    public static /* synthetic */ ActivationTicketRouteDetailsUIState e(String str, String str2, String str3, List list, List list2) {
        return d(str, str2, str3, list, list2, null);
    }

    public static String j(String str, String str2, String str3) {
        return StringsKt.x(str, str2, true) ? vo1.n(str, " ", str3) : str3;
    }

    public static LinkedHashMap k(List list) {
        List<MultiModalGroupTicketPassengerDetails> list2 = list;
        int iG = MapsKt.g(CollectionsKt.v(list2, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (MultiModalGroupTicketPassengerDetails multiModalGroupTicketPassengerDetails : list2) {
            Pair pair = new Pair(multiModalGroupTicketPassengerDetails.b, Integer.valueOf(multiModalGroupTicketPassengerDetails.c));
            linkedHashMap.put(pair.d(), pair.e());
        }
        return linkedHashMap;
    }

    public static /* synthetic */ Object m(ProductActivationUIStateBuilder productActivationUIStateBuilder, Function1 function1, Continuation continuation) {
        return productActivationUIStateBuilder.l(function1, StringEnum.VALIDATE_NOW, (ContinuationImpl) continuation);
    }

    public static TextUIState.ChaloTextUIState n(Map map) {
        if (map.isEmpty()) {
            return null;
        }
        Set setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.v(setEntrySet, 10));
        int i = 0;
        for (Object obj : setEntrySet) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            String strConcat = ((Number) entry.getValue()).intValue() + " " + ((String) entry.getKey());
            if (strConcat.length() > 0 && i < map.size() - 1) {
                strConcat = strConcat.concat(" | ");
            }
            arrayList.add(strConcat);
            i = i2;
        }
        return new TextUIState.ChaloTextUIState(StringsKt.v0(CollectionsKt.O(arrayList, "", null, null, null, 62)).toString(), UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    public static TopBarUIState r(String str, Function0 function0) {
        return new TopBarUIState(new ImageUIState(IconType.IC_ACTIVATION_CHECK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ACTIVATION_HELP, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(function0), 118));
    }

    /* JADX WARN: Code duplicated, block: B:141:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:150:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:151:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:158:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:161:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:162:0x0ab4  */
    /* JADX WARN: Code duplicated, block: B:165:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:169:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:173:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:176:0x0b16  */
    /* JADX WARN: Code duplicated, block: B:178:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:179:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:182:0x0b63  */
    /* JADX WARN: Code duplicated, block: B:184:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:192:0x0b75  */
    /* JADX WARN: Code duplicated, block: B:195:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:199:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:202:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:205:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:209:0x0c60  */
    /* JADX WARN: Code duplicated, block: B:213:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0ccd  */
    /* JADX WARN: Code duplicated, block: B:283:0x0f19  */
    /* JADX WARN: Code duplicated, block: B:285:0x0f21  */
    /* JADX WARN: Code duplicated, block: B:288:0x0f6f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0f80  */
    /* JADX WARN: Code duplicated, block: B:294:0x0fa0  */
    /* JADX WARN: Code duplicated, block: B:297:0x0fb1  */
    /* JADX WARN: Code duplicated, block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v161, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v162, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v165, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:288:0x0f6f -> B:289:0x0f7c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object A(java.lang.String r73, app.chalo.productactivation.data.ActivationProductData r74, app.chalo.home.data.model.app.response.BannerUiDataAppModel r75, app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome r76, boolean r77, kotlin.jvm.functions.Function1 r78, kotlin.coroutines.jvm.internal.ContinuationImpl r79) {
        /*
            Method dump skipped, instruction units count: 6086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder.A(java.lang.String, app.chalo.productactivation.data.ActivationProductData, app.chalo.home.data.model.app.response.BannerUiDataAppModel, app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object C(StringEnum stringEnum, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$sectionTitle$1 productActivationUIStateBuilder$sectionTitle$1;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$sectionTitle$1) {
            productActivationUIStateBuilder$sectionTitle$1 = (ProductActivationUIStateBuilder$sectionTitle$1) continuationImpl;
            int i = productActivationUIStateBuilder$sectionTitle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$sectionTitle$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$sectionTitle$1 = new ProductActivationUIStateBuilder$sectionTitle$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$sectionTitle$1 = new ProductActivationUIStateBuilder$sectionTitle$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$sectionTitle$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$sectionTitle$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            productActivationUIStateBuilder$sectionTitle$1.label = 1;
            objB = this.f8070a.b(stringEnum, new Object[0], productActivationUIStateBuilder$sectionTitle$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object E(PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$upsellFailureNotice$1 productActivationUIStateBuilder$upsellFailureNotice$1;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str;
        ProductActivationUIStateBuilder productActivationUIStateBuilder;
        ImageUIState imageUIState2;
        PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome2 = premiumBusUpsellRideOutcome;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$upsellFailureNotice$1) {
            productActivationUIStateBuilder$upsellFailureNotice$1 = (ProductActivationUIStateBuilder$upsellFailureNotice$1) continuationImpl;
            int i = productActivationUIStateBuilder$upsellFailureNotice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$upsellFailureNotice$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$upsellFailureNotice$1 = new ProductActivationUIStateBuilder$upsellFailureNotice$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$upsellFailureNotice$1 = new ProductActivationUIStateBuilder$upsellFailureNotice$1(this, continuationImpl);
        }
        Object objC = productActivationUIStateBuilder$upsellFailureNotice$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$upsellFailureNotice$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (!(premiumBusUpsellRideOutcome2 instanceof PremiumBusUpsellRideOutcome.Failed)) {
                return null;
            }
            imageUIState = new ImageUIState(IconType.IC_ERROR_ALERT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            StringEnum stringEnum = StringEnum.WE_COULDNT_BOOK_YOUR_RIDE;
            productActivationUIStateBuilder$upsellFailureNotice$1.L$0 = premiumBusUpsellRideOutcome2;
            productActivationUIStateBuilder$upsellFailureNotice$1.L$1 = imageUIState;
            productActivationUIStateBuilder$upsellFailureNotice$1.label = 1;
            objC = C(stringEnum, productActivationUIStateBuilder$upsellFailureNotice$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ImageUIState imageUIState3 = (ImageUIState) productActivationUIStateBuilder$upsellFailureNotice$1.L$1;
            PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome3 = (PremiumBusUpsellRideOutcome) productActivationUIStateBuilder$upsellFailureNotice$1.L$0;
            ResultKt.b(objC);
            imageUIState = imageUIState3;
            premiumBusUpsellRideOutcome2 = premiumBusUpsellRideOutcome3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productActivationUIStateBuilder = (ProductActivationUIStateBuilder) productActivationUIStateBuilder$upsellFailureNotice$1.L$2;
            chaloTextUIState = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$upsellFailureNotice$1.L$1;
            imageUIState2 = (ImageUIState) productActivationUIStateBuilder$upsellFailureNotice$1.L$0;
            ResultKt.b(objC);
        }
        str = (String) objC;
        imageUIState = imageUIState2;
        productActivationUIStateBuilder.getClass();
        return new ActivationNoticeUIState(imageUIState, chaloTextUIState, B(str));
        TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) objC;
        String str2 = ((PremiumBusUpsellRideOutcome.Failed) premiumBusUpsellRideOutcome2).b;
        if (str2 == null) {
            productActivationUIStateBuilder$upsellFailureNotice$1.L$0 = imageUIState;
            productActivationUIStateBuilder$upsellFailureNotice$1.L$1 = chaloTextUIState2;
            productActivationUIStateBuilder$upsellFailureNotice$1.L$2 = this;
            productActivationUIStateBuilder$upsellFailureNotice$1.label = 2;
            Object objB = this.f8070a.b(StringEnum.YOUR_PASS_IS_ACTIVE_YOU_CAN_BOOK_YOUR_RIDE_USING_IT, new Object[0], productActivationUIStateBuilder$upsellFailureNotice$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState = chaloTextUIState2;
                imageUIState2 = imageUIState;
                objC = objB;
                productActivationUIStateBuilder = this;
                str = (String) objC;
                imageUIState = imageUIState2;
            }
            return coroutineSingletons;
        }
        chaloTextUIState = chaloTextUIState2;
        str = str2;
        productActivationUIStateBuilder = this;
        productActivationUIStateBuilder.getClass();
        return new ActivationNoticeUIState(imageUIState, chaloTextUIState, B(str));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x0198  */
    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        if (r1 == r9) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.productactivation.ui.ProductActivationDataState r22, kotlin.jvm.functions.Function1 r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder.a(app.chalo.productactivation.ui.ProductActivationDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(List list, List list2, String str, String str2, LinkedHashMap linkedHashMap, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1 productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ActivationTicketRouteDetailsHeader activationTicketRouteDetailsHeader;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1) {
            productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1 = (ProductActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1) continuationImpl;
            int i = productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1 = new ProductActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1 = new ProductActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1(this, continuationImpl);
        }
        Object obj = productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            List listV0 = CollectionsKt.v0(new ProductActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$$inlined$sortedBy$1(), list);
            ArrayList arrayList = new ArrayList(CollectionsKt.v(listV0, 10));
            Iterator it = listV0.iterator();
            while (it.hasNext()) {
                arrayList.add(new ImageUIState(MultiModalGroupTicketEntityKt.a(((MultiModalGroupTicketSequenceInfo) it.next()).b), (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246));
            }
            TextUIState.ChaloTextUIState chaloTextUIStateN = linkedHashMap != null ? n(linkedHashMap) : null;
            ActivationTicketRouteDetailsHeader.MultipleLegsTicket multipleLegsTicket = new ActivationTicketRouteDetailsHeader.MultipleLegsTicket(arrayList, new ImageUIState(IconType.IC_ARROW_UP, (String) null, ChaloColorToken.Black_87.f9768a, new ImageUISize(ChaloThemeHelper.a().g), (UIContentScale) null, 90.0f, (UiEventHandler) null, 178));
            UITextStyle uITextStyle = UITextStyle.BodySmall;
            ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
            chaloTextUIState = new TextUIState.ChaloTextUIState(str, uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState(str2, uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$0 = chaloTextUIStateN;
            productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$1 = multipleLegsTicket;
            productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$2 = chaloTextUIState;
            productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$3 = chaloTextUIState4;
            productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.label = 1;
            Object objQ = q(list2, z, function1, productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1);
            if (objQ == obj2) {
                return obj2;
            }
            chaloTextUIState2 = chaloTextUIStateN;
            obj = objQ;
            activationTicketRouteDetailsHeader = multipleLegsTicket;
            chaloTextUIState3 = chaloTextUIState4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextUIState3 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$3;
            chaloTextUIState = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$2;
            activationTicketRouteDetailsHeader = (ActivationTicketRouteDetailsHeader) productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$1;
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getActivationTicketRouteDetailsUIStateForMultipleTickets$1.L$0;
            ResultKt.b(obj);
        }
        return new ActivationTicketRouteDetailsUIState(activationTicketRouteDetailsHeader, chaloTextUIState, chaloTextUIState3, (StepBasedRouteDetailsSectionUIState) obj, chaloTextUIState2, 13);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0207  */
    /* JADX WARN: Code duplicated, block: B:40:0x028e  */
    /* JADX WARN: Code duplicated, block: B:43:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0361  */
    /* JADX WARN: Code duplicated, block: B:76:0x0465  */
    /* JADX WARN: Code duplicated, block: B:79:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x0520  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public final Object f(ActivationProductData activationProductData, Function1 function1, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getBottomSheetUiState$1 productActivationUIStateBuilder$getBottomSheetUiState$1;
        int i;
        StringProvider stringProvider;
        CoroutineSingletons coroutineSingletons;
        int i2;
        Object objB;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs;
        DrawType.Icon icon;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objB2;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        CoroutineSingletons coroutineSingletons2;
        ChaloColorToken.White white;
        StringProvider stringProvider2;
        Object objB3;
        ImageUIState imageUIState2;
        final Function1 function3;
        DrawType.Icon icon2;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs2;
        ButtonUIStateFactory buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ChaloTextStyleHelper chaloTextStyleHelper;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs3;
        CoroutineSingletons coroutineSingletons3;
        DrawType.Icon icon3;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        ButtonUIStateFactory buttonUIStateFactory2;
        ButtonUIState buttonUIStateF;
        Object objB4;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs4;
        DrawType.Icon icon4;
        Function1 function4;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        ButtonUIStateFactory buttonUIStateFactory3;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        ActivationProductData activationProductData2;
        Function1 function5;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs5;
        DrawType.Icon icon5;
        ImageUIState imageUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        StringProvider stringProvider3;
        Object objB5;
        Function1 function6;
        final ActivationProductData activationProductData3;
        ImageUIState imageUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        ButtonUIStateFactory buttonUIStateFactory4;
        int i3;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        Object objB6;
        CoroutineSingletons coroutineSingletons4;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs6;
        final Function1 function7;
        DrawType.Icon icon6;
        ButtonUIStateFactory buttonUIStateFactory5;
        ImageUIState imageUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        CoroutineSingletons coroutineSingletons5;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs7;
        DrawType.Icon icon7;
        ButtonUIStateFactory buttonUIStateFactory6;
        ButtonUIState buttonUIStateF2;
        Object objB7;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        Function1 function8;
        ButtonUIStateFactory buttonUIStateFactory7;
        BottomSheetContentUiSpecs bottomSheetContentUiSpecs8;
        DrawType.Icon icon8;
        final ActivationProductData activationProductData4 = activationProductData;
        Function1 function9 = function1;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getBottomSheetUiState$1) {
            productActivationUIStateBuilder$getBottomSheetUiState$1 = (ProductActivationUIStateBuilder$getBottomSheetUiState$1) continuationImpl;
            int i4 = productActivationUIStateBuilder$getBottomSheetUiState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getBottomSheetUiState$1 = new ProductActivationUIStateBuilder$getBottomSheetUiState$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getBottomSheetUiState$1 = new ProductActivationUIStateBuilder$getBottomSheetUiState$1(this, continuationImpl);
        }
        Object objC = productActivationUIStateBuilder$getBottomSheetUiState$1.result;
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = productActivationUIStateBuilder$getBottomSheetUiState$1.label;
        ChaloColorToken.White white2 = ChaloColorToken.White.f9870a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        UiAlignment.Horizontal.Start start = UiAlignment.Horizontal.Start.f9886a;
        TimeUtilsContract timeUtilsContract = this.c;
        ChaloTextStyleHelper chaloTextStyleHelper7 = ChaloTextStyleHelper.f10078a;
        ButtonUIStateFactory buttonUIStateFactory8 = ButtonUIStateFactory.f9921a;
        StringProvider stringProvider4 = this.f8070a;
        switch (i5) {
            case 0:
                i = 0;
                ResultKt.b(objC);
                if ((activationProductData4 instanceof ActivationProductData.PassActivation.Magic) || (activationProductData4 instanceof ActivationProductData.PassActivation.RideBased)) {
                    stringProvider = stringProvider4;
                    coroutineSingletons = coroutineSingletons6;
                    StringEnum stringEnum = StringEnum.TICKET_ACTIVATION_CONFIRMATION_TITLE;
                    i2 = 0;
                    Object[] objArr = {timeUtilsContract.w(((ActivationProductData.PassActivation) activationProductData4).f7999a.getB().d)};
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function9;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 1;
                    objB = stringProvider.b(stringEnum, objArr, productActivationUIStateBuilder$getBottomSheetUiState$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String str = (String) objB;
                    bottomSheetContentUiSpecs = new BottomSheetContentUiSpecs(null, start, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
                    icon = new DrawType.Icon(new ImageUIState(IconType.IC_PRODUCT_USE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                    imageUIState = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new iw0(function9, 19)), WebSocketProtocol.PAYLOAD_SHORT);
                    chaloTextUIState = new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function9;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 2;
                    objB2 = stringProvider.b(StringEnum.PASS_ACTIVATION_CONFIRMATION_SUBTITLE, new Object[i2], productActivationUIStateBuilder$getBottomSheetUiState$1);
                    if (objB2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function2 = function9;
                    chaloTextUIState2 = chaloTextUIState;
                    coroutineSingletons2 = coroutineSingletons;
                    white = white2;
                    stringProvider2 = stringProvider;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function2;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState2;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = chaloTextUIState3;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory8;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper7;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 3;
                    objB3 = stringProvider2.b(StringEnum.VALIDATE_NOW, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                    if (objB3 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    DrawType.Icon icon9 = icon;
                    imageUIState2 = imageUIState;
                    function3 = function2;
                    icon2 = icon9;
                    bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
                    buttonUIStateFactory = buttonUIStateFactory8;
                    chaloTextUIState4 = chaloTextUIState2;
                    chaloTextUIState5 = chaloTextUIState3;
                    chaloTextStyleHelper = chaloTextStyleHelper7;
                    bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
                    coroutineSingletons3 = coroutineSingletons2;
                    icon3 = icon2;
                    chaloTextStyleHelper2 = chaloTextStyleHelper7;
                    buttonUIStateFactory2 = buttonUIStateFactory8;
                    final int i6 = 0;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB3, white, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                    break;
                                default:
                                    function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, UIShape.e, false, 0.0f, 52);
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function3;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs3;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon3;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState2;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState5;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory2;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper2;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 4;
                    objB4 = stringProvider2.b(StringEnum.CANCEL_SMALL, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                    if (objB4 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
                    icon4 = icon3;
                    objC = objB4;
                    function4 = function3;
                    chaloTextUIState6 = chaloTextUIState4;
                    buttonUIStateFactory3 = buttonUIStateFactory2;
                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                    return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs4, icon4, chaloTextUIState6, chaloTextUIState5, buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objC, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function4, 20), UIShape.e, false, 52), imageUIState2, 1);
                }
                if (!(activationProductData4 instanceof ActivationProductData.MobileTicketActivation)) {
                    if ((activationProductData4 instanceof ActivationProductData.InstantTicketActivation) || (activationProductData4 instanceof ActivationProductData.PremiumTicketActivation) || (activationProductData4 instanceof ActivationProductData.QuickPayActivation) || (activationProductData4 instanceof ActivationProductData.MetroTicketActivation) || (activationProductData4 instanceof ActivationProductData.ONDCMetroTicketActivation) || (activationProductData4 instanceof ActivationProductData.ONDCTicketActivation) || (activationProductData4 instanceof ActivationProductData.MultiModalGroupTicketActivation)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                MTicketConfiguration mTicketConfiguration = ((ActivationProductData.MobileTicketActivation) activationProductData4).f7995a.r;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function9;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 5;
                objC = this.e.c(mTicketConfiguration, productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objC != coroutineSingletons6) {
                    long jLongValue = ((Number) objC).longValue();
                    StringEnum stringEnum2 = StringEnum.TICKET_ACTIVATION_CONFIRMATION_TITLE;
                    String strW = timeUtilsContract.w(jLongValue);
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = strW;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function9;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 6;
                    objC = stringProvider4.b(stringEnum2, objArr2, productActivationUIStateBuilder$getBottomSheetUiState$1);
                    if (objC != coroutineSingletons6) {
                        Function1 function10 = function9;
                        activationProductData2 = activationProductData4;
                        function5 = function10;
                        bottomSheetContentUiSpecs5 = new BottomSheetContentUiSpecs(null, start, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
                        icon5 = new DrawType.Icon(new ImageUIState(IconType.IC_PRODUCT_USE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                        imageUIState3 = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new iw0(function5, 21)), WebSocketProtocol.PAYLOAD_SHORT);
                        stringProvider3 = stringProvider4;
                        chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objC, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData2;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function5;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs5;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon5;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState3;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState7;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.label = 7;
                        objB5 = stringProvider3.b(StringEnum.TICKET_ACTIVATION_CONFIRMATION_SUBTITLE, new Object[i], productActivationUIStateBuilder$getBottomSheetUiState$1);
                        if (objB5 != coroutineSingletons6) {
                            function6 = function5;
                            activationProductData3 = activationProductData2;
                            imageUIState4 = imageUIState3;
                            objC = objB5;
                            chaloTextUIState8 = chaloTextUIState7;
                            buttonUIStateFactory4 = buttonUIStateFactory8;
                            i3 = 0;
                            chaloTextStyleHelper4 = chaloTextStyleHelper7;
                            chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objC, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData3;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function6;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs5;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon5;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState4;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState8;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = chaloTextUIState9;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory4;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.label = 8;
                            objB6 = stringProvider3.b(StringEnum.VALIDATE_NOW, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                            coroutineSingletons4 = coroutineSingletons6;
                            if (objB6 == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                            Function1 function11 = function6;
                            bottomSheetContentUiSpecs6 = bottomSheetContentUiSpecs5;
                            function7 = function11;
                            icon6 = icon5;
                            buttonUIStateFactory5 = buttonUIStateFactory4;
                            imageUIState5 = imageUIState4;
                            chaloTextUIState10 = chaloTextUIState9;
                            chaloTextStyleHelper5 = chaloTextStyleHelper4;
                            coroutineSingletons5 = coroutineSingletons4;
                            bottomSheetContentUiSpecs7 = bottomSheetContentUiSpecs6;
                            icon7 = icon6;
                            buttonUIStateFactory6 = buttonUIStateFactory4;
                            final int i7 = 1;
                            buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, white2, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                            break;
                                        default:
                                            function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            }, UIShape.e, false, 0.0f, 52);
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function7;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs7;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon7;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState5;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState8;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState10;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF2;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory6;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                            productActivationUIStateBuilder$getBottomSheetUiState$1.label = 9;
                            objB7 = stringProvider3.b(StringEnum.CANCEL_SMALL, new Object[i3], productActivationUIStateBuilder$getBottomSheetUiState$1);
                            if (objB7 == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            chaloTextUIState11 = chaloTextUIState8;
                            chaloTextStyleHelper6 = chaloTextStyleHelper4;
                            objC = objB7;
                            function8 = function7;
                            buttonUIStateFactory7 = buttonUIStateFactory6;
                            bottomSheetContentUiSpecs8 = bottomSheetContentUiSpecs7;
                            icon8 = icon7;
                            return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs8, icon8, chaloTextUIState11, chaloTextUIState10, buttonUIStateF2, ButtonUIStateFactory.d(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objC, ChaloColorToken.Black_87.f9768a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function8, 22), UIShape.e, false, 52), imageUIState5, 1);
                        }
                    }
                }
                return coroutineSingletons6;
            case 1:
                i2 = 0;
                Function1 function12 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                ActivationProductData activationProductData5 = (ActivationProductData) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                function9 = function12;
                activationProductData4 = activationProductData5;
                coroutineSingletons = coroutineSingletons6;
                objB = objC;
                stringProvider = stringProvider4;
                String str2 = (String) objB;
                bottomSheetContentUiSpecs = new BottomSheetContentUiSpecs(null, start, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
                icon = new DrawType.Icon(new ImageUIState(IconType.IC_PRODUCT_USE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                imageUIState = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new iw0(function9, 19)), WebSocketProtocol.PAYLOAD_SHORT);
                chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function9;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 2;
                objB2 = stringProvider.b(StringEnum.PASS_ACTIVATION_CONFIRMATION_SUBTITLE, new Object[i2], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                function2 = function9;
                chaloTextUIState2 = chaloTextUIState;
                coroutineSingletons2 = coroutineSingletons;
                white = white2;
                stringProvider2 = stringProvider;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = chaloTextUIState3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory8;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 3;
                objB3 = stringProvider2.b(StringEnum.VALIDATE_NOW, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB3 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                DrawType.Icon icon10 = icon;
                imageUIState2 = imageUIState;
                function3 = function2;
                icon2 = icon10;
                bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
                buttonUIStateFactory = buttonUIStateFactory8;
                chaloTextUIState4 = chaloTextUIState2;
                chaloTextUIState5 = chaloTextUIState3;
                chaloTextStyleHelper = chaloTextStyleHelper7;
                bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
                coroutineSingletons3 = coroutineSingletons2;
                icon3 = icon2;
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                buttonUIStateFactory2 = buttonUIStateFactory8;
                final int i8 = 0;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB3, white, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                break;
                            default:
                                function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 0.0f, 52);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 4;
                objB4 = stringProvider2.b(StringEnum.CANCEL_SMALL, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB4 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
                icon4 = icon3;
                objC = objB4;
                function4 = function3;
                chaloTextUIState6 = chaloTextUIState4;
                buttonUIStateFactory3 = buttonUIStateFactory2;
                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs4, icon4, chaloTextUIState6, chaloTextUIState5, buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objC, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function4, 20), UIShape.e, false, 52), imageUIState2, 1);
            case 2:
                TextUIState.ChaloTextUIState chaloTextUIState12 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$5;
                ImageUIState imageUIState6 = (ImageUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$4;
                icon = (DrawType.Icon) productActivationUIStateBuilder$getBottomSheetUiState$1.L$3;
                bottomSheetContentUiSpecs = (BottomSheetContentUiSpecs) productActivationUIStateBuilder$getBottomSheetUiState$1.L$2;
                Function1 function13 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                ActivationProductData activationProductData6 = (ActivationProductData) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                white2 = white2;
                buttonUIStateFactory8 = buttonUIStateFactory8;
                coroutineSingletons = coroutineSingletons6;
                imageUIState = imageUIState6;
                chaloTextUIState2 = chaloTextUIState12;
                activationProductData4 = activationProductData6;
                function2 = function13;
                objB2 = objC;
                chaloTextStyleHelper7 = chaloTextStyleHelper7;
                stringProvider = stringProvider4;
                coroutineSingletons2 = coroutineSingletons;
                white = white2;
                stringProvider2 = stringProvider;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = chaloTextUIState3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory8;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 3;
                objB3 = stringProvider2.b(StringEnum.VALIDATE_NOW, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB3 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                DrawType.Icon icon11 = icon;
                imageUIState2 = imageUIState;
                function3 = function2;
                icon2 = icon11;
                bottomSheetContentUiSpecs2 = bottomSheetContentUiSpecs;
                buttonUIStateFactory = buttonUIStateFactory8;
                chaloTextUIState4 = chaloTextUIState2;
                chaloTextUIState5 = chaloTextUIState3;
                chaloTextStyleHelper = chaloTextStyleHelper7;
                bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
                coroutineSingletons3 = coroutineSingletons2;
                icon3 = icon2;
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                buttonUIStateFactory2 = buttonUIStateFactory8;
                final int i9 = 0;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB3, white, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                break;
                            default:
                                function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 0.0f, 52);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 4;
                objB4 = stringProvider2.b(StringEnum.CANCEL_SMALL, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB4 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
                icon4 = icon3;
                objC = objB4;
                function4 = function3;
                chaloTextUIState6 = chaloTextUIState4;
                buttonUIStateFactory3 = buttonUIStateFactory2;
                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs4, icon4, chaloTextUIState6, chaloTextUIState5, buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objC, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function4, 20), UIShape.e, false, 52), imageUIState2, 1);
            case 3:
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) productActivationUIStateBuilder$getBottomSheetUiState$1.L$8;
                ButtonUIStateFactory buttonUIStateFactory9 = (ButtonUIStateFactory) productActivationUIStateBuilder$getBottomSheetUiState$1.L$7;
                TextUIState.ChaloTextUIState chaloTextUIState13 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$6;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$5;
                ImageUIState imageUIState7 = (ImageUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$4;
                icon2 = (DrawType.Icon) productActivationUIStateBuilder$getBottomSheetUiState$1.L$3;
                bottomSheetContentUiSpecs2 = (BottomSheetContentUiSpecs) productActivationUIStateBuilder$getBottomSheetUiState$1.L$2;
                Function1 function14 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                activationProductData4 = (ActivationProductData) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                buttonUIStateFactory = buttonUIStateFactory9;
                chaloTextUIState5 = chaloTextUIState13;
                imageUIState2 = imageUIState7;
                white = white2;
                buttonUIStateFactory8 = buttonUIStateFactory8;
                stringProvider2 = stringProvider4;
                objB3 = objC;
                coroutineSingletons2 = coroutineSingletons6;
                chaloTextStyleHelper7 = chaloTextStyleHelper7;
                function3 = function14;
                chaloTextStyleHelper = chaloTextStyleHelper8;
                bottomSheetContentUiSpecs3 = bottomSheetContentUiSpecs2;
                coroutineSingletons3 = coroutineSingletons2;
                icon3 = icon2;
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                buttonUIStateFactory2 = buttonUIStateFactory8;
                final int i10 = 0;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB3, white, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                break;
                            default:
                                function3.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData4)));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 0.0f, 52);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 4;
                objB4 = stringProvider2.b(StringEnum.CANCEL_SMALL, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB4 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs3;
                icon4 = icon3;
                objC = objB4;
                function4 = function3;
                chaloTextUIState6 = chaloTextUIState4;
                buttonUIStateFactory3 = buttonUIStateFactory2;
                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs4, icon4, chaloTextUIState6, chaloTextUIState5, buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objC, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function4, 20), UIShape.e, false, 52), imageUIState2, 1);
            case 4:
                ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) productActivationUIStateBuilder$getBottomSheetUiState$1.L$8;
                ButtonUIStateFactory buttonUIStateFactory10 = (ButtonUIStateFactory) productActivationUIStateBuilder$getBottomSheetUiState$1.L$7;
                buttonUIStateF = (ButtonUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$6;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState14 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$4;
                imageUIState2 = (ImageUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$3;
                DrawType.Icon icon12 = (DrawType.Icon) productActivationUIStateBuilder$getBottomSheetUiState$1.L$2;
                BottomSheetContentUiSpecs bottomSheetContentUiSpecs9 = (BottomSheetContentUiSpecs) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                function4 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                chaloTextUIState6 = chaloTextUIState14;
                icon4 = icon12;
                bottomSheetContentUiSpecs4 = bottomSheetContentUiSpecs9;
                chaloTextStyleHelper3 = chaloTextStyleHelper9;
                buttonUIStateFactory3 = buttonUIStateFactory10;
                return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs4, icon4, chaloTextUIState6, chaloTextUIState5, buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objC, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function4, 20), UIShape.e, false, 52), imageUIState2, 1);
            case 5:
                i = 0;
                Function1 function15 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                ActivationProductData activationProductData7 = (ActivationProductData) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                function9 = function15;
                activationProductData4 = activationProductData7;
                long jLongValue2 = ((Number) objC).longValue();
                StringEnum stringEnum3 = StringEnum.TICKET_ACTIVATION_CONFIRMATION_TITLE;
                String strW2 = timeUtilsContract.w(jLongValue2);
                Object[] objArr3 = new Object[1];
                objArr3[i] = strW2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function9;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 6;
                objC = stringProvider4.b(stringEnum3, objArr3, productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objC != coroutineSingletons6) {
                    Function1 function16 = function9;
                    activationProductData2 = activationProductData4;
                    function5 = function16;
                    bottomSheetContentUiSpecs5 = new BottomSheetContentUiSpecs(null, start, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
                    icon5 = new DrawType.Icon(new ImageUIState(IconType.IC_PRODUCT_USE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                    imageUIState3 = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new iw0(function5, 21)), WebSocketProtocol.PAYLOAD_SHORT);
                    stringProvider3 = stringProvider4;
                    chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objC, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData2;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function5;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs5;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon5;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState3;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState7;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 7;
                    objB5 = stringProvider3.b(StringEnum.TICKET_ACTIVATION_CONFIRMATION_SUBTITLE, new Object[i], productActivationUIStateBuilder$getBottomSheetUiState$1);
                    if (objB5 != coroutineSingletons6) {
                        function6 = function5;
                        activationProductData3 = activationProductData2;
                        imageUIState4 = imageUIState3;
                        objC = objB5;
                        chaloTextUIState8 = chaloTextUIState7;
                        buttonUIStateFactory4 = buttonUIStateFactory8;
                        i3 = 0;
                        chaloTextStyleHelper4 = chaloTextStyleHelper7;
                        chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objC, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData3;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function6;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs5;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon5;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState4;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState8;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = chaloTextUIState9;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory4;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.label = 8;
                        objB6 = stringProvider3.b(StringEnum.VALIDATE_NOW, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                        coroutineSingletons4 = coroutineSingletons6;
                        if (objB6 == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        Function1 function17 = function6;
                        bottomSheetContentUiSpecs6 = bottomSheetContentUiSpecs5;
                        function7 = function17;
                        icon6 = icon5;
                        buttonUIStateFactory5 = buttonUIStateFactory4;
                        imageUIState5 = imageUIState4;
                        chaloTextUIState10 = chaloTextUIState9;
                        chaloTextStyleHelper5 = chaloTextStyleHelper4;
                        coroutineSingletons5 = coroutineSingletons4;
                        bottomSheetContentUiSpecs7 = bottomSheetContentUiSpecs6;
                        icon7 = icon6;
                        buttonUIStateFactory6 = buttonUIStateFactory4;
                        final int i11 = 1;
                        buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, white2, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                        break;
                                    default:
                                        function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        }, UIShape.e, false, 0.0f, 52);
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function7;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs7;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon7;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState5;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState8;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState10;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF2;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory6;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                        productActivationUIStateBuilder$getBottomSheetUiState$1.label = 9;
                        objB7 = stringProvider3.b(StringEnum.CANCEL_SMALL, new Object[i3], productActivationUIStateBuilder$getBottomSheetUiState$1);
                        if (objB7 == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        chaloTextUIState11 = chaloTextUIState8;
                        chaloTextStyleHelper6 = chaloTextStyleHelper4;
                        objC = objB7;
                        function8 = function7;
                        buttonUIStateFactory7 = buttonUIStateFactory6;
                        bottomSheetContentUiSpecs8 = bottomSheetContentUiSpecs7;
                        icon8 = icon7;
                        return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs8, icon8, chaloTextUIState11, chaloTextUIState10, buttonUIStateF2, ButtonUIStateFactory.d(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objC, ChaloColorToken.Black_87.f9768a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function8, 22), UIShape.e, false, 52), imageUIState5, 1);
                    }
                }
                return coroutineSingletons6;
            case 6:
                i = 0;
                function5 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                activationProductData2 = (ActivationProductData) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                bottomSheetContentUiSpecs5 = new BottomSheetContentUiSpecs(null, start, 0.0f, 0.0f, 0.0f, TypedValues.PositionType.TYPE_PERCENT_Y);
                icon5 = new DrawType.Icon(new ImageUIState(IconType.IC_PRODUCT_USE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                imageUIState3 = new ImageUIState(IconType.CLOSE_NEARBY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new iw0(function5, 21)), WebSocketProtocol.PAYLOAD_SHORT);
                stringProvider3 = stringProvider4;
                chaloTextUIState7 = new TextUIState.ChaloTextUIState((String) objC, UITextStyle.DisplaySmall, black, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 7;
                objB5 = stringProvider3.b(StringEnum.TICKET_ACTIVATION_CONFIRMATION_SUBTITLE, new Object[i], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB5 != coroutineSingletons6) {
                    function6 = function5;
                    activationProductData3 = activationProductData2;
                    imageUIState4 = imageUIState3;
                    objC = objB5;
                    chaloTextUIState8 = chaloTextUIState7;
                    buttonUIStateFactory4 = buttonUIStateFactory8;
                    i3 = 0;
                    chaloTextStyleHelper4 = chaloTextStyleHelper7;
                    chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objC, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData3;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function6;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs5;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon5;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState8;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = chaloTextUIState9;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 8;
                    objB6 = stringProvider3.b(StringEnum.VALIDATE_NOW, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                    coroutineSingletons4 = coroutineSingletons6;
                    if (objB6 == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    Function1 function18 = function6;
                    bottomSheetContentUiSpecs6 = bottomSheetContentUiSpecs5;
                    function7 = function18;
                    icon6 = icon5;
                    buttonUIStateFactory5 = buttonUIStateFactory4;
                    imageUIState5 = imageUIState4;
                    chaloTextUIState10 = chaloTextUIState9;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    coroutineSingletons5 = coroutineSingletons4;
                    bottomSheetContentUiSpecs7 = bottomSheetContentUiSpecs6;
                    icon7 = icon6;
                    buttonUIStateFactory6 = buttonUIStateFactory4;
                    final int i12 = 1;
                    buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, white2, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                    break;
                                default:
                                    function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, UIShape.e, false, 0.0f, 52);
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function7;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs7;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon7;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState5;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState8;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState10;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF2;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory6;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                    productActivationUIStateBuilder$getBottomSheetUiState$1.label = 9;
                    objB7 = stringProvider3.b(StringEnum.CANCEL_SMALL, new Object[i3], productActivationUIStateBuilder$getBottomSheetUiState$1);
                    if (objB7 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    chaloTextUIState11 = chaloTextUIState8;
                    chaloTextStyleHelper6 = chaloTextStyleHelper4;
                    objC = objB7;
                    function8 = function7;
                    buttonUIStateFactory7 = buttonUIStateFactory6;
                    bottomSheetContentUiSpecs8 = bottomSheetContentUiSpecs7;
                    icon8 = icon7;
                    return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs8, icon8, chaloTextUIState11, chaloTextUIState10, buttonUIStateF2, ButtonUIStateFactory.d(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objC, ChaloColorToken.Black_87.f9768a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function8, 22), UIShape.e, false, 52), imageUIState5, 1);
                }
                return coroutineSingletons6;
            case 7:
                TextUIState.ChaloTextUIState chaloTextUIState15 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$5;
                imageUIState4 = (ImageUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$4;
                icon5 = (DrawType.Icon) productActivationUIStateBuilder$getBottomSheetUiState$1.L$3;
                bottomSheetContentUiSpecs5 = (BottomSheetContentUiSpecs) productActivationUIStateBuilder$getBottomSheetUiState$1.L$2;
                Function1 function19 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                ActivationProductData activationProductData8 = (ActivationProductData) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                chaloTextUIState8 = chaloTextUIState15;
                activationProductData3 = activationProductData8;
                function6 = function19;
                stringProvider3 = stringProvider4;
                buttonUIStateFactory4 = buttonUIStateFactory8;
                i3 = 0;
                chaloTextStyleHelper4 = chaloTextStyleHelper7;
                chaloTextUIState9 = new TextUIState.ChaloTextUIState((String) objC, UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = activationProductData3;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = function6;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = bottomSheetContentUiSpecs5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = icon5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = imageUIState4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState8;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = chaloTextUIState9;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 8;
                objB6 = stringProvider3.b(StringEnum.VALIDATE_NOW, new Object[0], productActivationUIStateBuilder$getBottomSheetUiState$1);
                coroutineSingletons4 = coroutineSingletons6;
                if (objB6 == coroutineSingletons4) {
                    return coroutineSingletons4;
                }
                Function1 function110 = function6;
                bottomSheetContentUiSpecs6 = bottomSheetContentUiSpecs5;
                function7 = function110;
                icon6 = icon5;
                buttonUIStateFactory5 = buttonUIStateFactory4;
                imageUIState5 = imageUIState4;
                chaloTextUIState10 = chaloTextUIState9;
                chaloTextStyleHelper5 = chaloTextStyleHelper4;
                coroutineSingletons5 = coroutineSingletons4;
                bottomSheetContentUiSpecs7 = bottomSheetContentUiSpecs6;
                icon7 = icon6;
                buttonUIStateFactory6 = buttonUIStateFactory4;
                final int i13 = 1;
                buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, white2, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                break;
                            default:
                                function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 0.0f, 52);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState8;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState10;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory6;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 9;
                objB7 = stringProvider3.b(StringEnum.CANCEL_SMALL, new Object[i3], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB7 == coroutineSingletons5) {
                    return coroutineSingletons5;
                }
                chaloTextUIState11 = chaloTextUIState8;
                chaloTextStyleHelper6 = chaloTextStyleHelper4;
                objC = objB7;
                function8 = function7;
                buttonUIStateFactory7 = buttonUIStateFactory6;
                bottomSheetContentUiSpecs8 = bottomSheetContentUiSpecs7;
                icon8 = icon7;
                return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs8, icon8, chaloTextUIState11, chaloTextUIState10, buttonUIStateF2, ButtonUIStateFactory.d(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objC, ChaloColorToken.Black_87.f9768a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function8, 22), UIShape.e, false, 52), imageUIState5, 1);
            case 8:
                ChaloTextStyleHelper chaloTextStyleHelper10 = (ChaloTextStyleHelper) productActivationUIStateBuilder$getBottomSheetUiState$1.L$8;
                ButtonUIStateFactory buttonUIStateFactory11 = (ButtonUIStateFactory) productActivationUIStateBuilder$getBottomSheetUiState$1.L$7;
                TextUIState.ChaloTextUIState chaloTextUIState16 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState17 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$5;
                ImageUIState imageUIState8 = (ImageUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$4;
                icon6 = (DrawType.Icon) productActivationUIStateBuilder$getBottomSheetUiState$1.L$3;
                BottomSheetContentUiSpecs bottomSheetContentUiSpecs10 = (BottomSheetContentUiSpecs) productActivationUIStateBuilder$getBottomSheetUiState$1.L$2;
                function7 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                activationProductData3 = (ActivationProductData) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                buttonUIStateFactory5 = buttonUIStateFactory11;
                chaloTextUIState10 = chaloTextUIState16;
                chaloTextUIState8 = chaloTextUIState17;
                imageUIState5 = imageUIState8;
                bottomSheetContentUiSpecs6 = bottomSheetContentUiSpecs10;
                stringProvider3 = stringProvider4;
                coroutineSingletons4 = coroutineSingletons6;
                i3 = 0;
                buttonUIStateFactory4 = buttonUIStateFactory8;
                objB6 = objC;
                chaloTextStyleHelper4 = chaloTextStyleHelper7;
                chaloTextStyleHelper5 = chaloTextStyleHelper10;
                coroutineSingletons5 = coroutineSingletons4;
                bottomSheetContentUiSpecs7 = bottomSheetContentUiSpecs6;
                icon7 = icon6;
                buttonUIStateFactory6 = buttonUIStateFactory4;
                final int i14 = 1;
                buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, white2, 0, null, UIFontWeight.Bold, null, null, 108), new Function0() { // from class: kx0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                break;
                            default:
                                function7.invoke(new ProductActivationIntent.ConfirmActivationIntent(ActivationProductDataKt.a(activationProductData3)));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 0.0f, 52);
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$0 = function7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$1 = bottomSheetContentUiSpecs7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$2 = icon7;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$3 = imageUIState5;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$4 = chaloTextUIState8;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$5 = chaloTextUIState10;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$6 = buttonUIStateF2;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$7 = buttonUIStateFactory6;
                productActivationUIStateBuilder$getBottomSheetUiState$1.L$8 = chaloTextStyleHelper4;
                productActivationUIStateBuilder$getBottomSheetUiState$1.label = 9;
                objB7 = stringProvider3.b(StringEnum.CANCEL_SMALL, new Object[i3], productActivationUIStateBuilder$getBottomSheetUiState$1);
                if (objB7 == coroutineSingletons5) {
                    return coroutineSingletons5;
                }
                chaloTextUIState11 = chaloTextUIState8;
                chaloTextStyleHelper6 = chaloTextStyleHelper4;
                objC = objB7;
                function8 = function7;
                buttonUIStateFactory7 = buttonUIStateFactory6;
                bottomSheetContentUiSpecs8 = bottomSheetContentUiSpecs7;
                icon8 = icon7;
                return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs8, icon8, chaloTextUIState11, chaloTextUIState10, buttonUIStateF2, ButtonUIStateFactory.d(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objC, ChaloColorToken.Black_87.f9768a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function8, 22), UIShape.e, false, 52), imageUIState5, 1);
            case 9:
                ChaloTextStyleHelper chaloTextStyleHelper11 = (ChaloTextStyleHelper) productActivationUIStateBuilder$getBottomSheetUiState$1.L$8;
                ButtonUIStateFactory buttonUIStateFactory12 = (ButtonUIStateFactory) productActivationUIStateBuilder$getBottomSheetUiState$1.L$7;
                buttonUIStateF2 = (ButtonUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$6;
                chaloTextUIState10 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState18 = (TextUIState.ChaloTextUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$4;
                imageUIState5 = (ImageUIState) productActivationUIStateBuilder$getBottomSheetUiState$1.L$3;
                DrawType.Icon icon13 = (DrawType.Icon) productActivationUIStateBuilder$getBottomSheetUiState$1.L$2;
                BottomSheetContentUiSpecs bottomSheetContentUiSpecs11 = (BottomSheetContentUiSpecs) productActivationUIStateBuilder$getBottomSheetUiState$1.L$1;
                function8 = (Function1) productActivationUIStateBuilder$getBottomSheetUiState$1.L$0;
                ResultKt.b(objC);
                chaloTextUIState11 = chaloTextUIState18;
                icon8 = icon13;
                bottomSheetContentUiSpecs8 = bottomSheetContentUiSpecs11;
                chaloTextStyleHelper6 = chaloTextStyleHelper11;
                buttonUIStateFactory7 = buttonUIStateFactory12;
                return new BottomSheetStandardContentUiState(null, bottomSheetContentUiSpecs8, icon8, chaloTextUIState11, chaloTextUIState10, buttonUIStateF2, ButtonUIStateFactory.d(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objC, ChaloColorToken.Black_87.f9768a, 0, null, UIFontWeight.Bold, null, null, 108), new iw0(function8, 22), UIShape.e, false, 52), imageUIState5, 1);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(long j, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getExpirationInfoTextUIState$1 productActivationUIStateBuilder$getExpirationInfoTextUIState$1;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        int i;
        long j2;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getExpirationInfoTextUIState$1) {
            productActivationUIStateBuilder$getExpirationInfoTextUIState$1 = (ProductActivationUIStateBuilder$getExpirationInfoTextUIState$1) continuationImpl;
            int i2 = productActivationUIStateBuilder$getExpirationInfoTextUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getExpirationInfoTextUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getExpirationInfoTextUIState$1 = new ProductActivationUIStateBuilder$getExpirationInfoTextUIState$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getExpirationInfoTextUIState$1 = new ProductActivationUIStateBuilder$getExpirationInfoTextUIState$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$getExpirationInfoTextUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productActivationUIStateBuilder$getExpirationInfoTextUIState$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            styledTextDataUIStateArr = new StyledTextDataUIState[2];
            productActivationUIStateBuilder$getExpirationInfoTextUIState$1.L$0 = styledTextDataUIStateArr;
            productActivationUIStateBuilder$getExpirationInfoTextUIState$1.L$1 = styledTextDataUIStateArr;
            productActivationUIStateBuilder$getExpirationInfoTextUIState$1.J$0 = j;
            productActivationUIStateBuilder$getExpirationInfoTextUIState$1.I$0 = 0;
            productActivationUIStateBuilder$getExpirationInfoTextUIState$1.label = 1;
            objB = this.f8070a.b(StringEnum.TICKET_ACTIVATION_EXPIRATION_INFO_TEXT, new Object[0], productActivationUIStateBuilder$getExpirationInfoTextUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            i = 0;
            j2 = j;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = productActivationUIStateBuilder$getExpirationInfoTextUIState$1.I$0;
            j2 = productActivationUIStateBuilder$getExpirationInfoTextUIState$1.J$0;
            styledTextDataUIStateArr = (StyledTextDataUIState[]) productActivationUIStateBuilder$getExpirationInfoTextUIState$1.L$1;
            styledTextDataUIStateArr2 = (StyledTextDataUIState[]) productActivationUIStateBuilder$getExpirationInfoTextUIState$1.L$0;
            ResultKt.b(objB);
        }
        styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) objB, ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012);
        styledTextDataUIStateArr2[1] = new StyledTextDataUIState(vo1.B(" ", this.c.w(j2), CLConstants.DOT_SALT_DELIMETER), ChaloColorToken.AlmostBlackColor.f9756a, null, UITextStyle.TitleLarge, null, null, null, 1012);
        return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, null, 30);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d6, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f7, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015b, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
    
        if (r2 == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01be, code lost:
    
        if (r2 == r4) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(app.chalo.productactivation.data.ActivationProductData r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder.h(app.chalo.productactivation.data.ActivationProductData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0184  */
    /* JADX WARN: Code duplicated, block: B:32:0x0193  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0226  */
    /* JADX WARN: Code duplicated, block: B:51:0x0242  */
    /* JADX WARN: Code duplicated, block: B:55:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:63:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x031f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0329  */
    /* JADX WARN: Code duplicated, block: B:73:0x0344  */
    /* JADX WARN: Code duplicated, block: B:76:0x037a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0396  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0426  */
    public final Object i(ActivationProductData.PassActivation passActivation, PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome, Function1 function1, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1 productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1;
        ActivationProductData.PassActivation passActivation2;
        Object objS;
        List list;
        List arrayList;
        SuperPass superPass;
        boolean zL;
        BasicInfoContract basicInfoContract;
        Object objC;
        Function1 function2;
        SuperPass superPass2;
        List list2;
        List list3;
        Object objC2;
        Function1 function3;
        SuperPass superPass3;
        List list4;
        List list5;
        List list6;
        List list7;
        Function1 function4;
        List list8;
        List list9;
        Function1 function5;
        List list10;
        ButtonUIStateFactory buttonUIStateFactory;
        List list11;
        List list12;
        Function1 function6;
        Object objB;
        List list13;
        Function1 function7;
        List list14;
        ButtonUIStateFactory buttonUIStateFactory2;
        List list15;
        Function1 function8;
        List list16;
        ButtonUIStateFactory buttonUIStateFactory3;
        Function1 function9;
        List list17;
        List list18;
        List list19;
        List list20;
        List list21;
        ButtonUIStateFactory buttonUIStateFactory4;
        Function1 function10;
        Function1 function11;
        ButtonUIStateFactory buttonUIStateFactory5;
        List list22;
        Function1 function12 = function1;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1) {
            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1 = (ProductActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1) continuationImpl;
            int i = productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1 = new ProductActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1 = new ProductActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1(this, continuationImpl);
        }
        Object objJ = productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        StringProvider stringProvider = this.f8070a;
        ButtonUIStateFactory buttonUIStateFactory6 = ButtonUIStateFactory.f9921a;
        switch (i2) {
            case 0:
                ResultKt.b(objJ);
                passActivation2 = passActivation;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = passActivation2;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = function12;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 1;
                objS = s(premiumBusUpsellRideOutcome, function12, productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                if (objS != obj) {
                    list = (List) objS;
                    if (list != null) {
                        return list;
                    }
                    arrayList = new ArrayList();
                    superPass = passActivation2.f7999a;
                    zL = superPass.l();
                    basicInfoContract = this.d;
                    if (zL) {
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function12;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = superPass;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 2;
                        objC2 = basicInfoContract.c(productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objC2 != obj) {
                            function3 = function12;
                            superPass3 = superPass;
                            list4 = arrayList;
                            objJ = objC2;
                            list5 = list4;
                            long jLongValue = ((Number) objJ).longValue();
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function3;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list4;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list5;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = null;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 3;
                            objJ = superPass3.j(jLongValue);
                            if (objJ != obj) {
                                list6 = list5;
                                list7 = list4;
                                function4 = function3;
                                if (((Boolean) objJ).booleanValue()) {
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 4;
                                    objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                    if (objJ != obj) {
                                        list11 = arrayList;
                                        list12 = list7;
                                        function6 = function4;
                                        ButtonUIStateFactory buttonUIStateFactory7 = buttonUIStateFactory6;
                                        list11.add(ButtonUIStateFactory.f(buttonUIStateFactory7, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function6, 12), UIShape.e, false, 0.0f, 52));
                                        return list12;
                                    }
                                } else {
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 5;
                                    objJ = stringProvider.b(StringEnum.BOOK_RIDE_USING_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                    if (objJ != obj) {
                                        list8 = arrayList;
                                        list9 = list7;
                                        function5 = function4;
                                        list10 = list6;
                                        buttonUIStateFactory = buttonUIStateFactory6;
                                        ButtonUIStateFactory buttonUIStateFactory8 = buttonUIStateFactory;
                                        list8.add(ButtonUIStateFactory.f(buttonUIStateFactory8, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function5, 13), UIShape.e, false, 0.0f, 52));
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function5;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list9;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list10;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 6;
                                        objB = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                        if (objB != obj) {
                                            list13 = arrayList;
                                            function7 = function5;
                                            list14 = list9;
                                            buttonUIStateFactory2 = buttonUIStateFactory6;
                                            objJ = objB;
                                            list13.add(ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function7, 15), UIShape.e, false, 52));
                                            return list14;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (!zL) {
                            throw new NoWhenBranchMatchedException();
                        }
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function12;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = superPass;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 7;
                        objC = basicInfoContract.c(productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objC != obj) {
                            function2 = function12;
                            superPass2 = superPass;
                            list2 = arrayList;
                            objJ = objC;
                            list3 = list2;
                            long jLongValue2 = ((Number) objJ).longValue();
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function2;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list2;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = null;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 8;
                            objJ = superPass2.j(jLongValue2);
                            if (objJ != obj) {
                                list15 = list2;
                                function8 = function2;
                                if (((Boolean) objJ).booleanValue()) {
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 9;
                                    objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                    if (objJ != obj) {
                                        list20 = list15;
                                        list21 = arrayList;
                                        buttonUIStateFactory4 = buttonUIStateFactory6;
                                        function10 = function8;
                                        list21.add(ButtonUIStateFactory.f(buttonUIStateFactory4, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function10, 16), UIShape.e, false, 0.0f, 52));
                                        return list20;
                                    }
                                } else {
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 10;
                                    objJ = stringProvider.b(StringEnum.USE_A_RIDE_FROM_YOUR_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                    if (objJ != obj) {
                                        list16 = arrayList;
                                        buttonUIStateFactory3 = buttonUIStateFactory6;
                                        function9 = function8;
                                        list17 = list3;
                                        list18 = list15;
                                        list19 = list16;
                                        ButtonUIStateFactory buttonUIStateFactory9 = buttonUIStateFactory3;
                                        list16.add(ButtonUIStateFactory.f(buttonUIStateFactory9, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function9, 17), UIShape.e, false, 0.0f, 52));
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function9;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list18;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list17;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = list19;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 11;
                                        objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                        if (objJ != obj) {
                                            function11 = function9;
                                            buttonUIStateFactory5 = buttonUIStateFactory6;
                                            list22 = list18;
                                            ButtonUIStateFactory buttonUIStateFactory10 = buttonUIStateFactory5;
                                            list19.add(ButtonUIStateFactory.d(buttonUIStateFactory10, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function11, 18), UIShape.e, false, 52));
                                            return list22;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                function12 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                ActivationProductData.PassActivation passActivation3 = (ActivationProductData.PassActivation) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                objS = objJ;
                passActivation2 = passActivation3;
                list = (List) objS;
                if (list != null) {
                    return list;
                }
                arrayList = new ArrayList();
                superPass = passActivation2.f7999a;
                zL = superPass.l();
                basicInfoContract = this.d;
                if (zL) {
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function12;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = superPass;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 2;
                    objC2 = basicInfoContract.c(productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                    if (objC2 != obj) {
                        function3 = function12;
                        superPass3 = superPass;
                        list4 = arrayList;
                        objJ = objC2;
                        list5 = list4;
                        long jLongValue3 = ((Number) objJ).longValue();
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function3;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list4;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list5;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = null;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 3;
                        objJ = superPass3.j(jLongValue3);
                        if (objJ != obj) {
                            list6 = list5;
                            list7 = list4;
                            function4 = function3;
                            if (((Boolean) objJ).booleanValue()) {
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 4;
                                objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                if (objJ != obj) {
                                    list11 = arrayList;
                                    list12 = list7;
                                    function6 = function4;
                                    ButtonUIStateFactory buttonUIStateFactory11 = buttonUIStateFactory6;
                                    list11.add(ButtonUIStateFactory.f(buttonUIStateFactory11, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function6, 12), UIShape.e, false, 0.0f, 52));
                                    return list12;
                                }
                            } else {
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 5;
                                objJ = stringProvider.b(StringEnum.BOOK_RIDE_USING_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                if (objJ != obj) {
                                    list8 = arrayList;
                                    list9 = list7;
                                    function5 = function4;
                                    list10 = list6;
                                    buttonUIStateFactory = buttonUIStateFactory6;
                                    ButtonUIStateFactory buttonUIStateFactory12 = buttonUIStateFactory;
                                    list8.add(ButtonUIStateFactory.f(buttonUIStateFactory12, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function5, 13), UIShape.e, false, 0.0f, 52));
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function5;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list9;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list10;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 6;
                                    objB = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                    if (objB != obj) {
                                        list13 = arrayList;
                                        function7 = function5;
                                        list14 = list9;
                                        buttonUIStateFactory2 = buttonUIStateFactory6;
                                        objJ = objB;
                                        list13.add(ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function7, 15), UIShape.e, false, 52));
                                        return list14;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (!zL) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function12;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = superPass;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 7;
                    objC = basicInfoContract.c(productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                    if (objC != obj) {
                        function2 = function12;
                        superPass2 = superPass;
                        list2 = arrayList;
                        objJ = objC;
                        list3 = list2;
                        long jLongValue4 = ((Number) objJ).longValue();
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function2;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list2;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = null;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 8;
                        objJ = superPass2.j(jLongValue4);
                        if (objJ != obj) {
                            list15 = list2;
                            function8 = function2;
                            if (((Boolean) objJ).booleanValue()) {
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 9;
                                objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                if (objJ != obj) {
                                    list20 = list15;
                                    list21 = arrayList;
                                    buttonUIStateFactory4 = buttonUIStateFactory6;
                                    function10 = function8;
                                    list21.add(ButtonUIStateFactory.f(buttonUIStateFactory4, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function10, 16), UIShape.e, false, 0.0f, 52));
                                    return list20;
                                }
                            } else {
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 10;
                                objJ = stringProvider.b(StringEnum.USE_A_RIDE_FROM_YOUR_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                if (objJ != obj) {
                                    list16 = arrayList;
                                    buttonUIStateFactory3 = buttonUIStateFactory6;
                                    function9 = function8;
                                    list17 = list3;
                                    list18 = list15;
                                    list19 = list16;
                                    ButtonUIStateFactory buttonUIStateFactory13 = buttonUIStateFactory3;
                                    list16.add(ButtonUIStateFactory.f(buttonUIStateFactory13, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function9, 17), UIShape.e, false, 0.0f, 52));
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function9;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list18;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list17;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = list19;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 11;
                                    objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                                    if (objJ != obj) {
                                        function11 = function9;
                                        buttonUIStateFactory5 = buttonUIStateFactory6;
                                        list22 = list18;
                                        ButtonUIStateFactory buttonUIStateFactory14 = buttonUIStateFactory5;
                                        list19.add(ButtonUIStateFactory.d(buttonUIStateFactory14, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function11, 18), UIShape.e, false, 52));
                                        return list22;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                superPass3 = (SuperPass) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                arrayList = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                list5 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2;
                list4 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function3 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                long jLongValue5 = ((Number) objJ).longValue();
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function3;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list4;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list5;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = null;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 3;
                objJ = superPass3.j(jLongValue5);
                if (objJ != obj) {
                    list6 = list5;
                    list7 = list4;
                    function4 = function3;
                    if (((Boolean) objJ).booleanValue()) {
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 4;
                        objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objJ != obj) {
                            list11 = arrayList;
                            list12 = list7;
                            function6 = function4;
                            ButtonUIStateFactory buttonUIStateFactory15 = buttonUIStateFactory6;
                            list11.add(ButtonUIStateFactory.f(buttonUIStateFactory15, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function6, 12), UIShape.e, false, 0.0f, 52));
                            return list12;
                        }
                    } else {
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 5;
                        objJ = stringProvider.b(StringEnum.BOOK_RIDE_USING_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objJ != obj) {
                            list8 = arrayList;
                            list9 = list7;
                            function5 = function4;
                            list10 = list6;
                            buttonUIStateFactory = buttonUIStateFactory6;
                            ButtonUIStateFactory buttonUIStateFactory16 = buttonUIStateFactory;
                            list8.add(ButtonUIStateFactory.f(buttonUIStateFactory16, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function5, 13), UIShape.e, false, 0.0f, 52));
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function5;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list9;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list10;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 6;
                            objB = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                            if (objB != obj) {
                                list13 = arrayList;
                                function7 = function5;
                                list14 = list9;
                                buttonUIStateFactory2 = buttonUIStateFactory6;
                                objJ = objB;
                                list13.add(ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function7, 15), UIShape.e, false, 52));
                                return list14;
                            }
                        }
                    }
                }
                return obj;
            case 3:
                List list23 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                List list24 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2;
                list7 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function4 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                arrayList = list23;
                list6 = list24;
                if (((Boolean) objJ).booleanValue()) {
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 4;
                    objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                    if (objJ != obj) {
                        list11 = arrayList;
                        list12 = list7;
                        function6 = function4;
                        ButtonUIStateFactory buttonUIStateFactory17 = buttonUIStateFactory6;
                        list11.add(ButtonUIStateFactory.f(buttonUIStateFactory17, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function6, 12), UIShape.e, false, 0.0f, 52));
                        return list12;
                    }
                } else {
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function4;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list7;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list6;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 5;
                    objJ = stringProvider.b(StringEnum.BOOK_RIDE_USING_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                    if (objJ != obj) {
                        list8 = arrayList;
                        list9 = list7;
                        function5 = function4;
                        list10 = list6;
                        buttonUIStateFactory = buttonUIStateFactory6;
                        ButtonUIStateFactory buttonUIStateFactory18 = buttonUIStateFactory;
                        list8.add(ButtonUIStateFactory.f(buttonUIStateFactory18, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function5, 13), UIShape.e, false, 0.0f, 52));
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function5;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list9;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list10;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 6;
                        objB = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objB != obj) {
                            list13 = arrayList;
                            function7 = function5;
                            list14 = list9;
                            buttonUIStateFactory2 = buttonUIStateFactory6;
                            objJ = objB;
                            list13.add(ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function7, 15), UIShape.e, false, 52));
                            return list14;
                        }
                    }
                }
                return obj;
            case 4:
                buttonUIStateFactory6 = (ButtonUIStateFactory) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                list11 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                list12 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function6 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                ButtonUIStateFactory buttonUIStateFactory19 = buttonUIStateFactory6;
                list11.add(ButtonUIStateFactory.f(buttonUIStateFactory19, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function6, 12), UIShape.e, false, 0.0f, 52));
                return list12;
            case 5:
                buttonUIStateFactory = (ButtonUIStateFactory) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5;
                List list25 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                List list26 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                list10 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2;
                List list27 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                Function1 function13 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                almostBlackColor = almostBlackColor;
                list9 = list27;
                list8 = list25;
                arrayList = list26;
                function5 = function13;
                ButtonUIStateFactory buttonUIStateFactory110 = buttonUIStateFactory;
                list8.add(ButtonUIStateFactory.f(buttonUIStateFactory110, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function5, 13), UIShape.e, false, 0.0f, 52));
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function5;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list9;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list10;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 6;
                objB = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                if (objB != obj) {
                    list13 = arrayList;
                    function7 = function5;
                    list14 = list9;
                    buttonUIStateFactory2 = buttonUIStateFactory6;
                    objJ = objB;
                    list13.add(ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function7, 15), UIShape.e, false, 52));
                    return list14;
                }
                return obj;
            case 6:
                ButtonUIStateFactory buttonUIStateFactory20 = (ButtonUIStateFactory) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                list13 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                list14 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function7 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                almostBlackColor = almostBlackColor;
                buttonUIStateFactory2 = buttonUIStateFactory20;
                list13.add(ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function7, 15), UIShape.e, false, 52));
                return list14;
            case 7:
                superPass2 = (SuperPass) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                arrayList = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                List list28 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2;
                list2 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function2 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                list3 = list28;
                long jLongValue6 = ((Number) objJ).longValue();
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function2;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list2;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = null;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 8;
                objJ = superPass2.j(jLongValue6);
                if (objJ != obj) {
                    list15 = list2;
                    function8 = function2;
                    if (((Boolean) objJ).booleanValue()) {
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 9;
                        objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objJ != obj) {
                            list20 = list15;
                            list21 = arrayList;
                            buttonUIStateFactory4 = buttonUIStateFactory6;
                            function10 = function8;
                            list21.add(ButtonUIStateFactory.f(buttonUIStateFactory4, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function10, 16), UIShape.e, false, 0.0f, 52));
                            return list20;
                        }
                    } else {
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 10;
                        objJ = stringProvider.b(StringEnum.USE_A_RIDE_FROM_YOUR_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objJ != obj) {
                            list16 = arrayList;
                            buttonUIStateFactory3 = buttonUIStateFactory6;
                            function9 = function8;
                            list17 = list3;
                            list18 = list15;
                            list19 = list16;
                            ButtonUIStateFactory buttonUIStateFactory111 = buttonUIStateFactory3;
                            list16.add(ButtonUIStateFactory.f(buttonUIStateFactory111, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function9, 17), UIShape.e, false, 0.0f, 52));
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function9;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list18;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list17;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = list19;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                            productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 11;
                            objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                            if (objJ != obj) {
                                function11 = function9;
                                buttonUIStateFactory5 = buttonUIStateFactory6;
                                list22 = list18;
                                ButtonUIStateFactory buttonUIStateFactory112 = buttonUIStateFactory5;
                                list19.add(ButtonUIStateFactory.d(buttonUIStateFactory112, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function11, 18), UIShape.e, false, 52));
                                return list22;
                            }
                        }
                    }
                }
                return obj;
            case 8:
                List list29 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                List list30 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2;
                List list31 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function8 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                list3 = list30;
                stringProvider = stringProvider;
                arrayList = list29;
                list15 = list31;
                buttonUIStateFactory6 = buttonUIStateFactory6;
                if (((Boolean) objJ).booleanValue()) {
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 9;
                    objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                    if (objJ != obj) {
                        list20 = list15;
                        list21 = arrayList;
                        buttonUIStateFactory4 = buttonUIStateFactory6;
                        function10 = function8;
                        list21.add(ButtonUIStateFactory.f(buttonUIStateFactory4, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function10, 16), UIShape.e, false, 0.0f, 52));
                        return list20;
                    }
                } else {
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function8;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list15;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list3;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = arrayList;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = buttonUIStateFactory6;
                    productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 10;
                    objJ = stringProvider.b(StringEnum.USE_A_RIDE_FROM_YOUR_PASS, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                    if (objJ != obj) {
                        list16 = arrayList;
                        buttonUIStateFactory3 = buttonUIStateFactory6;
                        function9 = function8;
                        list17 = list3;
                        list18 = list15;
                        list19 = list16;
                        ButtonUIStateFactory buttonUIStateFactory113 = buttonUIStateFactory3;
                        list16.add(ButtonUIStateFactory.f(buttonUIStateFactory113, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function9, 17), UIShape.e, false, 0.0f, 52));
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function9;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list18;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list17;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = list19;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                        productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 11;
                        objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                        if (objJ != obj) {
                            function11 = function9;
                            buttonUIStateFactory5 = buttonUIStateFactory6;
                            list22 = list18;
                            ButtonUIStateFactory buttonUIStateFactory114 = buttonUIStateFactory5;
                            list19.add(ButtonUIStateFactory.d(buttonUIStateFactory114, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function11, 18), UIShape.e, false, 52));
                            return list22;
                        }
                    }
                }
                return obj;
            case 9:
                ButtonUIStateFactory buttonUIStateFactory21 = (ButtonUIStateFactory) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                list21 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                list20 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function10 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                buttonUIStateFactory4 = buttonUIStateFactory21;
                list21.add(ButtonUIStateFactory.f(buttonUIStateFactory4, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function10, 16), UIShape.e, false, 0.0f, 52));
                return list20;
            case 10:
                ButtonUIStateFactory buttonUIStateFactory22 = (ButtonUIStateFactory) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5;
                List list32 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                List list33 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                list17 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2;
                List list34 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                Function1 function14 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                buttonUIStateFactory3 = buttonUIStateFactory22;
                list16 = list32;
                list19 = list33;
                stringProvider = stringProvider;
                buttonUIStateFactory6 = buttonUIStateFactory6;
                list18 = list34;
                function9 = function14;
                ButtonUIStateFactory buttonUIStateFactory115 = buttonUIStateFactory3;
                list16.add(ButtonUIStateFactory.f(buttonUIStateFactory115, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, white, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function9, 17), UIShape.e, false, 0.0f, 52));
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0 = function9;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1 = list18;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$2 = list17;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3 = list19;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4 = buttonUIStateFactory6;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$5 = null;
                productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.label = 11;
                objJ = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1);
                if (objJ != obj) {
                    function11 = function9;
                    buttonUIStateFactory5 = buttonUIStateFactory6;
                    list22 = list18;
                    ButtonUIStateFactory buttonUIStateFactory116 = buttonUIStateFactory5;
                    list19.add(ButtonUIStateFactory.d(buttonUIStateFactory116, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function11, 18), UIShape.e, false, 52));
                    return list22;
                }
                return obj;
            case 11:
                ButtonUIStateFactory buttonUIStateFactory23 = (ButtonUIStateFactory) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$4;
                list19 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$3;
                list22 = (List) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$1;
                function11 = (Function1) productActivationUIStateBuilder$getPassFooterCtaButtonUIStateList$1.L$0;
                ResultKt.b(objJ);
                buttonUIStateFactory5 = buttonUIStateFactory23;
                ButtonUIStateFactory buttonUIStateFactory117 = buttonUIStateFactory5;
                list19.add(ButtonUIStateFactory.d(buttonUIStateFactory117, new TextUIState.ChaloTextUIState((String) objJ, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function11, 18), UIShape.e, false, 52));
                return list22;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(Function1 function1, StringEnum stringEnum, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1 productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1;
        ButtonUIState[] buttonUIStateArr;
        Function1 function2;
        ButtonUIStateFactory buttonUIStateFactory;
        int i;
        ButtonUIState[] buttonUIStateArr2;
        ButtonUIState[] buttonUIStateArr3;
        ButtonUIState[] buttonUIStateArr4;
        Function1 function3;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1) {
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1 = (ProductActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1) continuationImpl;
            int i2 = productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1 = new ProductActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1 = new ProductActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.label;
        StringProvider stringProvider = this.f8070a;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        int i4 = 1;
        if (i3 == 0) {
            ResultKt.b(objB);
            buttonUIStateArr = new ButtonUIState[2];
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$0 = function1;
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$1 = buttonUIStateArr;
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$2 = buttonUIStateFactory2;
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$3 = buttonUIStateArr;
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.I$0 = 0;
            productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.label = 1;
            objB = stringProvider.b(stringEnum, new Object[0], productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1);
            if (objB != coroutineSingletons) {
                function2 = function1;
                buttonUIStateFactory = buttonUIStateFactory2;
                i = 0;
                buttonUIStateArr2 = buttonUIStateArr;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.I$0;
            buttonUIStateArr = (ButtonUIState[]) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$3;
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$2;
            buttonUIStateArr2 = (ButtonUIState[]) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$1;
            function2 = (Function1) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$0;
            ResultKt.b(objB);
            buttonUIStateFactory = buttonUIStateFactory3;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.I$0;
            buttonUIStateArr3 = (ButtonUIState[]) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$3;
            buttonUIStateFactory2 = (ButtonUIStateFactory) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$2;
            buttonUIStateArr4 = (ButtonUIState[]) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$1;
            function3 = (Function1) productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$0;
            ResultKt.b(objB);
        }
        buttonUIStateArr3[i4] = ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function3, 10), UIShape.e, false, 52);
        return CollectionsKt.S(buttonUIStateArr4);
        buttonUIStateArr[i] = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function2, 9), UIShape.e, false, 0.0f, 52);
        productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$0 = function2;
        productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$1 = buttonUIStateArr2;
        productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$2 = buttonUIStateFactory2;
        productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.L$3 = buttonUIStateArr2;
        productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.I$0 = 1;
        productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1.label = 2;
        objB = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], productActivationUIStateBuilder$getStandardActivationFooterButtonsForTicket$1);
        if (objB != coroutineSingletons) {
            buttonUIStateArr3 = buttonUIStateArr2;
            buttonUIStateArr4 = buttonUIStateArr3;
            function3 = function2;
            buttonUIStateArr3[i4] = ButtonUIStateFactory.d(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new iw0(function3, 10), UIShape.e, false, 52);
            return CollectionsKt.S(buttonUIStateArr4);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object o(long j, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getStandardValidTillUIState$1 productActivationUIStateBuilder$getStandardValidTillUIState$1;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getStandardValidTillUIState$1) {
            productActivationUIStateBuilder$getStandardValidTillUIState$1 = (ProductActivationUIStateBuilder$getStandardValidTillUIState$1) continuationImpl;
            int i = productActivationUIStateBuilder$getStandardValidTillUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getStandardValidTillUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getStandardValidTillUIState$1 = new ProductActivationUIStateBuilder$getStandardValidTillUIState$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getStandardValidTillUIState$1 = new ProductActivationUIStateBuilder$getStandardValidTillUIState$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$getStandardValidTillUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$getStandardValidTillUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            String strA = TimeUtilsContract.DefaultImpls.a(this.c, j, null, 6);
            productActivationUIStateBuilder$getStandardValidTillUIState$1.label = 1;
            objB = this.f8070a.b(StringEnum.VALID_TILL_X, new Object[]{strA}, productActivationUIStateBuilder$getStandardValidTillUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(MultiModalGroupTicketChildAppModel multiModalGroupTicketChildAppModel, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1 productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1) {
            productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1 = (ProductActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1) continuationImpl;
            int i = productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1 = new ProductActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1 = new ProductActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1(this, continuationImpl);
        }
        Object objA = productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1.L$0 = multiModalGroupTicketChildAppModel;
            productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1.label = 1;
            objA = MultiModalGroupTicketChildUIStateMapperKt.a(multiModalGroupTicketChildAppModel, this.h, productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            multiModalGroupTicketChildAppModel = (MultiModalGroupTicketChildAppModel) productActivationUIStateBuilder$getStepBasedRouteDetailCardUIStateForChild$1.L$0;
            ResultKt.b(objA);
        }
        StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objA;
        ProductBookingBrandingUIState.ImageResourceBrandingUIState imageResourceBrandingUIState = null;
        if (multiModalGroupTicketChildAppModel instanceof MultiModalGroupTicketChildAppModel.OndcMetroTicketChild) {
            imageResourceBrandingUIState = new ProductBookingBrandingUIState.ImageResourceBrandingUIState(new ImageResourceBrandingUISpecs(null, null, 3), new ImageUIState(IconType.ONDC_LOGO, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().r)), UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 230));
        }
        return new StepBasedRouteDetailCardUIState(stepTicketModeBasedInfoUIState, imageResourceBrandingUIState);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:31:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0105 -> B:32:0x0106). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object q(java.util.List r23, boolean r24, kotlin.jvm.functions.Function1 r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder.q(java.util.List, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (r10 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome r8, kotlin.jvm.functions.Function1 r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder.s(app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c8 A[PHI: r1 r3
      0x00c8: PHI (r1v1 app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome) = 
      (r1v0 app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome)
      (r1v7 app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome)
      (r1v7 app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome)
     binds: [B:36:0x00c6, B:29:0x00b1, B:34:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r3v4 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel) = 
      (r3v2 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r3v8 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
      (r3v8 app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel)
     binds: [B:36:0x00c6, B:29:0x00b1, B:34:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182  */
    /* JADX WARN: Code duplicated, block: B:63:0x0193  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r2 == r5) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome r31, app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel r32, app.chalo.productactivation.data.ActivationProductData.PassActivation r33, kotlin.jvm.functions.Function1 r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.uistate.ProductActivationUIStateBuilder.t(app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome, app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel, app.chalo.productactivation.data.ActivationProductData$PassActivation, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object u(Gender gender, Function1 function1, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1 productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1;
        UserProfilePicComposableUIState userProfilePicComposableUIState;
        Function1 function2;
        UserProfilePicComposableUIState userProfilePicComposableUIState2;
        TextUIState textUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState textUIState2;
        Function1 function3;
        UserProfilePicComposableUIState userProfilePicComposableUIState3;
        TextUIState textUIState3;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1) {
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1 = (ProductActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1) continuationImpl;
            int i = productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1 = new ProductActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1 = new ProductActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.label;
        StringProvider stringProvider = this.f8070a;
        if (i2 == 0) {
            ResultKt.b(objB);
            userProfilePicComposableUIState = new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(new BorderUISpec(ChaloThemeHelper.a().c, ChaloColorToken.IvoryYellow.f9812a, UIShape.Circle.p), ChaloThemeHelper.a().d, ChaloThemeHelper.a().l0, 14), UserProfilePicComposableKt.b(gender, ChaloThemeHelper.a().l0, 2));
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$0 = function1;
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$1 = userProfilePicComposableUIState;
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.USER_PROFILING_HOME_DRAWER_BANNER_TITLE, new Object[0], productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1);
            if (objB != coroutineSingletons) {
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            userProfilePicComposableUIState = (UserProfilePicComposableUIState) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$1;
            function2 = (Function1) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                textUIState = (TextUIState) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$2;
                UserProfilePicComposableUIState userProfilePicComposableUIState4 = (UserProfilePicComposableUIState) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$1;
                Function1 function4 = (Function1) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$0;
                ResultKt.b(objB);
                userProfilePicComposableUIState2 = userProfilePicComposableUIState4;
                function2 = function4;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$0 = function2;
                productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$1 = userProfilePicComposableUIState2;
                productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$2 = textUIState;
                productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$3 = chaloTextUIState;
                productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.SET_UP_PROFILE, new Object[0], productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1);
                if (objB != coroutineSingletons) {
                    textUIState2 = textUIState;
                    function3 = function2;
                    userProfilePicComposableUIState3 = userProfilePicComposableUIState2;
                    textUIState3 = chaloTextUIState;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState textUIState4 = (TextUIState) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$3;
            TextUIState textUIState5 = (TextUIState) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$2;
            UserProfilePicComposableUIState userProfilePicComposableUIState5 = (UserProfilePicComposableUIState) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$1;
            function3 = (Function1) productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$0;
            ResultKt.b(objB);
            textUIState2 = textUIState5;
            userProfilePicComposableUIState3 = userProfilePicComposableUIState5;
            textUIState3 = textUIState4;
        }
        UITextStyle uITextStyle = UITextStyle.TitleLarge;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        return new UserProfilingTicketActivationBannerUIState(userProfilePicComposableUIState3, textUIState2, textUIState3, new SetUpProfileBtnUIState(new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, uITextStyle, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, white, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().d), 9), UiEventHandler.Companion.a(new iw0(function3, 14))), new iw0(function3, 23));
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$0 = function2;
        productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$1 = userProfilePicComposableUIState;
        productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$2 = chaloTextUIState2;
        productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.THIS_WILL_HELP_US_IMPROVE_YOUR_EXPERIENCE, new Object[0], productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1);
        if (objB != coroutineSingletons) {
            userProfilePicComposableUIState2 = userProfilePicComposableUIState;
            textUIState = chaloTextUIState2;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$0 = function2;
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$1 = userProfilePicComposableUIState2;
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$2 = textUIState;
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.L$3 = chaloTextUIState;
            productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.SET_UP_PROFILE, new Object[0], productActivationUIStateBuilder$getUserProfilingTicketActivationBannerUIState$1);
            if (objB != coroutineSingletons) {
                textUIState2 = textUIState;
                function3 = function2;
                userProfilePicComposableUIState3 = userProfilePicComposableUIState2;
                textUIState3 = chaloTextUIState;
                UITextStyle uITextStyle2 = UITextStyle.TitleLarge;
                ChaloColorToken.White white2 = ChaloColorToken.White.f9870a;
                return new UserProfilingTicketActivationBannerUIState(userProfilePicComposableUIState3, textUIState2, textUIState3, new SetUpProfileBtnUIState(new TextWithLeftAndRightIconUIState(null, new TextUIState.ChaloTextUIState((String) objB, uITextStyle2, white2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, white2, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), 0.0f, Dp.m7276boximpl(ChaloThemeHelper.a().d), 9), UiEventHandler.Companion.a(new iw0(function3, 14))), new iw0(function3, 23));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object v(Long l, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getValidityDurationInfoUIState$1 productActivationUIStateBuilder$getValidityDurationInfoUIState$1;
        long jLongValue;
        String str;
        Object objB;
        String str2;
        String str3;
        int iD;
        ListBuilder listBuilderY;
        String strSubstring;
        String strSubstring2;
        List listG;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getValidityDurationInfoUIState$1) {
            productActivationUIStateBuilder$getValidityDurationInfoUIState$1 = (ProductActivationUIStateBuilder$getValidityDurationInfoUIState$1) continuationImpl;
            int i = productActivationUIStateBuilder$getValidityDurationInfoUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1 = new ProductActivationUIStateBuilder$getValidityDurationInfoUIState$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getValidityDurationInfoUIState$1 = new ProductActivationUIStateBuilder$getValidityDurationInfoUIState$1(this, continuationImpl);
        }
        Object objC = productActivationUIStateBuilder$getValidityDurationInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$getValidityDurationInfoUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (l != null) {
                jLongValue = l.longValue();
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1.J$0 = jLongValue;
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1.label = 1;
                objC = this.d.c(productActivationUIStateBuilder$getValidityDurationInfoUIState$1);
                if (objC != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return null;
        }
        if (i2 == 1) {
            jLongValue = productActivationUIStateBuilder$getValidityDurationInfoUIState$1.J$0;
            ResultKt.b(objC);
        } else {
            if (i2 == 2) {
                ResultKt.b(objC);
                str = (String) objC;
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1.L$0 = str;
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1.label = 3;
                objB = this.f8070a.b(StringEnum.TICKET_VALID_FOR_THE_NEXT, new Object[]{str}, productActivationUIStateBuilder$getValidityDurationInfoUIState$1);
                if (objB != coroutineSingletons) {
                    str2 = str;
                    objC = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) productActivationUIStateBuilder$getValidityDurationInfoUIState$1.L$0;
            ResultKt.b(objC);
            str2 = str4;
        }
        str3 = (String) objC;
        ImageUIState imageUIState = new ImageUIState(IconType.IC_STOPWATCH, (String) null, ChaloColorToken.Orange3.f9831a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        iD = StringsKt.D(str3, str2, 0, false, 6);
        if (iD < 0) {
            listG = CollectionsKt.R(b(str3));
        } else {
            listBuilderY = CollectionsKt.y();
            strSubstring = str3.substring(0, iD);
            Intrinsics.h(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                listBuilderY.add(b(strSubstring));
            }
            listBuilderY.add(new StyledTextDataUIState(str2, ChaloColorToken.AlmostBlackColor.f9756a, UIFontWeight.Bold, UITextStyle.TitleLarge, null, null, null, 1008));
            strSubstring2 = str3.substring(str2.length() + iD);
            Intrinsics.h(strSubstring2, "substring(...)");
            if (strSubstring2.length() > 0) {
                listBuilderY.add(b(strSubstring2));
            }
            listG = listBuilderY.g();
        }
        return new AlertTextWithIconUiState(imageUIState, new TextUIState.StyledTextUIState(listG, null, null, 30));
        long jLongValue2 = jLongValue - ((Number) objC).longValue();
        if (jLongValue2 > 0) {
            productActivationUIStateBuilder$getValidityDurationInfoUIState$1.label = 2;
            objC = this.c.c(jLongValue2, productActivationUIStateBuilder$getValidityDurationInfoUIState$1);
            if (objC != coroutineSingletons) {
                str = (String) objC;
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1.L$0 = str;
                productActivationUIStateBuilder$getValidityDurationInfoUIState$1.label = 3;
                objB = this.f8070a.b(StringEnum.TICKET_VALID_FOR_THE_NEXT, new Object[]{str}, productActivationUIStateBuilder$getValidityDurationInfoUIState$1);
                if (objB != coroutineSingletons) {
                    str2 = str;
                    objC = objB;
                    str3 = (String) objC;
                    ImageUIState imageUIState2 = new ImageUIState(IconType.IC_STOPWATCH, (String) null, ChaloColorToken.Orange3.f9831a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                    iD = StringsKt.D(str3, str2, 0, false, 6);
                    if (iD < 0) {
                        listG = CollectionsKt.R(b(str3));
                    } else {
                        listBuilderY = CollectionsKt.y();
                        strSubstring = str3.substring(0, iD);
                        Intrinsics.h(strSubstring, "substring(...)");
                        if (strSubstring.length() > 0) {
                            listBuilderY.add(b(strSubstring));
                        }
                        listBuilderY.add(new StyledTextDataUIState(str2, ChaloColorToken.AlmostBlackColor.f9756a, UIFontWeight.Bold, UITextStyle.TitleLarge, null, null, null, 1008));
                        strSubstring2 = str3.substring(str2.length() + iD);
                        Intrinsics.h(strSubstring2, "substring(...)");
                        if (strSubstring2.length() > 0) {
                            listBuilderY.add(b(strSubstring2));
                        }
                        listG = listBuilderY.g();
                    }
                    return new AlertTextWithIconUiState(imageUIState2, new TextUIState.StyledTextUIState(listG, null, null, 30));
                }
            }
            return coroutineSingletons;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object w(long j, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$getValidityInfoUIState$1 productActivationUIStateBuilder$getValidityInfoUIState$1;
        String strA;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        ImageUIState imageUIState;
        int i;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$getValidityInfoUIState$1) {
            productActivationUIStateBuilder$getValidityInfoUIState$1 = (ProductActivationUIStateBuilder$getValidityInfoUIState$1) continuationImpl;
            int i2 = productActivationUIStateBuilder$getValidityInfoUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$getValidityInfoUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$getValidityInfoUIState$1 = new ProductActivationUIStateBuilder$getValidityInfoUIState$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$getValidityInfoUIState$1 = new ProductActivationUIStateBuilder$getValidityInfoUIState$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$getValidityInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = productActivationUIStateBuilder$getValidityInfoUIState$1.label;
        StringProvider stringProvider = this.f8070a;
        int i4 = 1;
        if (i3 == 0) {
            ResultKt.b(objB);
            strA = this.b.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_ICON_TICKET_BLACK, (String) null, ChaloColorToken.Orange3.f9831a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
            StyledTextDataUIState[] styledTextDataUIStateArr5 = new StyledTextDataUIState[2];
            productActivationUIStateBuilder$getValidityInfoUIState$1.L$0 = strA;
            productActivationUIStateBuilder$getValidityInfoUIState$1.L$1 = styledTextDataUIStateArr5;
            productActivationUIStateBuilder$getValidityInfoUIState$1.L$2 = imageUIState2;
            productActivationUIStateBuilder$getValidityInfoUIState$1.L$3 = styledTextDataUIStateArr5;
            productActivationUIStateBuilder$getValidityInfoUIState$1.I$0 = 0;
            productActivationUIStateBuilder$getValidityInfoUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.TICKET_VALID_ON_ANY_RIDE, new Object[0], productActivationUIStateBuilder$getValidityInfoUIState$1);
            if (objB != coroutineSingletons) {
                styledTextDataUIStateArr = styledTextDataUIStateArr5;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                imageUIState = imageUIState2;
                i = 0;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i5 = productActivationUIStateBuilder$getValidityInfoUIState$1.I$0;
            StyledTextDataUIState[] styledTextDataUIStateArr6 = (StyledTextDataUIState[]) productActivationUIStateBuilder$getValidityInfoUIState$1.L$3;
            ImageUIState imageUIState3 = (ImageUIState) productActivationUIStateBuilder$getValidityInfoUIState$1.L$2;
            styledTextDataUIStateArr2 = (StyledTextDataUIState[]) productActivationUIStateBuilder$getValidityInfoUIState$1.L$1;
            strA = (String) productActivationUIStateBuilder$getValidityInfoUIState$1.L$0;
            ResultKt.b(objB);
            i = i5;
            imageUIState = imageUIState3;
            styledTextDataUIStateArr = styledTextDataUIStateArr6;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = productActivationUIStateBuilder$getValidityInfoUIState$1.I$0;
            styledTextDataUIStateArr4 = (StyledTextDataUIState[]) productActivationUIStateBuilder$getValidityInfoUIState$1.L$2;
            imageUIState = (ImageUIState) productActivationUIStateBuilder$getValidityInfoUIState$1.L$1;
            styledTextDataUIStateArr3 = (StyledTextDataUIState[]) productActivationUIStateBuilder$getValidityInfoUIState$1.L$0;
            ResultKt.b(objB);
        }
        styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(gf.h(" ", objB), ChaloColorToken.AlmostBlackColor.f9756a, UIFontWeight.Bold, UITextStyle.TitleLarge, null, null, null, 1008);
        return new AlertTextWithIconUiState(imageUIState, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
        styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) objB, ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012);
        productActivationUIStateBuilder$getValidityInfoUIState$1.L$0 = styledTextDataUIStateArr2;
        productActivationUIStateBuilder$getValidityInfoUIState$1.L$1 = imageUIState;
        productActivationUIStateBuilder$getValidityInfoUIState$1.L$2 = styledTextDataUIStateArr2;
        productActivationUIStateBuilder$getValidityInfoUIState$1.L$3 = null;
        productActivationUIStateBuilder$getValidityInfoUIState$1.I$0 = 1;
        productActivationUIStateBuilder$getValidityInfoUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.TICKET_VALID_UP_TO_AMOUNT, new Object[]{strA}, productActivationUIStateBuilder$getValidityInfoUIState$1);
        if (objB != coroutineSingletons) {
            styledTextDataUIStateArr3 = styledTextDataUIStateArr2;
            styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
            styledTextDataUIStateArr4[i4] = new StyledTextDataUIState(gf.h(" ", objB), ChaloColorToken.AlmostBlackColor.f9756a, UIFontWeight.Bold, UITextStyle.TitleLarge, null, null, null, 1008);
            return new AlertTextWithIconUiState(imageUIState, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr3), null, null, 30));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object x(StringEnum stringEnum, iw0 iw0Var, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$greyFooterButton$1 productActivationUIStateBuilder$greyFooterButton$1;
        Function0 function0;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$greyFooterButton$1) {
            productActivationUIStateBuilder$greyFooterButton$1 = (ProductActivationUIStateBuilder$greyFooterButton$1) continuationImpl;
            int i = productActivationUIStateBuilder$greyFooterButton$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$greyFooterButton$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$greyFooterButton$1 = new ProductActivationUIStateBuilder$greyFooterButton$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$greyFooterButton$1 = new ProductActivationUIStateBuilder$greyFooterButton$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$greyFooterButton$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$greyFooterButton$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            productActivationUIStateBuilder$greyFooterButton$1.L$0 = iw0Var;
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            productActivationUIStateBuilder$greyFooterButton$1.L$1 = buttonUIStateFactory2;
            productActivationUIStateBuilder$greyFooterButton$1.label = 1;
            objB = this.f8070a.b(stringEnum, new Object[0], productActivationUIStateBuilder$greyFooterButton$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function0 = iw0Var;
            buttonUIStateFactory = buttonUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) productActivationUIStateBuilder$greyFooterButton$1.L$1;
            Function0 function1 = (Function0) productActivationUIStateBuilder$greyFooterButton$1.L$0;
            ResultKt.b(objB);
            function0 = function1;
            buttonUIStateFactory = buttonUIStateFactory3;
        }
        return ButtonUIStateFactory.d(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), function0, UIShape.e, false, 52);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object y(StringEnum stringEnum, Function0 function0, ContinuationImpl continuationImpl) {
        ProductActivationUIStateBuilder$orangeFooterButton$1 productActivationUIStateBuilder$orangeFooterButton$1;
        Function0 function1;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof ProductActivationUIStateBuilder$orangeFooterButton$1) {
            productActivationUIStateBuilder$orangeFooterButton$1 = (ProductActivationUIStateBuilder$orangeFooterButton$1) continuationImpl;
            int i = productActivationUIStateBuilder$orangeFooterButton$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productActivationUIStateBuilder$orangeFooterButton$1.label = i - Integer.MIN_VALUE;
            } else {
                productActivationUIStateBuilder$orangeFooterButton$1 = new ProductActivationUIStateBuilder$orangeFooterButton$1(this, continuationImpl);
            }
        } else {
            productActivationUIStateBuilder$orangeFooterButton$1 = new ProductActivationUIStateBuilder$orangeFooterButton$1(this, continuationImpl);
        }
        Object objB = productActivationUIStateBuilder$orangeFooterButton$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productActivationUIStateBuilder$orangeFooterButton$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            productActivationUIStateBuilder$orangeFooterButton$1.L$0 = function0;
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            productActivationUIStateBuilder$orangeFooterButton$1.L$1 = buttonUIStateFactory2;
            productActivationUIStateBuilder$orangeFooterButton$1.label = 1;
            objB = this.f8070a.b(stringEnum, new Object[0], productActivationUIStateBuilder$orangeFooterButton$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function1 = function0;
            buttonUIStateFactory = buttonUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) productActivationUIStateBuilder$orangeFooterButton$1.L$1;
            Function0 function2 = (Function0) productActivationUIStateBuilder$orangeFooterButton$1.L$0;
            ResultKt.b(objB);
            function1 = function2;
            buttonUIStateFactory = buttonUIStateFactory3;
        }
        return ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), function1, UIShape.e, false, 0.0f, 52);
    }

    public final Object z(String str, String str2, Continuation continuation) {
        return str2 == null ? str : this.f8070a.b(StringEnum.X_BULLET_Y, new Object[]{str, str2}, continuation);
    }
}
