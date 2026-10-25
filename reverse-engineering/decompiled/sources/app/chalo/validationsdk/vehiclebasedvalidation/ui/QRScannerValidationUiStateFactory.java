package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.graphics.Color;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.data.ProductBookingBranding;
import app.chalo.extensions.UtilityExtensionsKt;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.components.RegularBusPickupScheduleTimeViewState;
import app.chalo.uistate.components.RegularBusPickupScheduleUiState;
import app.chalo.uistate.components.RegularBusTicketAmountDetailsUiState;
import app.chalo.uistate.components.RegularBusTicketContainerUiState;
import app.chalo.uistate.components.RegularBusTicketReferenceNumberUiState;
import app.chalo.uistate.components.RegularBusTicketTripDetailsUiState;
import app.chalo.uistate.components.TicketRouteNameUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.ErrorWithMsgAndRetryUISpecs;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.AlertTextWithIconSpec;
import app.chalo.uistate.text.AlertTextWithIconUiState;
import app.chalo.uistate.text.AlertTextWithIconUiStateFactory;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.lx0;
import defpackage.lz0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QRScannerValidationUiStateFactory;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QRScannerValidationUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f10724a;
    public final CityProvider b;
    public final TimeUtilsContract c;
    public final String d;

    public QRScannerValidationUiStateFactory(StringProvider stringProvider, CityProvider cityProvider, TimeUtilsContract timeUtilsContract) {
        String str;
        this.f10724a = stringProvider;
        this.b = cityProvider;
        this.c = timeUtilsContract;
        CityAppModel cityAppModel = (CityAppModel) cityProvider.getE().getValue();
        this.d = (cityAppModel == null || (str = cityAppModel.l) == null) ? "Asia/Kolkata" : str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0129  */
    /* JADX WARN: Code duplicated, block: B:30:0x0145  */
    /* JADX WARN: Code duplicated, block: B:33:0x0151  */
    /* JADX WARN: Code duplicated, block: B:34:0x0169  */
    /* JADX WARN: Code duplicated, block: B:36:0x016d  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d2 A[PHI: r1 r2 r3 r6 r12 r13 r14 r15
      0x01d2: PHI (r1v20 app.chalo.uistate.text.AlertTextWithIconUiState) = (r1v17 app.chalo.uistate.text.AlertTextWithIconUiState), (r1v23 app.chalo.uistate.text.AlertTextWithIconUiState) binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r2v17 app.chalo.uistate.image.ImageUIState) = (r2v14 app.chalo.uistate.image.ImageUIState), (r2v19 app.chalo.uistate.image.ImageUIState) binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r3v16 java.lang.Object) = (r3v15 java.lang.Object), (r3v1 java.lang.Object) binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r6v15 app.chalo.validationsdk.vehiclebasedvalidation.ui.ValidateDetailButtonUIState) = 
      (r6v12 app.chalo.validationsdk.vehiclebasedvalidation.ui.ValidateDetailButtonUIState)
      (r6v18 app.chalo.validationsdk.vehiclebasedvalidation.ui.ValidateDetailButtonUIState)
     binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r12v13 app.chalo.validationsdk.vehiclebasedvalidation.ui.QrContainerUiState) = 
      (r12v10 app.chalo.validationsdk.vehiclebasedvalidation.ui.QrContainerUiState)
      (r12v16 app.chalo.validationsdk.vehiclebasedvalidation.ui.QrContainerUiState)
     binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r13v11 app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardUIState) = 
      (r13v8 app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardUIState)
      (r13v13 app.chalo.validationsdk.vehiclebasedvalidation.ui.TicketCardUIState)
     binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r14v5 kotlin.jvm.functions.Function1) = (r14v2 kotlin.jvm.functions.Function1), (r14v7 kotlin.jvm.functions.Function1) binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r15v6 app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState) = 
      (r15v3 app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState)
      (r15v8 app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState)
     binds: [B:53:0x01cf, B:15:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0217  */
    /* JADX WARN: Code duplicated, block: B:66:0x023e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(QRScannerDataState qRScannerDataState, Function1 function1, ContinuationImpl continuationImpl) {
        QRScannerValidationUiStateFactory$convertToUiState$1 qRScannerValidationUiStateFactory$convertToUiState$1;
        TicketCardUIState ticketCardUIState;
        Object objF;
        QRScannerDataState qRScannerDataState2;
        Function1 function2;
        TicketCardUIState ticketCardUIState2;
        QrContainerUiState qrContainerUiState;
        Object objE;
        QRScannerDataState qRScannerDataState3;
        Function1 function3;
        QrContainerUiState qrContainerUiState2;
        ValidateDetailButtonUIState validateDetailButtonUIState;
        ProductBookingBranding productBookingBranding;
        ImageUIState imageUIState;
        AlertTextWithIconUiStateFactory alertTextWithIconUiStateFactory;
        Object objB;
        TicketCardUIState ticketCardUIState3;
        Function1 function4;
        ImageUIState imageUIState2;
        QrContainerUiState qrContainerUiState3;
        ValidateDetailButtonUIState validateDetailButtonUIState2;
        AlertTextWithIconUiStateFactory alertTextWithIconUiStateFactory2;
        AlertTextWithIconUiState alertTextWithIconUiStateA;
        QRScannerToolbarUIState qRScannerToolbarUIState;
        Object objB2;
        QrContainerUiState qrContainerUiState4;
        ValidateDetailButtonUIState validateDetailButtonUIState3;
        AlertTextWithIconUiState alertTextWithIconUiState;
        QRScannerToolbarUIState qRScannerToolbarUIState2;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry;
        QRScannerToolbarUIState qRScannerToolbarUIState3;
        ImageUIState imageUIState3;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry2;
        QrContainerUiState qrContainerUiState5;
        TicketCardUIState ticketCardUIState4;
        LoadingDialogUIState loadingDialogUIState;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Object objB3;
        QRScannerToolbarUIState qRScannerToolbarUIState4;
        ImageUIState imageUIState4;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry3;
        ValidateDetailButtonUIState validateDetailButtonUIState4;
        TicketCardUIState ticketCardUIState5;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        QRScannerDataState qRScannerDataState4 = qRScannerDataState;
        Function1 function5 = function1;
        if (continuationImpl instanceof QRScannerValidationUiStateFactory$convertToUiState$1) {
            qRScannerValidationUiStateFactory$convertToUiState$1 = (QRScannerValidationUiStateFactory$convertToUiState$1) continuationImpl;
            int i = qRScannerValidationUiStateFactory$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRScannerValidationUiStateFactory$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                qRScannerValidationUiStateFactory$convertToUiState$1 = new QRScannerValidationUiStateFactory$convertToUiState$1(this, continuationImpl);
            }
        } else {
            qRScannerValidationUiStateFactory$convertToUiState$1 = new QRScannerValidationUiStateFactory$convertToUiState$1(this, continuationImpl);
        }
        Object objD = qRScannerValidationUiStateFactory$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRScannerValidationUiStateFactory$convertToUiState$1.label;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        StringProvider stringProvider = this.f10724a;
        switch (i2) {
            case 0:
                ResultKt.b(objD);
                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState4;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function5;
                qRScannerValidationUiStateFactory$convertToUiState$1.label = 1;
                objD = d(qRScannerDataState4, function5, qRScannerValidationUiStateFactory$convertToUiState$1);
                if (objD != obj) {
                    ticketCardUIState = (TicketCardUIState) objD;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState4;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function5;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState;
                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 2;
                    objF = f(qRScannerDataState4, qRScannerValidationUiStateFactory$convertToUiState$1);
                    if (objF != obj) {
                        qRScannerDataState2 = qRScannerDataState4;
                        function2 = function5;
                        ticketCardUIState2 = ticketCardUIState;
                        objD = objF;
                        qrContainerUiState = (QrContainerUiState) objD;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState;
                        qRScannerValidationUiStateFactory$convertToUiState$1.label = 3;
                        objE = e(qRScannerDataState2, function2, qRScannerValidationUiStateFactory$convertToUiState$1);
                        if (objE != obj) {
                            qRScannerDataState3 = qRScannerDataState2;
                            function3 = function2;
                            qrContainerUiState2 = qrContainerUiState;
                            objD = objE;
                            validateDetailButtonUIState = (ValidateDetailButtonUIState) objD;
                            productBookingBranding = qRScannerDataState3.m;
                            if (!(productBookingBranding instanceof ProductBookingBranding.Ondc)) {
                                imageUIState = new ImageUIState(IconType.ONDC_LOGO, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                            } else {
                                if ((productBookingBranding instanceof ProductBookingBranding.AgencyBranding) && !(productBookingBranding instanceof ProductBookingBranding.AgencyBrandingResource) && !(productBookingBranding instanceof ProductBookingBranding.AgencyBrandingText) && !(productBookingBranding instanceof ProductBookingBranding.AppResource) && !Intrinsics.d(productBookingBranding, ProductBookingBranding.None.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                imageUIState = null;
                            }
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState;
                            alertTextWithIconUiStateFactory = AlertTextWithIconUiStateFactory.f10077a;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateFactory;
                            qRScannerValidationUiStateFactory$convertToUiState$1.label = 4;
                            objB = stringProvider.b(StringEnum.CONDUCTOR_TICKET_VALIDATION_NOTE, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                            if (objB != obj) {
                                ticketCardUIState3 = ticketCardUIState2;
                                function4 = function3;
                                imageUIState2 = imageUIState;
                                qrContainerUiState3 = qrContainerUiState2;
                                validateDetailButtonUIState2 = validateDetailButtonUIState;
                                objD = objB;
                                alertTextWithIconUiStateFactory2 = alertTextWithIconUiStateFactory;
                                IconType iconType = IconType.IC_INFO;
                                alertTextWithIconUiStateFactory2.getClass();
                                alertTextWithIconUiStateA = AlertTextWithIconUiStateFactory.a((String) objD, black, iconType);
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function4;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState2;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState2;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateA;
                                qRScannerValidationUiStateFactory$convertToUiState$1.label = 5;
                                objD = c(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                                if (objD != obj) {
                                    qRScannerToolbarUIState = (QRScannerToolbarUIState) objD;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = ticketCardUIState3;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = qrContainerUiState3;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = validateDetailButtonUIState2;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = imageUIState2;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = alertTextWithIconUiStateA;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = qRScannerToolbarUIState;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 6;
                                    objB2 = b(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                                    if (objB2 != obj) {
                                        qrContainerUiState4 = qrContainerUiState3;
                                        validateDetailButtonUIState3 = validateDetailButtonUIState2;
                                        alertTextWithIconUiState = alertTextWithIconUiStateA;
                                        qRScannerToolbarUIState2 = qRScannerToolbarUIState;
                                        objD = objB2;
                                        errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) objD;
                                        if (qRScannerDataState3.k) {
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = ticketCardUIState3;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = qrContainerUiState4;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = validateDetailButtonUIState3;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = imageUIState2;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = alertTextWithIconUiState;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = qRScannerToolbarUIState2;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = errorWithMsgAndRetry;
                                            chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.L$7 = chaloTextStyleHelper;
                                            qRScannerValidationUiStateFactory$convertToUiState$1.label = 7;
                                            objB3 = stringProvider.b(StringEnum.LOADING, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                                            if (objB3 != obj) {
                                                qRScannerToolbarUIState4 = qRScannerToolbarUIState2;
                                                imageUIState4 = imageUIState2;
                                                errorWithMsgAndRetry3 = errorWithMsgAndRetry;
                                                objD = objB3;
                                                validateDetailButtonUIState4 = validateDetailButtonUIState3;
                                                ticketCardUIState5 = ticketCardUIState3;
                                                chaloTextStyleHelper2 = chaloTextStyleHelper;
                                                QrContainerUiState qrContainerUiState6 = qrContainerUiState4;
                                                imageUIState3 = imageUIState4;
                                                errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                                                ticketCardUIState4 = ticketCardUIState5;
                                                qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                                                validateDetailButtonUIState3 = validateDetailButtonUIState4;
                                                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                                                qrContainerUiState5 = qrContainerUiState6;
                                            }
                                        } else {
                                            qRScannerToolbarUIState3 = qRScannerToolbarUIState2;
                                            imageUIState3 = imageUIState2;
                                            errorWithMsgAndRetry2 = errorWithMsgAndRetry;
                                            qrContainerUiState5 = qrContainerUiState4;
                                            ticketCardUIState4 = ticketCardUIState3;
                                            loadingDialogUIState = null;
                                        }
                                        return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                Function1 function6 = (Function1) qRScannerValidationUiStateFactory$convertToUiState$1.L$1;
                QRScannerDataState qRScannerDataState5 = (QRScannerDataState) qRScannerValidationUiStateFactory$convertToUiState$1.L$0;
                ResultKt.b(objD);
                function5 = function6;
                qRScannerDataState4 = qRScannerDataState5;
                ticketCardUIState = (TicketCardUIState) objD;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState4;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function5;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState;
                qRScannerValidationUiStateFactory$convertToUiState$1.label = 2;
                objF = f(qRScannerDataState4, qRScannerValidationUiStateFactory$convertToUiState$1);
                if (objF != obj) {
                    qRScannerDataState2 = qRScannerDataState4;
                    function2 = function5;
                    ticketCardUIState2 = ticketCardUIState;
                    objD = objF;
                    qrContainerUiState = (QrContainerUiState) objD;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState;
                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 3;
                    objE = e(qRScannerDataState2, function2, qRScannerValidationUiStateFactory$convertToUiState$1);
                    if (objE != obj) {
                        qRScannerDataState3 = qRScannerDataState2;
                        function3 = function2;
                        qrContainerUiState2 = qrContainerUiState;
                        objD = objE;
                        validateDetailButtonUIState = (ValidateDetailButtonUIState) objD;
                        productBookingBranding = qRScannerDataState3.m;
                        if (!(productBookingBranding instanceof ProductBookingBranding.Ondc)) {
                            imageUIState = new ImageUIState(IconType.ONDC_LOGO, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                        } else {
                            if (productBookingBranding instanceof ProductBookingBranding.AgencyBranding) {
                            }
                            imageUIState = null;
                        }
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState;
                        alertTextWithIconUiStateFactory = AlertTextWithIconUiStateFactory.f10077a;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateFactory;
                        qRScannerValidationUiStateFactory$convertToUiState$1.label = 4;
                        objB = stringProvider.b(StringEnum.CONDUCTOR_TICKET_VALIDATION_NOTE, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                        if (objB != obj) {
                            ticketCardUIState3 = ticketCardUIState2;
                            function4 = function3;
                            imageUIState2 = imageUIState;
                            qrContainerUiState3 = qrContainerUiState2;
                            validateDetailButtonUIState2 = validateDetailButtonUIState;
                            objD = objB;
                            alertTextWithIconUiStateFactory2 = alertTextWithIconUiStateFactory;
                            IconType iconType2 = IconType.IC_INFO;
                            alertTextWithIconUiStateFactory2.getClass();
                            alertTextWithIconUiStateA = AlertTextWithIconUiStateFactory.a((String) objD, black, iconType2);
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function4;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateA;
                            qRScannerValidationUiStateFactory$convertToUiState$1.label = 5;
                            objD = c(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                            if (objD != obj) {
                                qRScannerToolbarUIState = (QRScannerToolbarUIState) objD;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = ticketCardUIState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = qrContainerUiState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = validateDetailButtonUIState2;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = imageUIState2;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = alertTextWithIconUiStateA;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = qRScannerToolbarUIState;
                                qRScannerValidationUiStateFactory$convertToUiState$1.label = 6;
                                objB2 = b(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                                if (objB2 != obj) {
                                    qrContainerUiState4 = qrContainerUiState3;
                                    validateDetailButtonUIState3 = validateDetailButtonUIState2;
                                    alertTextWithIconUiState = alertTextWithIconUiStateA;
                                    qRScannerToolbarUIState2 = qRScannerToolbarUIState;
                                    objD = objB2;
                                    errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) objD;
                                    if (qRScannerDataState3.k) {
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = ticketCardUIState3;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = qrContainerUiState4;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = validateDetailButtonUIState3;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = imageUIState2;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = alertTextWithIconUiState;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = qRScannerToolbarUIState2;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = errorWithMsgAndRetry;
                                        chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.L$7 = chaloTextStyleHelper;
                                        qRScannerValidationUiStateFactory$convertToUiState$1.label = 7;
                                        objB3 = stringProvider.b(StringEnum.LOADING, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                                        if (objB3 != obj) {
                                            qRScannerToolbarUIState4 = qRScannerToolbarUIState2;
                                            imageUIState4 = imageUIState2;
                                            errorWithMsgAndRetry3 = errorWithMsgAndRetry;
                                            objD = objB3;
                                            validateDetailButtonUIState4 = validateDetailButtonUIState3;
                                            ticketCardUIState5 = ticketCardUIState3;
                                            chaloTextStyleHelper2 = chaloTextStyleHelper;
                                            QrContainerUiState qrContainerUiState7 = qrContainerUiState4;
                                            imageUIState3 = imageUIState4;
                                            errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                                            ticketCardUIState4 = ticketCardUIState5;
                                            qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                                            validateDetailButtonUIState3 = validateDetailButtonUIState4;
                                            loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                                            qrContainerUiState5 = qrContainerUiState7;
                                        }
                                    } else {
                                        qRScannerToolbarUIState3 = qRScannerToolbarUIState2;
                                        imageUIState3 = imageUIState2;
                                        errorWithMsgAndRetry2 = errorWithMsgAndRetry;
                                        qrContainerUiState5 = qrContainerUiState4;
                                        ticketCardUIState4 = ticketCardUIState3;
                                        loadingDialogUIState = null;
                                    }
                                    return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
                                }
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 2:
                TicketCardUIState ticketCardUIState6 = (TicketCardUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$2;
                Function1 function7 = (Function1) qRScannerValidationUiStateFactory$convertToUiState$1.L$1;
                qRScannerDataState2 = (QRScannerDataState) qRScannerValidationUiStateFactory$convertToUiState$1.L$0;
                ResultKt.b(objD);
                ticketCardUIState2 = ticketCardUIState6;
                function2 = function7;
                qrContainerUiState = (QrContainerUiState) objD;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState;
                qRScannerValidationUiStateFactory$convertToUiState$1.label = 3;
                objE = e(qRScannerDataState2, function2, qRScannerValidationUiStateFactory$convertToUiState$1);
                if (objE != obj) {
                    qRScannerDataState3 = qRScannerDataState2;
                    function3 = function2;
                    qrContainerUiState2 = qrContainerUiState;
                    objD = objE;
                    validateDetailButtonUIState = (ValidateDetailButtonUIState) objD;
                    productBookingBranding = qRScannerDataState3.m;
                    if (!(productBookingBranding instanceof ProductBookingBranding.Ondc)) {
                        imageUIState = new ImageUIState(IconType.ONDC_LOGO, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                    } else {
                        if (productBookingBranding instanceof ProductBookingBranding.AgencyBranding) {
                        }
                        imageUIState = null;
                    }
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState;
                    alertTextWithIconUiStateFactory = AlertTextWithIconUiStateFactory.f10077a;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateFactory;
                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 4;
                    objB = stringProvider.b(StringEnum.CONDUCTOR_TICKET_VALIDATION_NOTE, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                    if (objB != obj) {
                        ticketCardUIState3 = ticketCardUIState2;
                        function4 = function3;
                        imageUIState2 = imageUIState;
                        qrContainerUiState3 = qrContainerUiState2;
                        validateDetailButtonUIState2 = validateDetailButtonUIState;
                        objD = objB;
                        alertTextWithIconUiStateFactory2 = alertTextWithIconUiStateFactory;
                        IconType iconType3 = IconType.IC_INFO;
                        alertTextWithIconUiStateFactory2.getClass();
                        alertTextWithIconUiStateA = AlertTextWithIconUiStateFactory.a((String) objD, black, iconType3);
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function4;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateA;
                        qRScannerValidationUiStateFactory$convertToUiState$1.label = 5;
                        objD = c(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                        if (objD != obj) {
                            qRScannerToolbarUIState = (QRScannerToolbarUIState) objD;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = ticketCardUIState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = qrContainerUiState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = validateDetailButtonUIState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = imageUIState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = alertTextWithIconUiStateA;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = qRScannerToolbarUIState;
                            qRScannerValidationUiStateFactory$convertToUiState$1.label = 6;
                            objB2 = b(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                            if (objB2 != obj) {
                                qrContainerUiState4 = qrContainerUiState3;
                                validateDetailButtonUIState3 = validateDetailButtonUIState2;
                                alertTextWithIconUiState = alertTextWithIconUiStateA;
                                qRScannerToolbarUIState2 = qRScannerToolbarUIState;
                                objD = objB2;
                                errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) objD;
                                if (qRScannerDataState3.k) {
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = ticketCardUIState3;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = qrContainerUiState4;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = validateDetailButtonUIState3;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = imageUIState2;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = alertTextWithIconUiState;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = qRScannerToolbarUIState2;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = errorWithMsgAndRetry;
                                    chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.L$7 = chaloTextStyleHelper;
                                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 7;
                                    objB3 = stringProvider.b(StringEnum.LOADING, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                                    if (objB3 != obj) {
                                        qRScannerToolbarUIState4 = qRScannerToolbarUIState2;
                                        imageUIState4 = imageUIState2;
                                        errorWithMsgAndRetry3 = errorWithMsgAndRetry;
                                        objD = objB3;
                                        validateDetailButtonUIState4 = validateDetailButtonUIState3;
                                        ticketCardUIState5 = ticketCardUIState3;
                                        chaloTextStyleHelper2 = chaloTextStyleHelper;
                                        QrContainerUiState qrContainerUiState8 = qrContainerUiState4;
                                        imageUIState3 = imageUIState4;
                                        errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                                        ticketCardUIState4 = ticketCardUIState5;
                                        qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                                        validateDetailButtonUIState3 = validateDetailButtonUIState4;
                                        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                                        qrContainerUiState5 = qrContainerUiState8;
                                    }
                                } else {
                                    qRScannerToolbarUIState3 = qRScannerToolbarUIState2;
                                    imageUIState3 = imageUIState2;
                                    errorWithMsgAndRetry2 = errorWithMsgAndRetry;
                                    qrContainerUiState5 = qrContainerUiState4;
                                    ticketCardUIState4 = ticketCardUIState3;
                                    loadingDialogUIState = null;
                                }
                                return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 3:
                qrContainerUiState2 = (QrContainerUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$3;
                ticketCardUIState2 = (TicketCardUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$2;
                function3 = (Function1) qRScannerValidationUiStateFactory$convertToUiState$1.L$1;
                QRScannerDataState qRScannerDataState6 = (QRScannerDataState) qRScannerValidationUiStateFactory$convertToUiState$1.L$0;
                ResultKt.b(objD);
                qRScannerDataState3 = qRScannerDataState6;
                validateDetailButtonUIState = (ValidateDetailButtonUIState) objD;
                productBookingBranding = qRScannerDataState3.m;
                if (!(productBookingBranding instanceof ProductBookingBranding.Ondc)) {
                    if (productBookingBranding instanceof ProductBookingBranding.AgencyBranding) {
                    }
                    imageUIState = null;
                    break;
                } else {
                    imageUIState = new ImageUIState(IconType.ONDC_LOGO, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                }
                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState;
                alertTextWithIconUiStateFactory = AlertTextWithIconUiStateFactory.f10077a;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateFactory;
                qRScannerValidationUiStateFactory$convertToUiState$1.label = 4;
                objB = stringProvider.b(StringEnum.CONDUCTOR_TICKET_VALIDATION_NOTE, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                if (objB != obj) {
                    ticketCardUIState3 = ticketCardUIState2;
                    function4 = function3;
                    imageUIState2 = imageUIState;
                    qrContainerUiState3 = qrContainerUiState2;
                    validateDetailButtonUIState2 = validateDetailButtonUIState;
                    objD = objB;
                    alertTextWithIconUiStateFactory2 = alertTextWithIconUiStateFactory;
                    IconType iconType4 = IconType.IC_INFO;
                    alertTextWithIconUiStateFactory2.getClass();
                    alertTextWithIconUiStateA = AlertTextWithIconUiStateFactory.a((String) objD, black, iconType4);
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function4;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateA;
                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 5;
                    objD = c(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                    if (objD != obj) {
                        qRScannerToolbarUIState = (QRScannerToolbarUIState) objD;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = ticketCardUIState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = qrContainerUiState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = validateDetailButtonUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = imageUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = alertTextWithIconUiStateA;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = qRScannerToolbarUIState;
                        qRScannerValidationUiStateFactory$convertToUiState$1.label = 6;
                        objB2 = b(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                        if (objB2 != obj) {
                            qrContainerUiState4 = qrContainerUiState3;
                            validateDetailButtonUIState3 = validateDetailButtonUIState2;
                            alertTextWithIconUiState = alertTextWithIconUiStateA;
                            qRScannerToolbarUIState2 = qRScannerToolbarUIState;
                            objD = objB2;
                            errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) objD;
                            if (qRScannerDataState3.k) {
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = ticketCardUIState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = qrContainerUiState4;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = validateDetailButtonUIState3;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = imageUIState2;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = alertTextWithIconUiState;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = qRScannerToolbarUIState2;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = errorWithMsgAndRetry;
                                chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                                qRScannerValidationUiStateFactory$convertToUiState$1.L$7 = chaloTextStyleHelper;
                                qRScannerValidationUiStateFactory$convertToUiState$1.label = 7;
                                objB3 = stringProvider.b(StringEnum.LOADING, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                                if (objB3 != obj) {
                                    qRScannerToolbarUIState4 = qRScannerToolbarUIState2;
                                    imageUIState4 = imageUIState2;
                                    errorWithMsgAndRetry3 = errorWithMsgAndRetry;
                                    objD = objB3;
                                    validateDetailButtonUIState4 = validateDetailButtonUIState3;
                                    ticketCardUIState5 = ticketCardUIState3;
                                    chaloTextStyleHelper2 = chaloTextStyleHelper;
                                    QrContainerUiState qrContainerUiState9 = qrContainerUiState4;
                                    imageUIState3 = imageUIState4;
                                    errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                                    ticketCardUIState4 = ticketCardUIState5;
                                    qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                                    validateDetailButtonUIState3 = validateDetailButtonUIState4;
                                    loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                                    qrContainerUiState5 = qrContainerUiState9;
                                }
                            } else {
                                qRScannerToolbarUIState3 = qRScannerToolbarUIState2;
                                imageUIState3 = imageUIState2;
                                errorWithMsgAndRetry2 = errorWithMsgAndRetry;
                                qrContainerUiState5 = qrContainerUiState4;
                                ticketCardUIState4 = ticketCardUIState3;
                                loadingDialogUIState = null;
                            }
                            return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
                        }
                    }
                }
                return obj;
            case 4:
                alertTextWithIconUiStateFactory2 = (AlertTextWithIconUiStateFactory) qRScannerValidationUiStateFactory$convertToUiState$1.L$6;
                imageUIState2 = (ImageUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$5;
                validateDetailButtonUIState2 = (ValidateDetailButtonUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$4;
                qrContainerUiState3 = (QrContainerUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$3;
                ticketCardUIState3 = (TicketCardUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$2;
                function4 = (Function1) qRScannerValidationUiStateFactory$convertToUiState$1.L$1;
                qRScannerDataState3 = (QRScannerDataState) qRScannerValidationUiStateFactory$convertToUiState$1.L$0;
                ResultKt.b(objD);
                IconType iconType5 = IconType.IC_INFO;
                alertTextWithIconUiStateFactory2.getClass();
                alertTextWithIconUiStateA = AlertTextWithIconUiStateFactory.a((String) objD, black, iconType5);
                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = function4;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = ticketCardUIState3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = qrContainerUiState3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = validateDetailButtonUIState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = imageUIState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = alertTextWithIconUiStateA;
                qRScannerValidationUiStateFactory$convertToUiState$1.label = 5;
                objD = c(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                if (objD != obj) {
                    qRScannerToolbarUIState = (QRScannerToolbarUIState) objD;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = ticketCardUIState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = qrContainerUiState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = validateDetailButtonUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = imageUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = alertTextWithIconUiStateA;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = qRScannerToolbarUIState;
                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 6;
                    objB2 = b(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                    if (objB2 != obj) {
                        qrContainerUiState4 = qrContainerUiState3;
                        validateDetailButtonUIState3 = validateDetailButtonUIState2;
                        alertTextWithIconUiState = alertTextWithIconUiStateA;
                        qRScannerToolbarUIState2 = qRScannerToolbarUIState;
                        objD = objB2;
                        errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) objD;
                        if (qRScannerDataState3.k) {
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = ticketCardUIState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = qrContainerUiState4;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = validateDetailButtonUIState3;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = imageUIState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = alertTextWithIconUiState;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = qRScannerToolbarUIState2;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = errorWithMsgAndRetry;
                            chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                            qRScannerValidationUiStateFactory$convertToUiState$1.L$7 = chaloTextStyleHelper;
                            qRScannerValidationUiStateFactory$convertToUiState$1.label = 7;
                            objB3 = stringProvider.b(StringEnum.LOADING, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                            if (objB3 != obj) {
                                qRScannerToolbarUIState4 = qRScannerToolbarUIState2;
                                imageUIState4 = imageUIState2;
                                errorWithMsgAndRetry3 = errorWithMsgAndRetry;
                                objD = objB3;
                                validateDetailButtonUIState4 = validateDetailButtonUIState3;
                                ticketCardUIState5 = ticketCardUIState3;
                                chaloTextStyleHelper2 = chaloTextStyleHelper;
                                QrContainerUiState qrContainerUiState10 = qrContainerUiState4;
                                imageUIState3 = imageUIState4;
                                errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                                ticketCardUIState4 = ticketCardUIState5;
                                qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                                validateDetailButtonUIState3 = validateDetailButtonUIState4;
                                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                                qrContainerUiState5 = qrContainerUiState10;
                            }
                        } else {
                            qRScannerToolbarUIState3 = qRScannerToolbarUIState2;
                            imageUIState3 = imageUIState2;
                            errorWithMsgAndRetry2 = errorWithMsgAndRetry;
                            qrContainerUiState5 = qrContainerUiState4;
                            ticketCardUIState4 = ticketCardUIState3;
                            loadingDialogUIState = null;
                        }
                        return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
                    }
                }
                return obj;
            case 5:
                alertTextWithIconUiStateA = (AlertTextWithIconUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$6;
                imageUIState2 = (ImageUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$5;
                validateDetailButtonUIState2 = (ValidateDetailButtonUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$4;
                qrContainerUiState3 = (QrContainerUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$3;
                ticketCardUIState3 = (TicketCardUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$2;
                function4 = (Function1) qRScannerValidationUiStateFactory$convertToUiState$1.L$1;
                qRScannerDataState3 = (QRScannerDataState) qRScannerValidationUiStateFactory$convertToUiState$1.L$0;
                ResultKt.b(objD);
                qRScannerToolbarUIState = (QRScannerToolbarUIState) objD;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = qRScannerDataState3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = ticketCardUIState3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = qrContainerUiState3;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = validateDetailButtonUIState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = imageUIState2;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = alertTextWithIconUiStateA;
                qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = qRScannerToolbarUIState;
                qRScannerValidationUiStateFactory$convertToUiState$1.label = 6;
                objB2 = b(qRScannerDataState3, function4, qRScannerValidationUiStateFactory$convertToUiState$1);
                if (objB2 != obj) {
                    qrContainerUiState4 = qrContainerUiState3;
                    validateDetailButtonUIState3 = validateDetailButtonUIState2;
                    alertTextWithIconUiState = alertTextWithIconUiStateA;
                    qRScannerToolbarUIState2 = qRScannerToolbarUIState;
                    objD = objB2;
                    errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) objD;
                    if (qRScannerDataState3.k) {
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = ticketCardUIState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = qrContainerUiState4;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = validateDetailButtonUIState3;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = imageUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = alertTextWithIconUiState;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = qRScannerToolbarUIState2;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = errorWithMsgAndRetry;
                        chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                        qRScannerValidationUiStateFactory$convertToUiState$1.L$7 = chaloTextStyleHelper;
                        qRScannerValidationUiStateFactory$convertToUiState$1.label = 7;
                        objB3 = stringProvider.b(StringEnum.LOADING, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                        if (objB3 != obj) {
                            qRScannerToolbarUIState4 = qRScannerToolbarUIState2;
                            imageUIState4 = imageUIState2;
                            errorWithMsgAndRetry3 = errorWithMsgAndRetry;
                            objD = objB3;
                            validateDetailButtonUIState4 = validateDetailButtonUIState3;
                            ticketCardUIState5 = ticketCardUIState3;
                            chaloTextStyleHelper2 = chaloTextStyleHelper;
                            QrContainerUiState qrContainerUiState11 = qrContainerUiState4;
                            imageUIState3 = imageUIState4;
                            errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                            ticketCardUIState4 = ticketCardUIState5;
                            qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                            validateDetailButtonUIState3 = validateDetailButtonUIState4;
                            loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                            qrContainerUiState5 = qrContainerUiState11;
                        }
                    } else {
                        qRScannerToolbarUIState3 = qRScannerToolbarUIState2;
                        imageUIState3 = imageUIState2;
                        errorWithMsgAndRetry2 = errorWithMsgAndRetry;
                        qrContainerUiState5 = qrContainerUiState4;
                        ticketCardUIState4 = ticketCardUIState3;
                        loadingDialogUIState = null;
                    }
                    return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
                }
                return obj;
            case 6:
                qRScannerToolbarUIState2 = (QRScannerToolbarUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$6;
                AlertTextWithIconUiState alertTextWithIconUiState2 = (AlertTextWithIconUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$5;
                ImageUIState imageUIState5 = (ImageUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$4;
                validateDetailButtonUIState3 = (ValidateDetailButtonUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$3;
                QrContainerUiState qrContainerUiState12 = (QrContainerUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$2;
                TicketCardUIState ticketCardUIState7 = (TicketCardUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$1;
                qRScannerDataState3 = (QRScannerDataState) qRScannerValidationUiStateFactory$convertToUiState$1.L$0;
                ResultKt.b(objD);
                alertTextWithIconUiState = alertTextWithIconUiState2;
                imageUIState2 = imageUIState5;
                qrContainerUiState4 = qrContainerUiState12;
                ticketCardUIState3 = ticketCardUIState7;
                errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) objD;
                if (qRScannerDataState3.k) {
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$0 = ticketCardUIState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$1 = qrContainerUiState4;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$2 = validateDetailButtonUIState3;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$3 = imageUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$4 = alertTextWithIconUiState;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$5 = qRScannerToolbarUIState2;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$6 = errorWithMsgAndRetry;
                    chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                    qRScannerValidationUiStateFactory$convertToUiState$1.L$7 = chaloTextStyleHelper;
                    qRScannerValidationUiStateFactory$convertToUiState$1.label = 7;
                    objB3 = stringProvider.b(StringEnum.LOADING, new Object[0], qRScannerValidationUiStateFactory$convertToUiState$1);
                    if (objB3 != obj) {
                        qRScannerToolbarUIState4 = qRScannerToolbarUIState2;
                        imageUIState4 = imageUIState2;
                        errorWithMsgAndRetry3 = errorWithMsgAndRetry;
                        objD = objB3;
                        validateDetailButtonUIState4 = validateDetailButtonUIState3;
                        ticketCardUIState5 = ticketCardUIState3;
                        chaloTextStyleHelper2 = chaloTextStyleHelper;
                        QrContainerUiState qrContainerUiState13 = qrContainerUiState4;
                        imageUIState3 = imageUIState4;
                        errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                        ticketCardUIState4 = ticketCardUIState5;
                        qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                        validateDetailButtonUIState3 = validateDetailButtonUIState4;
                        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                        qrContainerUiState5 = qrContainerUiState13;
                    }
                    return obj;
                }
                qRScannerToolbarUIState3 = qRScannerToolbarUIState2;
                imageUIState3 = imageUIState2;
                errorWithMsgAndRetry2 = errorWithMsgAndRetry;
                qrContainerUiState5 = qrContainerUiState4;
                ticketCardUIState4 = ticketCardUIState3;
                loadingDialogUIState = null;
                return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
            case 7:
                ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) qRScannerValidationUiStateFactory$convertToUiState$1.L$7;
                errorWithMsgAndRetry3 = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) qRScannerValidationUiStateFactory$convertToUiState$1.L$6;
                qRScannerToolbarUIState4 = (QRScannerToolbarUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$5;
                alertTextWithIconUiState = (AlertTextWithIconUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$4;
                ImageUIState imageUIState6 = (ImageUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$3;
                ValidateDetailButtonUIState validateDetailButtonUIState5 = (ValidateDetailButtonUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$2;
                qrContainerUiState4 = (QrContainerUiState) qRScannerValidationUiStateFactory$convertToUiState$1.L$1;
                ticketCardUIState5 = (TicketCardUIState) qRScannerValidationUiStateFactory$convertToUiState$1.L$0;
                ResultKt.b(objD);
                chaloTextStyleHelper2 = chaloTextStyleHelper3;
                imageUIState4 = imageUIState6;
                validateDetailButtonUIState4 = validateDetailButtonUIState5;
                QrContainerUiState qrContainerUiState14 = qrContainerUiState4;
                imageUIState3 = imageUIState4;
                errorWithMsgAndRetry2 = errorWithMsgAndRetry3;
                ticketCardUIState4 = ticketCardUIState5;
                qRScannerToolbarUIState3 = qRScannerToolbarUIState4;
                validateDetailButtonUIState3 = validateDetailButtonUIState4;
                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper2, (String) objD, black, null, null, 124));
                qrContainerUiState5 = qrContainerUiState14;
                return new QRScannerViewState(qRScannerToolbarUIState3, loadingDialogUIState, ticketCardUIState4, qrContainerUiState5, errorWithMsgAndRetry2, imageUIState3, new ValidationBottomCtaContainerUiState(validateDetailButtonUIState3, alertTextWithIconUiState, 1));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(QRScannerDataState qRScannerDataState, Function1 function1, ContinuationImpl continuationImpl) {
        QRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1 qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1;
        String str;
        Function1 function2;
        ImageUIState imageUIState;
        Object objB;
        String str2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIStateD;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIStateFactory buttonUIStateFactory2;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function3;
        if (continuationImpl instanceof QRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1) {
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1 = (QRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1) continuationImpl;
            int i = qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1 = new QRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1(this, continuationImpl);
            }
        } else {
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1 = new QRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1(this, continuationImpl);
        }
        Object objB3 = qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider = this.f10724a;
        if (i2 != 0) {
            if (i2 == 1) {
                function2 = (Function1) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0;
                ResultKt.b(objB3);
            } else {
                if (i2 == 2) {
                    ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$3;
                    imageUIState = (ImageUIState) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$2;
                    str2 = (String) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$1;
                    Function1 function4 = (Function1) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0;
                    ResultKt.b(objB3);
                    chaloTextStyleHelper = chaloTextStyleHelper3;
                    function2 = function4;
                    chaloTextUIStateD = ChaloTextStyleHelper.d(chaloTextStyleHelper, (String) objB3, ChaloColorToken.Black.f9759a, null, UIFontWeight.Bold, 108);
                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, str2, ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
                    qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0 = function2;
                    qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$1 = imageUIState;
                    qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$2 = chaloTextUIStateD;
                    qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$3 = chaloTextUIStateB;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$4 = buttonUIStateFactory;
                    qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$5 = chaloTextStyleHelper2;
                    qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1);
                    if (objB2 != coroutineSingletons) {
                        chaloTextUIState = chaloTextUIStateB;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        imageUIState2 = imageUIState;
                        chaloTextUIState2 = chaloTextUIStateD;
                        objB3 = objB2;
                        function3 = function2;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloTextStyleHelper2 = (ChaloTextStyleHelper) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$5;
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$4;
                chaloTextUIState = (TextUIState.ChaloTextUIState) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$3;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$2;
                imageUIState2 = (ImageUIState) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$1;
                function3 = (Function1) qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0;
                ResultKt.b(objB3);
                buttonUIStateFactory2 = buttonUIStateFactory3;
            }
            ChaloTextStyleHelper chaloTextStyleHelper4 = chaloTextStyleHelper2;
            ButtonUIState buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB3, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new lx0(function3, 10), UIShape.d, false, 0.0f, 52);
            ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
            float f = ChaloThemeHelper.a().h;
            return new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState2, chaloTextUIState2, chaloTextUIState, buttonUIStateF, null, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs, new ChaloPadding(f, f, f, f), true, WebSocketProtocol.PAYLOAD_SHORT), 16);
        }
        ResultKt.b(objB3);
        if (!qRScannerDataState.j) {
            return null;
        }
        QRValidationBottomSheetType qRValidationBottomSheetType = qRScannerDataState.l;
        if (!(qRValidationBottomSheetType instanceof QRValidationBottomSheetType.ValidationFailed)) {
            if (qRValidationBottomSheetType == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str3 = ((QRValidationBottomSheetType.ValidationFailed) qRValidationBottomSheetType).f10731a;
        if (str3 == null) {
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0 = function1;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label = 1;
            objB3 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1);
            if (objB3 != coroutineSingletons) {
                function2 = function1;
            }
        } else {
            str = str3;
            function2 = function1;
            imageUIState = new ImageUIState(IconType.IC_WARNING_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0 = function2;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$1 = str;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$2 = imageUIState;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$3 = chaloTextStyleHelper2;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label = 2;
            objB = stringProvider.b(StringEnum.VALIDATION_FAILED, new Object[0], qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1);
            if (objB != coroutineSingletons) {
                str2 = str;
                objB3 = objB;
                chaloTextStyleHelper = chaloTextStyleHelper2;
                chaloTextUIStateD = ChaloTextStyleHelper.d(chaloTextStyleHelper, (String) objB3, ChaloColorToken.Black.f9759a, null, UIFontWeight.Bold, 108);
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, str2, ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0 = function2;
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$1 = imageUIState;
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$2 = chaloTextUIStateD;
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$3 = chaloTextUIStateB;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$4 = buttonUIStateFactory;
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$5 = chaloTextStyleHelper2;
                qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label = 3;
                objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1);
                if (objB2 != coroutineSingletons) {
                    chaloTextUIState = chaloTextUIStateB;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    imageUIState2 = imageUIState;
                    chaloTextUIState2 = chaloTextUIStateD;
                    objB3 = objB2;
                    function3 = function2;
                    ChaloTextStyleHelper chaloTextStyleHelper5 = chaloTextStyleHelper2;
                    ButtonUIState buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB3, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new lx0(function3, 10), UIShape.d, false, 0.0f, 52);
                    ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs2 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                    float f2 = ChaloThemeHelper.a().h;
                    return new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState2, chaloTextUIState2, chaloTextUIState, buttonUIStateF2, null, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs2, new ChaloPadding(f2, f2, f2, f2), true, WebSocketProtocol.PAYLOAD_SHORT), 16);
                }
            }
        }
        return coroutineSingletons;
        str = (String) objB3;
        imageUIState = new ImageUIState(IconType.IC_WARNING_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0 = function2;
        qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$1 = str;
        qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$2 = imageUIState;
        qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$3 = chaloTextStyleHelper2;
        qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label = 2;
        objB = stringProvider.b(StringEnum.VALIDATION_FAILED, new Object[0], qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1);
        if (objB != coroutineSingletons) {
            str2 = str;
            objB3 = objB;
            chaloTextStyleHelper = chaloTextStyleHelper2;
            chaloTextUIStateD = ChaloTextStyleHelper.d(chaloTextStyleHelper, (String) objB3, ChaloColorToken.Black.f9759a, null, UIFontWeight.Bold, 108);
            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, str2, ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$0 = function2;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$1 = imageUIState;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$2 = chaloTextUIStateD;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$3 = chaloTextUIStateB;
            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$4 = buttonUIStateFactory;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.L$5 = chaloTextStyleHelper2;
            qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1.label = 3;
            objB2 = stringProvider.b(StringEnum.OKAY, new Object[0], qRScannerValidationUiStateFactory$createBottomSheetUIStateIfRequired$1);
            if (objB2 != coroutineSingletons) {
                chaloTextUIState = chaloTextUIStateB;
                buttonUIStateFactory2 = buttonUIStateFactory;
                imageUIState2 = imageUIState;
                chaloTextUIState2 = chaloTextUIStateD;
                objB3 = objB2;
                function3 = function2;
                ChaloTextStyleHelper chaloTextStyleHelper6 = chaloTextStyleHelper2;
                ButtonUIState buttonUIStateF3 = ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) objB3, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new lx0(function3, 10), UIShape.d, false, 0.0f, 52);
                ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs3 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                float f3 = ChaloThemeHelper.a().h;
                return new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState2, chaloTextUIState2, chaloTextUIState, buttonUIStateF3, null, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs3, new ChaloPadding(f3, f3, f3, f3), true, WebSocketProtocol.PAYLOAD_SHORT), 16);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(QRScannerDataState qRScannerDataState, Function1 function1, ContinuationImpl continuationImpl) {
        QRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1 qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1;
        QRScannerDataState qRScannerDataState2;
        Function1 function2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Function1 function3;
        QRScannerDataState qRScannerDataState3;
        if (continuationImpl instanceof QRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1) {
            qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1 = (QRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1) continuationImpl;
            int i = qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1 = new QRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1(this, continuationImpl);
            }
        } else {
            qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1 = new QRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1(this, continuationImpl);
        }
        Object objB = qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.label;
        StringProvider stringProvider = this.f10724a;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB);
            qRScannerDataState2 = qRScannerDataState;
            qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$0 = qRScannerDataState2;
            qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$1 = function1;
            qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$2 = chaloTextStyleHelper2;
            qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.VALIDATE_TICKET, new Object[0], qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1);
            if (objB != coroutineSingletons) {
                function2 = function1;
                chaloTextStyleHelper = chaloTextStyleHelper2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$2;
            function2 = (Function1) qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$1;
            qRScannerDataState2 = (QRScannerDataState) qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextUIState = (TextUIState.ChaloTextUIState) qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$3;
            chaloTextStyleHelper2 = (ChaloTextStyleHelper) qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$2;
            function3 = (Function1) qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$1;
            qRScannerDataState3 = (QRScannerDataState) qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$0;
            ResultKt.b(objB);
        }
        return new QRScannerToolbarUIState(chaloTextUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB, ChaloColorToken.AlmostBlackColor.f9756a, null, UIFontWeight.Bold, UiEventHandler.Companion.a(new lz0(function3, qRScannerDataState3, 0)), null, 72), 11);
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, ChaloColorToken.Black.f9759a, null, UIFontWeight.Bold, null, 104);
        qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$0 = qRScannerDataState2;
        qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$1 = function2;
        qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$2 = chaloTextStyleHelper2;
        qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.L$3 = chaloTextUIStateE;
        qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createQRScannerToolbarUIState$1);
        if (objB2 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateE;
            objB = objB2;
            function3 = function2;
            qRScannerDataState3 = qRScannerDataState2;
            return new QRScannerToolbarUIState(chaloTextUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) objB, ChaloColorToken.AlmostBlackColor.f9756a, null, UIFontWeight.Bold, UiEventHandler.Companion.a(new lz0(function3, qRScannerDataState3, 0)), null, 72), 11);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0125  */
    /* JADX WARN: Code duplicated, block: B:34:0x013c  */
    /* JADX WARN: Code duplicated, block: B:36:0x017f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0187  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(QRScannerDataState qRScannerDataState, Function1 function1, ContinuationImpl continuationImpl) {
        QRScannerValidationUiStateFactory$createTicketDetailsUIState$1 qRScannerValidationUiStateFactory$createTicketDetailsUIState$1;
        Function1 function2;
        int i;
        RegularBusPickupScheduleUiState regularBusPickupScheduleUiState;
        long jLongValue;
        Object obj;
        Function1 function3;
        String str;
        QRScannerDataState qRScannerDataState2;
        RegularBusPickupScheduleUiState regularBusPickupScheduleUiState2;
        Function1 function4;
        RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState;
        Object objB;
        String str2;
        QRScannerDataState qRScannerDataState3;
        RegularBusPickupScheduleUiState regularBusPickupScheduleUiState3;
        String str3;
        RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState2;
        QRScannerDataState qRScannerDataState4;
        RegularBusTicketReferenceNumberUiState regularBusTicketReferenceNumberUiState;
        String str4;
        RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState3;
        CardUISpec cardUISpec;
        TicketCardContentSpec ticketCardContentSpec;
        RegularBusTicketContainerUiState regularBusTicketContainerUiState;
        QRScannerDataState qRScannerDataState5;
        TicketCardContentSpec ticketCardContentSpec2;
        CardUISpec cardUISpec2;
        Function1 function5;
        RegularBusTicketContainerUiState regularBusTicketContainerUiState2;
        QRScannerDataState qRScannerDataState6 = qRScannerDataState;
        if (continuationImpl instanceof QRScannerValidationUiStateFactory$createTicketDetailsUIState$1) {
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1 = (QRScannerValidationUiStateFactory$createTicketDetailsUIState$1) continuationImpl;
            int i2 = qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1 = new QRScannerValidationUiStateFactory$createTicketDetailsUIState$1(this, continuationImpl);
            }
        } else {
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1 = new QRScannerValidationUiStateFactory$createTicketDetailsUIState$1(this, continuationImpl);
        }
        Object objB2 = qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider = this.f10724a;
        if (i3 != 0) {
            if (i3 == 1) {
                long j = qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.J$0;
                Function1 function6 = (Function1) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1;
                QRScannerDataState qRScannerDataState7 = (QRScannerDataState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0;
                ResultKt.b(objB2);
                jLongValue = j;
                obj = objB2;
                function3 = function6;
                qRScannerDataState6 = qRScannerDataState7;
            } else {
                if (i3 == 2) {
                    String str5 = (String) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3;
                    RegularBusPickupScheduleUiState regularBusPickupScheduleUiState4 = (RegularBusPickupScheduleUiState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2;
                    function4 = (Function1) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1;
                    QRScannerDataState qRScannerDataState8 = (QRScannerDataState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0;
                    ResultKt.b(objB2);
                    i = 0;
                    stringProvider = stringProvider;
                    qRScannerDataState3 = qRScannerDataState8;
                    shadyGray = shadyGray;
                    str2 = str5;
                    regularBusPickupScheduleUiState3 = regularBusPickupScheduleUiState4;
                    ChaloColorToken.ShadyGray shadyGray2 = shadyGray;
                    shadyGray = shadyGray2;
                    regularBusTicketAmountDetailsUiState = new RegularBusTicketAmountDetailsUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str2, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    qRScannerDataState2 = qRScannerDataState3;
                    regularBusPickupScheduleUiState2 = regularBusPickupScheduleUiState3;
                    str3 = qRScannerDataState2.f;
                    if (str3 != null) {
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState2;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = regularBusPickupScheduleUiState2;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = regularBusTicketAmountDetailsUiState;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = str3;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 3;
                        objB2 = stringProvider.b(StringEnum.TICKET_NUMBER, new Object[i], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                        if (objB2 != coroutineSingletons) {
                            RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState4 = regularBusTicketAmountDetailsUiState;
                            str4 = str3;
                            regularBusTicketAmountDetailsUiState3 = regularBusTicketAmountDetailsUiState4;
                            ChaloColorToken.ShadyGray shadyGray3 = shadyGray;
                            shadyGray = shadyGray3;
                            regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState3;
                            qRScannerDataState4 = qRScannerDataState2;
                            regularBusTicketReferenceNumberUiState = new RegularBusTicketReferenceNumberUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray3, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                            float f = ChaloThemeHelper.a().h;
                            ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f, f, f, f), 2);
                            TicketRouteNameUiState ticketRouteNameUiState = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            String str6 = qRScannerDataState4.d;
                            UITextStyle uITextStyle = UITextStyle.BodySmall;
                            ChaloColorToken.ShadyGray shadyGray4 = shadyGray;
                            regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState, null, new TextUIState.ChaloTextUIState(str6, uITextStyle, shadyGray4, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle, shadyGray4, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                            if (objB2 != coroutineSingletons) {
                                qRScannerDataState5 = qRScannerDataState4;
                                ticketCardContentSpec2 = ticketCardContentSpec;
                                cardUISpec2 = cardUISpec;
                                function5 = function4;
                                regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                            }
                        }
                    } else {
                        regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState;
                        qRScannerDataState4 = qRScannerDataState2;
                        regularBusTicketReferenceNumberUiState = null;
                        cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                        float f2 = ChaloThemeHelper.a().h;
                        ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f2, f2, f2, f2), 2);
                        TicketRouteNameUiState ticketRouteNameUiState2 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        String str7 = qRScannerDataState4.d;
                        UITextStyle uITextStyle2 = UITextStyle.BodySmall;
                        ChaloColorToken.ShadyGray shadyGray5 = shadyGray;
                        regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState2, null, new TextUIState.ChaloTextUIState(str7, uITextStyle2, shadyGray5, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle2, shadyGray5, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                        if (objB2 != coroutineSingletons) {
                            qRScannerDataState5 = qRScannerDataState4;
                            ticketCardContentSpec2 = ticketCardContentSpec;
                            cardUISpec2 = cardUISpec;
                            function5 = function4;
                            regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i3 == 3) {
                    String str8 = (String) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4;
                    RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState5 = (RegularBusTicketAmountDetailsUiState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3;
                    regularBusPickupScheduleUiState2 = (RegularBusPickupScheduleUiState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2;
                    function4 = (Function1) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1;
                    qRScannerDataState2 = (QRScannerDataState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0;
                    ResultKt.b(objB2);
                    stringProvider = stringProvider;
                    shadyGray = shadyGray;
                    str4 = str8;
                    regularBusTicketAmountDetailsUiState3 = regularBusTicketAmountDetailsUiState5;
                    ChaloColorToken.ShadyGray shadyGray6 = shadyGray;
                    shadyGray = shadyGray6;
                    regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState3;
                    qRScannerDataState4 = qRScannerDataState2;
                    regularBusTicketReferenceNumberUiState = new RegularBusTicketReferenceNumberUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray6, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                    float f3 = ChaloThemeHelper.a().h;
                    ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f3, f3, f3, f3), 2);
                    TicketRouteNameUiState ticketRouteNameUiState3 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    String str9 = qRScannerDataState4.d;
                    UITextStyle uITextStyle3 = UITextStyle.BodySmall;
                    ChaloColorToken.ShadyGray shadyGray7 = shadyGray;
                    regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState3, null, new TextUIState.ChaloTextUIState(str9, uITextStyle3, shadyGray7, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle3, shadyGray7, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                    if (objB2 != coroutineSingletons) {
                        qRScannerDataState5 = qRScannerDataState4;
                        ticketCardContentSpec2 = ticketCardContentSpec;
                        cardUISpec2 = cardUISpec;
                        function5 = function4;
                        regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                regularBusTicketContainerUiState2 = (RegularBusTicketContainerUiState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4;
                ticketCardContentSpec2 = (TicketCardContentSpec) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3;
                cardUISpec2 = (CardUISpec) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2;
                function5 = (Function1) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1;
                qRScannerDataState5 = (QRScannerDataState) qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0;
                ResultKt.b(objB2);
            }
            UITextStyle uITextStyle4 = UITextStyle.BodyMedium;
            UIFontWeight uIFontWeight = UIFontWeight.Bold;
            ChaloColorToken.Orange2 orange2 = ChaloColorToken.Orange2.f9830a;
            return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle4, orange2, 0, (UITextAlign) null, uIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange2, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
        }
        ResultKt.b(objB2);
        Long l = qRScannerDataState6.i;
        if (l != null) {
            jLongValue = l.longValue();
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState6;
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function1;
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.J$0 = jLongValue;
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 1;
            Object objB3 = stringProvider.b(StringEnum.VALID_TILL, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
            if (objB3 != coroutineSingletons) {
                obj = objB3;
                function3 = function1;
            }
        } else {
            function2 = function1;
            i = 0;
            regularBusPickupScheduleUiState = null;
            str = qRScannerDataState6.h;
            if (str != null) {
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState6;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function2;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = regularBusPickupScheduleUiState;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = str;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.AMOUNT, new Object[i], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                if (objB != coroutineSingletons) {
                    str2 = str;
                    qRScannerDataState3 = qRScannerDataState6;
                    regularBusPickupScheduleUiState3 = regularBusPickupScheduleUiState;
                    objB2 = objB;
                    function4 = function2;
                    ChaloColorToken.ShadyGray shadyGray8 = shadyGray;
                    shadyGray = shadyGray8;
                    regularBusTicketAmountDetailsUiState = new RegularBusTicketAmountDetailsUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray8, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str2, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    qRScannerDataState2 = qRScannerDataState3;
                    regularBusPickupScheduleUiState2 = regularBusPickupScheduleUiState3;
                    str3 = qRScannerDataState2.f;
                    if (str3 != null) {
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState2;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = regularBusPickupScheduleUiState2;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = regularBusTicketAmountDetailsUiState;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = str3;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 3;
                        objB2 = stringProvider.b(StringEnum.TICKET_NUMBER, new Object[i], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                        if (objB2 != coroutineSingletons) {
                            RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState6 = regularBusTicketAmountDetailsUiState;
                            str4 = str3;
                            regularBusTicketAmountDetailsUiState3 = regularBusTicketAmountDetailsUiState6;
                            ChaloColorToken.ShadyGray shadyGray9 = shadyGray;
                            shadyGray = shadyGray9;
                            regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState3;
                            qRScannerDataState4 = qRScannerDataState2;
                            regularBusTicketReferenceNumberUiState = new RegularBusTicketReferenceNumberUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray9, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                            float f4 = ChaloThemeHelper.a().h;
                            ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f4, f4, f4, f4), 2);
                            TicketRouteNameUiState ticketRouteNameUiState4 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                            String str10 = qRScannerDataState4.d;
                            UITextStyle uITextStyle5 = UITextStyle.BodySmall;
                            ChaloColorToken.ShadyGray shadyGray10 = shadyGray;
                            regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState4, null, new TextUIState.ChaloTextUIState(str10, uITextStyle5, shadyGray10, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle5, shadyGray10, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                            if (objB2 != coroutineSingletons) {
                                qRScannerDataState5 = qRScannerDataState4;
                                ticketCardContentSpec2 = ticketCardContentSpec;
                                cardUISpec2 = cardUISpec;
                                function5 = function4;
                                regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                                UITextStyle uITextStyle6 = UITextStyle.BodyMedium;
                                UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
                                ChaloColorToken.Orange2 orange3 = ChaloColorToken.Orange2.f9830a;
                                return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle6, orange3, 0, (UITextAlign) null, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange3, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                            }
                        }
                    } else {
                        regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState;
                        qRScannerDataState4 = qRScannerDataState2;
                        regularBusTicketReferenceNumberUiState = null;
                        cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                        float f5 = ChaloThemeHelper.a().h;
                        ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f5, f5, f5, f5), 2);
                        TicketRouteNameUiState ticketRouteNameUiState5 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        String str11 = qRScannerDataState4.d;
                        UITextStyle uITextStyle7 = UITextStyle.BodySmall;
                        ChaloColorToken.ShadyGray shadyGray11 = shadyGray;
                        regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState5, null, new TextUIState.ChaloTextUIState(str11, uITextStyle7, shadyGray11, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle7, shadyGray11, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                        if (objB2 != coroutineSingletons) {
                            qRScannerDataState5 = qRScannerDataState4;
                            ticketCardContentSpec2 = ticketCardContentSpec;
                            cardUISpec2 = cardUISpec;
                            function5 = function4;
                            regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                            UITextStyle uITextStyle8 = UITextStyle.BodyMedium;
                            UIFontWeight uIFontWeight3 = UIFontWeight.Bold;
                            ChaloColorToken.Orange2 orange4 = ChaloColorToken.Orange2.f9830a;
                            return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle8, orange4, 0, (UITextAlign) null, uIFontWeight3, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange4, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                        }
                    }
                }
            } else {
                qRScannerDataState2 = qRScannerDataState6;
                regularBusPickupScheduleUiState2 = regularBusPickupScheduleUiState;
                function4 = function2;
                regularBusTicketAmountDetailsUiState = null;
                str3 = qRScannerDataState2.f;
                if (str3 != null) {
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState2;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = regularBusPickupScheduleUiState2;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = regularBusTicketAmountDetailsUiState;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = str3;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.TICKET_NUMBER, new Object[i], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                    if (objB2 != coroutineSingletons) {
                        RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState7 = regularBusTicketAmountDetailsUiState;
                        str4 = str3;
                        regularBusTicketAmountDetailsUiState3 = regularBusTicketAmountDetailsUiState7;
                        ChaloColorToken.ShadyGray shadyGray12 = shadyGray;
                        shadyGray = shadyGray12;
                        regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState3;
                        qRScannerDataState4 = qRScannerDataState2;
                        regularBusTicketReferenceNumberUiState = new RegularBusTicketReferenceNumberUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray12, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                        float f6 = ChaloThemeHelper.a().h;
                        ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f6, f6, f6, f6), 2);
                        TicketRouteNameUiState ticketRouteNameUiState6 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        String str12 = qRScannerDataState4.d;
                        UITextStyle uITextStyle9 = UITextStyle.BodySmall;
                        ChaloColorToken.ShadyGray shadyGray13 = shadyGray;
                        regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState6, null, new TextUIState.ChaloTextUIState(str12, uITextStyle9, shadyGray13, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle9, shadyGray13, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                        if (objB2 != coroutineSingletons) {
                            qRScannerDataState5 = qRScannerDataState4;
                            ticketCardContentSpec2 = ticketCardContentSpec;
                            cardUISpec2 = cardUISpec;
                            function5 = function4;
                            regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                            UITextStyle uITextStyle10 = UITextStyle.BodyMedium;
                            UIFontWeight uIFontWeight4 = UIFontWeight.Bold;
                            ChaloColorToken.Orange2 orange5 = ChaloColorToken.Orange2.f9830a;
                            return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle10, orange5, 0, (UITextAlign) null, uIFontWeight4, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange5, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                        }
                    }
                } else {
                    regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState;
                    qRScannerDataState4 = qRScannerDataState2;
                    regularBusTicketReferenceNumberUiState = null;
                    cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                    float f7 = ChaloThemeHelper.a().h;
                    ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f7, f7, f7, f7), 2);
                    TicketRouteNameUiState ticketRouteNameUiState7 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    String str13 = qRScannerDataState4.d;
                    UITextStyle uITextStyle11 = UITextStyle.BodySmall;
                    ChaloColorToken.ShadyGray shadyGray14 = shadyGray;
                    regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState7, null, new TextUIState.ChaloTextUIState(str13, uITextStyle11, shadyGray14, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle11, shadyGray14, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                    if (objB2 != coroutineSingletons) {
                        qRScannerDataState5 = qRScannerDataState4;
                        ticketCardContentSpec2 = ticketCardContentSpec;
                        cardUISpec2 = cardUISpec;
                        function5 = function4;
                        regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                        UITextStyle uITextStyle12 = UITextStyle.BodyMedium;
                        UIFontWeight uIFontWeight5 = UIFontWeight.Bold;
                        ChaloColorToken.Orange2 orange6 = ChaloColorToken.Orange2.f9830a;
                        return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle12, orange6, 0, (UITextAlign) null, uIFontWeight5, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange6, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                    }
                }
            }
        }
        return coroutineSingletons;
        i = 0;
        function2 = function3;
        regularBusPickupScheduleUiState = new RegularBusPickupScheduleUiState(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new RegularBusPickupScheduleTimeViewState.FixedTime(new TextUIState.ChaloTextUIState(TimeUtilsContract.DefaultImpls.a(this.c, jLongValue, this.d, 4), UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
        str = qRScannerDataState6.h;
        if (str != null) {
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState6;
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function2;
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = regularBusPickupScheduleUiState;
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = str;
            qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 2;
            objB = stringProvider.b(StringEnum.AMOUNT, new Object[i], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
            if (objB != coroutineSingletons) {
                str2 = str;
                qRScannerDataState3 = qRScannerDataState6;
                regularBusPickupScheduleUiState3 = regularBusPickupScheduleUiState;
                objB2 = objB;
                function4 = function2;
                ChaloColorToken.ShadyGray shadyGray15 = shadyGray;
                shadyGray = shadyGray15;
                regularBusTicketAmountDetailsUiState = new RegularBusTicketAmountDetailsUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray15, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str2, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                qRScannerDataState2 = qRScannerDataState3;
                regularBusPickupScheduleUiState2 = regularBusPickupScheduleUiState3;
                str3 = qRScannerDataState2.f;
                if (str3 != null) {
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState2;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = regularBusPickupScheduleUiState2;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = regularBusTicketAmountDetailsUiState;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = str3;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.TICKET_NUMBER, new Object[i], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                    if (objB2 != coroutineSingletons) {
                        RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState8 = regularBusTicketAmountDetailsUiState;
                        str4 = str3;
                        regularBusTicketAmountDetailsUiState3 = regularBusTicketAmountDetailsUiState8;
                        ChaloColorToken.ShadyGray shadyGray16 = shadyGray;
                        shadyGray = shadyGray16;
                        regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState3;
                        qRScannerDataState4 = qRScannerDataState2;
                        regularBusTicketReferenceNumberUiState = new RegularBusTicketReferenceNumberUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray16, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                        float f8 = ChaloThemeHelper.a().h;
                        ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f8, f8, f8, f8), 2);
                        TicketRouteNameUiState ticketRouteNameUiState8 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                        String str14 = qRScannerDataState4.d;
                        UITextStyle uITextStyle13 = UITextStyle.BodySmall;
                        ChaloColorToken.ShadyGray shadyGray17 = shadyGray;
                        regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState8, null, new TextUIState.ChaloTextUIState(str14, uITextStyle13, shadyGray17, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle13, shadyGray17, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                        qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                        if (objB2 != coroutineSingletons) {
                            qRScannerDataState5 = qRScannerDataState4;
                            ticketCardContentSpec2 = ticketCardContentSpec;
                            cardUISpec2 = cardUISpec;
                            function5 = function4;
                            regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                            UITextStyle uITextStyle14 = UITextStyle.BodyMedium;
                            UIFontWeight uIFontWeight6 = UIFontWeight.Bold;
                            ChaloColorToken.Orange2 orange7 = ChaloColorToken.Orange2.f9830a;
                            return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle14, orange7, 0, (UITextAlign) null, uIFontWeight6, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange7, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                        }
                    }
                } else {
                    regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState;
                    qRScannerDataState4 = qRScannerDataState2;
                    regularBusTicketReferenceNumberUiState = null;
                    cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                    float f9 = ChaloThemeHelper.a().h;
                    ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f9, f9, f9, f9), 2);
                    TicketRouteNameUiState ticketRouteNameUiState9 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    String str15 = qRScannerDataState4.d;
                    UITextStyle uITextStyle15 = UITextStyle.BodySmall;
                    ChaloColorToken.ShadyGray shadyGray18 = shadyGray;
                    regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState9, null, new TextUIState.ChaloTextUIState(str15, uITextStyle15, shadyGray18, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle15, shadyGray18, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                    if (objB2 != coroutineSingletons) {
                        qRScannerDataState5 = qRScannerDataState4;
                        ticketCardContentSpec2 = ticketCardContentSpec;
                        cardUISpec2 = cardUISpec;
                        function5 = function4;
                        regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                        UITextStyle uITextStyle16 = UITextStyle.BodyMedium;
                        UIFontWeight uIFontWeight7 = UIFontWeight.Bold;
                        ChaloColorToken.Orange2 orange8 = ChaloColorToken.Orange2.f9830a;
                        return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle16, orange8, 0, (UITextAlign) null, uIFontWeight7, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange8, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                    }
                }
            }
        } else {
            qRScannerDataState2 = qRScannerDataState6;
            regularBusPickupScheduleUiState2 = regularBusPickupScheduleUiState;
            function4 = function2;
            regularBusTicketAmountDetailsUiState = null;
            str3 = qRScannerDataState2.f;
            if (str3 != null) {
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState2;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = regularBusPickupScheduleUiState2;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = regularBusTicketAmountDetailsUiState;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = str3;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.TICKET_NUMBER, new Object[i], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                if (objB2 != coroutineSingletons) {
                    RegularBusTicketAmountDetailsUiState regularBusTicketAmountDetailsUiState9 = regularBusTicketAmountDetailsUiState;
                    str4 = str3;
                    regularBusTicketAmountDetailsUiState3 = regularBusTicketAmountDetailsUiState9;
                    ChaloColorToken.ShadyGray shadyGray19 = shadyGray;
                    shadyGray = shadyGray19;
                    regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState3;
                    qRScannerDataState4 = qRScannerDataState2;
                    regularBusTicketReferenceNumberUiState = new RegularBusTicketReferenceNumberUiState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.BodySmall, shadyGray19, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                    float f10 = ChaloThemeHelper.a().h;
                    ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f10, f10, f10, f10), 2);
                    TicketRouteNameUiState ticketRouteNameUiState10 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    String str16 = qRScannerDataState4.d;
                    UITextStyle uITextStyle17 = UITextStyle.BodySmall;
                    ChaloColorToken.ShadyGray shadyGray110 = shadyGray;
                    regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState10, null, new TextUIState.ChaloTextUIState(str16, uITextStyle17, shadyGray110, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle17, shadyGray110, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                    qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                    if (objB2 != coroutineSingletons) {
                        qRScannerDataState5 = qRScannerDataState4;
                        ticketCardContentSpec2 = ticketCardContentSpec;
                        cardUISpec2 = cardUISpec;
                        function5 = function4;
                        regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                        UITextStyle uITextStyle18 = UITextStyle.BodyMedium;
                        UIFontWeight uIFontWeight8 = UIFontWeight.Bold;
                        ChaloColorToken.Orange2 orange9 = ChaloColorToken.Orange2.f9830a;
                        return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle18, orange9, 0, (UITextAlign) null, uIFontWeight8, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange9, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                    }
                }
            } else {
                regularBusTicketAmountDetailsUiState2 = regularBusTicketAmountDetailsUiState;
                qRScannerDataState4 = qRScannerDataState2;
                regularBusTicketReferenceNumberUiState = null;
                cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
                float f11 = ChaloThemeHelper.a().h;
                ticketCardContentSpec = new TicketCardContentSpec(new ChaloPadding(f11, f11, f11, f11), 2);
                TicketRouteNameUiState ticketRouteNameUiState11 = new TicketRouteNameUiState(new ImageUIState(IconType.IC_BUS_TINTED, (String) null, ChaloColorToken.Black.f9759a, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState(qRScannerDataState4.c, UITextStyle.HeadlineSmall, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                String str17 = qRScannerDataState4.d;
                UITextStyle uITextStyle19 = UITextStyle.BodySmall;
                ChaloColorToken.ShadyGray shadyGray111 = shadyGray;
                regularBusTicketContainerUiState = new RegularBusTicketContainerUiState(null, regularBusPickupScheduleUiState2, new RegularBusTicketTripDetailsUiState(null, ticketRouteNameUiState11, null, new TextUIState.ChaloTextUIState(str17, uITextStyle19, shadyGray111, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(qRScannerDataState4.e, uITextStyle19, shadyGray111, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, 101), regularBusTicketAmountDetailsUiState2, regularBusTicketReferenceNumberUiState, 3);
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$0 = qRScannerDataState4;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$1 = function4;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$2 = cardUISpec;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$3 = ticketCardContentSpec;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.L$4 = regularBusTicketContainerUiState;
                qRScannerValidationUiStateFactory$createTicketDetailsUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.VIEW_SUMMARY, new Object[0], qRScannerValidationUiStateFactory$createTicketDetailsUIState$1);
                if (objB2 != coroutineSingletons) {
                    qRScannerDataState5 = qRScannerDataState4;
                    ticketCardContentSpec2 = ticketCardContentSpec;
                    cardUISpec2 = cardUISpec;
                    function5 = function4;
                    regularBusTicketContainerUiState2 = regularBusTicketContainerUiState;
                    UITextStyle uITextStyle110 = UITextStyle.BodyMedium;
                    UIFontWeight uIFontWeight9 = UIFontWeight.Bold;
                    ChaloColorToken.Orange2 orange10 = ChaloColorToken.Orange2.f9830a;
                    return new TicketCardUIState(cardUISpec2, ticketCardContentSpec2, regularBusTicketContainerUiState2, new RegularBusTicketCtaUiState(new TextUIState.ChaloTextUIState((String) objB2, uITextStyle110, orange10, 0, (UITextAlign) null, uIFontWeight9, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, orange10, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new lz0(function5, qRScannerDataState5, 1)));
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(QRScannerDataState qRScannerDataState, Function1 function1, ContinuationImpl continuationImpl) {
        QRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1 qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1;
        QRScannerDataState qRScannerDataState2;
        Function1 function2;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof QRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1) {
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1 = (QRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1) continuationImpl;
            int i = qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1 = new QRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1(this, continuationImpl);
            }
        } else {
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1 = new QRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1(this, continuationImpl);
        }
        Object objB = qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$0 = qRScannerDataState;
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$1 = function1;
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$2 = buttonUIStateFactory2;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$3 = chaloTextStyleHelper2;
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.F$0 = 0.0f;
            qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.label = 1;
            objB = this.f10724a.b(StringEnum.MARK_AS_USED, new Object[0], qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            qRScannerDataState2 = qRScannerDataState;
            function2 = function1;
            buttonUIStateFactory = buttonUIStateFactory2;
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$3;
            buttonUIStateFactory = (ButtonUIStateFactory) qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$2;
            function2 = (Function1) qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$1;
            qRScannerDataState2 = (QRScannerDataState) qRScannerValidationUiStateFactory$createValidateDetailButtonUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
        }
        TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
        boolean z = qRScannerDataState2.b;
        return new ValidateDetailButtonUIState(ButtonUIStateFactory.f(buttonUIStateFactory, chaloTextUIStateB, new lx0(function2, 11), UIShape.d, z, 0.0f, 36), 7);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0165  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0226 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(QRScannerDataState qRScannerDataState, ContinuationImpl continuationImpl) {
        QRScannerValidationUiStateFactory$getQrContainerUiState$1 qRScannerValidationUiStateFactory$getQrContainerUiState$1;
        int i;
        List listS;
        QRScannerDataState qRScannerDataState2;
        List list;
        TicketExpiryContainer ticketExpiryContainer;
        List list2;
        TicketExpiryContainerSpec ticketExpiryContainerSpec;
        AlertTextWithIconSpec alertTextWithIconSpec;
        QrUistate qrUistate;
        CardUISpec cardUISpec;
        QrContainerSpec qrContainerSpec;
        Object objB;
        QrUistate qrUistate2;
        QrContainerSpec qrContainerSpec2;
        TicketExpiryContainer ticketExpiryContainer2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objB2;
        QrContainerSpec qrContainerSpec3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TicketExpiryContainer ticketExpiryContainer3;
        if (continuationImpl instanceof QRScannerValidationUiStateFactory$getQrContainerUiState$1) {
            qRScannerValidationUiStateFactory$getQrContainerUiState$1 = (QRScannerValidationUiStateFactory$getQrContainerUiState$1) continuationImpl;
            int i2 = qRScannerValidationUiStateFactory$getQrContainerUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qRScannerValidationUiStateFactory$getQrContainerUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                qRScannerValidationUiStateFactory$getQrContainerUiState$1 = new QRScannerValidationUiStateFactory$getQrContainerUiState$1(this, continuationImpl);
            }
        } else {
            qRScannerValidationUiStateFactory$getQrContainerUiState$1 = new QRScannerValidationUiStateFactory$getQrContainerUiState$1(this, continuationImpl);
        }
        Object obj = qRScannerValidationUiStateFactory$getQrContainerUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = qRScannerValidationUiStateFactory$getQrContainerUiState$1.label;
        StringProvider stringProvider = this.f10724a;
        if (i3 != 0) {
            if (i3 == 1) {
                ticketExpiryContainerSpec = (TicketExpiryContainerSpec) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3;
                alertTextWithIconSpec = (AlertTextWithIconSpec) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2;
                list2 = (List) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1;
                qRScannerDataState2 = (QRScannerDataState) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0;
                ResultKt.b(obj);
                i = 0;
            } else {
                if (i3 == 2) {
                    qrContainerSpec2 = (QrContainerSpec) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3;
                    cardUISpec = (CardUISpec) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2;
                    qrUistate2 = (QrUistate) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1;
                    ticketExpiryContainer2 = (TicketExpiryContainer) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0;
                    ResultKt.b(obj);
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0 = ticketExpiryContainer2;
                    qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1 = qrUistate2;
                    qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2 = cardUISpec;
                    qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3 = qrContainerSpec2;
                    qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$4 = chaloTextUIState;
                    qRScannerValidationUiStateFactory$getQrContainerUiState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.CONDUCTOR_VALIDATION_DESCRIPTION, new Object[0], qRScannerValidationUiStateFactory$getQrContainerUiState$1);
                    if (objB2 != coroutineSingletons) {
                        qrContainerSpec3 = qrContainerSpec2;
                        chaloTextUIState2 = chaloTextUIState;
                        obj = objB2;
                        ticketExpiryContainer3 = ticketExpiryContainer2;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$4;
                QrContainerSpec qrContainerSpec4 = (QrContainerSpec) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3;
                cardUISpec = (CardUISpec) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2;
                qrUistate2 = (QrUistate) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1;
                TicketExpiryContainer ticketExpiryContainer4 = (TicketExpiryContainer) qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0;
                ResultKt.b(obj);
                chaloTextUIState2 = chaloTextUIState3;
                ticketExpiryContainer3 = ticketExpiryContainer4;
                qrContainerSpec3 = qrContainerSpec4;
            }
            return new QrContainerUiState(cardUISpec, qrContainerSpec3, chaloTextUIState2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), qrUistate2, ticketExpiryContainer3);
        }
        ResultKt.b(obj);
        String str = qRScannerDataState.n;
        ChaloColorToken.PaleYellowGradient paleYellowGradient = ChaloColorToken.PaleYellowGradient.f9839a;
        if (str != null) {
            Regex regex = UtilityExtensionsKt.f2619a;
            if (!UtilityExtensionsKt.f2619a.h(str)) {
                str = null;
            }
            if (str != null) {
                i = 0;
                long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, str, ChaloColorTokenKt.c(paleYellowGradient));
                listS = CollectionsKt.S(ChaloColorTokenKt.a(0.25f, new ChaloColorToken.Custom(jA)), new ChaloColorToken.Custom(jA));
                if (listS == null) {
                }
            } else {
                i = 0;
            }
            ChaloColorToken[] chaloColorTokenArr = new ChaloColorToken[2];
            chaloColorTokenArr[i] = ChaloColorTokenKt.a(0.25f, paleYellowGradient);
            chaloColorTokenArr[1] = paleYellowGradient;
            listS = CollectionsKt.S(chaloColorTokenArr);
        } else {
            i = 0;
            ChaloColorToken[] chaloColorTokenArr2 = new ChaloColorToken[2];
            chaloColorTokenArr2[i] = ChaloColorTokenKt.a(0.25f, paleYellowGradient);
            chaloColorTokenArr2[1] = paleYellowGradient;
            listS = CollectionsKt.S(chaloColorTokenArr2);
        }
        Long l = qRScannerDataState.i;
        if (l != null) {
            String strA = TimeUtilsContract.DefaultImpls.a(this.c, l.longValue(), this.d, 4);
            TicketExpiryContainerSpec ticketExpiryContainerSpec2 = new TicketExpiryContainerSpec(ChaloColorTokenKt.a(0.5f, ChaloColorToken.White.f9870a));
            AlertTextWithIconSpec alertTextWithIconSpec2 = new AlertTextWithIconSpec(0.0f, 15);
            StringEnum stringEnum = StringEnum.TICKET_EXPIRES_AT_X;
            Object[] objArr = new Object[1];
            objArr[i] = strA;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0 = qRScannerDataState;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1 = listS;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2 = alertTextWithIconSpec2;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3 = ticketExpiryContainerSpec2;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.label = 1;
            Object objB3 = stringProvider.b(stringEnum, objArr, qRScannerValidationUiStateFactory$getQrContainerUiState$1);
            if (objB3 != coroutineSingletons) {
                qRScannerDataState2 = qRScannerDataState;
                list2 = listS;
                obj = objB3;
                ticketExpiryContainerSpec = ticketExpiryContainerSpec2;
                alertTextWithIconSpec = alertTextWithIconSpec2;
            }
        } else {
            qRScannerDataState2 = qRScannerDataState;
            list = listS;
            ticketExpiryContainer = null;
            if (!StringsKt.F(qRScannerDataState2.g)) {
                return null;
            }
            qrUistate = new QrUistate(qRScannerDataState2.g);
            cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
            float f = ChaloThemeHelper.a().h;
            qrContainerSpec = new QrContainerSpec(new ChaloPadding(f, f, f, f), list, ChaloThemeHelper.a().d, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0 = ticketExpiryContainer;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1 = qrUistate;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2 = cardUISpec;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3 = qrContainerSpec;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.label = 2;
            objB = stringProvider.b(StringEnum.YOUR_TICKET, new Object[i], qRScannerValidationUiStateFactory$getQrContainerUiState$1);
            if (objB != coroutineSingletons) {
                qrUistate2 = qrUistate;
                qrContainerSpec2 = qrContainerSpec;
                ticketExpiryContainer2 = ticketExpiryContainer;
                obj = objB;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0 = ticketExpiryContainer2;
                qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1 = qrUistate2;
                qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2 = cardUISpec;
                qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3 = qrContainerSpec2;
                qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$4 = chaloTextUIState;
                qRScannerValidationUiStateFactory$getQrContainerUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.CONDUCTOR_VALIDATION_DESCRIPTION, new Object[0], qRScannerValidationUiStateFactory$getQrContainerUiState$1);
                if (objB2 != coroutineSingletons) {
                    qrContainerSpec3 = qrContainerSpec2;
                    chaloTextUIState2 = chaloTextUIState;
                    obj = objB2;
                    ticketExpiryContainer3 = ticketExpiryContainer2;
                    return new QrContainerUiState(cardUISpec, qrContainerSpec3, chaloTextUIState2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), qrUistate2, ticketExpiryContainer3);
                }
            }
        }
        return coroutineSingletons;
        ticketExpiryContainer = new TicketExpiryContainer(ticketExpiryContainerSpec, new AlertTextWithIconUiState(alertTextWithIconSpec, new ImageUIState(IconType.CHALO_IC_TIME, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8124)));
        list = list2;
        if (!StringsKt.F(qRScannerDataState2.g)) {
            return null;
        }
        qrUistate = new QrUistate(qRScannerDataState2.g);
        cardUISpec = new CardUISpec(null, 0.0f, 0.0f, 7);
        float f2 = ChaloThemeHelper.a().h;
        qrContainerSpec = new QrContainerSpec(new ChaloPadding(f2, f2, f2, f2), list, ChaloThemeHelper.a().d, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0 = ticketExpiryContainer;
        qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1 = qrUistate;
        qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2 = cardUISpec;
        qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3 = qrContainerSpec;
        qRScannerValidationUiStateFactory$getQrContainerUiState$1.label = 2;
        objB = stringProvider.b(StringEnum.YOUR_TICKET, new Object[i], qRScannerValidationUiStateFactory$getQrContainerUiState$1);
        if (objB != coroutineSingletons) {
            qrUistate2 = qrUistate;
            qrContainerSpec2 = qrContainerSpec;
            ticketExpiryContainer2 = ticketExpiryContainer;
            obj = objB;
            chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$0 = ticketExpiryContainer2;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$1 = qrUistate2;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$2 = cardUISpec;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$3 = qrContainerSpec2;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.L$4 = chaloTextUIState;
            qRScannerValidationUiStateFactory$getQrContainerUiState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.CONDUCTOR_VALIDATION_DESCRIPTION, new Object[0], qRScannerValidationUiStateFactory$getQrContainerUiState$1);
            if (objB2 != coroutineSingletons) {
                qrContainerSpec3 = qrContainerSpec2;
                chaloTextUIState2 = chaloTextUIState;
                obj = objB2;
                ticketExpiryContainer3 = ticketExpiryContainer2;
                return new QrContainerUiState(cardUISpec, qrContainerSpec3, chaloTextUIState2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), qrUistate2, ticketExpiryContainer3);
            }
        }
        return coroutineSingletons;
    }
}
