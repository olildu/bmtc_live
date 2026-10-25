package app.chalo.premiumbus.ui.faredetails;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.data.model.ui.FareBreakupUiModel;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusDiscountTagUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsComponentDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsFooterUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTermsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsTripSummaryUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitRowUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareSplitSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusIconWithTextUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusIncludedInPassBannerUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOfferHeaderStripUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusOffersSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerCounterUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerDetailsSectionUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerRowUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusRouteDetailsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSectionNoteUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSelectedSeatsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusTotalAmountUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusTotalBookingsUiState;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonBorderUISpec;
import app.chalo.uistate.button.ButtonUIColor;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.ExpandingTextUIStateFactory;
import app.chalo.uistate.text.StyledTextClickHandler$Companion$create$1;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.fq0;
import defpackage.fr0;
import defpackage.gt0;
import defpackage.vo1;
import defpackage.yp0;
import defpackage.yt0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsUiStateFactory;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsUiStateFactory {
    public static final float c = Dp.m7278constructorimpl(14);
    public static final float d = Dp.m7278constructorimpl(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f7555a;
    public final TimeUtilsContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsUiStateFactory$Companion;", "", "", "SINGLE_BOOKING_COUNT", "Ljava/lang/String;", "", "SINGLE_BOOKING_LIMIT", "I", "MIN_PASSENGER_COUNT", "FARE_NOTE_MINIMIZED_MAX_LINES", "TNC_CLICK_TAG", "FARE_VALIDATION_MESSAGE_FONT_SIZE", "Landroidx/compose/ui/unit/Dp;", "ROUTE_ICON_SIZE", "F", "ROW_DIVIDER_THICKNESS", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7556a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RouteNamingSchemeType.values().length];
            try {
                iArr[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7556a = iArr;
            int[] iArr2 = new int[PassengerSelectionPolicy.values().length];
            try {
                iArr2[PassengerSelectionPolicy.Single.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PassengerSelectionPolicy.Multiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public PremiumBusFareDetailsUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f7555a = stringProvider;
        this.b = timeUtilsContract;
    }

    public static ImageUIState a(IconType iconType, boolean z, Function0 function0) {
        return new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, z ? UiEventHandler.Companion.a(function0) : null, WebSocketProtocol.PAYLOAD_SHORT);
    }

    public static TextUIState.ChaloTextUIState q(String str) {
        return new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
    }

    public static TextUIState.ChaloTextUIState r(String str) {
        return new TextUIState.ChaloTextUIState(str, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
    }

    public static TextUIState.ChaloTextUIState s(String str) {
        return new TextUIState.ChaloTextUIState(str, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    public static TextUIState.ChaloTextUIState x(String str) {
        return new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    public static TextUIState.ChaloTextUIState z(String str) {
        return new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineMedium, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e4 A[LOOP:0: B:29:0x00d6->B:33:0x00e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x0217  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016f, code lost:
    
        if (r3 == r5) goto L57;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00e4, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetType r37, kotlin.jvm.functions.Function1 r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory.A(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetType, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (r14 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r14 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        if (r14 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if (r14 == r0) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsComponentDataState r11, app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext r12, kotlin.jvm.functions.Function1 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory.b(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsComponentDataState, app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, List list, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$createFareSplitSection$1 premiumBusFareDetailsUiStateFactory$createFareSplitSection$1;
        String str2;
        List list2;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str3;
        List list3;
        List list4;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$createFareSplitSection$1) {
            premiumBusFareDetailsUiStateFactory$createFareSplitSection$1 = (PremiumBusFareDetailsUiStateFactory$createFareSplitSection$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$createFareSplitSection$1 = new PremiumBusFareDetailsUiStateFactory$createFareSplitSection$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$createFareSplitSection$1 = new PremiumBusFareDetailsUiStateFactory$createFareSplitSection$1(this, continuationImpl);
        }
        Object obj = premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.label;
        StringProvider stringProvider = this.f7555a;
        if (i2 != 0) {
            if (i2 == 1) {
                premiumBusFareDetailsUiStateFactory = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$2;
                list2 = (List) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$1;
                String str4 = (String) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$0;
                ResultKt.b(obj);
                str2 = str4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                premiumBusFareDetailsUiStateFactory2 = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$4;
                list3 = (List) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$3;
                chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$2;
                list4 = (List) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$1;
                str3 = (String) premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$0;
                ResultKt.b(obj);
            }
            premiumBusFareDetailsUiStateFactory2.getClass();
            TextUIState.ChaloTextUIState chaloTextUIStateS = s((String) obj);
            if (StringsKt.F(str3)) {
                str3 = ((PremiumBusFareSplitRowUiState) CollectionsKt.P(list4)).b.b;
            }
            return new PremiumBusFareSplitSectionUiState(chaloTextUIState, list3, new PremiumBusFareSplitRowUiState(chaloTextUIStateS, r(str3)));
        }
        ResultKt.b(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((PassengerFareDetailsUiModel) obj2).h != 0) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            PassengerFareDetailsUiModel passengerFareDetailsUiModel = (PassengerFareDetailsUiModel) obj3;
            PremiumBusFareSplitRowUiState premiumBusFareSplitRowUiState = new PremiumBusFareSplitRowUiState(s(passengerFareDetailsUiModel.b + " " + passengerFareDetailsUiModel.h + " X " + passengerFareDetailsUiModel.e), r(passengerFareDetailsUiModel.m));
            ArrayList arrayList3 = passengerFareDetailsUiModel.g;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(arrayList3, 10));
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                FareBreakupUiModel fareBreakupUiModel = (FareBreakupUiModel) obj4;
                ArrayList arrayList5 = arrayList;
                arrayList4.add(new PremiumBusFareSplitRowUiState(s(fareBreakupUiModel.f3894a), r(fareBreakupUiModel.b + fareBreakupUiModel.c)));
                arrayList = arrayList5;
                arrayList3 = arrayList3;
            }
            CollectionsKt.i(CollectionsKt.c0(arrayList4, CollectionsKt.R(premiumBusFareSplitRowUiState)), arrayList2);
            arrayList = arrayList;
        }
        str2 = str;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$0 = str2;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$1 = arrayList2;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$2 = this;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.label = 1;
        Object objB = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], premiumBusFareDetailsUiStateFactory$createFareSplitSection$1);
        if (objB != coroutineSingletons) {
            list2 = arrayList2;
            obj = objB;
            premiumBusFareDetailsUiStateFactory = this;
        }
        return coroutineSingletons;
        premiumBusFareDetailsUiStateFactory.getClass();
        TextUIState.ChaloTextUIState chaloTextUIStateZ = z((String) obj);
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$0 = str2;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$1 = list2;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$2 = chaloTextUIStateZ;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$3 = list2;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.L$4 = this;
        premiumBusFareDetailsUiStateFactory$createFareSplitSection$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.TOTAL, new Object[0], premiumBusFareDetailsUiStateFactory$createFareSplitSection$1);
        if (objB2 != coroutineSingletons) {
            premiumBusFareDetailsUiStateFactory2 = this;
            chaloTextUIState = chaloTextUIStateZ;
            obj = objB2;
            str3 = str2;
            list3 = list2;
            list4 = list3;
            premiumBusFareDetailsUiStateFactory2.getClass();
            TextUIState.ChaloTextUIState chaloTextUIStateS2 = s((String) obj);
            if (StringsKt.F(str3)) {
                str3 = ((PremiumBusFareSplitRowUiState) CollectionsKt.P(list4)).b.b;
            }
            return new PremiumBusFareSplitSectionUiState(chaloTextUIState, list3, new PremiumBusFareSplitRowUiState(chaloTextUIStateS2, r(str3)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1 premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1) {
            premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1 = (PremiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1 = new PremiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1 = new PremiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (premiumBusPassUpsellAppModel == null) {
                return null;
            }
            premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1.L$0 = this;
            premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1.label = 1;
            objB = this.f7555a.b(StringEnum.PB_TICKET_INCLUDED_IN_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            premiumBusFareDetailsUiStateFactory = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumBusFareDetailsUiStateFactory = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$createIncludedInPassBanner$1.L$0;
            ResultKt.b(objB);
        }
        premiumBusFareDetailsUiStateFactory.getClass();
        return new PremiumBusIncludedInPassBannerUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.TitleLarge, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0196  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0177, code lost:
    
        if (r3 == r5) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel r31, java.util.List r32, kotlin.jvm.functions.Function1 r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory.e(app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel, java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1 premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1;
        String str3;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        String str4;
        List list;
        TextUIState.ChaloTextUIState chaloTextUIState;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory2;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1) {
            premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1 = (PremiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1 = new PremiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1 = new PremiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.label;
        StringProvider stringProvider = this.f7555a;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (StringsKt.F(str2)) {
                return null;
            }
            premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$0 = str;
            premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$1 = str2;
            premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$2 = this;
            premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.label = 1;
            objB = stringProvider.b(StringEnum.PRICE_DETAILS, new Object[0], premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1);
            if (objB != coroutineSingletons) {
                str3 = str;
                premiumBusFareDetailsUiStateFactory = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            premiumBusFareDetailsUiStateFactory = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$2;
            str2 = (String) premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$1;
            str3 = (String) premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumBusFareDetailsUiStateFactory2 = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$3;
            list = (List) premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$2;
            chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$1;
            str4 = (String) premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$0;
            ResultKt.b(objB);
        }
        premiumBusFareDetailsUiStateFactory2.getClass();
        return new PremiumBusFareSplitSectionUiState(chaloTextUIState, list, new PremiumBusFareSplitRowUiState(s((String) objB), r(str4)));
        premiumBusFareDetailsUiStateFactory.getClass();
        TextUIState.ChaloTextUIState chaloTextUIStateZ = z((String) objB);
        List listR = CollectionsKt.R(new PremiumBusFareSplitRowUiState(s(str3), r(str2)));
        premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$0 = str2;
        premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$1 = chaloTextUIStateZ;
        premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$2 = listR;
        premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.L$3 = this;
        premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.TOTAL, new Object[0], premiumBusFareDetailsUiStateFactory$createPassFareSplitSection$1);
        if (objB2 != coroutineSingletons) {
            str4 = str2;
            list = listR;
            objB = objB2;
            chaloTextUIState = chaloTextUIStateZ;
            premiumBusFareDetailsUiStateFactory2 = this;
            premiumBusFareDetailsUiStateFactory2.getClass();
            return new PremiumBusFareSplitSectionUiState(chaloTextUIState, list, new PremiumBusFareSplitRowUiState(s((String) objB), r(str4)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r1 == r3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createPassengerSelectionNote$1
            if (r2 == 0) goto L17
            r2 = r1
            app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createPassengerSelectionNote$1 r2 = (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createPassengerSelectionNote$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createPassengerSelectionNote$1 r2 = new app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createPassengerSelectionNote$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 0
            app.chalo.providers.stringprovider.StringProvider r6 = r0.f7555a
            r7 = 0
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L4b
            if (r4 == r9) goto L47
            if (r4 != r8) goto L3f
            java.lang.Object r3 = r2.L$1
            app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory r3 = (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory) r3
            java.lang.Object r2 = r2.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r1)
            r16 = r3
            r3 = r2
            r2 = r16
            goto L88
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L47:
            kotlin.ResultKt.b(r1)
            goto L6f
        L4b:
            kotlin.ResultKt.b(r1)
            int[] r1 = app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory.WhenMappings.b
            int r4 = r18.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L62
            if (r1 != r8) goto L5c
            r1 = r7
            goto L71
        L5c:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L62:
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.FARE_DETAILS_PASSENGER_SELECTION_POLICY_SINGLE
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r2.label = r9
            java.lang.Object r1 = r6.b(r1, r4, r2)
            if (r1 != r3) goto L6f
            goto L84
        L6f:
            java.lang.String r1 = (java.lang.String) r1
        L71:
            if (r1 != 0) goto L74
            return r7
        L74:
            app.chalo.providers.stringprovider.StringEnum r4 = app.chalo.providers.stringprovider.StringEnum.FARE_DETAILS_HEADING
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2.L$0 = r1
            r2.L$1 = r0
            r2.label = r8
            java.lang.Object r2 = r6.b(r4, r5, r2)
            if (r2 != r3) goto L85
        L84:
            return r3
        L85:
            r3 = r1
            r1 = r2
            r2 = r0
        L88:
            java.lang.String r1 = (java.lang.String) r1
            r2.getClass()
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r1 = z(r1)
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r2 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            app.chalo.uistate.text.UITextStyle r4 = app.chalo.uistate.text.UITextStyle.BodySmall
            r14 = 0
            r15 = 8184(0x1ff8, float:1.1468E-41)
            app.chalo.uistate.base.ChaloColorToken$ShadyGray r5 = app.chalo.uistate.base.ChaloColorToken.ShadyGray.f9851a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSectionNoteUiState r3 = new app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSectionNoteUiState
            r3.<init>(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory.g(app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r13 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError r11, kotlin.jvm.functions.Function1 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createSwitchErrorDialog$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createSwitchErrorDialog$1 r0 = (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createSwitchErrorDialog$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createSwitchErrorDialog$1 r0 = new app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$createSwitchErrorDialog$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            app.chalo.providers.stringprovider.StringProvider r4 = r10.f7555a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L42
            if (r2 != r5) goto L3a
            java.lang.Object r11 = r0.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.L$1
            app.chalo.uistate.dialog.DialogUIStateFactory r12 = (app.chalo.uistate.dialog.DialogUIStateFactory) r12
            java.lang.Object r0 = r0.L$0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.ResultKt.b(r13)
        L38:
            r5 = r11
            goto L89
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            java.lang.Object r11 = r0.L$0
            r12 = r11
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            kotlin.ResultKt.b(r13)
            goto L6e
        L4b:
            kotlin.ResultKt.b(r13)
            boolean r13 = r11 instanceof app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError.DelegateFailed
            if (r13 == 0) goto L57
            app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError$DelegateFailed r11 = (app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError.DelegateFailed) r11
            java.lang.String r11 = r11.f7608a
            goto L71
        L57:
            app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError$TimedOut r13 = app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError.TimedOut.f7609a
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r13)
            if (r11 == 0) goto L9e
            app.chalo.providers.stringprovider.StringEnum r11 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r0.L$0 = r12
            r0.label = r6
            java.lang.Object r13 = r4.b(r11, r13, r0)
            if (r13 != r1) goto L6e
            goto L85
        L6e:
            java.lang.String r13 = (java.lang.String) r13
            r11 = r13
        L71:
            app.chalo.providers.stringprovider.StringEnum r13 = app.chalo.providers.stringprovider.StringEnum.OK
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r0.L$0 = r12
            app.chalo.uistate.dialog.DialogUIStateFactory r3 = app.chalo.uistate.dialog.DialogUIStateFactory.f9989a
            r0.L$1 = r3
            r0.L$2 = r11
            r0.label = r5
            java.lang.Object r13 = r4.b(r13, r2, r0)
            if (r13 != r1) goto L86
        L85:
            return r1
        L86:
            r0 = r12
            r12 = r3
            goto L38
        L89:
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            fq0 r8 = new fq0
            r11 = 29
            r8.<init>(r0, r11)
            r12.getClass()
            r4 = 0
            r7 = 0
            r9 = 0
            app.chalo.uistate.dialog.ConfirmationDialogUiState r11 = app.chalo.uistate.dialog.DialogUIStateFactory.b(r4, r5, r6, r7, r8, r9)
            return r11
        L9e:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory.h(app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x016a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    public final Object i(PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, List list, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$createTncSection$1 premiumBusFareDetailsUiStateFactory$createTncSection$1;
        List list2;
        List list3;
        Function1 function2;
        boolean z2;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        ?? arrayList;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        TextUIState.ChaloTextUIState chaloTextUIState;
        int i;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        ?? r4;
        Function1 function3;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ?? r5;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$createTncSection$1) {
            premiumBusFareDetailsUiStateFactory$createTncSection$1 = (PremiumBusFareDetailsUiStateFactory$createTncSection$1) continuationImpl;
            int i2 = premiumBusFareDetailsUiStateFactory$createTncSection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$createTncSection$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$createTncSection$1 = new PremiumBusFareDetailsUiStateFactory$createTncSection$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$createTncSection$1 = new PremiumBusFareDetailsUiStateFactory$createTncSection$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$createTncSection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusFareDetailsUiStateFactory$createTncSection$1.label;
        StringProvider stringProvider = this.f7555a;
        int i4 = 1;
        if (i3 == 0) {
            ResultKt.b(objB);
            if (list == null) {
                list2 = premiumBusFareDetailsSharedContext.c.f;
            } else {
                list2 = !list.isEmpty() ? list : null;
                if (list2 == null) {
                    list2 = premiumBusFareDetailsSharedContext.c.f;
                }
            }
            list3 = list2;
            List list4 = list3;
            if (list4 == null || list4.isEmpty()) {
                return null;
            }
            function2 = function1;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$0 = function2;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$1 = list3;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$2 = this;
            z2 = z;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.Z$0 = z2;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.label = 1;
            objB = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], premiumBusFareDetailsUiStateFactory$createTncSection$1);
            if (objB != coroutineSingletons) {
                premiumBusFareDetailsUiStateFactory = this;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            boolean z3 = premiumBusFareDetailsUiStateFactory$createTncSection$1.Z$0;
            PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory2 = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$2;
            list3 = (List) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$1;
            Function1 function4 = (Function1) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$0;
            ResultKt.b(objB);
            z2 = z3;
            premiumBusFareDetailsUiStateFactory = premiumBusFareDetailsUiStateFactory2;
            function2 = function4;
        } else {
            if (i3 == 2) {
                int i5 = premiumBusFareDetailsUiStateFactory$createTncSection$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr5 = (StyledTextDataUIState[]) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$4;
                List list5 = (List) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$2;
                StyledTextDataUIState[] styledTextDataUIStateArr6 = (StyledTextDataUIState[]) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$1;
                Function1 function5 = (Function1) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$0;
                ResultKt.b(objB);
                i = i5;
                r4 = list5;
                function2 = function5;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr5;
                chaloTextUIState = chaloTextUIState3;
                styledTextDataUIStateArr = styledTextDataUIStateArr6;
                styledTextDataUIStateArr2[i] = new StyledTextDataUIState(objB + " ", ChaloColorToken.Black_60.f9766a, null, UITextStyle.BodySmall, null, null, null, 1012);
                premiumBusFareDetailsUiStateFactory$createTncSection$1.L$0 = function2;
                premiumBusFareDetailsUiStateFactory$createTncSection$1.L$1 = styledTextDataUIStateArr;
                premiumBusFareDetailsUiStateFactory$createTncSection$1.L$2 = chaloTextUIState;
                premiumBusFareDetailsUiStateFactory$createTncSection$1.L$3 = r4;
                premiumBusFareDetailsUiStateFactory$createTncSection$1.L$4 = styledTextDataUIStateArr;
                premiumBusFareDetailsUiStateFactory$createTncSection$1.I$0 = 1;
                premiumBusFareDetailsUiStateFactory$createTncSection$1.label = 3;
                objB = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], premiumBusFareDetailsUiStateFactory$createTncSection$1);
                if (objB != coroutineSingletons) {
                    function3 = function2;
                    styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                    styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                    chaloTextUIState2 = chaloTextUIState;
                    r5 = r4;
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = premiumBusFareDetailsUiStateFactory$createTncSection$1.I$0;
            styledTextDataUIStateArr3 = (StyledTextDataUIState[]) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$4;
            List list6 = (List) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$3;
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$2;
            styledTextDataUIStateArr4 = (StyledTextDataUIState[]) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$1;
            function3 = (Function1) premiumBusFareDetailsUiStateFactory$createTncSection$1.L$0;
            ResultKt.b(objB);
            r5 = list6;
        }
        styledTextDataUIStateArr3[i4] = new StyledTextDataUIState((String) objB, ChaloColorToken.OrangePrimary.f9835a, null, UITextStyle.BodySmall, UITextDecoration.Underline, null, new StyledTextClickHandler$Companion$create$1("premiumBusFareDetailsTnc", "", new yt0(function3, 3)), 372);
        return new PremiumBusFareDetailsTermsUiState(chaloTextUIState2, r5, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr4), null, null, 30));
        premiumBusFareDetailsUiStateFactory.getClass();
        TextUIState.ChaloTextUIState chaloTextUIStateZ = z((String) objB);
        if (z2) {
            List list7 = list3;
            arrayList = new ArrayList(CollectionsKt.v(list7, 10));
            Iterator it = list7.iterator();
            while (it.hasNext()) {
                arrayList.add(q((String) it.next()));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        styledTextDataUIStateArr = new StyledTextDataUIState[2];
        premiumBusFareDetailsUiStateFactory$createTncSection$1.L$0 = function2;
        premiumBusFareDetailsUiStateFactory$createTncSection$1.L$1 = styledTextDataUIStateArr;
        premiumBusFareDetailsUiStateFactory$createTncSection$1.L$2 = chaloTextUIStateZ;
        premiumBusFareDetailsUiStateFactory$createTncSection$1.L$3 = arrayList;
        premiumBusFareDetailsUiStateFactory$createTncSection$1.L$4 = styledTextDataUIStateArr;
        premiumBusFareDetailsUiStateFactory$createTncSection$1.I$0 = 0;
        premiumBusFareDetailsUiStateFactory$createTncSection$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.TNC_PREFIX, new Object[0], premiumBusFareDetailsUiStateFactory$createTncSection$1);
        if (objB2 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateZ;
            objB = objB2;
            i = 0;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            r4 = arrayList;
            styledTextDataUIStateArr2[i] = new StyledTextDataUIState(objB + " ", ChaloColorToken.Black_60.f9766a, null, UITextStyle.BodySmall, null, null, null, 1012);
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$0 = function2;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$1 = styledTextDataUIStateArr;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$2 = chaloTextUIState;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$3 = r4;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.L$4 = styledTextDataUIStateArr;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.I$0 = 1;
            premiumBusFareDetailsUiStateFactory$createTncSection$1.label = 3;
            objB = stringProvider.b(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], premiumBusFareDetailsUiStateFactory$createTncSection$1);
            if (objB != coroutineSingletons) {
                function3 = function2;
                styledTextDataUIStateArr3 = styledTextDataUIStateArr;
                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                chaloTextUIState2 = chaloTextUIState;
                r5 = r4;
                styledTextDataUIStateArr3[i4] = new StyledTextDataUIState((String) objB, ChaloColorToken.OrangePrimary.f9835a, null, UITextStyle.BodySmall, UITextDecoration.Underline, null, new StyledTextClickHandler$Companion$create$1("premiumBusFareDetailsTnc", "", new yt0(function3, 3)), 372);
                return new PremiumBusFareDetailsTermsUiState(chaloTextUIState2, r5, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr4), null, null, 30));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x016b  */
    /* JADX WARN: Code duplicated, block: B:59:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x0261  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object j(PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$createTripSummary$1 premiumBusFareDetailsUiStateFactory$createTripSummary$1;
        FareDetailsData fareDetailsData;
        List list;
        Function1 function2;
        FareDetailsData fareDetailsData2;
        List list2;
        String str;
        String strN;
        int i;
        String str2;
        Object objB;
        FareDetailsData fareDetailsData3;
        Function1 function3;
        String str3;
        String str4;
        PremiumBusRouteDetailsUiState premiumBusRouteDetailsUiState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloColorToken.Black black;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIStateX;
        TextUIState.ChaloTextUIState chaloTextUIStateX2;
        Long l;
        PremiumBusIconWithTextUiState premiumBusIconWithTextUiState;
        PremiumBusRouteDetailsUiState premiumBusRouteDetailsUiState2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        PremiumBusIconWithTextUiState premiumBusIconWithTextUiState2;
        PremiumBusSelectedSeatsUiState premiumBusSelectedSeatsUiState;
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        Object objB2;
        PremiumBusRouteDetailsUiState premiumBusRouteDetailsUiState3;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        Function1 function4;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        PremiumBusIconWithTextUiState premiumBusIconWithTextUiState3;
        ImageUIState imageUIState2;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        String strJ;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$createTripSummary$1) {
            premiumBusFareDetailsUiStateFactory$createTripSummary$1 = (PremiumBusFareDetailsUiStateFactory$createTripSummary$1) continuationImpl;
            int i2 = premiumBusFareDetailsUiStateFactory$createTripSummary$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$createTripSummary$1 = new PremiumBusFareDetailsUiStateFactory$createTripSummary$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$createTripSummary$1 = new PremiumBusFareDetailsUiStateFactory$createTripSummary$1(this, continuationImpl);
        }
        Object obj = premiumBusFareDetailsUiStateFactory$createTripSummary$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusFareDetailsUiStateFactory$createTripSummary$1.label;
        StringProvider stringProvider = this.f7555a;
        if (i3 != 0) {
            if (i3 == 1) {
                list = (List) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2;
                fareDetailsData = (FareDetailsData) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1;
                function2 = (Function1) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0;
                ResultKt.b(obj);
            } else {
                if (i3 == 2) {
                    str = (String) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3;
                    list2 = (List) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2;
                    fareDetailsData3 = (FareDetailsData) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1;
                    function3 = (Function1) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0;
                    ResultKt.b(obj);
                    str3 = (String) obj;
                    fareDetailsData2 = fareDetailsData3;
                    str4 = str;
                    ImageUIState imageUIState3 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(c), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    UITextStyle uITextStyle = UITextStyle.TitleLarge;
                    black = ChaloColorToken.Black.f9759a;
                    chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    if (str4 != null) {
                        chaloTextUIState2 = chaloTextUIState;
                        chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    } else {
                        chaloTextUIState2 = chaloTextUIState;
                        chaloTextUIState3 = null;
                    }
                    premiumBusRouteDetailsUiState = new PremiumBusRouteDetailsUiState(imageUIState3, chaloTextUIState2, chaloTextUIState3);
                    chaloTextUIStateX = x(fareDetailsData2.b.b);
                    chaloTextUIStateX2 = x(fareDetailsData2.c.b);
                    l = fareDetailsData2.e;
                    if (l != null || (strJ = this.b.j(l.longValue())) == null) {
                        premiumBusIconWithTextUiState = null;
                    } else {
                        premiumBusIconWithTextUiState = new PremiumBusIconWithTextUiState(new ImageUIState(IconType.IC_SCHEDULE, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), x(strJ));
                    }
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        imageUIState = new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        chaloTextUIState6 = new TextUIState.ChaloTextUIState(CollectionsKt.O(list2, ", ", null, null, new gt0(18), 30), UITextStyle.BodyMedium, black, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function3;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = this;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = chaloTextUIState6;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = imageUIState;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4 = premiumBusRouteDetailsUiState;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5 = chaloTextUIStateX;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6 = chaloTextUIStateX2;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7 = premiumBusIconWithTextUiState;
                        premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 3;
                        objB2 = stringProvider.b(StringEnum.CHANGE_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                        if (objB2 != coroutineSingletons) {
                            premiumBusRouteDetailsUiState3 = premiumBusRouteDetailsUiState;
                            chaloTextUIState7 = chaloTextUIState6;
                            obj = objB2;
                            chaloTextUIState8 = chaloTextUIStateX;
                            function4 = function3;
                            chaloTextUIState9 = chaloTextUIStateX2;
                            premiumBusIconWithTextUiState3 = premiumBusIconWithTextUiState;
                            imageUIState2 = imageUIState;
                            premiumBusFareDetailsUiStateFactory = this;
                        }
                        return coroutineSingletons;
                    }
                    premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState;
                    chaloTextUIState4 = chaloTextUIStateX;
                    chaloTextUIState5 = chaloTextUIStateX2;
                    premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState;
                    premiumBusSelectedSeatsUiState = null;
                    return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                premiumBusIconWithTextUiState3 = (PremiumBusIconWithTextUiState) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7;
                chaloTextUIState9 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5;
                premiumBusRouteDetailsUiState3 = (PremiumBusRouteDetailsUiState) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4;
                imageUIState2 = (ImageUIState) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2;
                premiumBusFareDetailsUiStateFactory = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1;
                function4 = (Function1) premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0;
                ResultKt.b(obj);
            }
            String str5 = (String) obj;
            yt0 yt0Var = new yt0(function4, 8);
            premiumBusFareDetailsUiStateFactory.getClass();
            premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState3;
            chaloTextUIState5 = chaloTextUIState9;
            chaloTextUIState4 = chaloTextUIState8;
            premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState3;
            premiumBusSelectedSeatsUiState = new PremiumBusSelectedSeatsUiState(imageUIState2, chaloTextUIState7, new TextUIState.ChaloTextUIState(str5, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864));
            return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
        }
        ResultKt.b(obj);
        fareDetailsData = premiumBusFareDetailsSharedContext.c;
        list = premiumBusFareDetailsSharedContext.b;
        int i4 = WhenMappings.f7556a[fareDetailsData.h.ordinal()];
        if (i4 == 1) {
            String str6 = fareDetailsData.g;
            if (str6 != null) {
                if (str6.length() <= 0) {
                    str6 = null;
                }
                if (str6 != null) {
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function1;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = fareDetailsData;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = list;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 1;
                    Object objB3 = stringProvider.b(StringEnum.VIA_, new Object[]{str6}, premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                    if (objB3 != coroutineSingletons) {
                        function2 = function1;
                        obj = objB3;
                    }
                }
            }
            function2 = function1;
            strN = vo1.n(fareDetailsData.b.b, " - ", fareDetailsData.c.b);
            FareDetailsData fareDetailsData4 = fareDetailsData;
            list2 = list;
            str = strN;
            fareDetailsData2 = fareDetailsData4;
            i = WhenMappings.f7556a[fareDetailsData2.h.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = fareDetailsData2.f8185a.f8187a;
                function3 = function2;
                str4 = str;
                ImageUIState imageUIState4 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(c), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                UITextStyle uITextStyle2 = UITextStyle.TitleLarge;
                black = ChaloColorToken.Black.f9759a;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle2, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str4 != null) {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                } else {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = null;
                }
                premiumBusRouteDetailsUiState = new PremiumBusRouteDetailsUiState(imageUIState4, chaloTextUIState2, chaloTextUIState3);
                chaloTextUIStateX = x(fareDetailsData2.b.b);
                chaloTextUIStateX2 = x(fareDetailsData2.c.b);
                l = fareDetailsData2.e;
                if (l != null) {
                    premiumBusIconWithTextUiState = null;
                } else {
                    premiumBusIconWithTextUiState = null;
                }
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    imageUIState = new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    chaloTextUIState6 = new TextUIState.ChaloTextUIState(CollectionsKt.O(list2, ", ", null, null, new gt0(18), 30), UITextStyle.BodyMedium, black, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function3;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = this;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = chaloTextUIState6;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = imageUIState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4 = premiumBusRouteDetailsUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5 = chaloTextUIStateX;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6 = chaloTextUIStateX2;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7 = premiumBusIconWithTextUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.CHANGE_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                    if (objB2 != coroutineSingletons) {
                        premiumBusRouteDetailsUiState3 = premiumBusRouteDetailsUiState;
                        chaloTextUIState7 = chaloTextUIState6;
                        obj = objB2;
                        chaloTextUIState8 = chaloTextUIStateX;
                        function4 = function3;
                        chaloTextUIState9 = chaloTextUIStateX2;
                        premiumBusIconWithTextUiState3 = premiumBusIconWithTextUiState;
                        imageUIState2 = imageUIState;
                        premiumBusFareDetailsUiStateFactory = this;
                        String str7 = (String) obj;
                        yt0 yt0Var2 = new yt0(function4, 8);
                        premiumBusFareDetailsUiStateFactory.getClass();
                        premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState3;
                        chaloTextUIState5 = chaloTextUIState9;
                        chaloTextUIState4 = chaloTextUIState8;
                        premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState3;
                        premiumBusSelectedSeatsUiState = new PremiumBusSelectedSeatsUiState(imageUIState2, chaloTextUIState7, new TextUIState.ChaloTextUIState(str7, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var2), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864));
                    }
                } else {
                    premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState;
                    chaloTextUIState4 = chaloTextUIStateX;
                    chaloTextUIState5 = chaloTextUIStateX2;
                    premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState;
                    premiumBusSelectedSeatsUiState = null;
                }
                return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
            }
            StringEnum stringEnum = StringEnum.TO_;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function2;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = fareDetailsData2;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = list2;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = str;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 2;
            objB = stringProvider.b(stringEnum, new Object[]{str2}, premiumBusFareDetailsUiStateFactory$createTripSummary$1);
            if (objB != coroutineSingletons) {
                fareDetailsData3 = fareDetailsData2;
                obj = objB;
                function3 = function2;
                str3 = (String) obj;
                fareDetailsData2 = fareDetailsData3;
                str4 = str;
                ImageUIState imageUIState5 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(c), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                UITextStyle uITextStyle3 = UITextStyle.TitleLarge;
                black = ChaloColorToken.Black.f9759a;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle3, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str4 != null) {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                } else {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = null;
                }
                premiumBusRouteDetailsUiState = new PremiumBusRouteDetailsUiState(imageUIState5, chaloTextUIState2, chaloTextUIState3);
                chaloTextUIStateX = x(fareDetailsData2.b.b);
                chaloTextUIStateX2 = x(fareDetailsData2.c.b);
                l = fareDetailsData2.e;
                if (l != null) {
                    premiumBusIconWithTextUiState = null;
                } else {
                    premiumBusIconWithTextUiState = null;
                }
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    imageUIState = new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    chaloTextUIState6 = new TextUIState.ChaloTextUIState(CollectionsKt.O(list2, ", ", null, null, new gt0(18), 30), UITextStyle.BodyMedium, black, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function3;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = this;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = chaloTextUIState6;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = imageUIState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4 = premiumBusRouteDetailsUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5 = chaloTextUIStateX;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6 = chaloTextUIStateX2;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7 = premiumBusIconWithTextUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.CHANGE_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                    if (objB2 != coroutineSingletons) {
                        premiumBusRouteDetailsUiState3 = premiumBusRouteDetailsUiState;
                        chaloTextUIState7 = chaloTextUIState6;
                        obj = objB2;
                        chaloTextUIState8 = chaloTextUIStateX;
                        function4 = function3;
                        chaloTextUIState9 = chaloTextUIStateX2;
                        premiumBusIconWithTextUiState3 = premiumBusIconWithTextUiState;
                        imageUIState2 = imageUIState;
                        premiumBusFareDetailsUiStateFactory = this;
                        String str8 = (String) obj;
                        yt0 yt0Var3 = new yt0(function4, 8);
                        premiumBusFareDetailsUiStateFactory.getClass();
                        premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState3;
                        chaloTextUIState5 = chaloTextUIState9;
                        chaloTextUIState4 = chaloTextUIState8;
                        premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState3;
                        premiumBusSelectedSeatsUiState = new PremiumBusSelectedSeatsUiState(imageUIState2, chaloTextUIState7, new TextUIState.ChaloTextUIState(str8, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var3), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864));
                    }
                } else {
                    premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState;
                    chaloTextUIState4 = chaloTextUIStateX;
                    chaloTextUIState5 = chaloTextUIStateX2;
                    premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState;
                    premiumBusSelectedSeatsUiState = null;
                }
                return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
            }
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function2 = function1;
            fareDetailsData2 = fareDetailsData;
            list2 = list;
            str = null;
            i = WhenMappings.f7556a[fareDetailsData2.h.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = fareDetailsData2.f8185a.f8187a;
                function3 = function2;
                str4 = str;
                ImageUIState imageUIState6 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(c), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                UITextStyle uITextStyle4 = UITextStyle.TitleLarge;
                black = ChaloColorToken.Black.f9759a;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle4, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str4 != null) {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                } else {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = null;
                }
                premiumBusRouteDetailsUiState = new PremiumBusRouteDetailsUiState(imageUIState6, chaloTextUIState2, chaloTextUIState3);
                chaloTextUIStateX = x(fareDetailsData2.b.b);
                chaloTextUIStateX2 = x(fareDetailsData2.c.b);
                l = fareDetailsData2.e;
                if (l != null) {
                    premiumBusIconWithTextUiState = null;
                } else {
                    premiumBusIconWithTextUiState = null;
                }
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    imageUIState = new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    chaloTextUIState6 = new TextUIState.ChaloTextUIState(CollectionsKt.O(list2, ", ", null, null, new gt0(18), 30), UITextStyle.BodyMedium, black, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function3;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = this;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = chaloTextUIState6;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = imageUIState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4 = premiumBusRouteDetailsUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5 = chaloTextUIStateX;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6 = chaloTextUIStateX2;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7 = premiumBusIconWithTextUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.CHANGE_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                    if (objB2 != coroutineSingletons) {
                        premiumBusRouteDetailsUiState3 = premiumBusRouteDetailsUiState;
                        chaloTextUIState7 = chaloTextUIState6;
                        obj = objB2;
                        chaloTextUIState8 = chaloTextUIStateX;
                        function4 = function3;
                        chaloTextUIState9 = chaloTextUIStateX2;
                        premiumBusIconWithTextUiState3 = premiumBusIconWithTextUiState;
                        imageUIState2 = imageUIState;
                        premiumBusFareDetailsUiStateFactory = this;
                        String str9 = (String) obj;
                        yt0 yt0Var4 = new yt0(function4, 8);
                        premiumBusFareDetailsUiStateFactory.getClass();
                        premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState3;
                        chaloTextUIState5 = chaloTextUIState9;
                        chaloTextUIState4 = chaloTextUIState8;
                        premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState3;
                        premiumBusSelectedSeatsUiState = new PremiumBusSelectedSeatsUiState(imageUIState2, chaloTextUIState7, new TextUIState.ChaloTextUIState(str9, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var4), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864));
                    }
                } else {
                    premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState;
                    chaloTextUIState4 = chaloTextUIStateX;
                    chaloTextUIState5 = chaloTextUIStateX2;
                    premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState;
                    premiumBusSelectedSeatsUiState = null;
                }
                return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
            }
            StringEnum stringEnum2 = StringEnum.TO_;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function2;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = fareDetailsData2;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = list2;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = str;
            premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 2;
            objB = stringProvider.b(stringEnum2, new Object[]{str2}, premiumBusFareDetailsUiStateFactory$createTripSummary$1);
            if (objB != coroutineSingletons) {
                fareDetailsData3 = fareDetailsData2;
                obj = objB;
                function3 = function2;
                str3 = (String) obj;
                fareDetailsData2 = fareDetailsData3;
                str4 = str;
                ImageUIState imageUIState7 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(c), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                UITextStyle uITextStyle5 = UITextStyle.TitleLarge;
                black = ChaloColorToken.Black.f9759a;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle5, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                if (str4 != null) {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                } else {
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextUIState3 = null;
                }
                premiumBusRouteDetailsUiState = new PremiumBusRouteDetailsUiState(imageUIState7, chaloTextUIState2, chaloTextUIState3);
                chaloTextUIStateX = x(fareDetailsData2.b.b);
                chaloTextUIStateX2 = x(fareDetailsData2.c.b);
                l = fareDetailsData2.e;
                if (l != null) {
                    premiumBusIconWithTextUiState = null;
                } else {
                    premiumBusIconWithTextUiState = null;
                }
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    imageUIState = new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    chaloTextUIState6 = new TextUIState.ChaloTextUIState(CollectionsKt.O(list2, ", ", null, null, new gt0(18), 30), UITextStyle.BodyMedium, black, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function3;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = this;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = chaloTextUIState6;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = imageUIState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4 = premiumBusRouteDetailsUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5 = chaloTextUIStateX;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6 = chaloTextUIStateX2;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7 = premiumBusIconWithTextUiState;
                    premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.CHANGE_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                    if (objB2 != coroutineSingletons) {
                        premiumBusRouteDetailsUiState3 = premiumBusRouteDetailsUiState;
                        chaloTextUIState7 = chaloTextUIState6;
                        obj = objB2;
                        chaloTextUIState8 = chaloTextUIStateX;
                        function4 = function3;
                        chaloTextUIState9 = chaloTextUIStateX2;
                        premiumBusIconWithTextUiState3 = premiumBusIconWithTextUiState;
                        imageUIState2 = imageUIState;
                        premiumBusFareDetailsUiStateFactory = this;
                        String str10 = (String) obj;
                        yt0 yt0Var5 = new yt0(function4, 8);
                        premiumBusFareDetailsUiStateFactory.getClass();
                        premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState3;
                        chaloTextUIState5 = chaloTextUIState9;
                        chaloTextUIState4 = chaloTextUIState8;
                        premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState3;
                        premiumBusSelectedSeatsUiState = new PremiumBusSelectedSeatsUiState(imageUIState2, chaloTextUIState7, new TextUIState.ChaloTextUIState(str10, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var5), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864));
                    }
                } else {
                    premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState;
                    chaloTextUIState4 = chaloTextUIStateX;
                    chaloTextUIState5 = chaloTextUIStateX2;
                    premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState;
                    premiumBusSelectedSeatsUiState = null;
                }
                return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
            }
        }
        return coroutineSingletons;
        strN = (String) obj;
        if (strN == null) {
            strN = vo1.n(fareDetailsData.b.b, " - ", fareDetailsData.c.b);
        }
        FareDetailsData fareDetailsData5 = fareDetailsData;
        list2 = list;
        str = strN;
        fareDetailsData2 = fareDetailsData5;
        i = WhenMappings.f7556a[fareDetailsData2.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = fareDetailsData2.f8185a.f8187a;
            function3 = function2;
            str4 = str;
            ImageUIState imageUIState8 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(c), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            UITextStyle uITextStyle6 = UITextStyle.TitleLarge;
            black = ChaloColorToken.Black.f9759a;
            chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle6, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            if (str4 != null) {
                chaloTextUIState2 = chaloTextUIState;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            } else {
                chaloTextUIState2 = chaloTextUIState;
                chaloTextUIState3 = null;
            }
            premiumBusRouteDetailsUiState = new PremiumBusRouteDetailsUiState(imageUIState8, chaloTextUIState2, chaloTextUIState3);
            chaloTextUIStateX = x(fareDetailsData2.b.b);
            chaloTextUIStateX2 = x(fareDetailsData2.c.b);
            l = fareDetailsData2.e;
            if (l != null) {
                premiumBusIconWithTextUiState = null;
            } else {
                premiumBusIconWithTextUiState = null;
            }
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                imageUIState = new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                chaloTextUIState6 = new TextUIState.ChaloTextUIState(CollectionsKt.O(list2, ", ", null, null, new gt0(18), 30), UITextStyle.BodyMedium, black, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function3;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = this;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = chaloTextUIState6;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = imageUIState;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4 = premiumBusRouteDetailsUiState;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5 = chaloTextUIStateX;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6 = chaloTextUIStateX2;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7 = premiumBusIconWithTextUiState;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 3;
                objB2 = stringProvider.b(StringEnum.CHANGE_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                if (objB2 != coroutineSingletons) {
                    premiumBusRouteDetailsUiState3 = premiumBusRouteDetailsUiState;
                    chaloTextUIState7 = chaloTextUIState6;
                    obj = objB2;
                    chaloTextUIState8 = chaloTextUIStateX;
                    function4 = function3;
                    chaloTextUIState9 = chaloTextUIStateX2;
                    premiumBusIconWithTextUiState3 = premiumBusIconWithTextUiState;
                    imageUIState2 = imageUIState;
                    premiumBusFareDetailsUiStateFactory = this;
                    String str11 = (String) obj;
                    yt0 yt0Var6 = new yt0(function4, 8);
                    premiumBusFareDetailsUiStateFactory.getClass();
                    premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState3;
                    chaloTextUIState5 = chaloTextUIState9;
                    chaloTextUIState4 = chaloTextUIState8;
                    premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState3;
                    premiumBusSelectedSeatsUiState = new PremiumBusSelectedSeatsUiState(imageUIState2, chaloTextUIState7, new TextUIState.ChaloTextUIState(str11, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var6), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864));
                }
            } else {
                premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState;
                chaloTextUIState4 = chaloTextUIStateX;
                chaloTextUIState5 = chaloTextUIStateX2;
                premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState;
                premiumBusSelectedSeatsUiState = null;
            }
            return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
        }
        StringEnum stringEnum3 = StringEnum.TO_;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function2;
        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = fareDetailsData2;
        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = list2;
        premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = str;
        premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 2;
        objB = stringProvider.b(stringEnum3, new Object[]{str2}, premiumBusFareDetailsUiStateFactory$createTripSummary$1);
        if (objB != coroutineSingletons) {
            fareDetailsData3 = fareDetailsData2;
            obj = objB;
            function3 = function2;
            str3 = (String) obj;
            fareDetailsData2 = fareDetailsData3;
            str4 = str;
            ImageUIState imageUIState9 = new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(c), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            UITextStyle uITextStyle7 = UITextStyle.TitleLarge;
            black = ChaloColorToken.Black.f9759a;
            chaloTextUIState = new TextUIState.ChaloTextUIState(str3, uITextStyle7, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            if (str4 != null) {
                chaloTextUIState2 = chaloTextUIState;
                chaloTextUIState3 = new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            } else {
                chaloTextUIState2 = chaloTextUIState;
                chaloTextUIState3 = null;
            }
            premiumBusRouteDetailsUiState = new PremiumBusRouteDetailsUiState(imageUIState9, chaloTextUIState2, chaloTextUIState3);
            chaloTextUIStateX = x(fareDetailsData2.b.b);
            chaloTextUIStateX2 = x(fareDetailsData2.c.b);
            l = fareDetailsData2.e;
            if (l != null) {
                premiumBusIconWithTextUiState = null;
            } else {
                premiumBusIconWithTextUiState = null;
            }
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                imageUIState = new ImageUIState(IconType.IC_SEAT_BLACK, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                chaloTextUIState6 = new TextUIState.ChaloTextUIState(CollectionsKt.O(list2, ", ", null, null, new gt0(18), 30), UITextStyle.BodyMedium, black, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$0 = function3;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$1 = this;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$2 = chaloTextUIState6;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$3 = imageUIState;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$4 = premiumBusRouteDetailsUiState;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$5 = chaloTextUIStateX;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$6 = chaloTextUIStateX2;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.L$7 = premiumBusIconWithTextUiState;
                premiumBusFareDetailsUiStateFactory$createTripSummary$1.label = 3;
                objB2 = stringProvider.b(StringEnum.CHANGE_PASS, new Object[0], premiumBusFareDetailsUiStateFactory$createTripSummary$1);
                if (objB2 != coroutineSingletons) {
                    premiumBusRouteDetailsUiState3 = premiumBusRouteDetailsUiState;
                    chaloTextUIState7 = chaloTextUIState6;
                    obj = objB2;
                    chaloTextUIState8 = chaloTextUIStateX;
                    function4 = function3;
                    chaloTextUIState9 = chaloTextUIStateX2;
                    premiumBusIconWithTextUiState3 = premiumBusIconWithTextUiState;
                    imageUIState2 = imageUIState;
                    premiumBusFareDetailsUiStateFactory = this;
                    String str12 = (String) obj;
                    yt0 yt0Var7 = new yt0(function4, 8);
                    premiumBusFareDetailsUiStateFactory.getClass();
                    premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState3;
                    chaloTextUIState5 = chaloTextUIState9;
                    chaloTextUIState4 = chaloTextUIState8;
                    premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState3;
                    premiumBusSelectedSeatsUiState = new PremiumBusSelectedSeatsUiState(imageUIState2, chaloTextUIState7, new TextUIState.ChaloTextUIState(str12, UITextStyle.BodyMedium, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var7), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864));
                }
            } else {
                premiumBusRouteDetailsUiState2 = premiumBusRouteDetailsUiState;
                chaloTextUIState4 = chaloTextUIStateX;
                chaloTextUIState5 = chaloTextUIStateX2;
                premiumBusIconWithTextUiState2 = premiumBusIconWithTextUiState;
                premiumBusSelectedSeatsUiState = null;
            }
            return new PremiumBusFareDetailsTripSummaryUiState(premiumBusRouteDetailsUiState2, chaloTextUIState4, chaloTextUIState5, premiumBusIconWithTextUiState2, premiumBusSelectedSeatsUiState);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0113  */
    /* JADX WARN: Code duplicated, block: B:36:0x011e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0131  */
    /* JADX WARN: Code duplicated, block: B:41:0x013a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0141  */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object k(PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$createViewState$1 premiumBusFareDetailsUiStateFactory$createViewState$1;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState2;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext2;
        Function1 function2;
        ToolbarUIState.Companion companion;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext3;
        Function1 function3;
        ToolbarUIState toolbarUIState;
        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState;
        Object objB;
        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState2;
        ToolbarUIState toolbarUIState2;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState3;
        PremiumBusFareDetailsContent premiumBusFareDetailsContent;
        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState3;
        PremiumBusFareDetailsContent premiumBusFareDetailsContent2;
        LoadingDialogUIState loadingDialogUIState;
        Object objM;
        PremiumBusFareDetailsSwitchError premiumBusFareDetailsSwitchError;
        LoadingDialogUIState loadingDialogUIState2;
        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState4;
        ToolbarUIState toolbarUIState3;
        Object objH;
        LoadingDialogUIState loadingDialogUIState3;
        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState5;
        ToolbarUIState toolbarUIState4;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$createViewState$1) {
            premiumBusFareDetailsUiStateFactory$createViewState$1 = (PremiumBusFareDetailsUiStateFactory$createViewState$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$createViewState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$createViewState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$createViewState$1 = new PremiumBusFareDetailsUiStateFactory$createViewState$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$createViewState$1 = new PremiumBusFareDetailsUiStateFactory$createViewState$1(this, continuationImpl);
        }
        Object objB2 = premiumBusFareDetailsUiStateFactory$createViewState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$createViewState$1.label;
        ConfirmationDialogUiState confirmationDialogUiState = null;
        if (i2 == 0) {
            ResultKt.b(objB2);
            premiumBusFareDetailsComponentDataState2 = premiumBusFareDetailsComponentDataState;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = premiumBusFareDetailsComponentDataState2;
            premiumBusFareDetailsSharedContext2 = premiumBusFareDetailsSharedContext;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsSharedContext2;
            function2 = function1;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = function2;
            ToolbarUIState.Companion companion2 = ToolbarUIState.i;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = companion2;
            premiumBusFareDetailsUiStateFactory$createViewState$1.label = 1;
            objB2 = this.f7555a.b(StringEnum.PB_FARE_DETAILS_HEADING, new Object[0], premiumBusFareDetailsUiStateFactory$createViewState$1);
            if (objB2 != obj) {
                companion = companion2;
            }
            return obj;
        }
        if (i2 == 1) {
            companion = (ToolbarUIState.Companion) premiumBusFareDetailsUiStateFactory$createViewState$1.L$3;
            Function1 function4 = (Function1) premiumBusFareDetailsUiStateFactory$createViewState$1.L$2;
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext4 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$createViewState$1.L$1;
            PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState4 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$0;
            ResultKt.b(objB2);
            premiumBusFareDetailsSharedContext2 = premiumBusFareDetailsSharedContext4;
            premiumBusFareDetailsComponentDataState2 = premiumBusFareDetailsComponentDataState4;
            function2 = function4;
        } else {
            if (i2 == 2) {
                toolbarUIState = (ToolbarUIState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$3;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$createViewState$1.L$2;
                premiumBusFareDetailsSharedContext3 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$createViewState$1.L$1;
                premiumBusFareDetailsComponentDataState2 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$0;
                ResultKt.b(objB2);
                premiumBusFareDetailsTripSummaryUiState = (PremiumBusFareDetailsTripSummaryUiState) objB2;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = premiumBusFareDetailsComponentDataState2;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = toolbarUIState;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = premiumBusFareDetailsTripSummaryUiState;
                premiumBusFareDetailsUiStateFactory$createViewState$1.label = 3;
                objB = b(premiumBusFareDetailsComponentDataState2, premiumBusFareDetailsSharedContext3, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                if (objB != obj) {
                    ToolbarUIState toolbarUIState5 = toolbarUIState;
                    premiumBusFareDetailsTripSummaryUiState2 = premiumBusFareDetailsTripSummaryUiState;
                    objB2 = objB;
                    toolbarUIState2 = toolbarUIState5;
                    premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                    premiumBusFareDetailsContent = (PremiumBusFareDetailsContent) objB2;
                    if (!premiumBusFareDetailsComponentDataState3.c) {
                        premiumBusFareDetailsTripSummaryUiState3 = premiumBusFareDetailsTripSummaryUiState2;
                        premiumBusFareDetailsContent2 = premiumBusFareDetailsContent;
                        loadingDialogUIState = null;
                        premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState3.d;
                        if (premiumBusFareDetailsSwitchError != null) {
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = toolbarUIState2;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsTripSummaryUiState3;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = premiumBusFareDetailsContent2;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = loadingDialogUIState;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = null;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.label = 5;
                            objH = h(premiumBusFareDetailsSwitchError, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                            if (objH != obj) {
                                loadingDialogUIState3 = loadingDialogUIState;
                                objB2 = objH;
                                premiumBusFareDetailsTripSummaryUiState5 = premiumBusFareDetailsTripSummaryUiState3;
                                toolbarUIState4 = toolbarUIState2;
                            }
                        } else {
                            loadingDialogUIState2 = loadingDialogUIState;
                            premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState3;
                            toolbarUIState3 = toolbarUIState2;
                        }
                        return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
                    }
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = function3;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = toolbarUIState2;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = premiumBusFareDetailsTripSummaryUiState2;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = premiumBusFareDetailsContent;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.label = 4;
                    objM = m(premiumBusFareDetailsUiStateFactory$createViewState$1);
                    if (objM != obj) {
                        PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState6 = premiumBusFareDetailsTripSummaryUiState2;
                        premiumBusFareDetailsContent2 = premiumBusFareDetailsContent;
                        objB2 = objM;
                        premiumBusFareDetailsTripSummaryUiState3 = premiumBusFareDetailsTripSummaryUiState6;
                        loadingDialogUIState = (LoadingDialogUIState) objB2;
                        premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState3.d;
                        if (premiumBusFareDetailsSwitchError != null) {
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = toolbarUIState2;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsTripSummaryUiState3;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = premiumBusFareDetailsContent2;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = loadingDialogUIState;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = null;
                            premiumBusFareDetailsUiStateFactory$createViewState$1.label = 5;
                            objH = h(premiumBusFareDetailsSwitchError, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                            if (objH != obj) {
                                loadingDialogUIState3 = loadingDialogUIState;
                                objB2 = objH;
                                premiumBusFareDetailsTripSummaryUiState5 = premiumBusFareDetailsTripSummaryUiState3;
                                toolbarUIState4 = toolbarUIState2;
                            }
                        } else {
                            loadingDialogUIState2 = loadingDialogUIState;
                            premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState3;
                            toolbarUIState3 = toolbarUIState2;
                        }
                        return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                premiumBusFareDetailsTripSummaryUiState2 = (PremiumBusFareDetailsTripSummaryUiState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$2;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$createViewState$1.L$1;
                premiumBusFareDetailsComponentDataState3 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$0;
                ResultKt.b(objB2);
                premiumBusFareDetailsContent = (PremiumBusFareDetailsContent) objB2;
                if (!premiumBusFareDetailsComponentDataState3.c) {
                    premiumBusFareDetailsTripSummaryUiState3 = premiumBusFareDetailsTripSummaryUiState2;
                    premiumBusFareDetailsContent2 = premiumBusFareDetailsContent;
                    loadingDialogUIState = null;
                    premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState3.d;
                    if (premiumBusFareDetailsSwitchError != null) {
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = toolbarUIState2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsTripSummaryUiState3;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = premiumBusFareDetailsContent2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.label = 5;
                        objH = h(premiumBusFareDetailsSwitchError, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                        if (objH != obj) {
                            loadingDialogUIState3 = loadingDialogUIState;
                            objB2 = objH;
                            premiumBusFareDetailsTripSummaryUiState5 = premiumBusFareDetailsTripSummaryUiState3;
                            toolbarUIState4 = toolbarUIState2;
                        }
                    } else {
                        loadingDialogUIState2 = loadingDialogUIState;
                        premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState3;
                        toolbarUIState3 = toolbarUIState2;
                    }
                    return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
                }
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = premiumBusFareDetailsComponentDataState3;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = toolbarUIState2;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = premiumBusFareDetailsTripSummaryUiState2;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = premiumBusFareDetailsContent;
                premiumBusFareDetailsUiStateFactory$createViewState$1.label = 4;
                objM = m(premiumBusFareDetailsUiStateFactory$createViewState$1);
                if (objM != obj) {
                    PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState7 = premiumBusFareDetailsTripSummaryUiState2;
                    premiumBusFareDetailsContent2 = premiumBusFareDetailsContent;
                    objB2 = objM;
                    premiumBusFareDetailsTripSummaryUiState3 = premiumBusFareDetailsTripSummaryUiState7;
                    loadingDialogUIState = (LoadingDialogUIState) objB2;
                    premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState3.d;
                    if (premiumBusFareDetailsSwitchError != null) {
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = toolbarUIState2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsTripSummaryUiState3;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = premiumBusFareDetailsContent2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.label = 5;
                        objH = h(premiumBusFareDetailsSwitchError, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                        if (objH != obj) {
                            loadingDialogUIState3 = loadingDialogUIState;
                            objB2 = objH;
                            premiumBusFareDetailsTripSummaryUiState5 = premiumBusFareDetailsTripSummaryUiState3;
                            toolbarUIState4 = toolbarUIState2;
                        }
                    } else {
                        loadingDialogUIState2 = loadingDialogUIState;
                        premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState3;
                        toolbarUIState3 = toolbarUIState2;
                    }
                    return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
                }
                return obj;
            }
            if (i2 == 4) {
                premiumBusFareDetailsContent2 = (PremiumBusFareDetailsContent) premiumBusFareDetailsUiStateFactory$createViewState$1.L$4;
                premiumBusFareDetailsTripSummaryUiState3 = (PremiumBusFareDetailsTripSummaryUiState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$2;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$createViewState$1.L$1;
                premiumBusFareDetailsComponentDataState3 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$0;
                ResultKt.b(objB2);
                loadingDialogUIState = (LoadingDialogUIState) objB2;
                premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState3.d;
                if (premiumBusFareDetailsSwitchError != null) {
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = toolbarUIState2;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsTripSummaryUiState3;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = premiumBusFareDetailsContent2;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = null;
                    premiumBusFareDetailsUiStateFactory$createViewState$1.label = 5;
                    objH = h(premiumBusFareDetailsSwitchError, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                    if (objH != obj) {
                        loadingDialogUIState3 = loadingDialogUIState;
                        objB2 = objH;
                        premiumBusFareDetailsTripSummaryUiState5 = premiumBusFareDetailsTripSummaryUiState3;
                        toolbarUIState4 = toolbarUIState2;
                    }
                    return obj;
                }
                loadingDialogUIState2 = loadingDialogUIState;
                premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState3;
                toolbarUIState3 = toolbarUIState2;
                return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loadingDialogUIState3 = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$3;
            premiumBusFareDetailsContent2 = (PremiumBusFareDetailsContent) premiumBusFareDetailsUiStateFactory$createViewState$1.L$2;
            premiumBusFareDetailsTripSummaryUiState5 = (PremiumBusFareDetailsTripSummaryUiState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$1;
            toolbarUIState4 = (ToolbarUIState) premiumBusFareDetailsUiStateFactory$createViewState$1.L$0;
            ResultKt.b(objB2);
        }
        confirmationDialogUiState = (ConfirmationDialogUiState) objB2;
        toolbarUIState3 = toolbarUIState4;
        loadingDialogUIState2 = loadingDialogUIState3;
        premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState5;
        return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
        ToolbarUIState toolbarUIState6 = new ToolbarUIState(null, ToolbarUIState.Companion.a(companion, (String) objB2), null, null, null, 0.0f, null, null, 253);
        premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = premiumBusFareDetailsComponentDataState2;
        premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsSharedContext2;
        premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = function2;
        premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = toolbarUIState6;
        premiumBusFareDetailsUiStateFactory$createViewState$1.label = 2;
        objB2 = j(premiumBusFareDetailsSharedContext2, function2, premiumBusFareDetailsUiStateFactory$createViewState$1);
        if (objB2 != obj) {
            premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext2;
            function3 = function2;
            toolbarUIState = toolbarUIState6;
            premiumBusFareDetailsTripSummaryUiState = (PremiumBusFareDetailsTripSummaryUiState) objB2;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = premiumBusFareDetailsComponentDataState2;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = function3;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = toolbarUIState;
            premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = premiumBusFareDetailsTripSummaryUiState;
            premiumBusFareDetailsUiStateFactory$createViewState$1.label = 3;
            objB = b(premiumBusFareDetailsComponentDataState2, premiumBusFareDetailsSharedContext3, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
            if (objB != obj) {
                ToolbarUIState toolbarUIState7 = toolbarUIState;
                premiumBusFareDetailsTripSummaryUiState2 = premiumBusFareDetailsTripSummaryUiState;
                objB2 = objB;
                toolbarUIState2 = toolbarUIState7;
                premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                premiumBusFareDetailsContent = (PremiumBusFareDetailsContent) objB2;
                if (!premiumBusFareDetailsComponentDataState3.c) {
                    premiumBusFareDetailsTripSummaryUiState3 = premiumBusFareDetailsTripSummaryUiState2;
                    premiumBusFareDetailsContent2 = premiumBusFareDetailsContent;
                    loadingDialogUIState = null;
                    premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState3.d;
                    if (premiumBusFareDetailsSwitchError != null) {
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = toolbarUIState2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsTripSummaryUiState3;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = premiumBusFareDetailsContent2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.label = 5;
                        objH = h(premiumBusFareDetailsSwitchError, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                        if (objH != obj) {
                            loadingDialogUIState3 = loadingDialogUIState;
                            objB2 = objH;
                            premiumBusFareDetailsTripSummaryUiState5 = premiumBusFareDetailsTripSummaryUiState3;
                            toolbarUIState4 = toolbarUIState2;
                            confirmationDialogUiState = (ConfirmationDialogUiState) objB2;
                            toolbarUIState3 = toolbarUIState4;
                            loadingDialogUIState2 = loadingDialogUIState3;
                            premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState5;
                        }
                    } else {
                        loadingDialogUIState2 = loadingDialogUIState;
                        premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState3;
                        toolbarUIState3 = toolbarUIState2;
                    }
                    return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
                }
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = premiumBusFareDetailsComponentDataState3;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = toolbarUIState2;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = premiumBusFareDetailsTripSummaryUiState2;
                premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = premiumBusFareDetailsContent;
                premiumBusFareDetailsUiStateFactory$createViewState$1.label = 4;
                objM = m(premiumBusFareDetailsUiStateFactory$createViewState$1);
                if (objM != obj) {
                    PremiumBusFareDetailsTripSummaryUiState premiumBusFareDetailsTripSummaryUiState8 = premiumBusFareDetailsTripSummaryUiState2;
                    premiumBusFareDetailsContent2 = premiumBusFareDetailsContent;
                    objB2 = objM;
                    premiumBusFareDetailsTripSummaryUiState3 = premiumBusFareDetailsTripSummaryUiState8;
                    loadingDialogUIState = (LoadingDialogUIState) objB2;
                    premiumBusFareDetailsSwitchError = premiumBusFareDetailsComponentDataState3.d;
                    if (premiumBusFareDetailsSwitchError != null) {
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$0 = toolbarUIState2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$1 = premiumBusFareDetailsTripSummaryUiState3;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$2 = premiumBusFareDetailsContent2;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$3 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$createViewState$1.label = 5;
                        objH = h(premiumBusFareDetailsSwitchError, function3, premiumBusFareDetailsUiStateFactory$createViewState$1);
                        if (objH != obj) {
                            loadingDialogUIState3 = loadingDialogUIState;
                            objB2 = objH;
                            premiumBusFareDetailsTripSummaryUiState5 = premiumBusFareDetailsTripSummaryUiState3;
                            toolbarUIState4 = toolbarUIState2;
                            confirmationDialogUiState = (ConfirmationDialogUiState) objB2;
                            toolbarUIState3 = toolbarUIState4;
                            loadingDialogUIState2 = loadingDialogUIState3;
                            premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState5;
                        }
                    } else {
                        loadingDialogUIState2 = loadingDialogUIState;
                        premiumBusFareDetailsTripSummaryUiState4 = premiumBusFareDetailsTripSummaryUiState3;
                        toolbarUIState3 = toolbarUIState2;
                    }
                    return new PremiumBusFareDetailsUiState(toolbarUIState3, premiumBusFareDetailsTripSummaryUiState4, premiumBusFareDetailsContent2, loadingDialogUIState2, confirmationDialogUiState);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(StringEnum stringEnum, boolean z, Function0 function0, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$greyButton$1 premiumBusFareDetailsUiStateFactory$greyButton$1;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$greyButton$1) {
            premiumBusFareDetailsUiStateFactory$greyButton$1 = (PremiumBusFareDetailsUiStateFactory$greyButton$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$greyButton$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$greyButton$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$greyButton$1 = new PremiumBusFareDetailsUiStateFactory$greyButton$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$greyButton$1 = new PremiumBusFareDetailsUiStateFactory$greyButton$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$greyButton$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$greyButton$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusFareDetailsUiStateFactory$greyButton$1.L$0 = function0;
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            premiumBusFareDetailsUiStateFactory$greyButton$1.L$1 = buttonUIStateFactory2;
            premiumBusFareDetailsUiStateFactory$greyButton$1.Z$0 = z;
            premiumBusFareDetailsUiStateFactory$greyButton$1.label = 1;
            objB = this.f7555a.b(stringEnum, new Object[0], premiumBusFareDetailsUiStateFactory$greyButton$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            buttonUIStateFactory = buttonUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = premiumBusFareDetailsUiStateFactory$greyButton$1.Z$0;
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) premiumBusFareDetailsUiStateFactory$greyButton$1.L$1;
            function0 = (Function0) premiumBusFareDetailsUiStateFactory$greyButton$1.L$0;
            ResultKt.b(objB);
            buttonUIStateFactory = buttonUIStateFactory3;
        }
        return ButtonUIStateFactory.b(buttonUIStateFactory, (String) objB, function0, UIShape.d, z, 36);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$loadingDialog$1 premiumBusFareDetailsUiStateFactory$loadingDialog$1;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$loadingDialog$1) {
            premiumBusFareDetailsUiStateFactory$loadingDialog$1 = (PremiumBusFareDetailsUiStateFactory$loadingDialog$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$loadingDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$loadingDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$loadingDialog$1 = new PremiumBusFareDetailsUiStateFactory$loadingDialog$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$loadingDialog$1 = new PremiumBusFareDetailsUiStateFactory$loadingDialog$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$loadingDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$loadingDialog$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusFareDetailsUiStateFactory$loadingDialog$1.L$0 = this;
            premiumBusFareDetailsUiStateFactory$loadingDialog$1.label = 1;
            objB = this.f7555a.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], premiumBusFareDetailsUiStateFactory$loadingDialog$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            premiumBusFareDetailsUiStateFactory = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumBusFareDetailsUiStateFactory = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$loadingDialog$1.L$0;
            ResultKt.b(objB);
        }
        premiumBusFareDetailsUiStateFactory.getClass();
        return new LoadingDialogUIState(q((String) objB));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(StringEnum stringEnum, boolean z, fq0 fq0Var, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$orangeButton$1 premiumBusFareDetailsUiStateFactory$orangeButton$1;
        ButtonUIStateFactory buttonUIStateFactory;
        Function0 function0;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$orangeButton$1) {
            premiumBusFareDetailsUiStateFactory$orangeButton$1 = (PremiumBusFareDetailsUiStateFactory$orangeButton$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$orangeButton$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$orangeButton$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$orangeButton$1 = new PremiumBusFareDetailsUiStateFactory$orangeButton$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$orangeButton$1 = new PremiumBusFareDetailsUiStateFactory$orangeButton$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$orangeButton$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$orangeButton$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusFareDetailsUiStateFactory$orangeButton$1.L$0 = fq0Var;
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            premiumBusFareDetailsUiStateFactory$orangeButton$1.L$1 = buttonUIStateFactory2;
            premiumBusFareDetailsUiStateFactory$orangeButton$1.Z$0 = z;
            premiumBusFareDetailsUiStateFactory$orangeButton$1.label = 1;
            objB = this.f7555a.b(stringEnum, new Object[0], premiumBusFareDetailsUiStateFactory$orangeButton$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            buttonUIStateFactory = buttonUIStateFactory2;
            function0 = fq0Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = premiumBusFareDetailsUiStateFactory$orangeButton$1.Z$0;
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) premiumBusFareDetailsUiStateFactory$orangeButton$1.L$1;
            Function0 function1 = (Function0) premiumBusFareDetailsUiStateFactory$orangeButton$1.L$0;
            ResultKt.b(objB);
            buttonUIStateFactory = buttonUIStateFactory3;
            function0 = function1;
        }
        return ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, function0, null, UIShape.d, z, 0.0f, 36);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object o(StringEnum stringEnum, boolean z, Function0 function0, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$outlinedButton$1 premiumBusFareDetailsUiStateFactory$outlinedButton$1;
        boolean z2;
        Function0 function1;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$outlinedButton$1) {
            premiumBusFareDetailsUiStateFactory$outlinedButton$1 = (PremiumBusFareDetailsUiStateFactory$outlinedButton$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$outlinedButton$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$outlinedButton$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$outlinedButton$1 = new PremiumBusFareDetailsUiStateFactory$outlinedButton$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$outlinedButton$1 = new PremiumBusFareDetailsUiStateFactory$outlinedButton$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$outlinedButton$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$outlinedButton$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusFareDetailsUiStateFactory$outlinedButton$1.L$0 = function0;
            z2 = z;
            premiumBusFareDetailsUiStateFactory$outlinedButton$1.Z$0 = z2;
            premiumBusFareDetailsUiStateFactory$outlinedButton$1.label = 1;
            objB = this.f7555a.b(stringEnum, new Object[0], premiumBusFareDetailsUiStateFactory$outlinedButton$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function1 = function0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = premiumBusFareDetailsUiStateFactory$outlinedButton$1.Z$0;
            function1 = (Function0) premiumBusFareDetailsUiStateFactory$outlinedButton$1.L$0;
            ResultKt.b(objB);
            z2 = z3;
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.TitleLarge, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        UIShape.Rectangle rectangle = UIShape.d;
        float f = ChaloThemeHelper.a().k;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        return new ButtonUIState(chaloTextUIState, z2, rectangle, null, new ButtonUIColor(transparent, transparent), UiEventHandler.Companion.a(function1), f, new ButtonBorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a), 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r12 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r9, boolean r10, kotlin.jvm.functions.Function1 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$payButton$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$payButton$1 r0 = (app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$payButton$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$payButton$1 r0 = new app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory$payButton$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            boolean r10 = r0.Z$0
            java.lang.Object r9 = r0.L$0
            r11 = r9
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            kotlin.ResultKt.b(r12)
            goto L79
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            boolean r10 = r0.Z$0
            java.lang.Object r9 = r0.L$0
            r11 = r9
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            kotlin.ResultKt.b(r12)
            goto L61
        L44:
            kotlin.ResultKt.b(r12)
            boolean r12 = kotlin.text.StringsKt.F(r9)
            r2 = 0
            app.chalo.providers.stringprovider.StringProvider r5 = r8.f7555a
            if (r12 == 0) goto L66
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.PAY_NOW
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r0.L$0 = r11
            r0.Z$0 = r10
            r0.label = r4
            java.lang.Object r12 = r5.b(r9, r12, r0)
            if (r12 != r1) goto L61
            goto L78
        L61:
            java.lang.String r12 = (java.lang.String) r12
        L63:
            r5 = r10
            r1 = r12
            goto L7c
        L66:
            app.chalo.providers.stringprovider.StringEnum r12 = app.chalo.providers.stringprovider.StringEnum.FARE_DETAILS_PAY
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r9
            r0.L$0 = r11
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r12 = r5.b(r12, r4, r0)
            if (r12 != r1) goto L79
        L78:
            return r1
        L79:
            java.lang.String r12 = (java.lang.String) r12
            goto L63
        L7c:
            yt0 r2 = new yt0
            r9 = 9
            r2.<init>(r11, r9)
            r6 = 0
            r7 = 44
            app.chalo.uistate.button.ButtonUIStateFactory r0 = app.chalo.uistate.button.ButtonUIStateFactory.f9921a
            r3 = 0
            r4 = 0
            app.chalo.uistate.button.ButtonUIState r9 = app.chalo.uistate.button.ButtonUIStateFactory.g(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory.p(java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:134:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:137:0x0604  */
    /* JADX WARN: Code duplicated, block: B:149:0x063d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0674  */
    /* JADX WARN: Code duplicated, block: B:157:0x0686 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x068a  */
    /* JADX WARN: Code duplicated, block: B:163:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:166:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:169:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:171:0x0750  */
    /* JADX WARN: Code duplicated, block: B:175:0x0768  */
    /* JADX WARN: Code duplicated, block: B:177:0x076b  */
    /* JADX WARN: Code duplicated, block: B:180:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:182:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:185:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:188:0x0824  */
    /* JADX WARN: Code duplicated, block: B:190:0x0836  */
    /* JADX WARN: Code duplicated, block: B:192:0x083c  */
    /* JADX WARN: Code duplicated, block: B:196:0x086b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0871  */
    /* JADX WARN: Code duplicated, block: B:201:0x0899  */
    /* JADX WARN: Code duplicated, block: B:204:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:213:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0354  */
    /* JADX WARN: Code duplicated, block: B:41:0x0374  */
    /* JADX WARN: Code duplicated, block: B:42:0x0379  */
    /* JADX WARN: Code duplicated, block: B:45:0x0384  */
    /* JADX WARN: Code duplicated, block: B:47:0x038c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0396  */
    /* JADX WARN: Code duplicated, block: B:53:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x03ae A[LOOP:2: B:51:0x039a->B:56:0x03ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [app.chalo.uistate.text.TextUIState$ChaloTextUIState] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2, types: [app.chalo.premiumbus.ui.faredetails.contract.PremiumBusDiscountTagUiState] */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2, types: [app.chalo.uistate.radiobutton.RadioButtonUIState] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2, types: [app.chalo.premiumbus.ui.faredetails.contract.PremiumBusPassengerCounterUiState] */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [app.chalo.uistate.divider.DividerUIState] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r44v5 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Throwable] */
    public final Object t(PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState, PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1 premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1;
        DividerOrientation dividerOrientation;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        CoroutineSingletons coroutineSingletons;
        boolean z;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext2;
        int i;
        Function1 function2;
        boolean z2;
        String str;
        PassengerSelectionPolicy passengerSelectionPolicy;
        ApplicableRuleAppModel applicableRuleAppModel;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState;
        String str2;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState;
        boolean z3;
        Object objG;
        String str3;
        ApplicableRuleAppModel applicableRuleAppModel2;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState2;
        PassengerSelectionPolicy passengerSelectionPolicy2;
        Function1 function3;
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState;
        List list;
        boolean z4;
        CoroutineSingletons coroutineSingletons2;
        boolean z5;
        boolean z6;
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState2;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState3;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType2;
        ApplicableRuleAppModel applicableRuleAppModel3;
        PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType3;
        ApplicableRuleAppModel applicableRuleAppModel4;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState4;
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState3;
        boolean z7;
        int i2;
        String str4;
        PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState2;
        ApplicableRuleAppModel applicableRuleAppModel5;
        CoroutineSingletons coroutineSingletons3;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState2;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType4;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState5;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState2;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext3;
        String str5;
        String str6;
        boolean z8;
        boolean z9;
        ?? radioButtonUIState;
        ?? premiumBusPassengerCounterUiState;
        DividerOrientation dividerOrientation2;
        ?? dividerUIState;
        List list2;
        Iterator it;
        Iterator it2;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext4;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState3;
        Function1 function4;
        CoroutineSingletons coroutineSingletons4;
        Object objI;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState3;
        Function1 function5;
        boolean z10;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState2;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType5;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState4;
        List list3;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState;
        boolean z11;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState4;
        Object objP;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState2;
        Function1 function6;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType6;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState6;
        String str7;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState5;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState5;
        ButtonUIState buttonUIState;
        CoroutineSingletons coroutineSingletons5;
        StringProvider stringProvider;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType7;
        String str8;
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState4;
        PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState3;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState3;
        TextUIState.ExpandingTextUIState expandingTextUIState;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState3;
        ExpandingTextUIStateFactory expandingTextUIStateFactory;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState6;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState4;
        Object objB;
        Object obj;
        Function1 function7;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType8;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState4;
        String str9;
        ExpandingTextUIStateFactory expandingTextUIStateFactory2;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory2;
        String str10;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState5;
        PremiumBusTotalAmountUiState premiumBusTotalAmountUiState;
        String str11;
        Object objB2;
        String str12;
        ButtonUIState buttonUIState2;
        TextUIState.ExpandingTextUIState expandingTextUIState2;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState6;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType9;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory3;
        PremiumBusFareDetailsFooterUiState premiumBusFareDetailsFooterUiState;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState7;
        PremiumBusFareDetailsFooterUiState premiumBusFareDetailsFooterUiState2;
        Function1 function8;
        LoadingDialogUIState loadingDialogUIState;
        PremiumBusFareDetailsFooterUiState premiumBusFareDetailsFooterUiState3;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState5;
        PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState4;
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState5;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType10;
        String str13;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState8;
        PremiumBusFareDetailsFooterUiState premiumBusFareDetailsFooterUiState4;
        LoadingDialogUIState loadingDialogUIState2;
        ConfirmationDialogUiState confirmationDialogUiState;
        PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState;
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState6;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState7;
        PremiumBusSectionNoteUiState premiumBusSectionNoteUiState7;
        PremiumBusOffersSectionUiState premiumBusOffersSectionUiState8;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory4 = this;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState7 = premiumBusFareDetailsComponentDataState;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1) {
            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1 = (PremiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1) continuationImpl;
            int i3 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = i3 - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1 = new PremiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1(premiumBusFareDetailsUiStateFactory4, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1 = new PremiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1(premiumBusFareDetailsUiStateFactory4, continuationImpl);
        }
        Object objC = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.result;
        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label;
        StringProvider stringProvider2 = premiumBusFareDetailsUiStateFactory4.f7555a;
        switch (i4) {
            case 0:
                dividerOrientation = null;
                ResultKt.b(objC);
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState6 = premiumBusFareDetailsComponentDataState7.b;
                if (premiumBusFareDetailsDataState6.k.isEmpty()) {
                    return null;
                }
                PassengerSelectionPolicy passengerSelectionPolicy3 = premiumBusFareDetailsDataState6.m;
                List list4 = premiumBusFareDetailsDataState6.e;
                String str14 = premiumBusFareDetailsDataState6.i;
                boolean z12 = premiumBusFareDetailsDataState6.f;
                String str15 = premiumBusFareDetailsDataState6.r;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType11 = premiumBusFareDetailsDataState6.q;
                int iW0 = CollectionsKt.w0(premiumBusFareDetailsDataState6.b().values());
                boolean z13 = premiumBusFareDetailsComponentDataState7.g;
                ApplicableRuleAppModel applicableRuleAppModel6 = (ApplicableRuleAppModel) CollectionsKt.H(list4);
                PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = (premiumBusFareDetailsSharedContext.b.size() > 1 || iW0 > 1) ? null : freshPurchase.e;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState7;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsSharedContext;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = function1;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsDataState6;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = passengerSelectionPolicy3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str14;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = str15;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsBottomSheetType11;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = applicableRuleAppModel6;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z12;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = iW0;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$1 = z13;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 1;
                premiumBusFareDetailsUiStateFactory = this;
                Object objE = premiumBusFareDetailsUiStateFactory.e(premiumBusPassUpsellAppModel, list4, function1, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                coroutineSingletons = coroutineSingletons6;
                if (objE != coroutineSingletons) {
                    objC = objE;
                    z = z13;
                    premiumBusFareDetailsSharedContext2 = premiumBusFareDetailsSharedContext;
                    i = iW0;
                    function2 = function1;
                    z2 = z12;
                    str = str15;
                    passengerSelectionPolicy = passengerSelectionPolicy3;
                    applicableRuleAppModel = applicableRuleAppModel6;
                    premiumBusFareDetailsDataState = premiumBusFareDetailsDataState6;
                    str2 = str14;
                    premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsBottomSheetType11;
                    premiumBusOffersSectionUiState = (PremiumBusOffersSectionUiState) objC;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsSharedContext2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = function2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsDataState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = passengerSelectionPolicy;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = str;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsBottomSheetType;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = applicableRuleAppModel;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusOffersSectionUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$1 = z;
                    z3 = z;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 2;
                    objG = premiumBusFareDetailsUiStateFactory.g(passengerSelectionPolicy, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objG != coroutineSingletons) {
                        objC = objG;
                        str3 = str;
                        applicableRuleAppModel2 = applicableRuleAppModel;
                        premiumBusOffersSectionUiState2 = premiumBusOffersSectionUiState;
                        Function1 function9 = function2;
                        passengerSelectionPolicy2 = passengerSelectionPolicy;
                        function3 = function9;
                        premiumBusSectionNoteUiState = (PremiumBusSectionNoteUiState) objC;
                        PassengerSelectionPolicy passengerSelectionPolicy4 = passengerSelectionPolicy2;
                        list = premiumBusFareDetailsComponentDataState7.f;
                        boolean zIsEmpty = premiumBusFareDetailsSharedContext2.b.isEmpty();
                        if (applicableRuleAppModel2 != null) {
                            z4 = applicableRuleAppModel2.g;
                        } else {
                            z4 = true;
                        }
                        coroutineSingletons2 = coroutineSingletons;
                        if (list.size() == 1) {
                            list2 = list;
                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        it2 = it;
                                        if (((PassengerFareDetailsUiModel) it.next()).j > 1) {
                                            z5 = true;
                                        } else {
                                            it = it2;
                                        }
                                    }
                                }
                            }
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z4 || !zIsEmpty || !z5 || list.isEmpty()) {
                            z6 = z2;
                            premiumBusSectionNoteUiState2 = premiumBusSectionNoteUiState;
                            premiumBusOffersSectionUiState3 = premiumBusOffersSectionUiState2;
                            premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                            applicableRuleAppModel3 = applicableRuleAppModel2;
                            premiumBusPassengerDetailsSectionUiState = null;
                        } else {
                            boolean z14 = list.size() == 1;
                            List list5 = list;
                            boolean z15 = z14;
                            ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                            Iterator it3 = list5.iterator();
                            int i5 = 0;
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    ?? r7 = dividerOrientation;
                                    CollectionsKt.z0();
                                    throw r7;
                                }
                                PassengerFareDetailsUiModel passengerFareDetailsUiModel = (PassengerFareDetailsUiModel) next;
                                Iterator it4 = it3;
                                boolean z16 = i5 == CollectionsKt.K(list);
                                if (z15) {
                                    z8 = z16;
                                    z9 = passengerFareDetailsUiModel.h == 1;
                                } else {
                                    z8 = z16;
                                    z9 = passengerFareDetailsUiModel.l;
                                }
                                boolean z17 = passengerFareDetailsUiModel.k || z3;
                                boolean z18 = z9;
                                String str16 = passengerFareDetailsUiModel.b;
                                UITextStyle uITextStyle = UITextStyle.HeadlineSmall;
                                UIFontWeight uIFontWeight = UIFontWeight.Bold;
                                ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
                                TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(str16, uITextStyle, black, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                                TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(passengerFareDetailsUiModel.f, uITextStyle, black, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                                ?? r44 = passengerFareDetailsUiModel.c ? passengerFareDetailsUiModel.e : dividerOrientation;
                                ?? chaloTextUIState3 = r44 != 0 ? new TextUIState.ChaloTextUIState((String) r44, uITextStyle, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, UITextDecoration.LineThrough, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7672) : dividerOrientation;
                                String str17 = passengerFareDetailsUiModel.d;
                                ?? premiumBusDiscountTagUiState = str17 != null ? new PremiumBusDiscountTagUiState(new TextUIState.ChaloTextUIState(str17, UITextStyle.BodySmall, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120)) : dividerOrientation;
                                int i7 = WhenMappings.b[passengerSelectionPolicy4.ordinal()];
                                if (i7 == 1) {
                                    radioButtonUIState = new RadioButtonUIState(passengerFareDetailsUiModel.n, UiEventHandler.Companion.a(new yp0(function3, passengerFareDetailsUiModel, 3)), 44);
                                } else {
                                    if (i7 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    radioButtonUIState = dividerOrientation;
                                }
                                if (passengerFareDetailsUiModel.j > 1) {
                                    premiumBusPassengerCounterUiState = new PremiumBusPassengerCounterUiState(a(z18 ? IconType.REMOVE_TICKET_DISABLED : IconType.REMOVE_TICKET, !z18, new yp0(function3, passengerFareDetailsUiModel, 4)), new TextUIState.ChaloTextUIState(String.valueOf(passengerFareDetailsUiModel.h), UITextStyle.DisplaySmall, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), a(z17 != 0 ? IconType.ADD_TICKET_DISABLED : IconType.ADD_TICKET, !z17, new yp0(function3, passengerFareDetailsUiModel, 5)));
                                } else {
                                    premiumBusPassengerCounterUiState = dividerOrientation;
                                }
                                if (z8) {
                                    dividerOrientation2 = dividerOrientation;
                                    dividerUIState = dividerOrientation2;
                                } else {
                                    dividerOrientation2 = dividerOrientation;
                                    dividerUIState = new DividerUIState(d, ChaloColorToken.Black_12.f9761a, dividerOrientation2, 4);
                                }
                                arrayList.add(new PremiumBusPassengerRowUiState(chaloTextUIState, chaloTextUIState2, chaloTextUIState3, premiumBusDiscountTagUiState, radioButtonUIState, premiumBusPassengerCounterUiState, dividerUIState));
                                it3 = it4;
                                dividerOrientation = dividerOrientation2;
                                i5 = i6;
                                z2 = z2;
                                premiumBusSectionNoteUiState = premiumBusSectionNoteUiState;
                                premiumBusOffersSectionUiState2 = premiumBusOffersSectionUiState2;
                                applicableRuleAppModel2 = applicableRuleAppModel2;
                                premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsBottomSheetType;
                            }
                            z6 = z2;
                            premiumBusSectionNoteUiState2 = premiumBusSectionNoteUiState;
                            premiumBusOffersSectionUiState3 = premiumBusOffersSectionUiState2;
                            premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                            applicableRuleAppModel3 = applicableRuleAppModel2;
                            premiumBusPassengerDetailsSectionUiState = new PremiumBusPassengerDetailsSectionUiState(arrayList);
                        }
                        List list6 = premiumBusFareDetailsComponentDataState7.f;
                        String str18 = premiumBusFareDetailsComponentDataState7.e;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState7;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsSharedContext2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = function3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsDataState;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str3;
                        premiumBusFareDetailsBottomSheetType3 = premiumBusFareDetailsBottomSheetType2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsBottomSheetType3;
                        applicableRuleAppModel4 = applicableRuleAppModel3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = applicableRuleAppModel4;
                        premiumBusOffersSectionUiState4 = premiumBusOffersSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState4;
                        premiumBusSectionNoteUiState3 = premiumBusSectionNoteUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState;
                        z7 = z6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                        i2 = i;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                        str4 = str3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 3;
                        objC = c(str18, list6, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                        if (objC == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        premiumBusPassengerDetailsSectionUiState2 = premiumBusPassengerDetailsSectionUiState;
                        applicableRuleAppModel5 = applicableRuleAppModel4;
                        coroutineSingletons3 = coroutineSingletons2;
                        premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
                        premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType3;
                        premiumBusOffersSectionUiState5 = premiumBusOffersSectionUiState4;
                        premiumBusFareDetailsComponentDataState2 = premiumBusFareDetailsComponentDataState7;
                        premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext2;
                        str5 = str2;
                        str6 = str4;
                        premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objC;
                        if (applicableRuleAppModel5 == null && (list3 = applicableRuleAppModel5.f) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext5 = premiumBusFareDetailsSharedContext3;
                                Object next2 = it5.next();
                                Iterator it6 = it5;
                                if (next2 instanceof ApplicableRuleUxCopyAppModel.CheckoutScreen) {
                                    arrayList2.add(next2);
                                }
                                premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext5;
                                it5 = it6;
                            }
                            premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                            ApplicableRuleUxCopyAppModel.CheckoutScreen checkoutScreen = (ApplicableRuleUxCopyAppModel.CheckoutScreen) ((ApplicableRuleUxCopyAppModel) CollectionsKt.H(arrayList2));
                            List list7 = checkoutScreen != null ? checkoutScreen.d : null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 4;
                            premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                            function4 = function3;
                            coroutineSingletons4 = coroutineSingletons3;
                            premiumBusFareDetailsUiStateFactory4 = this;
                            objI = premiumBusFareDetailsUiStateFactory4.i(premiumBusFareDetailsSharedContext4, list7, false, function4, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            if (objI != coroutineSingletons4) {
                                objC = objI;
                                premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                                function5 = function4;
                                z10 = z7;
                                premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                                premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                                premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                                premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objC;
                                boolean z19 = z10;
                                String str19 = premiumBusFareDetailsComponentDataState3.e;
                                if (i2 > 0 || z19) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState2;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 5;
                                objP = premiumBusFareDetailsUiStateFactory4.p(str19, z11, function5, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                if (objP != coroutineSingletons4) {
                                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                    function6 = function5;
                                    premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType5;
                                    objC = objP;
                                    premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState5;
                                    str7 = str6;
                                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                    premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState4;
                                    buttonUIState = (ButtonUIState) objC;
                                    if (str5 != null) {
                                        CoroutineSingletons coroutineSingletons7 = coroutineSingletons4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState5;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState5;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str7;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsBottomSheetType6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str5;
                                        expandingTextUIStateFactory = ExpandingTextUIStateFactory.f10080a;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = expandingTextUIStateFactory;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsUiStateFactory4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState2;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = premiumBusFareSplitSectionUiState2;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = premiumBusFareDetailsTermsUiState2;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = buttonUIState;
                                        premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 6;
                                        premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState2;
                                        stringProvider = stringProvider2;
                                        objB = stringProvider.b(StringEnum.READ_MORE, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                        coroutineSingletons5 = coroutineSingletons7;
                                        if (objB == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType12 = premiumBusFareDetailsBottomSheetType6;
                                        obj = objB;
                                        function7 = function6;
                                        premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType12;
                                        premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                        str9 = str5;
                                        expandingTextUIStateFactory2 = expandingTextUIStateFactory;
                                        premiumBusFareDetailsUiStateFactory2 = premiumBusFareDetailsUiStateFactory4;
                                        ButtonUIState buttonUIState3 = buttonUIState;
                                        PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState5 = premiumBusPassengerDetailsSectionUiState2;
                                        fq0 fq0Var = new fq0(function7, 28);
                                        expandingTextUIStateFactory2.getClass();
                                        TextUIState.ExpandingTextUIState expandingTextUIStateA = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var);
                                        premiumBusFareDetailsUiStateFactory2.getClass();
                                        TextUIState.ChaloTextUIState chaloTextUIState4 = expandingTextUIStateA.b;
                                        UITextStyle uITextStyle2 = UITextStyle.BodySmall;
                                        TextUIState.ExpandingTextUIState expandingTextUIState3 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState4, uITextStyle2, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA.d, uITextStyle2, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA.e, false, null);
                                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                                        buttonUIState = buttonUIState3;
                                        str8 = str7;
                                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                                        expandingTextUIState = expandingTextUIState3;
                                        function6 = function7;
                                        premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                                        premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState5;
                                        premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                    } else {
                                        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState9 = premiumBusFareDetailsTermsUiState2;
                                        coroutineSingletons5 = coroutineSingletons4;
                                        stringProvider = stringProvider2;
                                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType6;
                                        str8 = str7;
                                        premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                                        premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState2;
                                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState2;
                                        expandingTextUIState = null;
                                        premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState9;
                                    }
                                    str10 = premiumBusFareDetailsComponentDataState5.e;
                                    if (StringsKt.F(str10)) {
                                        str10 = null;
                                    }
                                    if (str10 != null) {
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                                        str11 = str10;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                                        objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                        coroutineSingletons5 = coroutineSingletons5;
                                        if (objB2 == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        str12 = str11;
                                        buttonUIState2 = buttonUIState;
                                        objC = objB2;
                                        expandingTextUIState2 = expandingTextUIState;
                                        premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                                        premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                                        premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                                        premiumBusFareDetailsUiStateFactory3.getClass();
                                        UITextStyle uITextStyle3 = UITextStyle.DisplaySmall;
                                        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
                                        TextUIState.ExpandingTextUIState expandingTextUIState4 = expandingTextUIState2;
                                        premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle3, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle3, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                        buttonUIState = buttonUIState2;
                                        premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                                        expandingTextUIState = expandingTextUIState4;
                                    } else {
                                        premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                                        premiumBusTotalAmountUiState = null;
                                    }
                                    premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                                    if (premiumBusFareDetailsDataState5.h) {
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                                        objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                        if (objC == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                                        premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                                        premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                                        premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                                        function8 = function6;
                                        str13 = str8;
                                        str8 = str13;
                                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                                        premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                                        premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                                        premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                                        premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                                        loadingDialogUIState = (LoadingDialogUIState) objC;
                                    } else {
                                        premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                                        premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                                        function8 = function6;
                                        loadingDialogUIState = null;
                                    }
                                    if (str8 != null) {
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                                        objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                                        if (objC == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                                        premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                                    } else {
                                        premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                                        premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        confirmationDialogUiState = null;
                                    }
                                    if (premiumBusFareDetailsBottomSheetType7 != null) {
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                                        objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                        if (objC == coroutineSingletons5) {
                                            return coroutineSingletons5;
                                        }
                                        premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                                        premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                                        premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                                        premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                                        premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                                    } else {
                                        premiumBusFareDetailsBottomSheetUiState = null;
                                        premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                                        premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                                    }
                                    return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
                                }
                            }
                            return coroutineSingletons4;
                        }
                        premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 4;
                        premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                        function4 = function3;
                        coroutineSingletons4 = coroutineSingletons3;
                        premiumBusFareDetailsUiStateFactory4 = this;
                        objI = premiumBusFareDetailsUiStateFactory4.i(premiumBusFareDetailsSharedContext4, list7, false, function4, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                        if (objI != coroutineSingletons4) {
                            objC = objI;
                            premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                            function5 = function4;
                            z10 = z7;
                            premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                            premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                            premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                            premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objC;
                            boolean z110 = z10;
                            String str110 = premiumBusFareDetailsComponentDataState3.e;
                            if (i2 > 0) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState;
                            premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 5;
                            objP = premiumBusFareDetailsUiStateFactory4.p(str110, z11, function5, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            if (objP != coroutineSingletons4) {
                                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                function6 = function5;
                                premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType5;
                                objC = objP;
                                premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState5;
                                str7 = str6;
                                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState4;
                                buttonUIState = (ButtonUIState) objC;
                                if (str5 != null) {
                                    CoroutineSingletons coroutineSingletons8 = coroutineSingletons4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState5;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState5;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str7;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsBottomSheetType6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str5;
                                    expandingTextUIStateFactory = ExpandingTextUIStateFactory.f10080a;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = expandingTextUIStateFactory;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsUiStateFactory4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState2;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = premiumBusFareSplitSectionUiState2;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = premiumBusFareDetailsTermsUiState2;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = buttonUIState;
                                    premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 6;
                                    premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState2;
                                    stringProvider = stringProvider2;
                                    objB = stringProvider.b(StringEnum.READ_MORE, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                    coroutineSingletons5 = coroutineSingletons8;
                                    if (objB == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType13 = premiumBusFareDetailsBottomSheetType6;
                                    obj = objB;
                                    function7 = function6;
                                    premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType13;
                                    premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                    str9 = str5;
                                    expandingTextUIStateFactory2 = expandingTextUIStateFactory;
                                    premiumBusFareDetailsUiStateFactory2 = premiumBusFareDetailsUiStateFactory4;
                                    ButtonUIState buttonUIState4 = buttonUIState;
                                    PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState6 = premiumBusPassengerDetailsSectionUiState2;
                                    fq0 fq0Var2 = new fq0(function7, 28);
                                    expandingTextUIStateFactory2.getClass();
                                    TextUIState.ExpandingTextUIState expandingTextUIStateA2 = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var2);
                                    premiumBusFareDetailsUiStateFactory2.getClass();
                                    TextUIState.ChaloTextUIState chaloTextUIState5 = expandingTextUIStateA2.b;
                                    UITextStyle uITextStyle4 = UITextStyle.BodySmall;
                                    TextUIState.ExpandingTextUIState expandingTextUIState5 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState5, uITextStyle4, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA2.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA2.d, uITextStyle4, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA2.e, false, null);
                                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                                    buttonUIState = buttonUIState4;
                                    str8 = str7;
                                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                                    expandingTextUIState = expandingTextUIState5;
                                    function6 = function7;
                                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState6;
                                    premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                } else {
                                    PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState10 = premiumBusFareDetailsTermsUiState2;
                                    coroutineSingletons5 = coroutineSingletons4;
                                    stringProvider = stringProvider2;
                                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType6;
                                    str8 = str7;
                                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState2;
                                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState2;
                                    expandingTextUIState = null;
                                    premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState10;
                                }
                                str10 = premiumBusFareDetailsComponentDataState5.e;
                                if (StringsKt.F(str10)) {
                                    str10 = null;
                                }
                                if (str10 != null) {
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                                    str11 = str10;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                                    objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                    coroutineSingletons5 = coroutineSingletons5;
                                    if (objB2 == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    str12 = str11;
                                    buttonUIState2 = buttonUIState;
                                    objC = objB2;
                                    expandingTextUIState2 = expandingTextUIState;
                                    premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                                    premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                                    premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                                    premiumBusFareDetailsUiStateFactory3.getClass();
                                    UITextStyle uITextStyle5 = UITextStyle.DisplaySmall;
                                    ChaloColorToken.Black_87 black_88 = ChaloColorToken.Black_87.f9768a;
                                    TextUIState.ExpandingTextUIState expandingTextUIState6 = expandingTextUIState2;
                                    premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle5, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle5, black_88, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                    buttonUIState = buttonUIState2;
                                    premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                                    expandingTextUIState = expandingTextUIState6;
                                } else {
                                    premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                                    premiumBusTotalAmountUiState = null;
                                }
                                premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                                if (premiumBusFareDetailsDataState5.h) {
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                                    objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                    if (objC == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                                    premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                                    premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                                    premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                                    function8 = function6;
                                    str13 = str8;
                                    str8 = str13;
                                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                                    loadingDialogUIState = (LoadingDialogUIState) objC;
                                } else {
                                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                                    function8 = function6;
                                    loadingDialogUIState = null;
                                }
                                if (str8 != null) {
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                                    objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                                    if (objC == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                                } else {
                                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    confirmationDialogUiState = null;
                                }
                                if (premiumBusFareDetailsBottomSheetType7 != null) {
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                                    objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                    if (objC == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                                    premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                                } else {
                                    premiumBusFareDetailsBottomSheetUiState = null;
                                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                                }
                                return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
                            }
                        }
                        return coroutineSingletons4;
                    }
                }
                return coroutineSingletons;
            case 1:
                dividerOrientation = null;
                boolean z20 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$1;
                i = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0;
                z2 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0;
                applicableRuleAppModel = (ApplicableRuleAppModel) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType14 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                String str20 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                String str21 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                passengerSelectionPolicy = (PassengerSelectionPolicy) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState7 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                function2 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                premiumBusFareDetailsSharedContext2 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                premiumBusFareDetailsComponentDataState7 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                premiumBusFareDetailsDataState = premiumBusFareDetailsDataState7;
                str2 = str21;
                str = str20;
                premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsBottomSheetType14;
                coroutineSingletons = coroutineSingletons6;
                premiumBusFareDetailsUiStateFactory = premiumBusFareDetailsUiStateFactory4;
                z = z20;
                premiumBusOffersSectionUiState = (PremiumBusOffersSectionUiState) objC;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState7;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsSharedContext2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = function2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsDataState;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = passengerSelectionPolicy;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = str;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsBottomSheetType;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = applicableRuleAppModel;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusOffersSectionUiState;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$1 = z;
                z3 = z;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 2;
                objG = premiumBusFareDetailsUiStateFactory.g(passengerSelectionPolicy, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                if (objG != coroutineSingletons) {
                    objC = objG;
                    str3 = str;
                    applicableRuleAppModel2 = applicableRuleAppModel;
                    premiumBusOffersSectionUiState2 = premiumBusOffersSectionUiState;
                    Function1 function10 = function2;
                    passengerSelectionPolicy2 = passengerSelectionPolicy;
                    function3 = function10;
                    premiumBusSectionNoteUiState = (PremiumBusSectionNoteUiState) objC;
                    PassengerSelectionPolicy passengerSelectionPolicy5 = passengerSelectionPolicy2;
                    list = premiumBusFareDetailsComponentDataState7.f;
                    boolean zIsEmpty2 = premiumBusFareDetailsSharedContext2.b.isEmpty();
                    if (applicableRuleAppModel2 != null) {
                        z4 = applicableRuleAppModel2.g;
                    } else {
                        z4 = true;
                    }
                    coroutineSingletons2 = coroutineSingletons;
                    if (list.size() == 1) {
                        list2 = list;
                        if (list2 instanceof Collection) {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    it2 = it;
                                    if (((PassengerFareDetailsUiModel) it.next()).j > 1) {
                                        z5 = true;
                                    } else {
                                        it = it2;
                                    }
                                }
                            }
                        } else {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    it2 = it;
                                    if (((PassengerFareDetailsUiModel) it.next()).j > 1) {
                                        z5 = true;
                                    } else {
                                        it = it2;
                                    }
                                }
                            }
                        }
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z4) {
                        z6 = z2;
                        premiumBusSectionNoteUiState2 = premiumBusSectionNoteUiState;
                        premiumBusOffersSectionUiState3 = premiumBusOffersSectionUiState2;
                        premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                        applicableRuleAppModel3 = applicableRuleAppModel2;
                        premiumBusPassengerDetailsSectionUiState = null;
                    } else {
                        z6 = z2;
                        premiumBusSectionNoteUiState2 = premiumBusSectionNoteUiState;
                        premiumBusOffersSectionUiState3 = premiumBusOffersSectionUiState2;
                        premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                        applicableRuleAppModel3 = applicableRuleAppModel2;
                        premiumBusPassengerDetailsSectionUiState = null;
                    }
                    List list8 = premiumBusFareDetailsComponentDataState7.f;
                    String str111 = premiumBusFareDetailsComponentDataState7.e;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsSharedContext2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = function3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsDataState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str3;
                    premiumBusFareDetailsBottomSheetType3 = premiumBusFareDetailsBottomSheetType2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsBottomSheetType3;
                    applicableRuleAppModel4 = applicableRuleAppModel3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = applicableRuleAppModel4;
                    premiumBusOffersSectionUiState4 = premiumBusOffersSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState4;
                    premiumBusSectionNoteUiState3 = premiumBusSectionNoteUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState;
                    z7 = z6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                    i2 = i;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                    str4 = str3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 3;
                    objC = c(str111, list8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    premiumBusPassengerDetailsSectionUiState2 = premiumBusPassengerDetailsSectionUiState;
                    applicableRuleAppModel5 = applicableRuleAppModel4;
                    coroutineSingletons3 = coroutineSingletons2;
                    premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
                    premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType3;
                    premiumBusOffersSectionUiState5 = premiumBusOffersSectionUiState4;
                    premiumBusFareDetailsComponentDataState2 = premiumBusFareDetailsComponentDataState7;
                    premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext2;
                    str5 = str2;
                    str6 = str4;
                    premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objC;
                    if (applicableRuleAppModel5 == null) {
                        premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                    } else {
                        premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                    }
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 4;
                    premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                    function4 = function3;
                    coroutineSingletons4 = coroutineSingletons3;
                    premiumBusFareDetailsUiStateFactory4 = this;
                    objI = premiumBusFareDetailsUiStateFactory4.i(premiumBusFareDetailsSharedContext4, list7, false, function4, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objI != coroutineSingletons4) {
                        objC = objI;
                        premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                        function5 = function4;
                        z10 = z7;
                        premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                        premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                        premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                        premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objC;
                        boolean z111 = z10;
                        String str112 = premiumBusFareDetailsComponentDataState3.e;
                        if (i2 > 0) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState;
                        premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 5;
                        objP = premiumBusFareDetailsUiStateFactory4.p(str112, z11, function5, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                        if (objP != coroutineSingletons4) {
                            premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                            function6 = function5;
                            premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType5;
                            objC = objP;
                            premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState5;
                            str7 = str6;
                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                            premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState4;
                            buttonUIState = (ButtonUIState) objC;
                            if (str5 != null) {
                                CoroutineSingletons coroutineSingletons9 = coroutineSingletons4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str7;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsBottomSheetType6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str5;
                                expandingTextUIStateFactory = ExpandingTextUIStateFactory.f10080a;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = expandingTextUIStateFactory;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsUiStateFactory4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState2;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = premiumBusFareSplitSectionUiState2;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = premiumBusFareDetailsTermsUiState2;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = buttonUIState;
                                premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 6;
                                premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState2;
                                stringProvider = stringProvider2;
                                objB = stringProvider.b(StringEnum.READ_MORE, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                coroutineSingletons5 = coroutineSingletons9;
                                if (objB == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType15 = premiumBusFareDetailsBottomSheetType6;
                                obj = objB;
                                function7 = function6;
                                premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType15;
                                premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                str9 = str5;
                                expandingTextUIStateFactory2 = expandingTextUIStateFactory;
                                premiumBusFareDetailsUiStateFactory2 = premiumBusFareDetailsUiStateFactory4;
                                ButtonUIState buttonUIState5 = buttonUIState;
                                PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState7 = premiumBusPassengerDetailsSectionUiState2;
                                fq0 fq0Var3 = new fq0(function7, 28);
                                expandingTextUIStateFactory2.getClass();
                                TextUIState.ExpandingTextUIState expandingTextUIStateA3 = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var3);
                                premiumBusFareDetailsUiStateFactory2.getClass();
                                TextUIState.ChaloTextUIState chaloTextUIState6 = expandingTextUIStateA3.b;
                                UITextStyle uITextStyle6 = UITextStyle.BodySmall;
                                TextUIState.ExpandingTextUIState expandingTextUIState7 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState6, uITextStyle6, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA3.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA3.d, uITextStyle6, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA3.e, false, null);
                                premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                                buttonUIState = buttonUIState5;
                                str8 = str7;
                                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                                expandingTextUIState = expandingTextUIState7;
                                function6 = function7;
                                premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                                premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState7;
                                premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                            } else {
                                PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState11 = premiumBusFareDetailsTermsUiState2;
                                coroutineSingletons5 = coroutineSingletons4;
                                stringProvider = stringProvider2;
                                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType6;
                                str8 = str7;
                                premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                                premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState2;
                                premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState2;
                                expandingTextUIState = null;
                                premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState11;
                            }
                            str10 = premiumBusFareDetailsComponentDataState5.e;
                            if (StringsKt.F(str10)) {
                                str10 = null;
                            }
                            if (str10 != null) {
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                                str11 = str10;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                                objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                coroutineSingletons5 = coroutineSingletons5;
                                if (objB2 == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                str12 = str11;
                                buttonUIState2 = buttonUIState;
                                objC = objB2;
                                expandingTextUIState2 = expandingTextUIState;
                                premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                                premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                                premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                                premiumBusFareDetailsUiStateFactory3.getClass();
                                UITextStyle uITextStyle7 = UITextStyle.DisplaySmall;
                                ChaloColorToken.Black_87 black_89 = ChaloColorToken.Black_87.f9768a;
                                TextUIState.ExpandingTextUIState expandingTextUIState8 = expandingTextUIState2;
                                premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle7, black_89, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle7, black_89, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                                buttonUIState = buttonUIState2;
                                premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                                expandingTextUIState = expandingTextUIState8;
                            } else {
                                premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                                premiumBusTotalAmountUiState = null;
                            }
                            premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                            if (premiumBusFareDetailsDataState5.h) {
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                                objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                if (objC == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                                premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                                premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                                premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                                function8 = function6;
                                str13 = str8;
                                str8 = str13;
                                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                                premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                                premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                                premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                                premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                                premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                                loadingDialogUIState = (LoadingDialogUIState) objC;
                            } else {
                                premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                                premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                                function8 = function6;
                                loadingDialogUIState = null;
                            }
                            if (str8 != null) {
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                                objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                                if (objC == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                                premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                                loadingDialogUIState2 = loadingDialogUIState;
                                confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                            } else {
                                premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                                premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                                loadingDialogUIState2 = loadingDialogUIState;
                                confirmationDialogUiState = null;
                            }
                            if (premiumBusFareDetailsBottomSheetType7 != null) {
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                                objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                                if (objC == coroutineSingletons5) {
                                    return coroutineSingletons5;
                                }
                                premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                                premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                                premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                                premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                                premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                            } else {
                                premiumBusFareDetailsBottomSheetUiState = null;
                                premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                                premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                            }
                            return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
                        }
                    }
                    return coroutineSingletons4;
                }
                return coroutineSingletons;
            case 2:
                dividerOrientation = null;
                boolean z21 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$1;
                i = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0;
                z2 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0;
                premiumBusOffersSectionUiState2 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9;
                ApplicableRuleAppModel applicableRuleAppModel7 = (ApplicableRuleAppModel) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                premiumBusFareDetailsBottomSheetType = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                String str22 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                str2 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                passengerSelectionPolicy2 = (PassengerSelectionPolicy) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState8 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext6 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                premiumBusFareDetailsComponentDataState7 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                str3 = str22;
                applicableRuleAppModel2 = applicableRuleAppModel7;
                coroutineSingletons = coroutineSingletons6;
                z3 = z21;
                stringProvider2 = stringProvider2;
                premiumBusFareDetailsDataState = premiumBusFareDetailsDataState8;
                premiumBusFareDetailsSharedContext2 = premiumBusFareDetailsSharedContext6;
                premiumBusSectionNoteUiState = (PremiumBusSectionNoteUiState) objC;
                PassengerSelectionPolicy passengerSelectionPolicy6 = passengerSelectionPolicy2;
                list = premiumBusFareDetailsComponentDataState7.f;
                boolean zIsEmpty3 = premiumBusFareDetailsSharedContext2.b.isEmpty();
                if (applicableRuleAppModel2 != null) {
                    z4 = applicableRuleAppModel2.g;
                } else {
                    z4 = true;
                }
                coroutineSingletons2 = coroutineSingletons;
                if (list.size() == 1) {
                    list2 = list;
                    if (list2 instanceof Collection) {
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                it2 = it;
                                if (((PassengerFareDetailsUiModel) it.next()).j > 1) {
                                    z5 = true;
                                } else {
                                    it = it2;
                                }
                            }
                        }
                    } else {
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                it2 = it;
                                if (((PassengerFareDetailsUiModel) it.next()).j > 1) {
                                    z5 = true;
                                } else {
                                    it = it2;
                                }
                            }
                        }
                    }
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4) {
                    z6 = z2;
                    premiumBusSectionNoteUiState2 = premiumBusSectionNoteUiState;
                    premiumBusOffersSectionUiState3 = premiumBusOffersSectionUiState2;
                    premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                    applicableRuleAppModel3 = applicableRuleAppModel2;
                    premiumBusPassengerDetailsSectionUiState = null;
                } else {
                    z6 = z2;
                    premiumBusSectionNoteUiState2 = premiumBusSectionNoteUiState;
                    premiumBusOffersSectionUiState3 = premiumBusOffersSectionUiState2;
                    premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                    applicableRuleAppModel3 = applicableRuleAppModel2;
                    premiumBusPassengerDetailsSectionUiState = null;
                }
                List list9 = premiumBusFareDetailsComponentDataState7.f;
                String str113 = premiumBusFareDetailsComponentDataState7.e;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState7;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsSharedContext2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = function3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsDataState;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str3;
                premiumBusFareDetailsBottomSheetType3 = premiumBusFareDetailsBottomSheetType2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsBottomSheetType3;
                applicableRuleAppModel4 = applicableRuleAppModel3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = applicableRuleAppModel4;
                premiumBusOffersSectionUiState4 = premiumBusOffersSectionUiState3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState4;
                premiumBusSectionNoteUiState3 = premiumBusSectionNoteUiState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState;
                z7 = z6;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                i2 = i;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                str4 = str3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 3;
                objC = c(str113, list9, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                if (objC == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                premiumBusPassengerDetailsSectionUiState2 = premiumBusPassengerDetailsSectionUiState;
                applicableRuleAppModel5 = applicableRuleAppModel4;
                coroutineSingletons3 = coroutineSingletons2;
                premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
                premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType3;
                premiumBusOffersSectionUiState5 = premiumBusOffersSectionUiState4;
                premiumBusFareDetailsComponentDataState2 = premiumBusFareDetailsComponentDataState7;
                premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext2;
                str5 = str2;
                str6 = str4;
                premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objC;
                if (applicableRuleAppModel5 == null) {
                    premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                } else {
                    premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                }
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType4;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 4;
                premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                function4 = function3;
                coroutineSingletons4 = coroutineSingletons3;
                premiumBusFareDetailsUiStateFactory4 = this;
                objI = premiumBusFareDetailsUiStateFactory4.i(premiumBusFareDetailsSharedContext4, list7, false, function4, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                if (objI != coroutineSingletons4) {
                    objC = objI;
                    premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                    function5 = function4;
                    z10 = z7;
                    premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                    premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                    premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                    premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objC;
                    boolean z112 = z10;
                    String str114 = premiumBusFareDetailsComponentDataState3.e;
                    if (i2 > 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState;
                    premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 5;
                    objP = premiumBusFareDetailsUiStateFactory4.p(str114, z11, function5, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objP != coroutineSingletons4) {
                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                        function6 = function5;
                        premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType5;
                        objC = objP;
                        premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState5;
                        str7 = str6;
                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                        premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState4;
                        buttonUIState = (ButtonUIState) objC;
                        if (str5 != null) {
                            CoroutineSingletons coroutineSingletons10 = coroutineSingletons4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsBottomSheetType6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str5;
                            expandingTextUIStateFactory = ExpandingTextUIStateFactory.f10080a;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = expandingTextUIStateFactory;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsUiStateFactory4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = premiumBusFareSplitSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = premiumBusFareDetailsTermsUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = buttonUIState;
                            premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 6;
                            premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState2;
                            stringProvider = stringProvider2;
                            objB = stringProvider.b(StringEnum.READ_MORE, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            coroutineSingletons5 = coroutineSingletons10;
                            if (objB == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType16 = premiumBusFareDetailsBottomSheetType6;
                            obj = objB;
                            function7 = function6;
                            premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType16;
                            premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                            str9 = str5;
                            expandingTextUIStateFactory2 = expandingTextUIStateFactory;
                            premiumBusFareDetailsUiStateFactory2 = premiumBusFareDetailsUiStateFactory4;
                            ButtonUIState buttonUIState6 = buttonUIState;
                            PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState8 = premiumBusPassengerDetailsSectionUiState2;
                            fq0 fq0Var4 = new fq0(function7, 28);
                            expandingTextUIStateFactory2.getClass();
                            TextUIState.ExpandingTextUIState expandingTextUIStateA4 = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var4);
                            premiumBusFareDetailsUiStateFactory2.getClass();
                            TextUIState.ChaloTextUIState chaloTextUIState7 = expandingTextUIStateA4.b;
                            UITextStyle uITextStyle8 = UITextStyle.BodySmall;
                            TextUIState.ExpandingTextUIState expandingTextUIState9 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState7, uITextStyle8, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA4.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA4.d, uITextStyle8, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA4.e, false, null);
                            premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                            buttonUIState = buttonUIState6;
                            str8 = str7;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                            expandingTextUIState = expandingTextUIState9;
                            function6 = function7;
                            premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                            premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState8;
                            premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                        } else {
                            PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState12 = premiumBusFareDetailsTermsUiState2;
                            coroutineSingletons5 = coroutineSingletons4;
                            stringProvider = stringProvider2;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType6;
                            str8 = str7;
                            premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                            premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState2;
                            premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState2;
                            expandingTextUIState = null;
                            premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState12;
                        }
                        str10 = premiumBusFareDetailsComponentDataState5.e;
                        if (StringsKt.F(str10)) {
                            str10 = null;
                        }
                        if (str10 != null) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                            str11 = str10;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                            objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            coroutineSingletons5 = coroutineSingletons5;
                            if (objB2 == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            str12 = str11;
                            buttonUIState2 = buttonUIState;
                            objC = objB2;
                            expandingTextUIState2 = expandingTextUIState;
                            premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                            premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                            premiumBusFareDetailsUiStateFactory3.getClass();
                            UITextStyle uITextStyle9 = UITextStyle.DisplaySmall;
                            ChaloColorToken.Black_87 black_810 = ChaloColorToken.Black_87.f9768a;
                            TextUIState.ExpandingTextUIState expandingTextUIState10 = expandingTextUIState2;
                            premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle9, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle9, black_810, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            buttonUIState = buttonUIState2;
                            premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                            expandingTextUIState = expandingTextUIState10;
                        } else {
                            premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                            premiumBusTotalAmountUiState = null;
                        }
                        premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                        if (premiumBusFareDetailsDataState5.h) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                            objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            if (objC == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                            premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                            function8 = function6;
                            str13 = str8;
                            str8 = str13;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                            premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                            premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                            premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                            premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                            premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                            loadingDialogUIState = (LoadingDialogUIState) objC;
                        } else {
                            premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                            premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                            function8 = function6;
                            loadingDialogUIState = null;
                        }
                        if (str8 != null) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                            objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                            if (objC == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                            premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                            loadingDialogUIState2 = loadingDialogUIState;
                            confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                        } else {
                            premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                            premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                            loadingDialogUIState2 = loadingDialogUIState;
                            confirmationDialogUiState = null;
                        }
                        if (premiumBusFareDetailsBottomSheetType7 != null) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                            objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            if (objC == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                            premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                            premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                            premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                        } else {
                            premiumBusFareDetailsBottomSheetUiState = null;
                            premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                            premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                        }
                        return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
                    }
                }
                return coroutineSingletons4;
            case 3:
                int i8 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0;
                boolean z22 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0;
                PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState9 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10;
                PremiumBusSectionNoteUiState premiumBusSectionNoteUiState8 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9;
                premiumBusOffersSectionUiState5 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                ApplicableRuleAppModel applicableRuleAppModel8 = (ApplicableRuleAppModel) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType17 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                str6 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                String str23 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState9 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                Function1 function11 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext7 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState8 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                z7 = z22;
                applicableRuleAppModel5 = applicableRuleAppModel8;
                coroutineSingletons3 = coroutineSingletons6;
                stringProvider2 = stringProvider2;
                premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType17;
                premiumBusFareDetailsComponentDataState2 = premiumBusFareDetailsComponentDataState8;
                function3 = function11;
                premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext7;
                premiumBusSectionNoteUiState3 = premiumBusSectionNoteUiState8;
                premiumBusPassengerDetailsSectionUiState2 = premiumBusPassengerDetailsSectionUiState9;
                premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState9;
                str5 = str23;
                i2 = i8;
                premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objC;
                if (applicableRuleAppModel5 == null) {
                    premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                } else {
                    premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                }
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType4;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0 = z7;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0 = i2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 4;
                premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                function4 = function3;
                coroutineSingletons4 = coroutineSingletons3;
                premiumBusFareDetailsUiStateFactory4 = this;
                objI = premiumBusFareDetailsUiStateFactory4.i(premiumBusFareDetailsSharedContext4, list7, false, function4, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                if (objI != coroutineSingletons4) {
                    objC = objI;
                    premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                    function5 = function4;
                    z10 = z7;
                    premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                    premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                    premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                    premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objC;
                    boolean z113 = z10;
                    String str115 = premiumBusFareDetailsComponentDataState3.e;
                    if (i2 > 0) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState;
                    premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 5;
                    objP = premiumBusFareDetailsUiStateFactory4.p(str115, z11, function5, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objP != coroutineSingletons4) {
                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                        function6 = function5;
                        premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType5;
                        objC = objP;
                        premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState5;
                        str7 = str6;
                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                        premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState4;
                        buttonUIState = (ButtonUIState) objC;
                        if (str5 != null) {
                            CoroutineSingletons coroutineSingletons11 = coroutineSingletons4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsBottomSheetType6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str5;
                            expandingTextUIStateFactory = ExpandingTextUIStateFactory.f10080a;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = expandingTextUIStateFactory;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsUiStateFactory4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = premiumBusFareSplitSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = premiumBusFareDetailsTermsUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = buttonUIState;
                            premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 6;
                            premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState2;
                            stringProvider = stringProvider2;
                            objB = stringProvider.b(StringEnum.READ_MORE, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            coroutineSingletons5 = coroutineSingletons11;
                            if (objB == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType18 = premiumBusFareDetailsBottomSheetType6;
                            obj = objB;
                            function7 = function6;
                            premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType18;
                            premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                            str9 = str5;
                            expandingTextUIStateFactory2 = expandingTextUIStateFactory;
                            premiumBusFareDetailsUiStateFactory2 = premiumBusFareDetailsUiStateFactory4;
                            ButtonUIState buttonUIState7 = buttonUIState;
                            PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState10 = premiumBusPassengerDetailsSectionUiState2;
                            fq0 fq0Var5 = new fq0(function7, 28);
                            expandingTextUIStateFactory2.getClass();
                            TextUIState.ExpandingTextUIState expandingTextUIStateA5 = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var5);
                            premiumBusFareDetailsUiStateFactory2.getClass();
                            TextUIState.ChaloTextUIState chaloTextUIState8 = expandingTextUIStateA5.b;
                            UITextStyle uITextStyle10 = UITextStyle.BodySmall;
                            TextUIState.ExpandingTextUIState expandingTextUIState11 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState8, uITextStyle10, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA5.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA5.d, uITextStyle10, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA5.e, false, null);
                            premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                            buttonUIState = buttonUIState7;
                            str8 = str7;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                            expandingTextUIState = expandingTextUIState11;
                            function6 = function7;
                            premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                            premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState10;
                            premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                        } else {
                            PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState13 = premiumBusFareDetailsTermsUiState2;
                            coroutineSingletons5 = coroutineSingletons4;
                            stringProvider = stringProvider2;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType6;
                            str8 = str7;
                            premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                            premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState2;
                            premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState2;
                            expandingTextUIState = null;
                            premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState13;
                        }
                        str10 = premiumBusFareDetailsComponentDataState5.e;
                        if (StringsKt.F(str10)) {
                            str10 = null;
                        }
                        if (str10 != null) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                            str11 = str10;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                            objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            coroutineSingletons5 = coroutineSingletons5;
                            if (objB2 == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            str12 = str11;
                            buttonUIState2 = buttonUIState;
                            objC = objB2;
                            expandingTextUIState2 = expandingTextUIState;
                            premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                            premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                            premiumBusFareDetailsUiStateFactory3.getClass();
                            UITextStyle uITextStyle11 = UITextStyle.DisplaySmall;
                            ChaloColorToken.Black_87 black_811 = ChaloColorToken.Black_87.f9768a;
                            TextUIState.ExpandingTextUIState expandingTextUIState12 = expandingTextUIState2;
                            premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle11, black_811, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle11, black_811, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            buttonUIState = buttonUIState2;
                            premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                            expandingTextUIState = expandingTextUIState12;
                        } else {
                            premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                            premiumBusTotalAmountUiState = null;
                        }
                        premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                        if (premiumBusFareDetailsDataState5.h) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                            objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            if (objC == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                            premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                            function8 = function6;
                            str13 = str8;
                            str8 = str13;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                            premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                            premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                            premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                            premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                            premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                            loadingDialogUIState = (LoadingDialogUIState) objC;
                        } else {
                            premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                            premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                            function8 = function6;
                            loadingDialogUIState = null;
                        }
                        if (str8 != null) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                            objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                            if (objC == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                            premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                            loadingDialogUIState2 = loadingDialogUIState;
                            confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                        } else {
                            premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                            premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                            loadingDialogUIState2 = loadingDialogUIState;
                            confirmationDialogUiState = null;
                        }
                        if (premiumBusFareDetailsBottomSheetType7 != null) {
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                            premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                            objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                            if (objC == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                            premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                            premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                            premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                            premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                            premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                        } else {
                            premiumBusFareDetailsBottomSheetUiState = null;
                            premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                            premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                        }
                        return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
                    }
                }
                return coroutineSingletons4;
            case 4:
                int i9 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.I$0;
                z10 = premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.Z$0;
                premiumBusFareSplitSectionUiState2 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9;
                premiumBusPassengerDetailsSectionUiState2 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                premiumBusSectionNoteUiState3 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                premiumBusOffersSectionUiState5 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                premiumBusFareDetailsBottomSheetType5 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                String str24 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                String str25 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState10 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                Function1 function12 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                premiumBusFareDetailsComponentDataState3 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                stringProvider2 = stringProvider2;
                premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState10;
                str5 = str25;
                str6 = str24;
                coroutineSingletons4 = coroutineSingletons6;
                function5 = function12;
                i2 = i9;
                premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objC;
                boolean z114 = z10;
                String str116 = premiumBusFareDetailsComponentDataState3.e;
                if (i2 > 0) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState4;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str6;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsBottomSheetType5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState5;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState2;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState;
                premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 5;
                objP = premiumBusFareDetailsUiStateFactory4.p(str116, z11, function5, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                if (objP != coroutineSingletons4) {
                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                    function6 = function5;
                    premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType5;
                    objC = objP;
                    premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState5;
                    str7 = str6;
                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                    premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState4;
                    buttonUIState = (ButtonUIState) objC;
                    if (str5 != null) {
                        CoroutineSingletons coroutineSingletons12 = coroutineSingletons4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str7;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsBottomSheetType6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str5;
                        expandingTextUIStateFactory = ExpandingTextUIStateFactory.f10080a;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = expandingTextUIStateFactory;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsUiStateFactory4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = premiumBusFareSplitSectionUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = premiumBusFareDetailsTermsUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = buttonUIState;
                        premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 6;
                        premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState2;
                        stringProvider = stringProvider2;
                        objB = stringProvider.b(StringEnum.READ_MORE, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                        coroutineSingletons5 = coroutineSingletons12;
                        if (objB == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType19 = premiumBusFareDetailsBottomSheetType6;
                        obj = objB;
                        function7 = function6;
                        premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType19;
                        premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                        str9 = str5;
                        expandingTextUIStateFactory2 = expandingTextUIStateFactory;
                        premiumBusFareDetailsUiStateFactory2 = premiumBusFareDetailsUiStateFactory4;
                        ButtonUIState buttonUIState8 = buttonUIState;
                        PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState11 = premiumBusPassengerDetailsSectionUiState2;
                        fq0 fq0Var6 = new fq0(function7, 28);
                        expandingTextUIStateFactory2.getClass();
                        TextUIState.ExpandingTextUIState expandingTextUIStateA6 = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var6);
                        premiumBusFareDetailsUiStateFactory2.getClass();
                        TextUIState.ChaloTextUIState chaloTextUIState9 = expandingTextUIStateA6.b;
                        UITextStyle uITextStyle12 = UITextStyle.BodySmall;
                        TextUIState.ExpandingTextUIState expandingTextUIState13 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState9, uITextStyle12, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA6.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA6.d, uITextStyle12, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA6.e, false, null);
                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                        buttonUIState = buttonUIState8;
                        str8 = str7;
                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                        expandingTextUIState = expandingTextUIState13;
                        function6 = function7;
                        premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                        premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState11;
                        premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                    } else {
                        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState14 = premiumBusFareDetailsTermsUiState2;
                        coroutineSingletons5 = coroutineSingletons4;
                        stringProvider = stringProvider2;
                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType6;
                        str8 = str7;
                        premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                        premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState2;
                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState2;
                        expandingTextUIState = null;
                        premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState14;
                    }
                    str10 = premiumBusFareDetailsComponentDataState5.e;
                    if (StringsKt.F(str10)) {
                        str10 = null;
                    }
                    if (str10 != null) {
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                        str11 = str10;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                        objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                        coroutineSingletons5 = coroutineSingletons5;
                        if (objB2 == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        str12 = str11;
                        buttonUIState2 = buttonUIState;
                        objC = objB2;
                        expandingTextUIState2 = expandingTextUIState;
                        premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                        premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                        premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                        premiumBusFareDetailsUiStateFactory3.getClass();
                        UITextStyle uITextStyle13 = UITextStyle.DisplaySmall;
                        ChaloColorToken.Black_87 black_812 = ChaloColorToken.Black_87.f9768a;
                        TextUIState.ExpandingTextUIState expandingTextUIState14 = expandingTextUIState2;
                        premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle13, black_812, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle13, black_812, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        buttonUIState = buttonUIState2;
                        premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                        expandingTextUIState = expandingTextUIState14;
                    } else {
                        premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                        premiumBusTotalAmountUiState = null;
                    }
                    premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                    if (premiumBusFareDetailsDataState5.h) {
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                        objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                        if (objC == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                        premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                        premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                        premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                        function8 = function6;
                        str13 = str8;
                        str8 = str13;
                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                        premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                        premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                        premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                        premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                        loadingDialogUIState = (LoadingDialogUIState) objC;
                    } else {
                        premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                        premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                        function8 = function6;
                        loadingDialogUIState = null;
                    }
                    if (str8 != null) {
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                        objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                        if (objC == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                        premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                        loadingDialogUIState2 = loadingDialogUIState;
                        confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                    } else {
                        premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                        premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                        loadingDialogUIState2 = loadingDialogUIState;
                        confirmationDialogUiState = null;
                    }
                    if (premiumBusFareDetailsBottomSheetType7 != null) {
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                        premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                        objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                        if (objC == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                        premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                        premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                        premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                        premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                        premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                    } else {
                        premiumBusFareDetailsBottomSheetUiState = null;
                        premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                        premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                    }
                    return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
                }
                return coroutineSingletons4;
            case 5:
                PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState15 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10;
                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState6 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9;
                PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState12 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                PremiumBusSectionNoteUiState premiumBusSectionNoteUiState9 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                PremiumBusOffersSectionUiState premiumBusOffersSectionUiState9 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType20 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                String str26 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                String str27 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                premiumBusFareDetailsDataState5 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                function6 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState9 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState15;
                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState9;
                str5 = str27;
                coroutineSingletons4 = coroutineSingletons6;
                premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType20;
                str7 = str26;
                premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState9;
                premiumBusSectionNoteUiState3 = premiumBusSectionNoteUiState9;
                premiumBusPassengerDetailsSectionUiState2 = premiumBusPassengerDetailsSectionUiState12;
                premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState6;
                stringProvider2 = stringProvider2;
                buttonUIState = (ButtonUIState) objC;
                if (str5 != null) {
                    CoroutineSingletons coroutineSingletons13 = coroutineSingletons4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusFareDetailsComponentDataState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = function6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsDataState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = str7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsBottomSheetType6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = str5;
                    expandingTextUIStateFactory = ExpandingTextUIStateFactory.f10080a;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = expandingTextUIStateFactory;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsUiStateFactory4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusSectionNoteUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusPassengerDetailsSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = premiumBusFareSplitSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = premiumBusFareDetailsTermsUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = buttonUIState;
                    premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 6;
                    premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState2;
                    stringProvider = stringProvider2;
                    objB = stringProvider.b(StringEnum.READ_MORE, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    coroutineSingletons5 = coroutineSingletons13;
                    if (objB == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType110 = premiumBusFareDetailsBottomSheetType6;
                    obj = objB;
                    function7 = function6;
                    premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType110;
                    premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                    str9 = str5;
                    expandingTextUIStateFactory2 = expandingTextUIStateFactory;
                    premiumBusFareDetailsUiStateFactory2 = premiumBusFareDetailsUiStateFactory4;
                    ButtonUIState buttonUIState9 = buttonUIState;
                    PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState13 = premiumBusPassengerDetailsSectionUiState2;
                    fq0 fq0Var7 = new fq0(function7, 28);
                    expandingTextUIStateFactory2.getClass();
                    TextUIState.ExpandingTextUIState expandingTextUIStateA7 = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var7);
                    premiumBusFareDetailsUiStateFactory2.getClass();
                    TextUIState.ChaloTextUIState chaloTextUIState10 = expandingTextUIStateA7.b;
                    UITextStyle uITextStyle14 = UITextStyle.BodySmall;
                    TextUIState.ExpandingTextUIState expandingTextUIState15 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState10, uITextStyle14, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA7.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA7.d, uITextStyle14, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA7.e, false, null);
                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                    buttonUIState = buttonUIState9;
                    str8 = str7;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                    expandingTextUIState = expandingTextUIState15;
                    function6 = function7;
                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState13;
                    premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                } else {
                    PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState16 = premiumBusFareDetailsTermsUiState2;
                    coroutineSingletons5 = coroutineSingletons4;
                    stringProvider = stringProvider2;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType6;
                    str8 = str7;
                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState2;
                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState2;
                    expandingTextUIState = null;
                    premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState16;
                }
                str10 = premiumBusFareDetailsComponentDataState5.e;
                if (StringsKt.F(str10)) {
                    str10 = null;
                }
                if (str10 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                    str11 = str10;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                    objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    coroutineSingletons5 = coroutineSingletons5;
                    if (objB2 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    str12 = str11;
                    buttonUIState2 = buttonUIState;
                    objC = objB2;
                    expandingTextUIState2 = expandingTextUIState;
                    premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                    premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                    premiumBusFareDetailsUiStateFactory3.getClass();
                    UITextStyle uITextStyle15 = UITextStyle.DisplaySmall;
                    ChaloColorToken.Black_87 black_813 = ChaloColorToken.Black_87.f9768a;
                    TextUIState.ExpandingTextUIState expandingTextUIState16 = expandingTextUIState2;
                    premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle15, black_813, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle15, black_813, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    buttonUIState = buttonUIState2;
                    premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                    expandingTextUIState = expandingTextUIState16;
                } else {
                    premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                    premiumBusTotalAmountUiState = null;
                }
                premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                if (premiumBusFareDetailsDataState5.h) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                    objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                    premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                    function8 = function6;
                    str13 = str8;
                    str8 = str13;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                    loadingDialogUIState = (LoadingDialogUIState) objC;
                } else {
                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                    function8 = function6;
                    loadingDialogUIState = null;
                }
                if (str8 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                    objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                } else {
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = null;
                }
                if (premiumBusFareDetailsBottomSheetType7 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                    objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                } else {
                    premiumBusFareDetailsBottomSheetUiState = null;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                }
                return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
            case 6:
                ButtonUIState buttonUIState10 = (ButtonUIState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13;
                PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState17 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12;
                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState7 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11;
                premiumBusPassengerDetailsSectionUiState2 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10;
                premiumBusSectionNoteUiState3 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9;
                premiumBusOffersSectionUiState6 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                premiumBusFareDetailsUiStateFactory2 = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                ExpandingTextUIStateFactory expandingTextUIStateFactory3 = (ExpandingTextUIStateFactory) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                String str28 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType21 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                str7 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState11 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                Function1 function13 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState10 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState10;
                premiumBusFareDetailsTermsUiState4 = premiumBusFareDetailsTermsUiState17;
                stringProvider = stringProvider2;
                function7 = function13;
                coroutineSingletons5 = coroutineSingletons6;
                obj = objC;
                buttonUIState = buttonUIState10;
                premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState7;
                str9 = str28;
                expandingTextUIStateFactory2 = expandingTextUIStateFactory3;
                premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType21;
                premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState11;
                ButtonUIState buttonUIState11 = buttonUIState;
                PremiumBusPassengerDetailsSectionUiState premiumBusPassengerDetailsSectionUiState14 = premiumBusPassengerDetailsSectionUiState2;
                fq0 fq0Var8 = new fq0(function7, 28);
                expandingTextUIStateFactory2.getClass();
                TextUIState.ExpandingTextUIState expandingTextUIStateA8 = ExpandingTextUIStateFactory.a(str9, (String) obj, 3, fq0Var8);
                premiumBusFareDetailsUiStateFactory2.getClass();
                TextUIState.ChaloTextUIState chaloTextUIState11 = expandingTextUIStateA8.b;
                UITextStyle uITextStyle16 = UITextStyle.BodySmall;
                TextUIState.ExpandingTextUIState expandingTextUIState17 = new TextUIState.ExpandingTextUIState(TextUIState.ChaloTextUIState.a(chaloTextUIState11, uITextStyle16, ChaloColorToken.Black_60.f9766a, null, 8185), expandingTextUIStateA8.c, TextUIState.ChaloTextUIState.a(expandingTextUIStateA8.d, uITextStyle16, ChaloColorToken.Orange2.f9830a, null, 8185), expandingTextUIStateA8.e, false, null);
                premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState4;
                buttonUIState = buttonUIState11;
                str8 = str7;
                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType8;
                expandingTextUIState = expandingTextUIState17;
                function6 = function7;
                premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState3;
                premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState14;
                premiumBusFareDetailsTermsUiState3 = premiumBusFareDetailsTermsUiState4;
                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                str10 = premiumBusFareDetailsComponentDataState5.e;
                if (StringsKt.F(str10)) {
                    str10 = null;
                }
                if (str10 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsDataState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = str8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = str10;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsUiStateFactory4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = premiumBusFareDetailsTermsUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = buttonUIState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = expandingTextUIState;
                    str11 = str10;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 7;
                    objB2 = stringProvider.b(StringEnum.TOTAL_AMOUNT, new Object[0], premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    coroutineSingletons5 = coroutineSingletons5;
                    if (objB2 == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    str12 = str11;
                    buttonUIState2 = buttonUIState;
                    objC = objB2;
                    expandingTextUIState2 = expandingTextUIState;
                    premiumBusFareDetailsTermsUiState6 = premiumBusFareDetailsTermsUiState3;
                    premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory3 = premiumBusFareDetailsUiStateFactory4;
                    premiumBusFareDetailsUiStateFactory3.getClass();
                    UITextStyle uITextStyle17 = UITextStyle.DisplaySmall;
                    ChaloColorToken.Black_87 black_814 = ChaloColorToken.Black_87.f9768a;
                    TextUIState.ExpandingTextUIState expandingTextUIState18 = expandingTextUIState2;
                    premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle17, black_814, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle17, black_814, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    buttonUIState = buttonUIState2;
                    premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                    expandingTextUIState = expandingTextUIState18;
                } else {
                    premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState3;
                    premiumBusTotalAmountUiState = null;
                }
                premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                if (premiumBusFareDetailsDataState5.h) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                    objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                    premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                    function8 = function6;
                    str13 = str8;
                    str8 = str13;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                    loadingDialogUIState = (LoadingDialogUIState) objC;
                } else {
                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                    function8 = function6;
                    loadingDialogUIState = null;
                }
                if (str8 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                    objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                } else {
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = null;
                }
                if (premiumBusFareDetailsBottomSheetType7 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                    objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                } else {
                    premiumBusFareDetailsBottomSheetUiState = null;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                }
                return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
            case 7:
                TextUIState.ExpandingTextUIState expandingTextUIState19 = (TextUIState.ExpandingTextUIState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12;
                buttonUIState2 = (ButtonUIState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11;
                premiumBusFareDetailsTermsUiState6 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10;
                premiumBusFareSplitSectionUiState3 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9;
                premiumBusPassengerDetailsSectionUiState3 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                PremiumBusSectionNoteUiState premiumBusSectionNoteUiState10 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                PremiumBusOffersSectionUiState premiumBusOffersSectionUiState10 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                premiumBusFareDetailsUiStateFactory3 = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                String str29 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType22 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                str8 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState12 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                Function1 function14 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                str12 = str29;
                premiumBusFareDetailsDataState5 = premiumBusFareDetailsDataState12;
                premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState10;
                premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState10;
                coroutineSingletons5 = coroutineSingletons6;
                premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType22;
                function6 = function14;
                expandingTextUIState2 = expandingTextUIState19;
                premiumBusFareDetailsUiStateFactory3.getClass();
                UITextStyle uITextStyle18 = UITextStyle.DisplaySmall;
                ChaloColorToken.Black_87 black_815 = ChaloColorToken.Black_87.f9768a;
                TextUIState.ExpandingTextUIState expandingTextUIState110 = expandingTextUIState2;
                premiumBusTotalAmountUiState = new PremiumBusTotalAmountUiState(new TextUIState.ChaloTextUIState((String) objC, uITextStyle18, black_815, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str12, uITextStyle18, black_815, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                buttonUIState = buttonUIState2;
                premiumBusFareDetailsTermsUiState5 = premiumBusFareDetailsTermsUiState6;
                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType9;
                expandingTextUIState = expandingTextUIState110;
                premiumBusFareDetailsFooterUiState = new PremiumBusFareDetailsFooterUiState(buttonUIState, expandingTextUIState, premiumBusTotalAmountUiState);
                if (premiumBusFareDetailsDataState5.h) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = str8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = premiumBusFareDetailsFooterUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 8;
                    objC = premiumBusFareDetailsUiStateFactory4.m(premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusFareDetailsFooterUiState3 = premiumBusFareDetailsFooterUiState;
                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState3;
                    premiumBusPassengerDetailsSectionUiState4 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusSectionNoteUiState5 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsBottomSheetType10 = premiumBusFareDetailsBottomSheetType7;
                    function8 = function6;
                    str13 = str8;
                    str8 = str13;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                    premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                    premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                    loadingDialogUIState = (LoadingDialogUIState) objC;
                } else {
                    premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                    premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState;
                    function8 = function6;
                    loadingDialogUIState = null;
                }
                if (str8 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                    objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                } else {
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = null;
                }
                if (premiumBusFareDetailsBottomSheetType7 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                    objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                } else {
                    premiumBusFareDetailsBottomSheetUiState = null;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                }
                return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
            case 8:
                premiumBusFareDetailsFooterUiState3 = (PremiumBusFareDetailsFooterUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                premiumBusFareDetailsTermsUiState5 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                premiumBusFareSplitSectionUiState5 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                premiumBusPassengerDetailsSectionUiState4 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                premiumBusSectionNoteUiState5 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                PremiumBusOffersSectionUiState premiumBusOffersSectionUiState11 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                premiumBusFareDetailsBottomSheetType10 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                str13 = (String) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                function8 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState11;
                coroutineSingletons5 = coroutineSingletons6;
                str8 = str13;
                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType10;
                premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState5;
                premiumBusPassengerDetailsSectionUiState3 = premiumBusPassengerDetailsSectionUiState4;
                premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState5;
                premiumBusFareDetailsTermsUiState7 = premiumBusFareDetailsTermsUiState5;
                premiumBusFareDetailsFooterUiState2 = premiumBusFareDetailsFooterUiState3;
                loadingDialogUIState = (LoadingDialogUIState) objC;
                if (str8 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = function8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusFareDetailsBottomSheetType7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = premiumBusFareDetailsFooterUiState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 9;
                    objC = premiumBusFareDetailsUiStateFactory4.v(str8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1, function8);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                } else {
                    premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                    premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    confirmationDialogUiState = null;
                }
                if (premiumBusFareDetailsBottomSheetType7 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                    objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                } else {
                    premiumBusFareDetailsBottomSheetUiState = null;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                }
                return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
            case 9:
                loadingDialogUIState = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8;
                premiumBusFareDetailsFooterUiState2 = (PremiumBusFareDetailsFooterUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                premiumBusFareDetailsTermsUiState7 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                premiumBusFareSplitSectionUiState3 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                premiumBusPassengerDetailsSectionUiState3 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                PremiumBusSectionNoteUiState premiumBusSectionNoteUiState11 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                PremiumBusOffersSectionUiState premiumBusOffersSectionUiState12 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                premiumBusFareDetailsBottomSheetType7 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                function8 = (Function1) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                premiumBusOffersSectionUiState6 = premiumBusOffersSectionUiState12;
                premiumBusSectionNoteUiState4 = premiumBusSectionNoteUiState11;
                coroutineSingletons5 = coroutineSingletons6;
                premiumBusFareDetailsTermsUiState8 = premiumBusFareDetailsTermsUiState7;
                premiumBusFareDetailsFooterUiState4 = premiumBusFareDetailsFooterUiState2;
                loadingDialogUIState2 = loadingDialogUIState;
                confirmationDialogUiState = (ConfirmationDialogUiState) objC;
                if (premiumBusFareDetailsBottomSheetType7 != null) {
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1 = premiumBusSectionNoteUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2 = premiumBusPassengerDetailsSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3 = premiumBusFareSplitSectionUiState3;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4 = premiumBusFareDetailsTermsUiState8;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5 = premiumBusFareDetailsFooterUiState4;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7 = confirmationDialogUiState;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$8 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$9 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$10 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$11 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$12 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$13 = null;
                    premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.label = 10;
                    objC = premiumBusFareDetailsUiStateFactory4.A(premiumBusFareDetailsBottomSheetType7, function8, premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1);
                    if (objC == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                    premiumBusSectionNoteUiState7 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState8 = premiumBusOffersSectionUiState6;
                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                } else {
                    premiumBusFareDetailsBottomSheetUiState = null;
                    premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState4;
                    premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState6;
                }
                return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
            case 10:
                confirmationDialogUiState = (ConfirmationDialogUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$7;
                loadingDialogUIState2 = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$6;
                premiumBusFareDetailsFooterUiState4 = (PremiumBusFareDetailsFooterUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$5;
                premiumBusFareDetailsTermsUiState8 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$4;
                premiumBusFareSplitSectionUiState3 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$3;
                premiumBusPassengerDetailsSectionUiState3 = (PremiumBusPassengerDetailsSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$2;
                premiumBusSectionNoteUiState7 = (PremiumBusSectionNoteUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$1;
                premiumBusOffersSectionUiState8 = (PremiumBusOffersSectionUiState) premiumBusFareDetailsUiStateFactory$toFreshPurchaseContent$1.L$0;
                ResultKt.b(objC);
                premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objC;
                premiumBusOffersSectionUiState7 = premiumBusOffersSectionUiState8;
                premiumBusSectionNoteUiState6 = premiumBusSectionNoteUiState7;
                return new PremiumBusFareDetailsContent.FreshPurchase(premiumBusOffersSectionUiState7, premiumBusSectionNoteUiState6, premiumBusPassengerDetailsSectionUiState3, premiumBusFareSplitSectionUiState3, premiumBusFareDetailsTermsUiState8, premiumBusFareDetailsFooterUiState4, loadingDialogUIState2, confirmationDialogUiState, premiumBusFareDetailsBottomSheetUiState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0213  */
    /* JADX WARN: Code duplicated, block: B:39:0x0216  */
    /* JADX WARN: Code duplicated, block: B:40:0x0246  */
    /* JADX WARN: Code duplicated, block: B:43:0x024b  */
    /* JADX WARN: Code duplicated, block: B:44:0x025d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0260  */
    /* JADX WARN: Code duplicated, block: B:48:0x0269  */
    /* JADX WARN: Code duplicated, block: B:51:0x028a  */
    /* JADX WARN: Code duplicated, block: B:55:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x0306  */
    /* JADX WARN: Code duplicated, block: B:64:0x032d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object u(PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$toOfferCardUiState$1 premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1;
        PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState;
        Function1 function2;
        ImageUIState imageUIState;
        Object obj;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        String str;
        UIFontWeight uIFontWeight;
        UITextStyle uITextStyle;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        String str2;
        ImageUrlUIState imageUrlUIState;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel2;
        boolean z2;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory2;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        String str3;
        PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState2;
        PassUpsellOfferCardUISpecs passUpsellOfferCardUISpecs;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel3;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        Function1 function4;
        PassUpsellOfferCardUISpecs passUpsellOfferCardUISpecs2;
        ButtonUIStateFactory buttonUIStateFactory2;
        Object objO;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        ImageUrlUIState imageUrlUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState3;
        PassUpsellOfferCardUISpecs passUpsellOfferCardUISpecs3;
        ButtonUIState buttonUIStateF;
        PassUpsellOfferCardUISpecs passUpsellOfferCardUISpecs4;
        TextUIState.ChaloTextUIState chaloTextUIState14;
        PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState4;
        ImageUrlUIState imageUrlUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState15;
        TextUIState.ChaloTextUIState chaloTextUIState16;
        TextUIState.ChaloTextUIState chaloTextUIState17;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel4 = premiumBusPassUpsellAppModel;
        boolean z3 = z;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$toOfferCardUiState$1) {
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1 = (PremiumBusFareDetailsUiStateFactory$toOfferCardUiState$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1 = new PremiumBusFareDetailsUiStateFactory$toOfferCardUiState$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1 = new PremiumBusFareDetailsUiStateFactory$toOfferCardUiState$1(this, continuationImpl);
        }
        Object objB2 = premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label;
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        StringProvider stringProvider = this.f7555a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            if (z3) {
                ImageUIState imageUIState2 = new ImageUIState(IconType.IC_CHECK_CIRCLE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function1;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = imageUIState2;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = this;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.Z$0 = z3;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 1;
                Object objB3 = stringProvider.b(StringEnum.PB_UPGRADED_TO_RIDE_PACK, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                if (objB3 != coroutineSingletons) {
                    function2 = function1;
                    imageUIState = imageUIState2;
                    obj = objB3;
                    premiumBusFareDetailsUiStateFactory = this;
                }
            } else {
                ImageUIState imageUIState3 = new ImageUIState(IconType.IC_AWESOME, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                String str4 = premiumBusPassUpsellAppModel4.h;
                if (str4 == null) {
                    str4 = "";
                }
                premiumBusOfferHeaderStripUiState = new PremiumBusOfferHeaderStripUiState(imageUIState3, new TextUIState.ChaloTextUIState(str4, UITextStyle.BodySmall, ChaloColorToken.Orange3.f9831a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), CollectionsKt.S(ChaloColorToken.LightOrange.f9816a, white));
                function2 = function1;
                String str5 = premiumBusPassUpsellAppModel4.d;
                str = premiumBusPassUpsellAppModel4.g;
                UITextStyle uITextStyle2 = UITextStyle.HeadlineSmall;
                uIFontWeight = UIFontWeight.Bold;
                uITextStyle = uITextStyle2;
                chaloTextUIState = new TextUIState.ChaloTextUIState(str5, uITextStyle, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                if (AnyExtsKt.a(str) || (str3 = premiumBusPassUpsellAppModel4.f) == null) {
                    chaloTextUIState2 = null;
                } else {
                    chaloTextUIState2 = new TextUIState.ChaloTextUIState(StringsKt.h0(str3, "/"), uITextStyle, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, UITextDecoration.LineThrough, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7672);
                }
                if (str != null) {
                    uITextStyle = uITextStyle;
                    chaloTextUIState3 = new TextUIState.ChaloTextUIState(vo1.n(StringsKt.h0(str, "/"), " ", StringsKt.e0(str, "/", str)), uITextStyle, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                } else {
                    uITextStyle = uITextStyle;
                    chaloTextUIState3 = null;
                }
                str2 = premiumBusPassUpsellAppModel4.i;
                if (str2 != null) {
                    imageUrlUIState = new ImageUrlUIState(str2, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    imageUrlUIState = null;
                }
                if (z3) {
                    TextUIState.ChaloTextUIState chaloTextUIState18 = chaloTextUIState3;
                    function3 = function2;
                    chaloTextUIState5 = chaloTextUIState18;
                    TextUIState.ChaloTextUIState chaloTextUIState19 = chaloTextUIState2;
                    chaloTextUIState6 = chaloTextUIState;
                    chaloTextUIState7 = chaloTextUIState19;
                    chaloTextUIState8 = null;
                    premiumBusOfferHeaderStripUiState2 = premiumBusOfferHeaderStripUiState;
                    passUpsellOfferCardUISpecs = new PassUpsellOfferCardUISpecs(z3);
                    if (z3) {
                        StringEnum stringEnum = StringEnum.REMOVE;
                        yt0 yt0Var = new yt0(function3, 5);
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusOfferHeaderStripUiState2;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = chaloTextUIState6;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = chaloTextUIState7;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState5;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = imageUrlUIState;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState8;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = passUpsellOfferCardUISpecs;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = null;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 3;
                        objO = o(stringEnum, true, yt0Var, premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                        if (objO != coroutineSingletons) {
                            chaloTextUIState10 = chaloTextUIState8;
                            imageUrlUIState2 = imageUrlUIState;
                            chaloTextUIState11 = chaloTextUIState5;
                            chaloTextUIState12 = chaloTextUIState7;
                            chaloTextUIState13 = chaloTextUIState6;
                            premiumBusOfferHeaderStripUiState3 = premiumBusOfferHeaderStripUiState2;
                            objB2 = objO;
                            passUpsellOfferCardUISpecs3 = passUpsellOfferCardUISpecs;
                            buttonUIStateF = (ButtonUIState) objB2;
                            passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs3;
                            chaloTextUIState14 = chaloTextUIState10;
                            premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState3;
                            imageUrlUIState3 = imageUrlUIState2;
                            chaloTextUIState15 = chaloTextUIState11;
                            chaloTextUIState16 = chaloTextUIState12;
                            chaloTextUIState17 = chaloTextUIState13;
                            return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                        }
                    } else {
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function3;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = premiumBusOfferHeaderStripUiState2;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState6;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = chaloTextUIState7;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState5;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = imageUrlUIState;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = chaloTextUIState8;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$8 = passUpsellOfferCardUISpecs;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$9 = buttonUIStateFactory;
                        premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 4;
                        objB = stringProvider.b(StringEnum.PB_UPGRADE, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                        if (objB != coroutineSingletons) {
                            premiumBusPassUpsellAppModel3 = premiumBusPassUpsellAppModel4;
                            chaloTextUIState9 = chaloTextUIState8;
                            function4 = function3;
                            passUpsellOfferCardUISpecs2 = passUpsellOfferCardUISpecs;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            objB2 = objB;
                            PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState5 = premiumBusOfferHeaderStripUiState2;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.TitleLarge, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new fr0(8, function4, premiumBusPassUpsellAppModel3), UIShape.d, false, ChaloThemeHelper.a().k, 20);
                            premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState5;
                            passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs2;
                            chaloTextUIState14 = chaloTextUIState9;
                            imageUrlUIState3 = imageUrlUIState;
                            chaloTextUIState15 = chaloTextUIState5;
                            chaloTextUIState16 = chaloTextUIState7;
                            chaloTextUIState17 = chaloTextUIState6;
                            return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                        }
                    }
                } else {
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function2;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = premiumBusOfferHeaderStripUiState;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = chaloTextUIState2;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState3;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = imageUrlUIState;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = this;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.Z$0 = z3;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 2;
                    objB2 = stringProvider.b(StringEnum.PB_SEE_MORE_DETAILS, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                    if (objB2 != coroutineSingletons) {
                        chaloTextUIState4 = chaloTextUIState2;
                        premiumBusPassUpsellAppModel2 = premiumBusPassUpsellAppModel4;
                        z2 = z3;
                        premiumBusFareDetailsUiStateFactory2 = this;
                        String str6 = (String) objB2;
                        yt0 yt0Var2 = new yt0(function2, 4);
                        premiumBusFareDetailsUiStateFactory2.getClass();
                        TextUIState.ChaloTextUIState chaloTextUIState20 = chaloTextUIState3;
                        function3 = function2;
                        chaloTextUIState5 = chaloTextUIState20;
                        z3 = z2;
                        premiumBusPassUpsellAppModel4 = premiumBusPassUpsellAppModel2;
                        chaloTextUIState8 = new TextUIState.ChaloTextUIState(str6, UITextStyle.BodySmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var2), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864);
                        chaloTextUIState6 = chaloTextUIState;
                        chaloTextUIState7 = chaloTextUIState4;
                        premiumBusOfferHeaderStripUiState2 = premiumBusOfferHeaderStripUiState;
                        passUpsellOfferCardUISpecs = new PassUpsellOfferCardUISpecs(z3);
                        if (z3) {
                            StringEnum stringEnum2 = StringEnum.REMOVE;
                            yt0 yt0Var3 = new yt0(function3, 5);
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusOfferHeaderStripUiState2;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = chaloTextUIState6;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = chaloTextUIState7;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState5;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = imageUrlUIState;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState8;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = passUpsellOfferCardUISpecs;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = null;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 3;
                            objO = o(stringEnum2, true, yt0Var3, premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                            if (objO != coroutineSingletons) {
                                chaloTextUIState10 = chaloTextUIState8;
                                imageUrlUIState2 = imageUrlUIState;
                                chaloTextUIState11 = chaloTextUIState5;
                                chaloTextUIState12 = chaloTextUIState7;
                                chaloTextUIState13 = chaloTextUIState6;
                                premiumBusOfferHeaderStripUiState3 = premiumBusOfferHeaderStripUiState2;
                                objB2 = objO;
                                passUpsellOfferCardUISpecs3 = passUpsellOfferCardUISpecs;
                                buttonUIStateF = (ButtonUIState) objB2;
                                passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs3;
                                chaloTextUIState14 = chaloTextUIState10;
                                premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState3;
                                imageUrlUIState3 = imageUrlUIState2;
                                chaloTextUIState15 = chaloTextUIState11;
                                chaloTextUIState16 = chaloTextUIState12;
                                chaloTextUIState17 = chaloTextUIState13;
                                return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                            }
                        } else {
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function3;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = premiumBusOfferHeaderStripUiState2;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState6;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = chaloTextUIState7;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState5;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = imageUrlUIState;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = chaloTextUIState8;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$8 = passUpsellOfferCardUISpecs;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$9 = buttonUIStateFactory;
                            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 4;
                            objB = stringProvider.b(StringEnum.PB_UPGRADE, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                            if (objB != coroutineSingletons) {
                                premiumBusPassUpsellAppModel3 = premiumBusPassUpsellAppModel4;
                                chaloTextUIState9 = chaloTextUIState8;
                                function4 = function3;
                                passUpsellOfferCardUISpecs2 = passUpsellOfferCardUISpecs;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                objB2 = objB;
                                PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState6 = premiumBusOfferHeaderStripUiState2;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.TitleLarge, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new fr0(8, function4, premiumBusPassUpsellAppModel3), UIShape.d, false, ChaloThemeHelper.a().k, 20);
                                premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState6;
                                passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs2;
                                chaloTextUIState14 = chaloTextUIState9;
                                imageUrlUIState3 = imageUrlUIState;
                                chaloTextUIState15 = chaloTextUIState5;
                                chaloTextUIState16 = chaloTextUIState7;
                                chaloTextUIState17 = chaloTextUIState6;
                                return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    passUpsellOfferCardUISpecs3 = (PassUpsellOfferCardUISpecs) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6;
                    chaloTextUIState10 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5;
                    imageUrlUIState2 = (ImageUrlUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4;
                    chaloTextUIState11 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3;
                    chaloTextUIState12 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2;
                    chaloTextUIState13 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1;
                    premiumBusOfferHeaderStripUiState3 = (PremiumBusOfferHeaderStripUiState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0;
                    ResultKt.b(objB2);
                    buttonUIStateF = (ButtonUIState) objB2;
                    passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs3;
                    chaloTextUIState14 = chaloTextUIState10;
                    premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState3;
                    imageUrlUIState3 = imageUrlUIState2;
                    chaloTextUIState15 = chaloTextUIState11;
                    chaloTextUIState16 = chaloTextUIState12;
                    chaloTextUIState17 = chaloTextUIState13;
                    return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                buttonUIStateFactory2 = (ButtonUIStateFactory) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$9;
                passUpsellOfferCardUISpecs2 = (PassUpsellOfferCardUISpecs) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$8;
                chaloTextUIState9 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7;
                imageUrlUIState = (ImageUrlUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5;
                chaloTextUIState7 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4;
                chaloTextUIState6 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3;
                premiumBusOfferHeaderStripUiState2 = (PremiumBusOfferHeaderStripUiState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2;
                function4 = (Function1) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1;
                premiumBusPassUpsellAppModel3 = (PremiumBusPassUpsellAppModel) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0;
                ResultKt.b(objB2);
                PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState7 = premiumBusOfferHeaderStripUiState2;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.TitleLarge, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new fr0(8, function4, premiumBusPassUpsellAppModel3), UIShape.d, false, ChaloThemeHelper.a().k, 20);
                premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState7;
                passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs2;
                chaloTextUIState14 = chaloTextUIState9;
                imageUrlUIState3 = imageUrlUIState;
                chaloTextUIState15 = chaloTextUIState5;
                chaloTextUIState16 = chaloTextUIState7;
                chaloTextUIState17 = chaloTextUIState6;
                return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
            }
            z2 = premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.Z$0;
            premiumBusFareDetailsUiStateFactory2 = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7;
            imageUrlUIState = (ImageUrlUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6;
            chaloTextUIState3 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5;
            chaloTextUIState4 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4;
            chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3;
            premiumBusOfferHeaderStripUiState = (PremiumBusOfferHeaderStripUiState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2;
            function2 = (Function1) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1;
            premiumBusPassUpsellAppModel2 = (PremiumBusPassUpsellAppModel) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0;
            ResultKt.b(objB2);
            String str7 = (String) objB2;
            yt0 yt0Var4 = new yt0(function2, 4);
            premiumBusFareDetailsUiStateFactory2.getClass();
            TextUIState.ChaloTextUIState chaloTextUIState21 = chaloTextUIState3;
            function3 = function2;
            chaloTextUIState5 = chaloTextUIState21;
            z3 = z2;
            premiumBusPassUpsellAppModel4 = premiumBusPassUpsellAppModel2;
            chaloTextUIState8 = new TextUIState.ChaloTextUIState(str7, UITextStyle.BodySmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var4), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864);
            chaloTextUIState6 = chaloTextUIState;
            chaloTextUIState7 = chaloTextUIState4;
            premiumBusOfferHeaderStripUiState2 = premiumBusOfferHeaderStripUiState;
            passUpsellOfferCardUISpecs = new PassUpsellOfferCardUISpecs(z3);
            if (z3) {
                StringEnum stringEnum3 = StringEnum.REMOVE;
                yt0 yt0Var5 = new yt0(function3, 5);
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusOfferHeaderStripUiState2;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = chaloTextUIState6;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = chaloTextUIState7;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState5;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = imageUrlUIState;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState8;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = passUpsellOfferCardUISpecs;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = null;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 3;
                objO = o(stringEnum3, true, yt0Var5, premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                if (objO != coroutineSingletons) {
                    chaloTextUIState10 = chaloTextUIState8;
                    imageUrlUIState2 = imageUrlUIState;
                    chaloTextUIState11 = chaloTextUIState5;
                    chaloTextUIState12 = chaloTextUIState7;
                    chaloTextUIState13 = chaloTextUIState6;
                    premiumBusOfferHeaderStripUiState3 = premiumBusOfferHeaderStripUiState2;
                    objB2 = objO;
                    passUpsellOfferCardUISpecs3 = passUpsellOfferCardUISpecs;
                    buttonUIStateF = (ButtonUIState) objB2;
                    passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs3;
                    chaloTextUIState14 = chaloTextUIState10;
                    premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState3;
                    imageUrlUIState3 = imageUrlUIState2;
                    chaloTextUIState15 = chaloTextUIState11;
                    chaloTextUIState16 = chaloTextUIState12;
                    chaloTextUIState17 = chaloTextUIState13;
                    return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                }
            } else {
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = premiumBusOfferHeaderStripUiState2;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState6;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = chaloTextUIState7;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState5;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = imageUrlUIState;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = chaloTextUIState8;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$8 = passUpsellOfferCardUISpecs;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$9 = buttonUIStateFactory;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 4;
                objB = stringProvider.b(StringEnum.PB_UPGRADE, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                if (objB != coroutineSingletons) {
                    premiumBusPassUpsellAppModel3 = premiumBusPassUpsellAppModel4;
                    chaloTextUIState9 = chaloTextUIState8;
                    function4 = function3;
                    passUpsellOfferCardUISpecs2 = passUpsellOfferCardUISpecs;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    objB2 = objB;
                    PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState8 = premiumBusOfferHeaderStripUiState2;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.TitleLarge, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new fr0(8, function4, premiumBusPassUpsellAppModel3), UIShape.d, false, ChaloThemeHelper.a().k, 20);
                    premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState8;
                    passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs2;
                    chaloTextUIState14 = chaloTextUIState9;
                    imageUrlUIState3 = imageUrlUIState;
                    chaloTextUIState15 = chaloTextUIState5;
                    chaloTextUIState16 = chaloTextUIState7;
                    chaloTextUIState17 = chaloTextUIState6;
                    return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                }
            }
            return coroutineSingletons;
        }
        boolean z4 = premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.Z$0;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory3 = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3;
        ImageUIState imageUIState4 = (ImageUIState) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2;
        function2 = (Function1) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel5 = (PremiumBusPassUpsellAppModel) premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0;
        ResultKt.b(objB2);
        z3 = z4;
        premiumBusPassUpsellAppModel4 = premiumBusPassUpsellAppModel5;
        imageUIState = imageUIState4;
        obj = objB2;
        premiumBusFareDetailsUiStateFactory = premiumBusFareDetailsUiStateFactory3;
        premiumBusFareDetailsUiStateFactory.getClass();
        premiumBusOfferHeaderStripUiState = new PremiumBusOfferHeaderStripUiState(imageUIState, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), CollectionsKt.S(ChaloColorToken.GreenBase.f9800a, white));
        String str8 = premiumBusPassUpsellAppModel4.d;
        str = premiumBusPassUpsellAppModel4.g;
        UITextStyle uITextStyle3 = UITextStyle.HeadlineSmall;
        uIFontWeight = UIFontWeight.Bold;
        uITextStyle = uITextStyle3;
        chaloTextUIState = new TextUIState.ChaloTextUIState(str8, uITextStyle, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        if (AnyExtsKt.a(str)) {
            chaloTextUIState2 = null;
        } else {
            chaloTextUIState2 = null;
        }
        if (str != null) {
            uITextStyle = uITextStyle;
            chaloTextUIState3 = new TextUIState.ChaloTextUIState(vo1.n(StringsKt.h0(str, "/"), " ", StringsKt.e0(str, "/", str)), uITextStyle, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        } else {
            uITextStyle = uITextStyle;
            chaloTextUIState3 = null;
        }
        str2 = premiumBusPassUpsellAppModel4.i;
        if (str2 != null) {
            imageUrlUIState = new ImageUrlUIState(str2, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            imageUrlUIState = null;
        }
        if (z3) {
            TextUIState.ChaloTextUIState chaloTextUIState110 = chaloTextUIState3;
            function3 = function2;
            chaloTextUIState5 = chaloTextUIState110;
            TextUIState.ChaloTextUIState chaloTextUIState111 = chaloTextUIState2;
            chaloTextUIState6 = chaloTextUIState;
            chaloTextUIState7 = chaloTextUIState111;
            chaloTextUIState8 = null;
            premiumBusOfferHeaderStripUiState2 = premiumBusOfferHeaderStripUiState;
            passUpsellOfferCardUISpecs = new PassUpsellOfferCardUISpecs(z3);
            if (z3) {
                StringEnum stringEnum4 = StringEnum.REMOVE;
                yt0 yt0Var6 = new yt0(function3, 5);
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusOfferHeaderStripUiState2;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = chaloTextUIState6;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = chaloTextUIState7;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState5;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = imageUrlUIState;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState8;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = passUpsellOfferCardUISpecs;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = null;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 3;
                objO = o(stringEnum4, true, yt0Var6, premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                if (objO != coroutineSingletons) {
                    chaloTextUIState10 = chaloTextUIState8;
                    imageUrlUIState2 = imageUrlUIState;
                    chaloTextUIState11 = chaloTextUIState5;
                    chaloTextUIState12 = chaloTextUIState7;
                    chaloTextUIState13 = chaloTextUIState6;
                    premiumBusOfferHeaderStripUiState3 = premiumBusOfferHeaderStripUiState2;
                    objB2 = objO;
                    passUpsellOfferCardUISpecs3 = passUpsellOfferCardUISpecs;
                    buttonUIStateF = (ButtonUIState) objB2;
                    passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs3;
                    chaloTextUIState14 = chaloTextUIState10;
                    premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState3;
                    imageUrlUIState3 = imageUrlUIState2;
                    chaloTextUIState15 = chaloTextUIState11;
                    chaloTextUIState16 = chaloTextUIState12;
                    chaloTextUIState17 = chaloTextUIState13;
                    return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                }
            } else {
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = premiumBusOfferHeaderStripUiState2;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState6;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = chaloTextUIState7;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState5;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = imageUrlUIState;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = chaloTextUIState8;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$8 = passUpsellOfferCardUISpecs;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$9 = buttonUIStateFactory;
                premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 4;
                objB = stringProvider.b(StringEnum.PB_UPGRADE, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                if (objB != coroutineSingletons) {
                    premiumBusPassUpsellAppModel3 = premiumBusPassUpsellAppModel4;
                    chaloTextUIState9 = chaloTextUIState8;
                    function4 = function3;
                    passUpsellOfferCardUISpecs2 = passUpsellOfferCardUISpecs;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    objB2 = objB;
                    PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState9 = premiumBusOfferHeaderStripUiState2;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.TitleLarge, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new fr0(8, function4, premiumBusPassUpsellAppModel3), UIShape.d, false, ChaloThemeHelper.a().k, 20);
                    premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState9;
                    passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs2;
                    chaloTextUIState14 = chaloTextUIState9;
                    imageUrlUIState3 = imageUrlUIState;
                    chaloTextUIState15 = chaloTextUIState5;
                    chaloTextUIState16 = chaloTextUIState7;
                    chaloTextUIState17 = chaloTextUIState6;
                    return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                }
            }
        } else {
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function2;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = premiumBusOfferHeaderStripUiState;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = chaloTextUIState2;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState3;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = imageUrlUIState;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = this;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.Z$0 = z3;
            premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 2;
            objB2 = stringProvider.b(StringEnum.PB_SEE_MORE_DETAILS, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
            if (objB2 != coroutineSingletons) {
                chaloTextUIState4 = chaloTextUIState2;
                premiumBusPassUpsellAppModel2 = premiumBusPassUpsellAppModel4;
                z2 = z3;
                premiumBusFareDetailsUiStateFactory2 = this;
                String str9 = (String) objB2;
                yt0 yt0Var7 = new yt0(function2, 4);
                premiumBusFareDetailsUiStateFactory2.getClass();
                TextUIState.ChaloTextUIState chaloTextUIState22 = chaloTextUIState3;
                function3 = function2;
                chaloTextUIState5 = chaloTextUIState22;
                z3 = z2;
                premiumBusPassUpsellAppModel4 = premiumBusPassUpsellAppModel2;
                chaloTextUIState8 = new TextUIState.ChaloTextUIState(str9, UITextStyle.BodySmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, UiEventHandler.Companion.a(yt0Var7), (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7864);
                chaloTextUIState6 = chaloTextUIState;
                chaloTextUIState7 = chaloTextUIState4;
                premiumBusOfferHeaderStripUiState2 = premiumBusOfferHeaderStripUiState;
                passUpsellOfferCardUISpecs = new PassUpsellOfferCardUISpecs(z3);
                if (z3) {
                    StringEnum stringEnum5 = StringEnum.REMOVE;
                    yt0 yt0Var8 = new yt0(function3, 5);
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusOfferHeaderStripUiState2;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = chaloTextUIState6;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = chaloTextUIState7;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState5;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = imageUrlUIState;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState8;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = passUpsellOfferCardUISpecs;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = null;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 3;
                    objO = o(stringEnum5, true, yt0Var8, premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                    if (objO != coroutineSingletons) {
                        chaloTextUIState10 = chaloTextUIState8;
                        imageUrlUIState2 = imageUrlUIState;
                        chaloTextUIState11 = chaloTextUIState5;
                        chaloTextUIState12 = chaloTextUIState7;
                        chaloTextUIState13 = chaloTextUIState6;
                        premiumBusOfferHeaderStripUiState3 = premiumBusOfferHeaderStripUiState2;
                        objB2 = objO;
                        passUpsellOfferCardUISpecs3 = passUpsellOfferCardUISpecs;
                        buttonUIStateF = (ButtonUIState) objB2;
                        passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs3;
                        chaloTextUIState14 = chaloTextUIState10;
                        premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState3;
                        imageUrlUIState3 = imageUrlUIState2;
                        chaloTextUIState15 = chaloTextUIState11;
                        chaloTextUIState16 = chaloTextUIState12;
                        chaloTextUIState17 = chaloTextUIState13;
                        return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                    }
                } else {
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$0 = premiumBusPassUpsellAppModel4;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$1 = function3;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$2 = premiumBusOfferHeaderStripUiState2;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$3 = chaloTextUIState6;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$4 = chaloTextUIState7;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$5 = chaloTextUIState5;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$6 = imageUrlUIState;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$7 = chaloTextUIState8;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$8 = passUpsellOfferCardUISpecs;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.L$9 = buttonUIStateFactory;
                    premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1.label = 4;
                    objB = stringProvider.b(StringEnum.PB_UPGRADE, new Object[0], premiumBusFareDetailsUiStateFactory$toOfferCardUiState$1);
                    if (objB != coroutineSingletons) {
                        premiumBusPassUpsellAppModel3 = premiumBusPassUpsellAppModel4;
                        chaloTextUIState9 = chaloTextUIState8;
                        function4 = function3;
                        passUpsellOfferCardUISpecs2 = passUpsellOfferCardUISpecs;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        objB2 = objB;
                        PremiumBusOfferHeaderStripUiState premiumBusOfferHeaderStripUiState10 = premiumBusOfferHeaderStripUiState2;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.TitleLarge, white, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new fr0(8, function4, premiumBusPassUpsellAppModel3), UIShape.d, false, ChaloThemeHelper.a().k, 20);
                        premiumBusOfferHeaderStripUiState4 = premiumBusOfferHeaderStripUiState10;
                        passUpsellOfferCardUISpecs4 = passUpsellOfferCardUISpecs2;
                        chaloTextUIState14 = chaloTextUIState9;
                        imageUrlUIState3 = imageUrlUIState;
                        chaloTextUIState15 = chaloTextUIState5;
                        chaloTextUIState16 = chaloTextUIState7;
                        chaloTextUIState17 = chaloTextUIState6;
                        return new PassUpsellOfferCardUiState(premiumBusOfferHeaderStripUiState4, chaloTextUIState17, chaloTextUIState16, chaloTextUIState15, imageUrlUIState3, chaloTextUIState14, buttonUIStateF, passUpsellOfferCardUISpecs4);
                    }
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(String str, ContinuationImpl continuationImpl, Function1 function1) {
        PremiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1 premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1;
        Function1 function2;
        DialogUIStateFactory dialogUIStateFactory;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1) {
            premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1 = (PremiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1 = new PremiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1 = new PremiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.L$0 = function1;
            DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
            premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.L$1 = dialogUIStateFactory2;
            premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.L$2 = str;
            premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.label = 1;
            objB = this.f7555a.b(StringEnum.OK, new Object[0], premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function2 = function1;
            dialogUIStateFactory = dialogUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.L$2;
            dialogUIStateFactory = (DialogUIStateFactory) premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.L$1;
            function2 = (Function1) premiumBusFareDetailsUiStateFactory$toOrderCreationErrorDialog$1.L$0;
            ResultKt.b(objB);
        }
        String str2 = str;
        yt0 yt0Var = new yt0(function2, 6);
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.b(null, str2, (String) objB, null, yt0Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0207  */
    /* JADX WARN: Code duplicated, block: B:38:0x022b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0254  */
    /* JADX WARN: Code duplicated, block: B:45:0x0260  */
    /* JADX WARN: Code duplicated, block: B:48:0x027d  */
    /* JADX WARN: Code duplicated, block: B:50:0x028d  */
    /* JADX WARN: Code duplicated, block: B:54:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x030b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0339  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object w(PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1 premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext2;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState;
        Function1 function2;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState2;
        boolean z;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIStateZ;
        Object objD;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState2;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel2;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType3;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState3;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext3;
        Function1 function3;
        PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState;
        Object objU;
        PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState2;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState3;
        PassUpsellOfferCardUiState passUpsellOfferCardUiState;
        Object objF;
        PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState3;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        PassUpsellOfferCardUiState passUpsellOfferCardUiState2;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState;
        boolean z2;
        PassUpsellOfferCardUiState passUpsellOfferCardUiState3;
        Function1 function4;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext4;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState4;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType5;
        PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState4;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        LoadingDialogUIState loadingDialogUIState;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState2;
        Object objM;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType6;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState3;
        Function1 function5;
        LoadingDialogUIState loadingDialogUIState2;
        PassUpsellOfferCardUiState passUpsellOfferCardUiState4;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        boolean z3;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState4;
        PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState5;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType7;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState5;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState5;
        Function1 function6;
        PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState;
        PremiumBusFareDetailsComponentDataState premiumBusFareDetailsComponentDataState6;
        Object objP;
        LoadingDialogUIState loadingDialogUIState3;
        PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState2;
        PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState2;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState6;
        ButtonUIState buttonUIState;
        Object objO;
        LoadingDialogUIState loadingDialogUIState4;
        ButtonUIState buttonUIState2;
        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState7;
        PassUpsellOfferCardUiState passUpsellOfferCardUiState5;
        PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState6;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1) {
            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1 = (PremiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1 = new PremiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1 = new PremiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1(this, continuationImpl);
        }
        PremiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1 premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2 = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$1;
        Object objI = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label) {
            case 0:
                ResultKt.b(objI);
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState4 = premiumBusFareDetailsComponentDataState.b;
                premiumBusPassUpsellAppModel = premiumBusFareDetailsDataState4.p;
                if (premiumBusPassUpsellAppModel == null) {
                    return null;
                }
                boolean z4 = premiumBusFareDetailsDataState4.f;
                premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsDataState4.q;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState;
                premiumBusFareDetailsSharedContext2 = premiumBusFareDetailsSharedContext;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function1;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusPassUpsellAppModel;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsBottomSheetType;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = this;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 1;
                Object objB = this.f7555a.b(StringEnum.OFFERS_AND_BENEFITS, new Object[0], premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                if (objB != coroutineSingletons) {
                    premiumBusFareDetailsDataState = premiumBusFareDetailsDataState4;
                    objI = objB;
                    function2 = function1;
                    premiumBusFareDetailsComponentDataState2 = premiumBusFareDetailsComponentDataState;
                    z = z4;
                    premiumBusFareDetailsUiStateFactory = this;
                    premiumBusFareDetailsUiStateFactory.getClass();
                    chaloTextUIStateZ = z((String) objI);
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusPassUpsellAppModel;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsBottomSheetType;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = chaloTextUIStateZ;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 2;
                    objD = d(premiumBusPassUpsellAppModel, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objD != coroutineSingletons) {
                        premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                        chaloTextUIState = chaloTextUIStateZ;
                        objI = objD;
                        premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
                        premiumBusPassUpsellAppModel2 = premiumBusPassUpsellAppModel;
                        premiumBusFareDetailsBottomSheetType3 = premiumBusFareDetailsBottomSheetType2;
                        premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                        premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext2;
                        function3 = function2;
                        premiumBusIncludedInPassBannerUiState = (PremiumBusIncludedInPassBannerUiState) objI;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusPassUpsellAppModel2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsBottomSheetType3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = chaloTextUIState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusIncludedInPassBannerUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 3;
                        objU = u(premiumBusPassUpsellAppModel2, true, function3, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objU != coroutineSingletons) {
                            premiumBusIncludedInPassBannerUiState2 = premiumBusIncludedInPassBannerUiState;
                            objI = objU;
                            premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                            passUpsellOfferCardUiState = (PassUpsellOfferCardUiState) objI;
                            String str = premiumBusPassUpsellAppModel2.d;
                            String str2 = premiumBusFareDetailsComponentDataState3.e;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareDetailsBottomSheetType3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = chaloTextUIState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusIncludedInPassBannerUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = passUpsellOfferCardUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 4;
                            objF = f(str, str2, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objF != coroutineSingletons) {
                                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType8 = premiumBusFareDetailsBottomSheetType3;
                                premiumBusIncludedInPassBannerUiState3 = premiumBusIncludedInPassBannerUiState2;
                                premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType8;
                                chaloTextUIState2 = chaloTextUIState;
                                passUpsellOfferCardUiState2 = passUpsellOfferCardUiState;
                                objI = objF;
                                premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objI;
                                if (premiumBusFareDetailsDataState3.h) {
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsBottomSheetType4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = chaloTextUIState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusIncludedInPassBannerUiState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = passUpsellOfferCardUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareSplitSectionUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 5;
                                    objM = m(premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objM != coroutineSingletons) {
                                        premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType4;
                                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState;
                                        objI = objM;
                                        z2 = z;
                                        premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                                        premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                                        chaloTextUIState3 = chaloTextUIState2;
                                        premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType6;
                                        premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState3;
                                        passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                                        function4 = function3;
                                        premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                                        loadingDialogUIState = (LoadingDialogUIState) objI;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                                        objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objI != coroutineSingletons) {
                                            TextUIState.ChaloTextUIState chaloTextUIState6 = chaloTextUIState3;
                                            function5 = function4;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                                            chaloTextUIState4 = chaloTextUIState6;
                                            z3 = z2;
                                            premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                            premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                            premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                                            if (premiumBusFareDetailsBottomSheetType7 != null) {
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                                objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objI != coroutineSingletons) {
                                                    function6 = function5;
                                                    premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState8 = premiumBusFareSplitSectionUiState4;
                                                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState8;
                                                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                                    objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                    if (objP != coroutineSingletons) {
                                                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState9 = premiumBusFareSplitSectionUiState5;
                                                        objI = objP;
                                                        loadingDialogUIState3 = loadingDialogUIState2;
                                                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                        premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState9;
                                                        buttonUIState = (ButtonUIState) objI;
                                                        StringEnum stringEnum = StringEnum.REMOVE;
                                                        fq0 fq0Var = new fq0(function6, 23);
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                        objO = o(stringEnum, true, fq0Var, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                        if (objO != coroutineSingletons) {
                                                            loadingDialogUIState4 = loadingDialogUIState3;
                                                            buttonUIState2 = buttonUIState;
                                                            objI = objO;
                                                            premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                            passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                            premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                            chaloTextUIState5 = chaloTextUIState4;
                                                            return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                        }
                                                    }
                                                }
                                            } else {
                                                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                                function6 = function5;
                                                premiumBusFareDetailsBottomSheetUiState = null;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                                objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objP != coroutineSingletons) {
                                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState10 = premiumBusFareSplitSectionUiState5;
                                                    objI = objP;
                                                    loadingDialogUIState3 = loadingDialogUIState2;
                                                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                    premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                    premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState10;
                                                    buttonUIState = (ButtonUIState) objI;
                                                    StringEnum stringEnum2 = StringEnum.REMOVE;
                                                    fq0 fq0Var2 = new fq0(function6, 23);
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                    objO = o(stringEnum2, true, fq0Var2, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                    if (objO != coroutineSingletons) {
                                                        loadingDialogUIState4 = loadingDialogUIState3;
                                                        buttonUIState2 = buttonUIState;
                                                        objI = objO;
                                                        premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                        passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                        premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                        chaloTextUIState5 = chaloTextUIState4;
                                                        return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    z2 = z;
                                    passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                                    function4 = function3;
                                    premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                                    premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                                    premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                                    premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                                    chaloTextUIState3 = chaloTextUIState2;
                                    loadingDialogUIState = null;
                                    premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                                    objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objI != coroutineSingletons) {
                                        TextUIState.ChaloTextUIState chaloTextUIState7 = chaloTextUIState3;
                                        function5 = function4;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                                        chaloTextUIState4 = chaloTextUIState7;
                                        z3 = z2;
                                        premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                        premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                        premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                                        if (premiumBusFareDetailsBottomSheetType7 != null) {
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                            objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objI != coroutineSingletons) {
                                                function6 = function5;
                                                premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState11 = premiumBusFareSplitSectionUiState4;
                                                premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState11;
                                                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                                objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objP != coroutineSingletons) {
                                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState12 = premiumBusFareSplitSectionUiState5;
                                                    objI = objP;
                                                    loadingDialogUIState3 = loadingDialogUIState2;
                                                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                    premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                    premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState12;
                                                    buttonUIState = (ButtonUIState) objI;
                                                    StringEnum stringEnum3 = StringEnum.REMOVE;
                                                    fq0 fq0Var3 = new fq0(function6, 23);
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                    objO = o(stringEnum3, true, fq0Var3, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                    if (objO != coroutineSingletons) {
                                                        loadingDialogUIState4 = loadingDialogUIState3;
                                                        buttonUIState2 = buttonUIState;
                                                        objI = objO;
                                                        premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                        passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                        premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                        chaloTextUIState5 = chaloTextUIState4;
                                                        return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                    }
                                                }
                                            }
                                        } else {
                                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                            function6 = function5;
                                            premiumBusFareDetailsBottomSheetUiState = null;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                            objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objP != coroutineSingletons) {
                                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState13 = premiumBusFareSplitSectionUiState5;
                                                objI = objP;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState13;
                                                buttonUIState = (ButtonUIState) objI;
                                                StringEnum stringEnum4 = StringEnum.REMOVE;
                                                fq0 fq0Var4 = new fq0(function6, 23);
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                objO = o(stringEnum4, true, fq0Var4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objO != coroutineSingletons) {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    buttonUIState2 = buttonUIState;
                                                    objI = objO;
                                                    premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                    passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                    premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                    chaloTextUIState5 = chaloTextUIState4;
                                                    return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                z = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0;
                premiumBusFareDetailsUiStateFactory = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                premiumBusFareDetailsBottomSheetType = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                premiumBusPassUpsellAppModel = (PremiumBusPassUpsellAppModel) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                function2 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                premiumBusFareDetailsSharedContext2 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                premiumBusFareDetailsComponentDataState2 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                premiumBusFareDetailsUiStateFactory.getClass();
                chaloTextUIStateZ = z((String) objI);
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusPassUpsellAppModel;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsBottomSheetType;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = chaloTextUIStateZ;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 2;
                objD = d(premiumBusPassUpsellAppModel, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                if (objD != coroutineSingletons) {
                    premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType;
                    chaloTextUIState = chaloTextUIStateZ;
                    objI = objD;
                    premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
                    premiumBusPassUpsellAppModel2 = premiumBusPassUpsellAppModel;
                    premiumBusFareDetailsBottomSheetType3 = premiumBusFareDetailsBottomSheetType2;
                    premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                    premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext2;
                    function3 = function2;
                    premiumBusIncludedInPassBannerUiState = (PremiumBusIncludedInPassBannerUiState) objI;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusPassUpsellAppModel2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsBottomSheetType3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = chaloTextUIState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusIncludedInPassBannerUiState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 3;
                    objU = u(premiumBusPassUpsellAppModel2, true, function3, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objU != coroutineSingletons) {
                        premiumBusIncludedInPassBannerUiState2 = premiumBusIncludedInPassBannerUiState;
                        objI = objU;
                        premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                        passUpsellOfferCardUiState = (PassUpsellOfferCardUiState) objI;
                        String str3 = premiumBusPassUpsellAppModel2.d;
                        String str4 = premiumBusFareDetailsComponentDataState3.e;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareDetailsBottomSheetType3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = chaloTextUIState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusIncludedInPassBannerUiState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = passUpsellOfferCardUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 4;
                        objF = f(str3, str4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objF != coroutineSingletons) {
                            PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType9 = premiumBusFareDetailsBottomSheetType3;
                            premiumBusIncludedInPassBannerUiState3 = premiumBusIncludedInPassBannerUiState2;
                            premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType9;
                            chaloTextUIState2 = chaloTextUIState;
                            passUpsellOfferCardUiState2 = passUpsellOfferCardUiState;
                            objI = objF;
                            premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objI;
                            if (premiumBusFareDetailsDataState3.h) {
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsBottomSheetType4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = chaloTextUIState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusIncludedInPassBannerUiState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = passUpsellOfferCardUiState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareSplitSectionUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 5;
                                objM = m(premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objM != coroutineSingletons) {
                                    premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType4;
                                    premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState;
                                    objI = objM;
                                    z2 = z;
                                    premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                                    premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                                    chaloTextUIState3 = chaloTextUIState2;
                                    premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType6;
                                    premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState3;
                                    passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                                    function4 = function3;
                                    premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                                    loadingDialogUIState = (LoadingDialogUIState) objI;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                                    objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objI != coroutineSingletons) {
                                        TextUIState.ChaloTextUIState chaloTextUIState8 = chaloTextUIState3;
                                        function5 = function4;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                                        chaloTextUIState4 = chaloTextUIState8;
                                        z3 = z2;
                                        premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                        premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                        premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                                        if (premiumBusFareDetailsBottomSheetType7 != null) {
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                            objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objI != coroutineSingletons) {
                                                function6 = function5;
                                                premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState14 = premiumBusFareSplitSectionUiState4;
                                                premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState14;
                                                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                                objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objP != coroutineSingletons) {
                                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState15 = premiumBusFareSplitSectionUiState5;
                                                    objI = objP;
                                                    loadingDialogUIState3 = loadingDialogUIState2;
                                                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                    premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                    premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState15;
                                                    buttonUIState = (ButtonUIState) objI;
                                                    StringEnum stringEnum5 = StringEnum.REMOVE;
                                                    fq0 fq0Var5 = new fq0(function6, 23);
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                    objO = o(stringEnum5, true, fq0Var5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                    if (objO != coroutineSingletons) {
                                                        loadingDialogUIState4 = loadingDialogUIState3;
                                                        buttonUIState2 = buttonUIState;
                                                        objI = objO;
                                                        premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                        passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                        premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                        chaloTextUIState5 = chaloTextUIState4;
                                                        return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                    }
                                                }
                                            }
                                        } else {
                                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                            function6 = function5;
                                            premiumBusFareDetailsBottomSheetUiState = null;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                            objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objP != coroutineSingletons) {
                                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState16 = premiumBusFareSplitSectionUiState5;
                                                objI = objP;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState16;
                                                buttonUIState = (ButtonUIState) objI;
                                                StringEnum stringEnum6 = StringEnum.REMOVE;
                                                fq0 fq0Var6 = new fq0(function6, 23);
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                objO = o(stringEnum6, true, fq0Var6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objO != coroutineSingletons) {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    buttonUIState2 = buttonUIState;
                                                    objI = objO;
                                                    premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                    passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                    premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                    chaloTextUIState5 = chaloTextUIState4;
                                                    return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                z2 = z;
                                passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                                function4 = function3;
                                premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                                premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                                premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                                premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                                chaloTextUIState3 = chaloTextUIState2;
                                loadingDialogUIState = null;
                                premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                                objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objI != coroutineSingletons) {
                                    TextUIState.ChaloTextUIState chaloTextUIState9 = chaloTextUIState3;
                                    function5 = function4;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                                    chaloTextUIState4 = chaloTextUIState9;
                                    z3 = z2;
                                    premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                    premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                    premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                                    if (premiumBusFareDetailsBottomSheetType7 != null) {
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                        objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objI != coroutineSingletons) {
                                            function6 = function5;
                                            premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState17 = premiumBusFareSplitSectionUiState4;
                                            premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState17;
                                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                            objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objP != coroutineSingletons) {
                                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState18 = premiumBusFareSplitSectionUiState5;
                                                objI = objP;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState18;
                                                buttonUIState = (ButtonUIState) objI;
                                                StringEnum stringEnum7 = StringEnum.REMOVE;
                                                fq0 fq0Var7 = new fq0(function6, 23);
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                objO = o(stringEnum7, true, fq0Var7, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objO != coroutineSingletons) {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    buttonUIState2 = buttonUIState;
                                                    objI = objO;
                                                    premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                    passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                    premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                    chaloTextUIState5 = chaloTextUIState4;
                                                    return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                }
                                            }
                                        }
                                    } else {
                                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                        function6 = function5;
                                        premiumBusFareDetailsBottomSheetUiState = null;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                        objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objP != coroutineSingletons) {
                                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState19 = premiumBusFareSplitSectionUiState5;
                                            objI = objP;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState19;
                                            buttonUIState = (ButtonUIState) objI;
                                            StringEnum stringEnum8 = StringEnum.REMOVE;
                                            fq0 fq0Var8 = new fq0(function6, 23);
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                            objO = o(stringEnum8, true, fq0Var8, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objO != coroutineSingletons) {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                buttonUIState2 = buttonUIState;
                                                objI = objO;
                                                premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                z = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0;
                TextUIState.ChaloTextUIState chaloTextUIState10 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType10 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                premiumBusPassUpsellAppModel = (PremiumBusPassUpsellAppModel) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                function2 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                premiumBusFareDetailsSharedContext2 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                premiumBusFareDetailsComponentDataState2 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                premiumBusFareDetailsBottomSheetType2 = premiumBusFareDetailsBottomSheetType10;
                chaloTextUIState = chaloTextUIState10;
                premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
                premiumBusPassUpsellAppModel2 = premiumBusPassUpsellAppModel;
                premiumBusFareDetailsBottomSheetType3 = premiumBusFareDetailsBottomSheetType2;
                premiumBusFareDetailsComponentDataState3 = premiumBusFareDetailsComponentDataState2;
                premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext2;
                function3 = function2;
                premiumBusIncludedInPassBannerUiState = (PremiumBusIncludedInPassBannerUiState) objI;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusPassUpsellAppModel2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsBottomSheetType3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = chaloTextUIState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusIncludedInPassBannerUiState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 3;
                objU = u(premiumBusPassUpsellAppModel2, true, function3, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                if (objU != coroutineSingletons) {
                    premiumBusIncludedInPassBannerUiState2 = premiumBusIncludedInPassBannerUiState;
                    objI = objU;
                    premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
                    passUpsellOfferCardUiState = (PassUpsellOfferCardUiState) objI;
                    String str5 = premiumBusPassUpsellAppModel2.d;
                    String str6 = premiumBusFareDetailsComponentDataState3.e;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareDetailsBottomSheetType3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = chaloTextUIState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusIncludedInPassBannerUiState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = passUpsellOfferCardUiState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 4;
                    objF = f(str5, str6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objF != coroutineSingletons) {
                        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType11 = premiumBusFareDetailsBottomSheetType3;
                        premiumBusIncludedInPassBannerUiState3 = premiumBusIncludedInPassBannerUiState2;
                        premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType11;
                        chaloTextUIState2 = chaloTextUIState;
                        passUpsellOfferCardUiState2 = passUpsellOfferCardUiState;
                        objI = objF;
                        premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objI;
                        if (premiumBusFareDetailsDataState3.h) {
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsBottomSheetType4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = chaloTextUIState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusIncludedInPassBannerUiState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = passUpsellOfferCardUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareSplitSectionUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 5;
                            objM = m(premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objM != coroutineSingletons) {
                                premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType4;
                                premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState;
                                objI = objM;
                                z2 = z;
                                premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                                premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                                chaloTextUIState3 = chaloTextUIState2;
                                premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType6;
                                premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState3;
                                passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                                function4 = function3;
                                premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                                loadingDialogUIState = (LoadingDialogUIState) objI;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                                objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objI != coroutineSingletons) {
                                    TextUIState.ChaloTextUIState chaloTextUIState11 = chaloTextUIState3;
                                    function5 = function4;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                                    chaloTextUIState4 = chaloTextUIState11;
                                    z3 = z2;
                                    premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                    premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                    premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                                    if (premiumBusFareDetailsBottomSheetType7 != null) {
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                        objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objI != coroutineSingletons) {
                                            function6 = function5;
                                            premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState110 = premiumBusFareSplitSectionUiState4;
                                            premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState110;
                                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                            objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objP != coroutineSingletons) {
                                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState111 = premiumBusFareSplitSectionUiState5;
                                                objI = objP;
                                                loadingDialogUIState3 = loadingDialogUIState2;
                                                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                                premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState111;
                                                buttonUIState = (ButtonUIState) objI;
                                                StringEnum stringEnum9 = StringEnum.REMOVE;
                                                fq0 fq0Var9 = new fq0(function6, 23);
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                                objO = o(stringEnum9, true, fq0Var9, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                                if (objO != coroutineSingletons) {
                                                    loadingDialogUIState4 = loadingDialogUIState3;
                                                    buttonUIState2 = buttonUIState;
                                                    objI = objO;
                                                    premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                    passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                    premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                    chaloTextUIState5 = chaloTextUIState4;
                                                    return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                                }
                                            }
                                        }
                                    } else {
                                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                        function6 = function5;
                                        premiumBusFareDetailsBottomSheetUiState = null;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                        objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objP != coroutineSingletons) {
                                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState112 = premiumBusFareSplitSectionUiState5;
                                            objI = objP;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState112;
                                            buttonUIState = (ButtonUIState) objI;
                                            StringEnum stringEnum10 = StringEnum.REMOVE;
                                            fq0 fq0Var10 = new fq0(function6, 23);
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                            objO = o(stringEnum10, true, fq0Var10, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objO != coroutineSingletons) {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                buttonUIState2 = buttonUIState;
                                                objI = objO;
                                                premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            z2 = z;
                            passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                            function4 = function3;
                            premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                            premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                            premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                            premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                            chaloTextUIState3 = chaloTextUIState2;
                            loadingDialogUIState = null;
                            premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                            objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objI != coroutineSingletons) {
                                TextUIState.ChaloTextUIState chaloTextUIState12 = chaloTextUIState3;
                                function5 = function4;
                                loadingDialogUIState2 = loadingDialogUIState;
                                passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                                chaloTextUIState4 = chaloTextUIState12;
                                z3 = z2;
                                premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                                if (premiumBusFareDetailsBottomSheetType7 != null) {
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                    objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objI != coroutineSingletons) {
                                        function6 = function5;
                                        premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState113 = premiumBusFareSplitSectionUiState4;
                                        premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState113;
                                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                        objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objP != coroutineSingletons) {
                                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState114 = premiumBusFareSplitSectionUiState5;
                                            objI = objP;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState114;
                                            buttonUIState = (ButtonUIState) objI;
                                            StringEnum stringEnum11 = StringEnum.REMOVE;
                                            fq0 fq0Var11 = new fq0(function6, 23);
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                            objO = o(stringEnum11, true, fq0Var11, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objO != coroutineSingletons) {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                buttonUIState2 = buttonUIState;
                                                objI = objO;
                                                premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                            }
                                        }
                                    }
                                } else {
                                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                    function6 = function5;
                                    premiumBusFareDetailsBottomSheetUiState = null;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                    objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objP != coroutineSingletons) {
                                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState115 = premiumBusFareSplitSectionUiState5;
                                        objI = objP;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState115;
                                        buttonUIState = (ButtonUIState) objI;
                                        StringEnum stringEnum12 = StringEnum.REMOVE;
                                        fq0 fq0Var12 = new fq0(function6, 23);
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                        objO = o(stringEnum12, true, fq0Var12, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objO != coroutineSingletons) {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            buttonUIState2 = buttonUIState;
                                            objI = objO;
                                            premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                            passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                            premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                z = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0;
                premiumBusIncludedInPassBannerUiState2 = (PremiumBusIncludedInPassBannerUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7;
                chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                premiumBusFareDetailsBottomSheetType3 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                premiumBusPassUpsellAppModel2 = (PremiumBusPassUpsellAppModel) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                premiumBusFareDetailsDataState3 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                premiumBusFareDetailsSharedContext3 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                premiumBusFareDetailsComponentDataState3 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                passUpsellOfferCardUiState = (PassUpsellOfferCardUiState) objI;
                String str7 = premiumBusPassUpsellAppModel2.d;
                String str8 = premiumBusFareDetailsComponentDataState3.e;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsDataState3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareDetailsBottomSheetType3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = chaloTextUIState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusIncludedInPassBannerUiState2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = passUpsellOfferCardUiState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 4;
                objF = f(str7, str8, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                if (objF != coroutineSingletons) {
                    PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType12 = premiumBusFareDetailsBottomSheetType3;
                    premiumBusIncludedInPassBannerUiState3 = premiumBusIncludedInPassBannerUiState2;
                    premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType12;
                    chaloTextUIState2 = chaloTextUIState;
                    passUpsellOfferCardUiState2 = passUpsellOfferCardUiState;
                    objI = objF;
                    premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objI;
                    if (premiumBusFareDetailsDataState3.h) {
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsBottomSheetType4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = chaloTextUIState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusIncludedInPassBannerUiState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = passUpsellOfferCardUiState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareSplitSectionUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 5;
                        objM = m(premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objM != coroutineSingletons) {
                            premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType4;
                            premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState;
                            objI = objM;
                            z2 = z;
                            premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                            premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                            chaloTextUIState3 = chaloTextUIState2;
                            premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType6;
                            premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState3;
                            passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                            function4 = function3;
                            premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                            loadingDialogUIState = (LoadingDialogUIState) objI;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                            objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objI != coroutineSingletons) {
                                TextUIState.ChaloTextUIState chaloTextUIState13 = chaloTextUIState3;
                                function5 = function4;
                                loadingDialogUIState2 = loadingDialogUIState;
                                passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                                chaloTextUIState4 = chaloTextUIState13;
                                z3 = z2;
                                premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                                premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                                premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                                premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                                if (premiumBusFareDetailsBottomSheetType7 != null) {
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                    objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objI != coroutineSingletons) {
                                        function6 = function5;
                                        premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState116 = premiumBusFareSplitSectionUiState4;
                                        premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState116;
                                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                        objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objP != coroutineSingletons) {
                                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState117 = premiumBusFareSplitSectionUiState5;
                                            objI = objP;
                                            loadingDialogUIState3 = loadingDialogUIState2;
                                            premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                            premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState117;
                                            buttonUIState = (ButtonUIState) objI;
                                            StringEnum stringEnum13 = StringEnum.REMOVE;
                                            fq0 fq0Var13 = new fq0(function6, 23);
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                            objO = o(stringEnum13, true, fq0Var13, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                            if (objO != coroutineSingletons) {
                                                loadingDialogUIState4 = loadingDialogUIState3;
                                                buttonUIState2 = buttonUIState;
                                                objI = objO;
                                                premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                                passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                                premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                                chaloTextUIState5 = chaloTextUIState4;
                                                return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                            }
                                        }
                                    }
                                } else {
                                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                    function6 = function5;
                                    premiumBusFareDetailsBottomSheetUiState = null;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                    objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objP != coroutineSingletons) {
                                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState118 = premiumBusFareSplitSectionUiState5;
                                        objI = objP;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState118;
                                        buttonUIState = (ButtonUIState) objI;
                                        StringEnum stringEnum14 = StringEnum.REMOVE;
                                        fq0 fq0Var14 = new fq0(function6, 23);
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                        objO = o(stringEnum14, true, fq0Var14, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objO != coroutineSingletons) {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            buttonUIState2 = buttonUIState;
                                            objI = objO;
                                            premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                            passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                            premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        z2 = z;
                        passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                        function4 = function3;
                        premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                        premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                        premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                        premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                        chaloTextUIState3 = chaloTextUIState2;
                        loadingDialogUIState = null;
                        premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                        objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objI != coroutineSingletons) {
                            TextUIState.ChaloTextUIState chaloTextUIState14 = chaloTextUIState3;
                            function5 = function4;
                            loadingDialogUIState2 = loadingDialogUIState;
                            passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                            chaloTextUIState4 = chaloTextUIState14;
                            z3 = z2;
                            premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                            premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                            premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                            if (premiumBusFareDetailsBottomSheetType7 != null) {
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objI != coroutineSingletons) {
                                    function6 = function5;
                                    premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState119 = premiumBusFareSplitSectionUiState4;
                                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState119;
                                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                    objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objP != coroutineSingletons) {
                                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1110 = premiumBusFareSplitSectionUiState5;
                                        objI = objP;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState1110;
                                        buttonUIState = (ButtonUIState) objI;
                                        StringEnum stringEnum15 = StringEnum.REMOVE;
                                        fq0 fq0Var15 = new fq0(function6, 23);
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                        objO = o(stringEnum15, true, fq0Var15, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objO != coroutineSingletons) {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            buttonUIState2 = buttonUIState;
                                            objI = objO;
                                            premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                            passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                            premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                        }
                                    }
                                }
                            } else {
                                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                function6 = function5;
                                premiumBusFareDetailsBottomSheetUiState = null;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objP != coroutineSingletons) {
                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1111 = premiumBusFareSplitSectionUiState5;
                                    objI = objP;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                    premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState1111;
                                    buttonUIState = (ButtonUIState) objI;
                                    StringEnum stringEnum16 = StringEnum.REMOVE;
                                    fq0 fq0Var16 = new fq0(function6, 23);
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                    objO = o(stringEnum16, true, fq0Var16, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objO != coroutineSingletons) {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        buttonUIState2 = buttonUIState;
                                        objI = objO;
                                        premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                        passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                        premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                z = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0;
                PassUpsellOfferCardUiState passUpsellOfferCardUiState6 = (PassUpsellOfferCardUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7;
                PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState7 = (PremiumBusIncludedInPassBannerUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState15 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType13 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                premiumBusFareDetailsDataState3 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                premiumBusFareDetailsSharedContext3 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                premiumBusFareDetailsComponentDataState3 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                passUpsellOfferCardUiState2 = passUpsellOfferCardUiState6;
                premiumBusFareDetailsBottomSheetType4 = premiumBusFareDetailsBottomSheetType13;
                chaloTextUIState2 = chaloTextUIState15;
                premiumBusIncludedInPassBannerUiState3 = premiumBusIncludedInPassBannerUiState7;
                premiumBusFareSplitSectionUiState = (PremiumBusFareSplitSectionUiState) objI;
                if (premiumBusFareDetailsDataState3.h) {
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusFareDetailsSharedContext3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = function3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareDetailsBottomSheetType4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = chaloTextUIState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusIncludedInPassBannerUiState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = passUpsellOfferCardUiState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareSplitSectionUiState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 5;
                    objM = m(premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objM != coroutineSingletons) {
                        premiumBusFareDetailsBottomSheetType6 = premiumBusFareDetailsBottomSheetType4;
                        premiumBusFareSplitSectionUiState3 = premiumBusFareSplitSectionUiState;
                        objI = objM;
                        z2 = z;
                        premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                        premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                        chaloTextUIState3 = chaloTextUIState2;
                        premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType6;
                        premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState3;
                        passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                        function4 = function3;
                        premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                        loadingDialogUIState = (LoadingDialogUIState) objI;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                        objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objI != coroutineSingletons) {
                            TextUIState.ChaloTextUIState chaloTextUIState16 = chaloTextUIState3;
                            function5 = function4;
                            loadingDialogUIState2 = loadingDialogUIState;
                            passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                            chaloTextUIState4 = chaloTextUIState16;
                            z3 = z2;
                            premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                            premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                            premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                            premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                            if (premiumBusFareDetailsBottomSheetType7 != null) {
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                                objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objI != coroutineSingletons) {
                                    function6 = function5;
                                    premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1112 = premiumBusFareSplitSectionUiState4;
                                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState1112;
                                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                    objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objP != coroutineSingletons) {
                                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1113 = premiumBusFareSplitSectionUiState5;
                                        objI = objP;
                                        loadingDialogUIState3 = loadingDialogUIState2;
                                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                        premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState1113;
                                        buttonUIState = (ButtonUIState) objI;
                                        StringEnum stringEnum17 = StringEnum.REMOVE;
                                        fq0 fq0Var17 = new fq0(function6, 23);
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                        objO = o(stringEnum17, true, fq0Var17, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                        if (objO != coroutineSingletons) {
                                            loadingDialogUIState4 = loadingDialogUIState3;
                                            buttonUIState2 = buttonUIState;
                                            objI = objO;
                                            premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                            passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                            premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                        }
                                    }
                                }
                            } else {
                                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                                function6 = function5;
                                premiumBusFareDetailsBottomSheetUiState = null;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objP != coroutineSingletons) {
                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1114 = premiumBusFareSplitSectionUiState5;
                                    objI = objP;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                    premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState1114;
                                    buttonUIState = (ButtonUIState) objI;
                                    StringEnum stringEnum18 = StringEnum.REMOVE;
                                    fq0 fq0Var18 = new fq0(function6, 23);
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                    objO = o(stringEnum18, true, fq0Var18, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objO != coroutineSingletons) {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        buttonUIState2 = buttonUIState;
                                        objI = objO;
                                        premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                        passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                        premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z2 = z;
                    passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                    function4 = function3;
                    premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                    premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                    premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType4;
                    premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                    chaloTextUIState3 = chaloTextUIState2;
                    loadingDialogUIState = null;
                    premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                    objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objI != coroutineSingletons) {
                        TextUIState.ChaloTextUIState chaloTextUIState17 = chaloTextUIState3;
                        function5 = function4;
                        loadingDialogUIState2 = loadingDialogUIState;
                        passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                        chaloTextUIState4 = chaloTextUIState17;
                        z3 = z2;
                        premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                        premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                        premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                        premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                        if (premiumBusFareDetailsBottomSheetType7 != null) {
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                            objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objI != coroutineSingletons) {
                                function6 = function5;
                                premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1115 = premiumBusFareSplitSectionUiState4;
                                premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState1115;
                                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                                objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objP != coroutineSingletons) {
                                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1116 = premiumBusFareSplitSectionUiState5;
                                    objI = objP;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                    premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                    premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState1116;
                                    buttonUIState = (ButtonUIState) objI;
                                    StringEnum stringEnum19 = StringEnum.REMOVE;
                                    fq0 fq0Var19 = new fq0(function6, 23);
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                    objO = o(stringEnum19, true, fq0Var19, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                    if (objO != coroutineSingletons) {
                                        loadingDialogUIState4 = loadingDialogUIState3;
                                        buttonUIState2 = buttonUIState;
                                        objI = objO;
                                        premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                        passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                        premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                    }
                                }
                            }
                        } else {
                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                            function6 = function5;
                            premiumBusFareDetailsBottomSheetUiState = null;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                            objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objP != coroutineSingletons) {
                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1117 = premiumBusFareSplitSectionUiState5;
                                objI = objP;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState1117;
                                buttonUIState = (ButtonUIState) objI;
                                StringEnum stringEnum110 = StringEnum.REMOVE;
                                fq0 fq0Var110 = new fq0(function6, 23);
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                objO = o(stringEnum110, true, fq0Var110, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objO != coroutineSingletons) {
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    buttonUIState2 = buttonUIState;
                                    objI = objO;
                                    premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                    passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                    premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                z = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0;
                premiumBusFareSplitSectionUiState3 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7;
                passUpsellOfferCardUiState2 = (PassUpsellOfferCardUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                premiumBusIncludedInPassBannerUiState3 = (PremiumBusIncludedInPassBannerUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                premiumBusFareDetailsBottomSheetType6 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                premiumBusFareDetailsSharedContext3 = (PremiumBusFareDetailsSharedContext) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                premiumBusFareDetailsComponentDataState3 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                z2 = z;
                premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsSharedContext3;
                premiumBusFareDetailsComponentDataState4 = premiumBusFareDetailsComponentDataState3;
                chaloTextUIState3 = chaloTextUIState2;
                premiumBusFareDetailsBottomSheetType5 = premiumBusFareDetailsBottomSheetType6;
                premiumBusFareSplitSectionUiState2 = premiumBusFareSplitSectionUiState3;
                passUpsellOfferCardUiState3 = passUpsellOfferCardUiState2;
                function4 = function3;
                premiumBusIncludedInPassBannerUiState4 = premiumBusIncludedInPassBannerUiState3;
                loadingDialogUIState = (LoadingDialogUIState) objI;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusFareDetailsBottomSheetType5;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = chaloTextUIState3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusIncludedInPassBannerUiState4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = passUpsellOfferCardUiState3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareSplitSectionUiState2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = loadingDialogUIState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 6;
                objI = i(premiumBusFareDetailsSharedContext4, null, true, function4, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                if (objI != coroutineSingletons) {
                    TextUIState.ChaloTextUIState chaloTextUIState18 = chaloTextUIState3;
                    function5 = function4;
                    loadingDialogUIState2 = loadingDialogUIState;
                    passUpsellOfferCardUiState4 = passUpsellOfferCardUiState3;
                    chaloTextUIState4 = chaloTextUIState18;
                    z3 = z2;
                    premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState2;
                    premiumBusIncludedInPassBannerUiState5 = premiumBusIncludedInPassBannerUiState4;
                    premiumBusFareDetailsBottomSheetType7 = premiumBusFareDetailsBottomSheetType5;
                    premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState4;
                    premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                    if (premiumBusFareDetailsBottomSheetType7 != null) {
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                        objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objI != coroutineSingletons) {
                            function6 = function5;
                            premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1118 = premiumBusFareSplitSectionUiState4;
                            premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                            premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState1118;
                            premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                            objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objP != coroutineSingletons) {
                                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState1119 = premiumBusFareSplitSectionUiState5;
                                objI = objP;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState1119;
                                buttonUIState = (ButtonUIState) objI;
                                StringEnum stringEnum111 = StringEnum.REMOVE;
                                fq0 fq0Var111 = new fq0(function6, 23);
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                                objO = o(stringEnum111, true, fq0Var111, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                                if (objO != coroutineSingletons) {
                                    loadingDialogUIState4 = loadingDialogUIState3;
                                    buttonUIState2 = buttonUIState;
                                    objI = objO;
                                    premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                    passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                    premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                                }
                            }
                        }
                    } else {
                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                        function6 = function5;
                        premiumBusFareDetailsBottomSheetUiState = null;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                        objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objP != coroutineSingletons) {
                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState11110 = premiumBusFareSplitSectionUiState5;
                            objI = objP;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState11110;
                            buttonUIState = (ButtonUIState) objI;
                            StringEnum stringEnum112 = StringEnum.REMOVE;
                            fq0 fq0Var112 = new fq0(function6, 23);
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                            objO = o(stringEnum112, true, fq0Var112, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objO != coroutineSingletons) {
                                loadingDialogUIState4 = loadingDialogUIState3;
                                buttonUIState2 = buttonUIState;
                                objI = objO;
                                premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                chaloTextUIState5 = chaloTextUIState4;
                                return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                z3 = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0;
                LoadingDialogUIState loadingDialogUIState5 = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7;
                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState20 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                passUpsellOfferCardUiState4 = (PassUpsellOfferCardUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                premiumBusIncludedInPassBannerUiState5 = (PremiumBusIncludedInPassBannerUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                premiumBusFareDetailsBottomSheetType7 = (PremiumBusFareDetailsBottomSheetType) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                function5 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                premiumBusFareDetailsComponentDataState5 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                premiumBusFareSplitSectionUiState4 = premiumBusFareSplitSectionUiState20;
                loadingDialogUIState2 = loadingDialogUIState5;
                premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) objI;
                if (premiumBusFareDetailsBottomSheetType7 != null) {
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = premiumBusFareDetailsComponentDataState5;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = function5;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = chaloTextUIState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusIncludedInPassBannerUiState5;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = passUpsellOfferCardUiState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareSplitSectionUiState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsTermsUiState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0 = z3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 7;
                    objI = A(premiumBusFareDetailsBottomSheetType7, function5, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objI != coroutineSingletons) {
                        function6 = function5;
                        premiumBusFareDetailsComponentDataState6 = premiumBusFareDetailsComponentDataState5;
                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState11111 = premiumBusFareSplitSectionUiState4;
                        premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                        premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState11111;
                        premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                        objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objP != coroutineSingletons) {
                            PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState11112 = premiumBusFareSplitSectionUiState5;
                            objI = objP;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState11112;
                            buttonUIState = (ButtonUIState) objI;
                            StringEnum stringEnum113 = StringEnum.REMOVE;
                            fq0 fq0Var113 = new fq0(function6, 23);
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                            premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                            objO = o(stringEnum113, true, fq0Var113, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                            if (objO != coroutineSingletons) {
                                loadingDialogUIState4 = loadingDialogUIState3;
                                buttonUIState2 = buttonUIState;
                                objI = objO;
                                premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                                passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                                premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                                chaloTextUIState5 = chaloTextUIState4;
                                return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                            }
                        }
                    }
                } else {
                    premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState4;
                    function6 = function5;
                    premiumBusFareDetailsBottomSheetUiState = null;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                    objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objP != coroutineSingletons) {
                        PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState11113 = premiumBusFareSplitSectionUiState5;
                        objI = objP;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                        premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState11113;
                        buttonUIState = (ButtonUIState) objI;
                        StringEnum stringEnum114 = StringEnum.REMOVE;
                        fq0 fq0Var114 = new fq0(function6, 23);
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                        premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                        objO = o(stringEnum114, true, fq0Var114, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                        if (objO != coroutineSingletons) {
                            loadingDialogUIState4 = loadingDialogUIState3;
                            buttonUIState2 = buttonUIState;
                            objI = objO;
                            premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                            passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                            premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                            chaloTextUIState5 = chaloTextUIState4;
                            return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                z3 = premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.Z$0;
                premiumBusFareDetailsTermsUiState = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7;
                loadingDialogUIState2 = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                premiumBusFareSplitSectionUiState4 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                passUpsellOfferCardUiState4 = (PassUpsellOfferCardUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                premiumBusIncludedInPassBannerUiState5 = (PremiumBusIncludedInPassBannerUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                function6 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                premiumBusFareDetailsComponentDataState6 = (PremiumBusFareDetailsComponentDataState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState11114 = premiumBusFareSplitSectionUiState4;
                premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objI;
                premiumBusFareSplitSectionUiState5 = premiumBusFareSplitSectionUiState11114;
                premiumBusFareDetailsComponentDataState5 = premiumBusFareDetailsComponentDataState6;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = function6;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = chaloTextUIState4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = premiumBusIncludedInPassBannerUiState5;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = passUpsellOfferCardUiState4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = premiumBusFareSplitSectionUiState5;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = loadingDialogUIState2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsTermsUiState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = premiumBusFareDetailsBottomSheetUiState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 8;
                objP = p(premiumBusFareDetailsComponentDataState5.e, !z3, function6, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                if (objP != coroutineSingletons) {
                    PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState11115 = premiumBusFareSplitSectionUiState5;
                    objI = objP;
                    loadingDialogUIState3 = loadingDialogUIState2;
                    premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState;
                    premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                    premiumBusFareSplitSectionUiState6 = premiumBusFareSplitSectionUiState11115;
                    buttonUIState = (ButtonUIState) objI;
                    StringEnum stringEnum115 = StringEnum.REMOVE;
                    fq0 fq0Var115 = new fq0(function6, 23);
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                    premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                    objO = o(stringEnum115, true, fq0Var115, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                    if (objO != coroutineSingletons) {
                        loadingDialogUIState4 = loadingDialogUIState3;
                        buttonUIState2 = buttonUIState;
                        objI = objO;
                        premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                        passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                        premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                        chaloTextUIState5 = chaloTextUIState4;
                        return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                    }
                }
                return coroutineSingletons;
            case 8:
                PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState3 = (PremiumBusFareDetailsBottomSheetUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7;
                PremiumBusFareDetailsTermsUiState premiumBusFareDetailsTermsUiState3 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                LoadingDialogUIState loadingDialogUIState6 = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                premiumBusFareSplitSectionUiState6 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                passUpsellOfferCardUiState4 = (PassUpsellOfferCardUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                premiumBusIncludedInPassBannerUiState5 = (PremiumBusIncludedInPassBannerUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                function6 = (Function1) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState3;
                loadingDialogUIState3 = loadingDialogUIState6;
                premiumBusFareDetailsTermsUiState2 = premiumBusFareDetailsTermsUiState3;
                buttonUIState = (ButtonUIState) objI;
                StringEnum stringEnum116 = StringEnum.REMOVE;
                fq0 fq0Var116 = new fq0(function6, 23);
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0 = chaloTextUIState4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1 = premiumBusIncludedInPassBannerUiState5;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2 = passUpsellOfferCardUiState4;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3 = premiumBusFareSplitSectionUiState6;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4 = loadingDialogUIState3;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5 = premiumBusFareDetailsTermsUiState2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6 = premiumBusFareDetailsBottomSheetUiState2;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7 = buttonUIState;
                premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.label = 9;
                objO = o(stringEnum116, true, fq0Var116, premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2);
                if (objO != coroutineSingletons) {
                    loadingDialogUIState4 = loadingDialogUIState3;
                    buttonUIState2 = buttonUIState;
                    objI = objO;
                    premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState6;
                    passUpsellOfferCardUiState5 = passUpsellOfferCardUiState4;
                    premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState5;
                    chaloTextUIState5 = chaloTextUIState4;
                    return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
                }
                return coroutineSingletons;
            case 9:
                ButtonUIState buttonUIState3 = (ButtonUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$7;
                premiumBusFareDetailsBottomSheetUiState2 = (PremiumBusFareDetailsBottomSheetUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$6;
                premiumBusFareDetailsTermsUiState2 = (PremiumBusFareDetailsTermsUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$5;
                LoadingDialogUIState loadingDialogUIState7 = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$4;
                PremiumBusFareSplitSectionUiState premiumBusFareSplitSectionUiState21 = (PremiumBusFareSplitSectionUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$3;
                PassUpsellOfferCardUiState passUpsellOfferCardUiState7 = (PassUpsellOfferCardUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$2;
                PremiumBusIncludedInPassBannerUiState premiumBusIncludedInPassBannerUiState8 = (PremiumBusIncludedInPassBannerUiState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState19 = (TextUIState.ChaloTextUIState) premiumBusFareDetailsUiStateFactory$toPassUpsellNudgeContent$2.L$0;
                ResultKt.b(objI);
                buttonUIState2 = buttonUIState3;
                chaloTextUIState5 = chaloTextUIState19;
                loadingDialogUIState4 = loadingDialogUIState7;
                premiumBusFareSplitSectionUiState7 = premiumBusFareSplitSectionUiState21;
                passUpsellOfferCardUiState5 = passUpsellOfferCardUiState7;
                premiumBusIncludedInPassBannerUiState6 = premiumBusIncludedInPassBannerUiState8;
                return new PremiumBusFareDetailsContent.PassUpsellNudge(chaloTextUIState5, premiumBusIncludedInPassBannerUiState6, passUpsellOfferCardUiState5, premiumBusFareSplitSectionUiState7, loadingDialogUIState4, premiumBusFareDetailsTermsUiState2, premiumBusFareDetailsBottomSheetUiState2, buttonUIState2, (ButtonUIState) objI);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0141  */
    /* JADX WARN: Code duplicated, block: B:35:0x0153  */
    /* JADX WARN: Code duplicated, block: B:37:0x015e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0167  */
    /* JADX WARN: Code duplicated, block: B:43:0x017a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0189  */
    /* JADX WARN: Code duplicated, block: B:48:0x0190  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object y(PremiumBusFareDetailsDataState premiumBusFareDetailsDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusFareDetailsUiStateFactory$toThroughPassContent$1 premiumBusFareDetailsUiStateFactory$toThroughPassContent$1;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState2;
        Function1 function2;
        PremiumBusFareDetailsUiStateFactory premiumBusFareDetailsUiStateFactory;
        PremiumBusTotalBookingsUiState premiumBusTotalBookingsUiState;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState3;
        Function1 function3;
        ButtonUIStateFactory buttonUIStateFactory;
        ButtonUIState buttonUIStateG;
        Function1 function4;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState4;
        PremiumBusTotalBookingsUiState premiumBusTotalBookingsUiState2;
        ButtonUIState buttonUIState;
        LoadingDialogUIState loadingDialogUIState;
        PremiumBusFareDetailsBottomSheetType premiumBusFareDetailsBottomSheetType;
        ButtonUIState buttonUIState2;
        LoadingDialogUIState loadingDialogUIState2;
        PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState;
        Object objA;
        Function1 function5;
        String str;
        PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState2;
        LoadingDialogUIState loadingDialogUIState3;
        PremiumBusTotalBookingsUiState premiumBusTotalBookingsUiState3;
        PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState3;
        LoadingDialogUIState loadingDialogUIState4;
        PremiumBusTotalBookingsUiState premiumBusTotalBookingsUiState4;
        ButtonUIState buttonUIState3;
        if (continuationImpl instanceof PremiumBusFareDetailsUiStateFactory$toThroughPassContent$1) {
            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1 = (PremiumBusFareDetailsUiStateFactory$toThroughPassContent$1) continuationImpl;
            int i = premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1 = new PremiumBusFareDetailsUiStateFactory$toThroughPassContent$1(this, continuationImpl);
            }
        } else {
            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1 = new PremiumBusFareDetailsUiStateFactory$toThroughPassContent$1(this, continuationImpl);
        }
        Object objB = premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label;
        StringProvider stringProvider = this.f7555a;
        ConfirmationDialogUiState confirmationDialogUiState = null;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState;
            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState2;
            function2 = function1;
            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function2;
            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = this;
            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 1;
            objB = stringProvider.b(StringEnum.TOTAL_BOOKINGS, new Object[0], premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
            if (objB != coroutineSingletons) {
                premiumBusFareDetailsUiStateFactory = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            premiumBusFareDetailsUiStateFactory = (PremiumBusFareDetailsUiStateFactory) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2;
            Function1 function6 = (Function1) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1;
            PremiumBusFareDetailsDataState premiumBusFareDetailsDataState5 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0;
            ResultKt.b(objB);
            function2 = function6;
            premiumBusFareDetailsDataState2 = premiumBusFareDetailsDataState5;
        } else {
            if (i2 == 2) {
                ButtonUIStateFactory buttonUIStateFactory2 = (ButtonUIStateFactory) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3;
                premiumBusTotalBookingsUiState = (PremiumBusTotalBookingsUiState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1;
                premiumBusFareDetailsDataState3 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0;
                ResultKt.b(objB);
                buttonUIStateFactory = buttonUIStateFactory2;
                buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new fq0(function3, 22), null, null, !premiumBusFareDetailsDataState3.g, 0.0f, 44);
                if (premiumBusFareDetailsDataState3.h) {
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState3;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function3;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIStateG;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 3;
                    objB = m(premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
                    if (objB != coroutineSingletons) {
                        premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                        ButtonUIState buttonUIState4 = buttonUIStateG;
                        loadingDialogUIState = (LoadingDialogUIState) objB;
                        function4 = function3;
                        premiumBusTotalBookingsUiState2 = premiumBusTotalBookingsUiState;
                        buttonUIState = buttonUIState4;
                        premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsDataState4.q;
                        if (premiumBusFareDetailsBottomSheetType == null) {
                            buttonUIState2 = buttonUIState;
                            loadingDialogUIState2 = loadingDialogUIState;
                            premiumBusFareDetailsBottomSheetUiState = null;
                            str = premiumBusFareDetailsDataState4.r;
                            if (str != null) {
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                                objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                                if (objB != coroutineSingletons) {
                                    premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                                    loadingDialogUIState4 = loadingDialogUIState2;
                                    premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                                    buttonUIState3 = buttonUIState2;
                                }
                            } else {
                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                            }
                            return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                        }
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState4;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function4;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIState;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = loadingDialogUIState;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 4;
                        objA = A(premiumBusFareDetailsBottomSheetType, function4, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
                        if (objA != coroutineSingletons) {
                            function5 = function4;
                            objB = objA;
                            LoadingDialogUIState loadingDialogUIState5 = loadingDialogUIState;
                            premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objB;
                            function4 = function5;
                            buttonUIState2 = buttonUIState;
                            loadingDialogUIState2 = loadingDialogUIState5;
                            str = premiumBusFareDetailsDataState4.r;
                            if (str != null) {
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                                objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                                if (objB != coroutineSingletons) {
                                    premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                                    loadingDialogUIState4 = loadingDialogUIState2;
                                    premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                                    buttonUIState3 = buttonUIState2;
                                }
                            } else {
                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                            }
                            return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                        }
                    }
                } else {
                    function4 = function3;
                    premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                    premiumBusTotalBookingsUiState2 = premiumBusTotalBookingsUiState;
                    buttonUIState = buttonUIStateG;
                    loadingDialogUIState = null;
                    premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsDataState4.q;
                    if (premiumBusFareDetailsBottomSheetType == null) {
                        buttonUIState2 = buttonUIState;
                        loadingDialogUIState2 = loadingDialogUIState;
                        premiumBusFareDetailsBottomSheetUiState = null;
                        str = premiumBusFareDetailsDataState4.r;
                        if (str != null) {
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                            objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                            if (objB != coroutineSingletons) {
                                premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                                loadingDialogUIState4 = loadingDialogUIState2;
                                premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                                buttonUIState3 = buttonUIState2;
                            }
                        } else {
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                        }
                        return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                    }
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState4;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function4;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState2;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIState;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 4;
                    objA = A(premiumBusFareDetailsBottomSheetType, function4, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
                    if (objA != coroutineSingletons) {
                        function5 = function4;
                        objB = objA;
                        LoadingDialogUIState loadingDialogUIState6 = loadingDialogUIState;
                        premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objB;
                        function4 = function5;
                        buttonUIState2 = buttonUIState;
                        loadingDialogUIState2 = loadingDialogUIState6;
                        str = premiumBusFareDetailsDataState4.r;
                        if (str != null) {
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                            objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                            if (objB != coroutineSingletons) {
                                premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                                loadingDialogUIState4 = loadingDialogUIState2;
                                premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                                buttonUIState3 = buttonUIState2;
                            }
                        } else {
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                        }
                        return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                buttonUIStateG = (ButtonUIState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3;
                premiumBusTotalBookingsUiState = (PremiumBusTotalBookingsUiState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2;
                function3 = (Function1) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1;
                premiumBusFareDetailsDataState4 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0;
                ResultKt.b(objB);
                ButtonUIState buttonUIState5 = buttonUIStateG;
                loadingDialogUIState = (LoadingDialogUIState) objB;
                function4 = function3;
                premiumBusTotalBookingsUiState2 = premiumBusTotalBookingsUiState;
                buttonUIState = buttonUIState5;
                premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsDataState4.q;
                if (premiumBusFareDetailsBottomSheetType == null) {
                    buttonUIState2 = buttonUIState;
                    loadingDialogUIState2 = loadingDialogUIState;
                    premiumBusFareDetailsBottomSheetUiState = null;
                    str = premiumBusFareDetailsDataState4.r;
                    if (str != null) {
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                        objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                        if (objB != coroutineSingletons) {
                            premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState4 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                            buttonUIState3 = buttonUIState2;
                        }
                    } else {
                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                    }
                    return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                }
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState4;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function4;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState2;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIState;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = loadingDialogUIState;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 4;
                objA = A(premiumBusFareDetailsBottomSheetType, function4, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
                if (objA != coroutineSingletons) {
                    function5 = function4;
                    objB = objA;
                    LoadingDialogUIState loadingDialogUIState7 = loadingDialogUIState;
                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objB;
                    function4 = function5;
                    buttonUIState2 = buttonUIState;
                    loadingDialogUIState2 = loadingDialogUIState7;
                    str = premiumBusFareDetailsDataState4.r;
                    if (str != null) {
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                        objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                        if (objB != coroutineSingletons) {
                            premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState4 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                            buttonUIState3 = buttonUIState2;
                        }
                    } else {
                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                    }
                    return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                loadingDialogUIState = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4;
                buttonUIState = (ButtonUIState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3;
                premiumBusTotalBookingsUiState2 = (PremiumBusTotalBookingsUiState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2;
                function5 = (Function1) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1;
                premiumBusFareDetailsDataState4 = (PremiumBusFareDetailsDataState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0;
                ResultKt.b(objB);
                LoadingDialogUIState loadingDialogUIState8 = loadingDialogUIState;
                premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objB;
                function4 = function5;
                buttonUIState2 = buttonUIState;
                loadingDialogUIState2 = loadingDialogUIState8;
                str = premiumBusFareDetailsDataState4.r;
                if (str != null) {
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                    objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                    if (objB != coroutineSingletons) {
                        premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                        loadingDialogUIState4 = loadingDialogUIState2;
                        premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                        buttonUIState3 = buttonUIState2;
                    }
                    return coroutineSingletons;
                }
                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                loadingDialogUIState3 = loadingDialogUIState2;
                premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumBusFareDetailsBottomSheetUiState3 = (PremiumBusFareDetailsBottomSheetUiState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3;
            loadingDialogUIState4 = (LoadingDialogUIState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2;
            buttonUIState3 = (ButtonUIState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1;
            premiumBusTotalBookingsUiState4 = (PremiumBusTotalBookingsUiState) premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0;
            ResultKt.b(objB);
        }
        confirmationDialogUiState = (ConfirmationDialogUiState) objB;
        premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState4;
        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState3;
        loadingDialogUIState3 = loadingDialogUIState4;
        buttonUIState2 = buttonUIState3;
        return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
        premiumBusFareDetailsUiStateFactory.getClass();
        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        PremiumBusTotalBookingsUiState premiumBusTotalBookingsUiState5 = new PremiumBusTotalBookingsUiState(new TextUIState.ChaloTextUIState((String) objB, uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState("1", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState2;
        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function2;
        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState5;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIStateFactory3;
        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 2;
        objB = stringProvider.b(StringEnum.CAB_BOOK, new Object[0], premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
        if (objB != coroutineSingletons) {
            premiumBusTotalBookingsUiState = premiumBusTotalBookingsUiState5;
            premiumBusFareDetailsDataState3 = premiumBusFareDetailsDataState2;
            function3 = function2;
            buttonUIStateFactory = buttonUIStateFactory3;
            buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new fq0(function3, 22), null, null, !premiumBusFareDetailsDataState3.g, 0.0f, 44);
            if (premiumBusFareDetailsDataState3.h) {
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState3;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function3;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIStateG;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 3;
                objB = m(premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
                if (objB != coroutineSingletons) {
                    premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                    ButtonUIState buttonUIState6 = buttonUIStateG;
                    loadingDialogUIState = (LoadingDialogUIState) objB;
                    function4 = function3;
                    premiumBusTotalBookingsUiState2 = premiumBusTotalBookingsUiState;
                    buttonUIState = buttonUIState6;
                    premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsDataState4.q;
                    if (premiumBusFareDetailsBottomSheetType == null) {
                        buttonUIState2 = buttonUIState;
                        loadingDialogUIState2 = loadingDialogUIState;
                        premiumBusFareDetailsBottomSheetUiState = null;
                        str = premiumBusFareDetailsDataState4.r;
                        if (str != null) {
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                            objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                            if (objB != coroutineSingletons) {
                                premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                                loadingDialogUIState4 = loadingDialogUIState2;
                                premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                                buttonUIState3 = buttonUIState2;
                                confirmationDialogUiState = (ConfirmationDialogUiState) objB;
                                premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState4;
                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState3;
                                loadingDialogUIState3 = loadingDialogUIState4;
                                buttonUIState2 = buttonUIState3;
                            }
                        } else {
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                        }
                        return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                    }
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState4;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function4;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState2;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIState;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = loadingDialogUIState;
                    premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 4;
                    objA = A(premiumBusFareDetailsBottomSheetType, function4, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
                    if (objA != coroutineSingletons) {
                        function5 = function4;
                        objB = objA;
                        LoadingDialogUIState loadingDialogUIState9 = loadingDialogUIState;
                        premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objB;
                        function4 = function5;
                        buttonUIState2 = buttonUIState;
                        loadingDialogUIState2 = loadingDialogUIState9;
                        str = premiumBusFareDetailsDataState4.r;
                        if (str != null) {
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                            premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                            objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                            if (objB != coroutineSingletons) {
                                premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                                loadingDialogUIState4 = loadingDialogUIState2;
                                premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                                buttonUIState3 = buttonUIState2;
                                confirmationDialogUiState = (ConfirmationDialogUiState) objB;
                                premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState4;
                                premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState3;
                                loadingDialogUIState3 = loadingDialogUIState4;
                                buttonUIState2 = buttonUIState3;
                            }
                        } else {
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                        }
                        return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                    }
                }
            } else {
                function4 = function3;
                premiumBusFareDetailsDataState4 = premiumBusFareDetailsDataState3;
                premiumBusTotalBookingsUiState2 = premiumBusTotalBookingsUiState;
                buttonUIState = buttonUIStateG;
                loadingDialogUIState = null;
                premiumBusFareDetailsBottomSheetType = premiumBusFareDetailsDataState4.q;
                if (premiumBusFareDetailsBottomSheetType == null) {
                    buttonUIState2 = buttonUIState;
                    loadingDialogUIState2 = loadingDialogUIState;
                    premiumBusFareDetailsBottomSheetUiState = null;
                    str = premiumBusFareDetailsDataState4.r;
                    if (str != null) {
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                        objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                        if (objB != coroutineSingletons) {
                            premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState4 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                            buttonUIState3 = buttonUIState2;
                            confirmationDialogUiState = (ConfirmationDialogUiState) objB;
                            premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState4;
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState3;
                            loadingDialogUIState3 = loadingDialogUIState4;
                            buttonUIState2 = buttonUIState3;
                        }
                    } else {
                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                    }
                    return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                }
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusFareDetailsDataState4;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = function4;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = premiumBusTotalBookingsUiState2;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = buttonUIState;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = loadingDialogUIState;
                premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 4;
                objA = A(premiumBusFareDetailsBottomSheetType, function4, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1);
                if (objA != coroutineSingletons) {
                    function5 = function4;
                    objB = objA;
                    LoadingDialogUIState loadingDialogUIState10 = loadingDialogUIState;
                    premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) objB;
                    function4 = function5;
                    buttonUIState2 = buttonUIState;
                    loadingDialogUIState2 = loadingDialogUIState10;
                    str = premiumBusFareDetailsDataState4.r;
                    if (str != null) {
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$0 = premiumBusTotalBookingsUiState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$1 = buttonUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$2 = loadingDialogUIState2;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$3 = premiumBusFareDetailsBottomSheetUiState;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.L$4 = null;
                        premiumBusFareDetailsUiStateFactory$toThroughPassContent$1.label = 5;
                        objB = v(str, premiumBusFareDetailsUiStateFactory$toThroughPassContent$1, function4);
                        if (objB != coroutineSingletons) {
                            premiumBusFareDetailsBottomSheetUiState3 = premiumBusFareDetailsBottomSheetUiState;
                            loadingDialogUIState4 = loadingDialogUIState2;
                            premiumBusTotalBookingsUiState4 = premiumBusTotalBookingsUiState2;
                            buttonUIState3 = buttonUIState2;
                            confirmationDialogUiState = (ConfirmationDialogUiState) objB;
                            premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState4;
                            premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState3;
                            loadingDialogUIState3 = loadingDialogUIState4;
                            buttonUIState2 = buttonUIState3;
                        }
                    } else {
                        premiumBusFareDetailsBottomSheetUiState2 = premiumBusFareDetailsBottomSheetUiState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        premiumBusTotalBookingsUiState3 = premiumBusTotalBookingsUiState2;
                    }
                    return new PremiumBusFareDetailsContent.ThroughPass(premiumBusTotalBookingsUiState3, buttonUIState2, loadingDialogUIState3, premiumBusFareDetailsBottomSheetUiState2, confirmationDialogUiState);
                }
            }
        }
        return coroutineSingletons;
    }
}
