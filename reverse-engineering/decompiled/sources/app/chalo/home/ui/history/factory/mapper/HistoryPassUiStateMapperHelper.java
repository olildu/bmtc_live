package app.chalo.home.ui.history.factory.mapper;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.contract.BasicInfoContract;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.domain.GetProductStatusUIUseCase;
import app.chalo.home.ui.history.ProductStatusUiData;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerSpec;
import app.chalo.home.ui.history.uistate.regularbusticket.ProductBannerUiState;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketCtaUiState;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.vo1;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/factory/mapper/HistoryPassUiStateMapperHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HistoryPassUiStateMapperHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f3456a;
    public final BasicInfoContract b;
    public final TimeUtilsContract c;
    public final GetProductStatusUIUseCase d;
    public final CheckIfContinueWithBulkBookingFlowUseCase e;
    public final BookingHelper f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3457a;

        static {
            int[] iArr = new int[BannerStatus.values().length];
            try {
                iArr[BannerStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerStatus.IN_PROCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3457a = iArr;
        }
    }

    public HistoryPassUiStateMapperHelper(StringProvider stringProvider, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, GetProductStatusUIUseCase getProductStatusUIUseCase, CheckIfContinueWithBulkBookingFlowUseCase checkIfContinueWithBulkBookingFlowUseCase, BookingHelper bookingHelper) {
        this.f3456a = stringProvider;
        this.b = basicInfoContract;
        this.c = timeUtilsContract;
        this.d = getProductStatusUIUseCase;
        this.e = checkIfContinueWithBulkBookingFlowUseCase;
        this.f = bookingHelper;
    }

    public static ProductBannerUiState e(ProductStatusUiData productStatusUiData, Function0 function0) {
        IconType iconType = productStatusUiData.f3443a;
        RegularBusTicketCtaUiState regularBusTicketCtaUiState = null;
        ImageUIState imageUIState = iconType != null ? new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null;
        ProductBannerSpec productBannerSpec = new ProductBannerSpec(0.0f, 11, productStatusUiData.b);
        String str = productStatusUiData.c;
        UITextStyle uITextStyle = UITextStyle.BodySmall;
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(str, uITextStyle, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        String str2 = productStatusUiData.d;
        if (str2 != null) {
            regularBusTicketCtaUiState = new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState(str2, uITextStyle, ChaloColorToken.Orange2.f9830a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), function0);
        }
        return new ProductBannerUiState(productBannerSpec, chaloTextUIState, imageUIState, regularBusTicketCtaUiState);
    }

    public static String f(String str, String str2, String str3) {
        return StringsKt.x(str, str2, true) ? vo1.n(str, " ", str3) : str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable a(ChaloUserBookingType.SuperPassBooking superPassBooking, boolean z, boolean z2, String str, BannerStatus bannerStatus, Function0 function0, ContinuationImpl continuationImpl) {
        HistoryPassUiStateMapperHelper$buildActivePassBannerState$1 historyPassUiStateMapperHelper$buildActivePassBannerState$1;
        String str2;
        Function0 function1;
        boolean z3;
        List list;
        ChaloColorToken chaloColorToken;
        IconType iconType;
        List list2;
        List list3;
        List list4;
        List list5;
        if (continuationImpl instanceof HistoryPassUiStateMapperHelper$buildActivePassBannerState$1) {
            historyPassUiStateMapperHelper$buildActivePassBannerState$1 = (HistoryPassUiStateMapperHelper$buildActivePassBannerState$1) continuationImpl;
            int i = historyPassUiStateMapperHelper$buildActivePassBannerState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                historyPassUiStateMapperHelper$buildActivePassBannerState$1.label = i - Integer.MIN_VALUE;
            } else {
                historyPassUiStateMapperHelper$buildActivePassBannerState$1 = new HistoryPassUiStateMapperHelper$buildActivePassBannerState$1(this, continuationImpl);
            }
        } else {
            historyPassUiStateMapperHelper$buildActivePassBannerState$1 = new HistoryPassUiStateMapperHelper$buildActivePassBannerState$1(this, continuationImpl);
        }
        Object objB = historyPassUiStateMapperHelper$buildActivePassBannerState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = historyPassUiStateMapperHelper$buildActivePassBannerState$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                z3 = historyPassUiStateMapperHelper$buildActivePassBannerState$1.Z$0;
                List list6 = (List) historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$3;
                List list7 = (List) historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$2;
                str2 = (String) historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$1;
                function1 = (Function0) historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$0;
                ResultKt.b(objB);
                list = list6;
                list2 = list7;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list8 = (List) historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$1;
                List list9 = (List) historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$0;
                ResultKt.b(objB);
                list5 = list9;
                list4 = list8;
            }
            list4.add(objB);
            list3 = list5;
            return CollectionsKt.t(list3);
        }
        ResultKt.b(objB);
        str2 = (str == null || StringsKt.F(str)) ? null : str;
        ListBuilder listBuilderY = CollectionsKt.y();
        if (!z || str2 == null || bannerStatus == null) {
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$0 = function0;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$1 = str2;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$2 = listBuilderY;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$3 = listBuilderY;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.Z$0 = z2;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.label = 1;
            Object objA = this.d.a(superPassBooking, historyPassUiStateMapperHelper$buildActivePassBannerState$1);
            if (objA != coroutineSingletons) {
                ListBuilder listBuilder = listBuilderY;
                function1 = function0;
                z3 = z2;
                objB = objA;
                list = listBuilder;
                list2 = listBuilder;
            }
            return coroutineSingletons;
        }
        int[] iArr = WhenMappings.f3457a;
        int i3 = iArr[bannerStatus.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            chaloColorToken = ChaloColorToken.LightOrangeSpf.f9817a;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            chaloColorToken = ChaloColorToken.RedBase.f9846a;
        }
        ProductBannerSpec productBannerSpec = new ProductBannerSpec(ChaloThemeHelper.a().f, 3, chaloColorToken);
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        int i4 = iArr[bannerStatus.ordinal()];
        if (i4 == 1) {
            iconType = IconType.PARTY_EMOJI;
        } else if (i4 == 2 || i4 == 3) {
            iconType = IconType.IC_ROLLOVER;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iconType = IconType.IC_ALERT_TRIANGLE;
        }
        listBuilderY.add(new ProductBannerUiState(productBannerSpec, chaloTextUIState, new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null));
        list3 = listBuilderY;
        return CollectionsKt.t(list3);
        ProductStatusUiData productStatusUiData = (ProductStatusUiData) objB;
        ProductBannerUiState productBannerUiStateE = productStatusUiData != null ? e(productStatusUiData, function1) : null;
        if (productBannerUiStateE != null) {
            list.add(productBannerUiStateE);
        }
        if (str2 == null && z3) {
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$0 = list2;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$1 = list;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$2 = null;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.L$3 = null;
            historyPassUiStateMapperHelper$buildActivePassBannerState$1.label = 2;
            objB = b(historyPassUiStateMapperHelper$buildActivePassBannerState$1);
            if (objB != coroutineSingletons) {
                list4 = list;
                list5 = list2;
                list4.add(objB);
                list3 = list5;
            }
            return coroutineSingletons;
        }
        list3 = list2;
        return CollectionsKt.t(list3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(ContinuationImpl continuationImpl) {
        HistoryPassUiStateMapperHelper$bulkBookingBannerState$1 historyPassUiStateMapperHelper$bulkBookingBannerState$1;
        ProductBannerSpec productBannerSpec;
        if (continuationImpl instanceof HistoryPassUiStateMapperHelper$bulkBookingBannerState$1) {
            historyPassUiStateMapperHelper$bulkBookingBannerState$1 = (HistoryPassUiStateMapperHelper$bulkBookingBannerState$1) continuationImpl;
            int i = historyPassUiStateMapperHelper$bulkBookingBannerState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                historyPassUiStateMapperHelper$bulkBookingBannerState$1.label = i - Integer.MIN_VALUE;
            } else {
                historyPassUiStateMapperHelper$bulkBookingBannerState$1 = new HistoryPassUiStateMapperHelper$bulkBookingBannerState$1(this, continuationImpl);
            }
        } else {
            historyPassUiStateMapperHelper$bulkBookingBannerState$1 = new HistoryPassUiStateMapperHelper$bulkBookingBannerState$1(this, continuationImpl);
        }
        Object obj = historyPassUiStateMapperHelper$bulkBookingBannerState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = historyPassUiStateMapperHelper$bulkBookingBannerState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProductBannerSpec productBannerSpec2 = new ProductBannerSpec(ChaloThemeHelper.a().f, 3, ChaloColorToken.LightOrangeSpf.f9817a);
            historyPassUiStateMapperHelper$bulkBookingBannerState$1.L$0 = productBannerSpec2;
            historyPassUiStateMapperHelper$bulkBookingBannerState$1.label = 1;
            Object objB = this.f3456a.b(StringEnum.BULK_BOOKING_INFO, new Object[0], historyPassUiStateMapperHelper$bulkBookingBannerState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            productBannerSpec = productBannerSpec2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productBannerSpec = (ProductBannerSpec) historyPassUiStateMapperHelper$bulkBookingBannerState$1.L$0;
            ResultKt.b(obj);
        }
        return new ProductBannerUiState(productBannerSpec, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_INFO, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), null);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0dc7  */
    /* JADX WARN: Code duplicated, block: B:107:0x0dd9  */
    /* JADX WARN: Code duplicated, block: B:110:0x0dfe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0e01  */
    /* JADX WARN: Code duplicated, block: B:113:0x0e04  */
    /* JADX WARN: Code duplicated, block: B:114:0x0e06  */
    /* JADX WARN: Code duplicated, block: B:117:0x0e0b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0e0e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0e11  */
    /* JADX WARN: Code duplicated, block: B:121:0x0e19  */
    /* JADX WARN: Code duplicated, block: B:125:0x0e5e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0ea6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0ee8  */
    /* JADX WARN: Code duplicated, block: B:136:0x0efa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0f03  */
    /* JADX WARN: Code duplicated, block: B:143:0x0f56  */
    /* JADX WARN: Code duplicated, block: B:147:0x1040  */
    /* JADX WARN: Code duplicated, block: B:151:0x109b  */
    /* JADX WARN: Code duplicated, block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:55:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:65:0x0c18  */
    /* JADX WARN: Code duplicated, block: B:68:0x0c39  */
    /* JADX WARN: Code duplicated, block: B:77:0x0c78  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0c9c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0d0b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0d47  */
    /* JADX WARN: Code duplicated, block: B:95:0x0d4f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v46, types: [int] */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v47 */
    /* JADX WARN: Type inference failed for: r18v49 */
    /* JADX WARN: Type inference failed for: r18v50 */
    /* JADX WARN: Type inference failed for: r18v51 */
    /* JADX WARN: Type inference failed for: r18v78 */
    /* JADX WARN: Type inference failed for: r18v79 */
    /* JADX WARN: Type inference failed for: r3v174 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:310:0x18f3 -> B:311:0x18f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:313:0x1922 -> B:312:0x191f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.lang.String r66, java.util.List r67, kotlin.jvm.functions.Function2 r68, kotlin.coroutines.jvm.internal.ContinuationImpl r69) {
        /*
            Method dump skipped, instruction units count: 6644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.factory.mapper.HistoryPassUiStateMapperHelper.c(java.lang.String, java.util.List, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:104:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:105:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:108:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:109:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x079b  */
    /* JADX WARN: Code duplicated, block: B:45:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0889  */
    /* JADX WARN: Code duplicated, block: B:63:0x0896  */
    /* JADX WARN: Code duplicated, block: B:64:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x08db  */
    /* JADX WARN: Code duplicated, block: B:79:0x08de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0907  */
    /* JADX WARN: Code duplicated, block: B:86:0x093b  */
    /* JADX WARN: Code duplicated, block: B:89:0x094a  */
    /* JADX WARN: Code duplicated, block: B:91:0x095b  */
    /* JADX WARN: Code duplicated, block: B:94:0x097f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x11f1 -> B:245:0x11fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:246:0x1225 -> B:247:0x122e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.lang.String r53, java.util.List r54, kotlin.jvm.functions.Function2 r55, kotlin.coroutines.jvm.internal.ContinuationImpl r56) {
        /*
            Method dump skipped, instruction units count: 4820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.factory.mapper.HistoryPassUiStateMapperHelper.d(java.lang.String, java.util.List, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final String g(long j, String str) {
        return vo1.n(str, " ", this.c.g(j));
    }
}
