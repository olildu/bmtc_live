package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.ticketvalidation.QRValidationStatus;
import app.chalo.ticketvalidation.TicketValidationInfo;
import app.chalo.ticketvalidation.TicketValidationInfoKt;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.uistate.toolbar.ToolbarActionSpec;
import app.chalo.uistate.toolbar.ToolbarActionsUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUiSpecs;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.RouteDetailsFieldData;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent;
import defpackage.wg0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationUIStateFactory;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiProductValidationUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f10704a;
    public final TimeUtilsContract b;
    public final StepTicketModeBasedInfoUIStateFactory c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10705a;

        static {
            int[] iArr = new int[ChaloTransitMode.values().length];
            try {
                iArr[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloTransitMode.METRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloTransitMode.TRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloTransitMode.MONORAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloTransitMode.CAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f10705a = iArr;
        }
    }

    public MultiProductValidationUIStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract, StepTicketModeBasedInfoUIStateFactory stepTicketModeBasedInfoUIStateFactory) {
        this.f10704a = stringProvider;
        this.b = timeUtilsContract;
        this.c = stepTicketModeBasedInfoUIStateFactory;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x0108  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0132  */
    /* JADX WARN: Code duplicated, block: B:43:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x0170  */
    /* JADX WARN: Code duplicated, block: B:53:0x0173  */
    /* JADX WARN: Code duplicated, block: B:56:0x0187 A[EDGE_INSN: B:56:0x0187->B:57:0x018c BREAK  A[LOOP:0: B:24:0x0085->B:63:0x0085]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0070 -> B:22:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory.a(app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ProductValidationData productValidationData, QRValidationStatus qRValidationStatus, ContinuationImpl continuationImpl) {
        MultiProductValidationUIStateFactory$checkIfQRStatusMatches$1 multiProductValidationUIStateFactory$checkIfQRStatusMatches$1;
        TicketValidationInfo ticketValidationInfo;
        if (continuationImpl instanceof MultiProductValidationUIStateFactory$checkIfQRStatusMatches$1) {
            multiProductValidationUIStateFactory$checkIfQRStatusMatches$1 = (MultiProductValidationUIStateFactory$checkIfQRStatusMatches$1) continuationImpl;
            int i = multiProductValidationUIStateFactory$checkIfQRStatusMatches$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProductValidationUIStateFactory$checkIfQRStatusMatches$1.label = i - Integer.MIN_VALUE;
            } else {
                multiProductValidationUIStateFactory$checkIfQRStatusMatches$1 = new MultiProductValidationUIStateFactory$checkIfQRStatusMatches$1(this, continuationImpl);
            }
        } else {
            multiProductValidationUIStateFactory$checkIfQRStatusMatches$1 = new MultiProductValidationUIStateFactory$checkIfQRStatusMatches$1(this, continuationImpl);
        }
        Object objQ = multiProductValidationUIStateFactory$checkIfQRStatusMatches$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiProductValidationUIStateFactory$checkIfQRStatusMatches$1.label;
        if (i2 == 0) {
            ResultKt.b(objQ);
            multiProductValidationUIStateFactory$checkIfQRStatusMatches$1.L$0 = qRValidationStatus;
            multiProductValidationUIStateFactory$checkIfQRStatusMatches$1.label = 1;
            objQ = productValidationData.q(multiProductValidationUIStateFactory$checkIfQRStatusMatches$1);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qRValidationStatus = (QRValidationStatus) multiProductValidationUIStateFactory$checkIfQRStatusMatches$1.L$0;
            ResultKt.b(objQ);
        }
        ArrayList arrayListA = TicketValidationInfoKt.a((List) objQ);
        QRValidationStatus qRValidationStatus2 = null;
        if (arrayListA.isEmpty()) {
            arrayListA = null;
        }
        if (arrayListA != null && (ticketValidationInfo = (TicketValidationInfo) CollectionsKt.H(arrayListA)) != null) {
            qRValidationStatus2 = ticketValidationInfo.e;
        }
        return Boolean.valueOf(qRValidationStatus2 == qRValidationStatus);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0168  */
    /* JADX WARN: Code duplicated, block: B:33:0x0174  */
    /* JADX WARN: Code duplicated, block: B:36:0x0194  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x0213  */
    /* JADX WARN: Code duplicated, block: B:53:0x0222  */
    /* JADX WARN: Code duplicated, block: B:54:0x0224  */
    /* JADX WARN: Code duplicated, block: B:57:0x0236  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(MultiProductValidationDataState multiProductValidationDataState, MultiProductChildState multiProductChildState, int i, Function1 function1, ContinuationImpl continuationImpl) {
        MultiProductValidationUIStateFactory$childCardUiState$1 multiProductValidationUIStateFactory$childCardUiState$1;
        MultiProductValidationDataState multiProductValidationDataState2;
        boolean z;
        MultiProductChildState multiProductChildState2;
        ProductValidationData productValidationData;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        final ProductValidationData productValidationData2;
        final Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        MultiProductValidationDataState multiProductValidationDataState3;
        MultiProductChildState multiProductChildState3;
        ValidationTicketStatusUIState validationTicketStatusUIState;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ValidationTicketStatusUIState validationTicketStatusUIState2;
        MultiChildQRCard multiChildQRCard;
        Object objH;
        Function1 function4;
        ValidationTicketStatusUIState validationTicketStatusUIState3;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A;
        UiEventHandler uiEventHandlerA;
        Object objI;
        MultiChildQRCard multiChildQRCard2;
        ValidationTicketStatusUIState validationTicketStatusUIState4;
        UiEventHandler uiEventHandler;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState;
        Object objE;
        UiEventHandler uiEventHandler2;
        StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState2;
        ValidationTicketStatusUIState validationTicketStatusUIState5;
        MultiChildQRCard multiChildQRCard3;
        UiEventHandler uiEventHandler3;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState;
        Object objL;
        StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState3;
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState2;
        ValidationTicketStatusUIState validationTicketStatusUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        BorderUISpec borderUISpec;
        if (continuationImpl instanceof MultiProductValidationUIStateFactory$childCardUiState$1) {
            multiProductValidationUIStateFactory$childCardUiState$1 = (MultiProductValidationUIStateFactory$childCardUiState$1) continuationImpl;
            int i2 = multiProductValidationUIStateFactory$childCardUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multiProductValidationUIStateFactory$childCardUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                multiProductValidationUIStateFactory$childCardUiState$1 = new MultiProductValidationUIStateFactory$childCardUiState$1(this, continuationImpl);
            }
        } else {
            multiProductValidationUIStateFactory$childCardUiState$1 = new MultiProductValidationUIStateFactory$childCardUiState$1(this, continuationImpl);
        }
        Object objK = multiProductValidationUIStateFactory$childCardUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int i3 = 0;
        final int i4 = 1;
        switch (multiProductValidationUIStateFactory$childCardUiState$1.label) {
            case 0:
                ResultKt.b(objK);
                ProductValidationData productValidationData3 = multiProductValidationDataState.c;
                ProductValidationData productValidationData4 = multiProductChildState.f10688a;
                boolean zD = Intrinsics.d(productValidationData3 != null ? productValidationData3.getId() : null, productValidationData4.getId());
                StringEnum stringEnum = StringEnum.STEP_X;
                Object[] objArr = {String.valueOf(i + 1)};
                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = multiProductValidationDataState;
                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = multiProductChildState;
                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = function1;
                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = productValidationData4;
                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = zD;
                multiProductValidationUIStateFactory$childCardUiState$1.label = 1;
                Object objB = this.f10704a.b(stringEnum, objArr, multiProductValidationUIStateFactory$childCardUiState$1);
                if (objB != obj) {
                    multiProductValidationDataState2 = multiProductValidationDataState;
                    z = zD;
                    objK = objB;
                    multiProductChildState2 = multiProductChildState;
                    productValidationData = productValidationData4;
                    function2 = function1;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objK, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = multiProductValidationDataState2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = multiProductChildState2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = function2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = productValidationData;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = chaloTextUIState;
                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                    multiProductValidationUIStateFactory$childCardUiState$1.label = 2;
                    objK = k(productValidationData, multiProductValidationUIStateFactory$childCardUiState$1);
                    if (objK != obj) {
                        MultiProductChildState multiProductChildState4 = multiProductChildState2;
                        productValidationData2 = productValidationData;
                        function3 = function2;
                        chaloTextUIState2 = chaloTextUIState;
                        multiProductValidationDataState3 = multiProductValidationDataState2;
                        multiProductChildState3 = multiProductChildState4;
                        validationTicketStatusUIState = (ValidationTicketStatusUIState) objK;
                        if (z) {
                            ActiveQrState activeQrState = multiProductValidationDataState3.d;
                            wg0 wg0Var = new wg0(function3, 20);
                            multiProductValidationUIStateFactory$childCardUiState$1.L$0 = function3;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$1 = productValidationData2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$2 = chaloTextUIState2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$3 = validationTicketStatusUIState;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$4 = null;
                            multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                            multiProductValidationUIStateFactory$childCardUiState$1.label = 3;
                            objH = h(multiProductChildState3, activeQrState, wg0Var, multiProductValidationUIStateFactory$childCardUiState$1);
                            if (objH != obj) {
                                function4 = function3;
                                validationTicketStatusUIState3 = validationTicketStatusUIState;
                                objK = objH;
                                multiChildQRCard = (MultiChildQRCard) objK;
                                TextUIState.ChaloTextUIState chaloTextUIState6 = chaloTextUIState2;
                                validationTicketStatusUIState2 = validationTicketStatusUIState3;
                                function3 = function4;
                                chaloTextUIState3 = chaloTextUIState6;
                                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i3) {
                                            case 0:
                                                function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                                break;
                                            default:
                                                function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                });
                                uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i4) {
                                            case 0:
                                                function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                                break;
                                            default:
                                                function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                                break;
                                        }
                                        return Unit.f17538a;
                                    }
                                });
                                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState3;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState2;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                multiProductValidationUIStateFactory$childCardUiState$1.label = 4;
                                objI = i(productValidationData2, multiProductValidationUIStateFactory$childCardUiState$1);
                                if (objI != obj) {
                                    multiChildQRCard2 = multiChildQRCard;
                                    objK = objI;
                                    validationTicketStatusUIState4 = validationTicketStatusUIState2;
                                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                    chaloTextUIState4 = chaloTextUIState3;
                                    stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                    multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                                    objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                                    if (objE != obj) {
                                        UiEventHandler uiEventHandler4 = uiEventHandler;
                                        uiEventHandler2 = uiEventHandlerA;
                                        stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                                        objK = objE;
                                        validationTicketStatusUIState5 = validationTicketStatusUIState4;
                                        multiChildQRCard3 = multiChildQRCard2;
                                        uiEventHandler3 = uiEventHandler4;
                                        textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                                        multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                        multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                                        multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                                        multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                                        multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                                        multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                                        multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                                        multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                        multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                                        objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                                        if (objL != obj) {
                                            stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                                            textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                                            objK = objL;
                                            validationTicketStatusUIState6 = validationTicketStatusUIState5;
                                            chaloTextUIState5 = chaloTextUIState4;
                                            UiEventHandler uiEventHandler5 = uiEventHandler2;
                                            UiEventHandler uiEventHandler6 = uiEventHandler3;
                                            MultiChildQRCard multiChildQRCard4 = multiChildQRCard3;
                                            TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState3 = (TextWithLeftAndRightIconUIState) objK;
                                            if (z) {
                                                borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                                            } else {
                                                borderUISpec = null;
                                            }
                                            return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard4, uiEventHandler6, uiEventHandler5, textWithLeftAndRightIconUIState3, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                                        }
                                    }
                                }
                            }
                        } else {
                            chaloTextUIState3 = chaloTextUIState2;
                            validationTicketStatusUIState2 = validationTicketStatusUIState;
                            multiChildQRCard = null;
                            uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                            break;
                                        default:
                                            function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            });
                            uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                            break;
                                        default:
                                            function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            });
                            multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState3;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                            multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                            multiProductValidationUIStateFactory$childCardUiState$1.label = 4;
                            objI = i(productValidationData2, multiProductValidationUIStateFactory$childCardUiState$1);
                            if (objI != obj) {
                                multiChildQRCard2 = multiChildQRCard;
                                objK = objI;
                                validationTicketStatusUIState4 = validationTicketStatusUIState2;
                                uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                chaloTextUIState4 = chaloTextUIState3;
                                stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                                objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                                if (objE != obj) {
                                    UiEventHandler uiEventHandler7 = uiEventHandler;
                                    uiEventHandler2 = uiEventHandlerA;
                                    stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                                    objK = objE;
                                    validationTicketStatusUIState5 = validationTicketStatusUIState4;
                                    multiChildQRCard3 = multiChildQRCard2;
                                    uiEventHandler3 = uiEventHandler7;
                                    textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                    multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                                    objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                                    if (objL != obj) {
                                        stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                                        textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                                        objK = objL;
                                        validationTicketStatusUIState6 = validationTicketStatusUIState5;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        UiEventHandler uiEventHandler8 = uiEventHandler2;
                                        UiEventHandler uiEventHandler9 = uiEventHandler3;
                                        MultiChildQRCard multiChildQRCard5 = multiChildQRCard3;
                                        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState4 = (TextWithLeftAndRightIconUIState) objK;
                                        if (z) {
                                            borderUISpec = null;
                                        } else {
                                            borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                                        }
                                        return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard5, uiEventHandler9, uiEventHandler8, textWithLeftAndRightIconUIState4, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                z = multiProductValidationUIStateFactory$childCardUiState$1.Z$0;
                productValidationData = (ProductValidationData) multiProductValidationUIStateFactory$childCardUiState$1.L$3;
                function2 = (Function1) multiProductValidationUIStateFactory$childCardUiState$1.L$2;
                multiProductChildState2 = (MultiProductChildState) multiProductValidationUIStateFactory$childCardUiState$1.L$1;
                multiProductValidationDataState2 = (MultiProductValidationDataState) multiProductValidationUIStateFactory$childCardUiState$1.L$0;
                ResultKt.b(objK);
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objK, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = multiProductValidationDataState2;
                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = multiProductChildState2;
                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = function2;
                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = productValidationData;
                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = chaloTextUIState;
                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                multiProductValidationUIStateFactory$childCardUiState$1.label = 2;
                objK = k(productValidationData, multiProductValidationUIStateFactory$childCardUiState$1);
                if (objK != obj) {
                    MultiProductChildState multiProductChildState5 = multiProductChildState2;
                    productValidationData2 = productValidationData;
                    function3 = function2;
                    chaloTextUIState2 = chaloTextUIState;
                    multiProductValidationDataState3 = multiProductValidationDataState2;
                    multiProductChildState3 = multiProductChildState5;
                    validationTicketStatusUIState = (ValidationTicketStatusUIState) objK;
                    if (z) {
                        ActiveQrState activeQrState2 = multiProductValidationDataState3.d;
                        wg0 wg0Var2 = new wg0(function3, 20);
                        multiProductValidationUIStateFactory$childCardUiState$1.L$0 = function3;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$1 = productValidationData2;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$2 = chaloTextUIState2;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$3 = validationTicketStatusUIState;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$4 = null;
                        multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                        multiProductValidationUIStateFactory$childCardUiState$1.label = 3;
                        objH = h(multiProductChildState3, activeQrState2, wg0Var2, multiProductValidationUIStateFactory$childCardUiState$1);
                        if (objH != obj) {
                            function4 = function3;
                            validationTicketStatusUIState3 = validationTicketStatusUIState;
                            objK = objH;
                            multiChildQRCard = (MultiChildQRCard) objK;
                            TextUIState.ChaloTextUIState chaloTextUIState7 = chaloTextUIState2;
                            validationTicketStatusUIState2 = validationTicketStatusUIState3;
                            function3 = function4;
                            chaloTextUIState3 = chaloTextUIState7;
                            uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i3) {
                                        case 0:
                                            function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                            break;
                                        default:
                                            function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            });
                            uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                            break;
                                        default:
                                            function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            });
                            multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState3;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                            multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                            multiProductValidationUIStateFactory$childCardUiState$1.label = 4;
                            objI = i(productValidationData2, multiProductValidationUIStateFactory$childCardUiState$1);
                            if (objI != obj) {
                                multiChildQRCard2 = multiChildQRCard;
                                objK = objI;
                                validationTicketStatusUIState4 = validationTicketStatusUIState2;
                                uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                                chaloTextUIState4 = chaloTextUIState3;
                                stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                                objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                                if (objE != obj) {
                                    UiEventHandler uiEventHandler10 = uiEventHandler;
                                    uiEventHandler2 = uiEventHandlerA;
                                    stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                                    objK = objE;
                                    validationTicketStatusUIState5 = validationTicketStatusUIState4;
                                    multiChildQRCard3 = multiChildQRCard2;
                                    uiEventHandler3 = uiEventHandler10;
                                    textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                                    multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                    multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                                    objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                                    if (objL != obj) {
                                        stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                                        textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                                        objK = objL;
                                        validationTicketStatusUIState6 = validationTicketStatusUIState5;
                                        chaloTextUIState5 = chaloTextUIState4;
                                        UiEventHandler uiEventHandler11 = uiEventHandler2;
                                        UiEventHandler uiEventHandler12 = uiEventHandler3;
                                        MultiChildQRCard multiChildQRCard6 = multiChildQRCard3;
                                        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState5 = (TextWithLeftAndRightIconUIState) objK;
                                        if (z) {
                                            borderUISpec = null;
                                        } else {
                                            borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                                        }
                                        return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard6, uiEventHandler12, uiEventHandler11, textWithLeftAndRightIconUIState5, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                                    }
                                }
                            }
                        }
                    } else {
                        chaloTextUIState3 = chaloTextUIState2;
                        validationTicketStatusUIState2 = validationTicketStatusUIState;
                        multiChildQRCard = null;
                        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                        break;
                                    default:
                                        function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        });
                        uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                        break;
                                    default:
                                        function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        });
                        multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState3;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState2;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                        multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                        multiProductValidationUIStateFactory$childCardUiState$1.label = 4;
                        objI = i(productValidationData2, multiProductValidationUIStateFactory$childCardUiState$1);
                        if (objI != obj) {
                            multiChildQRCard2 = multiChildQRCard;
                            objK = objI;
                            validationTicketStatusUIState4 = validationTicketStatusUIState2;
                            uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                            chaloTextUIState4 = chaloTextUIState3;
                            stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                            multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                            multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                            objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                            if (objE != obj) {
                                UiEventHandler uiEventHandler13 = uiEventHandler;
                                uiEventHandler2 = uiEventHandlerA;
                                stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                                objK = objE;
                                validationTicketStatusUIState5 = validationTicketStatusUIState4;
                                multiChildQRCard3 = multiChildQRCard2;
                                uiEventHandler3 = uiEventHandler13;
                                textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                                objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                                if (objL != obj) {
                                    stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                                    textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                                    objK = objL;
                                    validationTicketStatusUIState6 = validationTicketStatusUIState5;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    UiEventHandler uiEventHandler14 = uiEventHandler2;
                                    UiEventHandler uiEventHandler15 = uiEventHandler3;
                                    MultiChildQRCard multiChildQRCard7 = multiChildQRCard3;
                                    TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState6 = (TextWithLeftAndRightIconUIState) objK;
                                    if (z) {
                                        borderUISpec = null;
                                    } else {
                                        borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                                    }
                                    return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard7, uiEventHandler15, uiEventHandler14, textWithLeftAndRightIconUIState6, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                z = multiProductValidationUIStateFactory$childCardUiState$1.Z$0;
                TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$4;
                ProductValidationData productValidationData5 = (ProductValidationData) multiProductValidationUIStateFactory$childCardUiState$1.L$3;
                Function1 function5 = (Function1) multiProductValidationUIStateFactory$childCardUiState$1.L$2;
                multiProductChildState3 = (MultiProductChildState) multiProductValidationUIStateFactory$childCardUiState$1.L$1;
                multiProductValidationDataState3 = (MultiProductValidationDataState) multiProductValidationUIStateFactory$childCardUiState$1.L$0;
                ResultKt.b(objK);
                chaloTextUIState2 = chaloTextUIState8;
                function3 = function5;
                productValidationData2 = productValidationData5;
                validationTicketStatusUIState = (ValidationTicketStatusUIState) objK;
                if (z) {
                    ActiveQrState activeQrState3 = multiProductValidationDataState3.d;
                    wg0 wg0Var3 = new wg0(function3, 20);
                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = function3;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = productValidationData2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = chaloTextUIState2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = validationTicketStatusUIState;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = null;
                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                    multiProductValidationUIStateFactory$childCardUiState$1.label = 3;
                    objH = h(multiProductChildState3, activeQrState3, wg0Var3, multiProductValidationUIStateFactory$childCardUiState$1);
                    if (objH != obj) {
                        function4 = function3;
                        validationTicketStatusUIState3 = validationTicketStatusUIState;
                        objK = objH;
                        multiChildQRCard = (MultiChildQRCard) objK;
                        TextUIState.ChaloTextUIState chaloTextUIState9 = chaloTextUIState2;
                        validationTicketStatusUIState2 = validationTicketStatusUIState3;
                        function3 = function4;
                        chaloTextUIState3 = chaloTextUIState9;
                        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                        break;
                                    default:
                                        function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        });
                        uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                        break;
                                    default:
                                        function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        });
                        multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState3;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState2;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                        multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                        multiProductValidationUIStateFactory$childCardUiState$1.label = 4;
                        objI = i(productValidationData2, multiProductValidationUIStateFactory$childCardUiState$1);
                        if (objI != obj) {
                            multiChildQRCard2 = multiChildQRCard;
                            objK = objI;
                            validationTicketStatusUIState4 = validationTicketStatusUIState2;
                            uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                            chaloTextUIState4 = chaloTextUIState3;
                            stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                            multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                            multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                            objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                            if (objE != obj) {
                                UiEventHandler uiEventHandler16 = uiEventHandler;
                                uiEventHandler2 = uiEventHandlerA;
                                stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                                objK = objE;
                                validationTicketStatusUIState5 = validationTicketStatusUIState4;
                                multiChildQRCard3 = multiChildQRCard2;
                                uiEventHandler3 = uiEventHandler16;
                                textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                                multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                                multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                                objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                                if (objL != obj) {
                                    stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                                    textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                                    objK = objL;
                                    validationTicketStatusUIState6 = validationTicketStatusUIState5;
                                    chaloTextUIState5 = chaloTextUIState4;
                                    UiEventHandler uiEventHandler17 = uiEventHandler2;
                                    UiEventHandler uiEventHandler18 = uiEventHandler3;
                                    MultiChildQRCard multiChildQRCard8 = multiChildQRCard3;
                                    TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState7 = (TextWithLeftAndRightIconUIState) objK;
                                    if (z) {
                                        borderUISpec = null;
                                    } else {
                                        borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                                    }
                                    return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard8, uiEventHandler18, uiEventHandler17, textWithLeftAndRightIconUIState7, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                                }
                            }
                        }
                    }
                } else {
                    chaloTextUIState3 = chaloTextUIState2;
                    validationTicketStatusUIState2 = validationTicketStatusUIState;
                    multiChildQRCard = null;
                    uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                    break;
                                default:
                                    function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                    break;
                                default:
                                    function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState3;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                    multiProductValidationUIStateFactory$childCardUiState$1.label = 4;
                    objI = i(productValidationData2, multiProductValidationUIStateFactory$childCardUiState$1);
                    if (objI != obj) {
                        multiChildQRCard2 = multiChildQRCard;
                        objK = objI;
                        validationTicketStatusUIState4 = validationTicketStatusUIState2;
                        uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                        chaloTextUIState4 = chaloTextUIState3;
                        stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                        multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                        multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                        objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                        if (objE != obj) {
                            UiEventHandler uiEventHandler19 = uiEventHandler;
                            uiEventHandler2 = uiEventHandlerA;
                            stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                            objK = objE;
                            validationTicketStatusUIState5 = validationTicketStatusUIState4;
                            multiChildQRCard3 = multiChildQRCard2;
                            uiEventHandler3 = uiEventHandler19;
                            textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                            multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                            multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                            multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                            objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                            if (objL != obj) {
                                stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                                textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                                objK = objL;
                                validationTicketStatusUIState6 = validationTicketStatusUIState5;
                                chaloTextUIState5 = chaloTextUIState4;
                                UiEventHandler uiEventHandler110 = uiEventHandler2;
                                UiEventHandler uiEventHandler111 = uiEventHandler3;
                                MultiChildQRCard multiChildQRCard9 = multiChildQRCard3;
                                TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState8 = (TextWithLeftAndRightIconUIState) objK;
                                if (z) {
                                    borderUISpec = null;
                                } else {
                                    borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                                }
                                return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard9, uiEventHandler111, uiEventHandler110, textWithLeftAndRightIconUIState8, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                            }
                        }
                    }
                }
                return obj;
            case 3:
                z = multiProductValidationUIStateFactory$childCardUiState$1.Z$0;
                validationTicketStatusUIState3 = (ValidationTicketStatusUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$3;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$2;
                productValidationData2 = (ProductValidationData) multiProductValidationUIStateFactory$childCardUiState$1.L$1;
                function4 = (Function1) multiProductValidationUIStateFactory$childCardUiState$1.L$0;
                ResultKt.b(objK);
                multiChildQRCard = (MultiChildQRCard) objK;
                TextUIState.ChaloTextUIState chaloTextUIState10 = chaloTextUIState2;
                validationTicketStatusUIState2 = validationTicketStatusUIState3;
                function3 = function4;
                chaloTextUIState3 = chaloTextUIState10;
                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                break;
                            default:
                                function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
                uiEventHandlerA = UiEventHandler.Companion.a(new Function0() { // from class: gk0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                function3.invoke(new MultiProductValidationIntent.ChildClickedIntent(productValidationData2));
                                break;
                            default:
                                function3.invoke(new MultiProductValidationIntent.ViewReceiptIntent(productValidationData2));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState3;
                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState2;
                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard;
                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler$Companion$fromLambda$1A;
                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                multiProductValidationUIStateFactory$childCardUiState$1.label = 4;
                objI = i(productValidationData2, multiProductValidationUIStateFactory$childCardUiState$1);
                if (objI != obj) {
                    multiChildQRCard2 = multiChildQRCard;
                    objK = objI;
                    validationTicketStatusUIState4 = validationTicketStatusUIState2;
                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                    chaloTextUIState4 = chaloTextUIState3;
                    stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                    multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                    objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                    if (objE != obj) {
                        UiEventHandler uiEventHandler112 = uiEventHandler;
                        uiEventHandler2 = uiEventHandlerA;
                        stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                        objK = objE;
                        validationTicketStatusUIState5 = validationTicketStatusUIState4;
                        multiChildQRCard3 = multiChildQRCard2;
                        uiEventHandler3 = uiEventHandler112;
                        textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                        multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                        multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                        multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                        objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                        if (objL != obj) {
                            stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                            textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                            objK = objL;
                            validationTicketStatusUIState6 = validationTicketStatusUIState5;
                            chaloTextUIState5 = chaloTextUIState4;
                            UiEventHandler uiEventHandler113 = uiEventHandler2;
                            UiEventHandler uiEventHandler114 = uiEventHandler3;
                            MultiChildQRCard multiChildQRCard10 = multiChildQRCard3;
                            TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState9 = (TextWithLeftAndRightIconUIState) objK;
                            if (z) {
                                borderUISpec = null;
                            } else {
                                borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                            }
                            return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard10, uiEventHandler114, uiEventHandler113, textWithLeftAndRightIconUIState9, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                        }
                    }
                }
                return obj;
            case 4:
                z = multiProductValidationUIStateFactory$childCardUiState$1.Z$0;
                uiEventHandlerA = (UiEventHandler) multiProductValidationUIStateFactory$childCardUiState$1.L$4;
                uiEventHandler = (UiEventHandler) multiProductValidationUIStateFactory$childCardUiState$1.L$3;
                multiChildQRCard2 = (MultiChildQRCard) multiProductValidationUIStateFactory$childCardUiState$1.L$2;
                validationTicketStatusUIState4 = (ValidationTicketStatusUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$1;
                chaloTextUIState4 = (TextUIState.ChaloTextUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$0;
                ResultKt.b(objK);
                stepTicketModeBasedInfoUIState = (StepTicketModeBasedInfoUIState) objK;
                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState4;
                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard2;
                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler;
                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandlerA;
                multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState;
                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                multiProductValidationUIStateFactory$childCardUiState$1.label = 5;
                objE = e(z, multiProductValidationUIStateFactory$childCardUiState$1);
                if (objE != obj) {
                    UiEventHandler uiEventHandler115 = uiEventHandler;
                    uiEventHandler2 = uiEventHandlerA;
                    stepTicketModeBasedInfoUIState2 = stepTicketModeBasedInfoUIState;
                    objK = objE;
                    validationTicketStatusUIState5 = validationTicketStatusUIState4;
                    multiChildQRCard3 = multiChildQRCard2;
                    uiEventHandler3 = uiEventHandler115;
                    textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                    multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                    multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                    multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                    objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                    if (objL != obj) {
                        stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                        textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                        objK = objL;
                        validationTicketStatusUIState6 = validationTicketStatusUIState5;
                        chaloTextUIState5 = chaloTextUIState4;
                        UiEventHandler uiEventHandler116 = uiEventHandler2;
                        UiEventHandler uiEventHandler117 = uiEventHandler3;
                        MultiChildQRCard multiChildQRCard11 = multiChildQRCard3;
                        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState10 = (TextWithLeftAndRightIconUIState) objK;
                        if (z) {
                            borderUISpec = null;
                        } else {
                            borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                        }
                        return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard11, uiEventHandler117, uiEventHandler116, textWithLeftAndRightIconUIState10, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                    }
                }
                return obj;
            case 5:
                z = multiProductValidationUIStateFactory$childCardUiState$1.Z$0;
                stepTicketModeBasedInfoUIState2 = (StepTicketModeBasedInfoUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$5;
                uiEventHandler2 = (UiEventHandler) multiProductValidationUIStateFactory$childCardUiState$1.L$4;
                uiEventHandler3 = (UiEventHandler) multiProductValidationUIStateFactory$childCardUiState$1.L$3;
                multiChildQRCard3 = (MultiChildQRCard) multiProductValidationUIStateFactory$childCardUiState$1.L$2;
                ValidationTicketStatusUIState validationTicketStatusUIState7 = (ValidationTicketStatusUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState11 = (TextUIState.ChaloTextUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$0;
                ResultKt.b(objK);
                validationTicketStatusUIState5 = validationTicketStatusUIState7;
                chaloTextUIState4 = chaloTextUIState11;
                textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) objK;
                multiProductValidationUIStateFactory$childCardUiState$1.L$0 = chaloTextUIState4;
                multiProductValidationUIStateFactory$childCardUiState$1.L$1 = validationTicketStatusUIState5;
                multiProductValidationUIStateFactory$childCardUiState$1.L$2 = multiChildQRCard3;
                multiProductValidationUIStateFactory$childCardUiState$1.L$3 = uiEventHandler3;
                multiProductValidationUIStateFactory$childCardUiState$1.L$4 = uiEventHandler2;
                multiProductValidationUIStateFactory$childCardUiState$1.L$5 = stepTicketModeBasedInfoUIState2;
                multiProductValidationUIStateFactory$childCardUiState$1.L$6 = textWithLeftAndRightIconUIState;
                multiProductValidationUIStateFactory$childCardUiState$1.Z$0 = z;
                multiProductValidationUIStateFactory$childCardUiState$1.label = 6;
                objL = l(multiProductValidationUIStateFactory$childCardUiState$1);
                if (objL != obj) {
                    stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState2;
                    textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState;
                    objK = objL;
                    validationTicketStatusUIState6 = validationTicketStatusUIState5;
                    chaloTextUIState5 = chaloTextUIState4;
                    UiEventHandler uiEventHandler118 = uiEventHandler2;
                    UiEventHandler uiEventHandler119 = uiEventHandler3;
                    MultiChildQRCard multiChildQRCard12 = multiChildQRCard3;
                    TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState11 = (TextWithLeftAndRightIconUIState) objK;
                    if (z) {
                        borderUISpec = null;
                    } else {
                        borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                    }
                    return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard12, uiEventHandler119, uiEventHandler118, textWithLeftAndRightIconUIState11, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
                }
                return obj;
            case 6:
                z = multiProductValidationUIStateFactory$childCardUiState$1.Z$0;
                TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState12 = (TextWithLeftAndRightIconUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$6;
                StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState4 = (StepTicketModeBasedInfoUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$5;
                uiEventHandler2 = (UiEventHandler) multiProductValidationUIStateFactory$childCardUiState$1.L$4;
                uiEventHandler3 = (UiEventHandler) multiProductValidationUIStateFactory$childCardUiState$1.L$3;
                multiChildQRCard3 = (MultiChildQRCard) multiProductValidationUIStateFactory$childCardUiState$1.L$2;
                ValidationTicketStatusUIState validationTicketStatusUIState8 = (ValidationTicketStatusUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState12 = (TextUIState.ChaloTextUIState) multiProductValidationUIStateFactory$childCardUiState$1.L$0;
                ResultKt.b(objK);
                textWithLeftAndRightIconUIState2 = textWithLeftAndRightIconUIState12;
                chaloTextUIState5 = chaloTextUIState12;
                stepTicketModeBasedInfoUIState3 = stepTicketModeBasedInfoUIState4;
                validationTicketStatusUIState6 = validationTicketStatusUIState8;
                UiEventHandler uiEventHandler1110 = uiEventHandler2;
                UiEventHandler uiEventHandler1111 = uiEventHandler3;
                MultiChildQRCard multiChildQRCard13 = multiChildQRCard3;
                TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState13 = (TextWithLeftAndRightIconUIState) objK;
                if (z) {
                    borderUISpec = null;
                } else {
                    borderUISpec = new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.OrangePrimary.f9835a, UIShape.e);
                }
                return new MultiProductChildCardUIState(chaloTextUIState5, stepTicketModeBasedInfoUIState3, validationTicketStatusUIState6, textWithLeftAndRightIconUIState2, multiChildQRCard13, uiEventHandler1111, uiEventHandler1110, textWithLeftAndRightIconUIState13, new MultiProductChildCardUISpec(borderUISpec, z ? ChaloColorToken.OrangeBackground.f9832a : null));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x023e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0267  */
    /* JADX WARN: Code duplicated, block: B:65:0x0271  */
    /* JADX WARN: Code duplicated, block: B:68:0x029f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v18, types: [app.chalo.uistate.text.TextUIState] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x029f -> B:69:0x02a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationDataState r35, kotlin.jvm.functions.Function1 r36, defpackage.dk0 r37, defpackage.dk0 r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory.d(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationDataState, kotlin.jvm.functions.Function1, dk0, dk0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r1 == r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory.e(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009e -> B:33:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory.f(app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x016c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r4 == r6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        if (r4 == r6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        if (r4 == r6) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r31, java.lang.String r32, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r33, kotlin.jvm.functions.Function0 r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory.g(java.lang.String, java.lang.String, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0148, code lost:
    
        if (r3 == r6) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductChildState r17, app.chalo.validationsdk.multiproductvalidation.ui.ActiveQrState r18, defpackage.wg0 r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory.h(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductChildState, app.chalo.validationsdk.multiproductvalidation.ui.ActiveQrState, wg0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        MultiProductValidationUIStateFactory$routeAndStopDetails$1 multiProductValidationUIStateFactory$routeAndStopDetails$1;
        if (continuationImpl instanceof MultiProductValidationUIStateFactory$routeAndStopDetails$1) {
            multiProductValidationUIStateFactory$routeAndStopDetails$1 = (MultiProductValidationUIStateFactory$routeAndStopDetails$1) continuationImpl;
            int i = multiProductValidationUIStateFactory$routeAndStopDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProductValidationUIStateFactory$routeAndStopDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                multiProductValidationUIStateFactory$routeAndStopDetails$1 = new MultiProductValidationUIStateFactory$routeAndStopDetails$1(this, continuationImpl);
            }
        } else {
            multiProductValidationUIStateFactory$routeAndStopDetails$1 = new MultiProductValidationUIStateFactory$routeAndStopDetails$1(this, continuationImpl);
        }
        Object objT = multiProductValidationUIStateFactory$routeAndStopDetails$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiProductValidationUIStateFactory$routeAndStopDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objT);
            multiProductValidationUIStateFactory$routeAndStopDetails$1.L$0 = productValidationData;
            multiProductValidationUIStateFactory$routeAndStopDetails$1.label = 1;
            objT = productValidationData.t(multiProductValidationUIStateFactory$routeAndStopDetails$1);
            if (objT != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objT);
            return objT;
        }
        productValidationData = (ProductValidationData) multiProductValidationUIStateFactory$routeAndStopDetails$1.L$0;
        ResultKt.b(objT);
        ProductDetailsDisplayData productDetailsDisplayData = (ProductDetailsDisplayData) objT;
        switch (WhenMappings.f10705a[productValidationData.B().ordinal()]) {
            case 1:
                RouteDetailsFieldData routeDetailsFieldData = productDetailsDisplayData.e;
                if (routeDetailsFieldData != null) {
                    return StepTicketModeBasedInfoUIStateFactory.b(this.c, routeDetailsFieldData.e, routeDetailsFieldData.f10621a, routeDetailsFieldData.b);
                }
                return null;
            case 2:
                multiProductValidationUIStateFactory$routeAndStopDetails$1.L$0 = null;
                multiProductValidationUIStateFactory$routeAndStopDetails$1.label = 2;
                Object objF = f(productDetailsDisplayData, multiProductValidationUIStateFactory$routeAndStopDetails$1);
                return objF == obj ? obj : objF;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object j(MultiProductValidationData multiProductValidationData, Function1 function1, ContinuationImpl continuationImpl) {
        MultiProductValidationUIStateFactory$toolbar$1 multiProductValidationUIStateFactory$toolbar$1;
        ChaloColorToken.White white;
        Function1 function2;
        ChaloColorToken.White white2;
        String str;
        TextUIState.ChaloTextUIState chaloTextUIState;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A;
        float f;
        ToolbarUiSpecs toolbarUiSpecs;
        DividerUIState dividerUIState;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2;
        Object objB;
        ChaloColorToken.White white3;
        float f2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        UiEventHandler uiEventHandler;
        ToolbarUiSpecs toolbarUiSpecs2;
        DividerUIState dividerUIState2;
        UiEventHandler uiEventHandler2;
        if (continuationImpl instanceof MultiProductValidationUIStateFactory$toolbar$1) {
            multiProductValidationUIStateFactory$toolbar$1 = (MultiProductValidationUIStateFactory$toolbar$1) continuationImpl;
            int i = multiProductValidationUIStateFactory$toolbar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProductValidationUIStateFactory$toolbar$1.label = i - Integer.MIN_VALUE;
            } else {
                multiProductValidationUIStateFactory$toolbar$1 = new MultiProductValidationUIStateFactory$toolbar$1(this, continuationImpl);
            }
        } else {
            multiProductValidationUIStateFactory$toolbar$1 = new MultiProductValidationUIStateFactory$toolbar$1(this, continuationImpl);
        }
        Object obj = multiProductValidationUIStateFactory$toolbar$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiProductValidationUIStateFactory$toolbar$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                white2 = (ChaloColorToken.White) multiProductValidationUIStateFactory$toolbar$1.L$1;
                function2 = (Function1) multiProductValidationUIStateFactory$toolbar$1.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                float f3 = multiProductValidationUIStateFactory$toolbar$1.F$0;
                UiEventHandler uiEventHandler3 = (UiEventHandler) multiProductValidationUIStateFactory$toolbar$1.L$5;
                DividerUIState dividerUIState3 = (DividerUIState) multiProductValidationUIStateFactory$toolbar$1.L$4;
                ToolbarUiSpecs toolbarUiSpecs3 = (ToolbarUiSpecs) multiProductValidationUIStateFactory$toolbar$1.L$3;
                UiEventHandler uiEventHandler4 = (UiEventHandler) multiProductValidationUIStateFactory$toolbar$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) multiProductValidationUIStateFactory$toolbar$1.L$1;
                ChaloColorToken.White white4 = (ChaloColorToken.White) multiProductValidationUIStateFactory$toolbar$1.L$0;
                ResultKt.b(obj);
                f2 = f3;
                white3 = white4;
                dividerUIState2 = dividerUIState3;
                toolbarUiSpecs2 = toolbarUiSpecs3;
                uiEventHandler = uiEventHandler4;
                chaloTextUIState2 = chaloTextUIState3;
                uiEventHandler2 = uiEventHandler3;
            }
            TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            float f4 = ChaloThemeHelper.a().f;
            ChaloPadding chaloPadding = new ChaloPadding(f4, f4, f4, f4);
            UIShape.Rectangle rectangle = UIShape.c;
            return new ToolbarUIState(toolbarUiSpecs2, chaloTextUIState2, null, uiEventHandler, CollectionsKt.R(new ToolbarActionsUIState(uiEventHandler2, null, chaloTextUIState4, new ToolbarActionSpec(chaloPadding, rectangle, new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, rectangle), 2), 2)), f2, dividerUIState2, white3, 4);
        }
        ResultKt.b(obj);
        white = ChaloColorToken.White.f9870a;
        function2 = function1;
        if (multiProductValidationData != null) {
            multiProductValidationUIStateFactory$toolbar$1.L$0 = function2;
            multiProductValidationUIStateFactory$toolbar$1.L$1 = white;
            multiProductValidationUIStateFactory$toolbar$1.label = 1;
            Object objK = multiProductValidationData.k(multiProductValidationUIStateFactory$toolbar$1);
            if (objK != obj2) {
                obj = objK;
                white2 = white;
            }
        } else {
            str = "";
            white2 = white;
            chaloTextUIState = new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
            uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new wg0(function2, 21));
            f = ChaloThemeHelper.a().f1916a;
            float f5 = ChaloThemeHelper.a().f;
            float f6 = ChaloThemeHelper.a().f;
            toolbarUiSpecs = new ToolbarUiSpecs(white2, new ChaloPadding(f6, f5, f5, f6), ChaloThemeHelper.a().g, 20);
            dividerUIState = new DividerUIState(0.0f, null, null, 7);
            uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new wg0(function2, 22));
            multiProductValidationUIStateFactory$toolbar$1.L$0 = white2;
            multiProductValidationUIStateFactory$toolbar$1.L$1 = chaloTextUIState;
            multiProductValidationUIStateFactory$toolbar$1.L$2 = uiEventHandler$Companion$fromLambda$1A;
            multiProductValidationUIStateFactory$toolbar$1.L$3 = toolbarUiSpecs;
            multiProductValidationUIStateFactory$toolbar$1.L$4 = dividerUIState;
            multiProductValidationUIStateFactory$toolbar$1.L$5 = uiEventHandler$Companion$fromLambda$1A2;
            multiProductValidationUIStateFactory$toolbar$1.F$0 = f;
            multiProductValidationUIStateFactory$toolbar$1.label = 2;
            objB = this.f10704a.b(StringEnum.HELP, new Object[0], multiProductValidationUIStateFactory$toolbar$1);
            if (objB != obj2) {
                white3 = white2;
                f2 = f;
                obj = objB;
                chaloTextUIState2 = chaloTextUIState;
                uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                toolbarUiSpecs2 = toolbarUiSpecs;
                dividerUIState2 = dividerUIState;
                uiEventHandler2 = uiEventHandler$Companion$fromLambda$1A2;
                TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                float f7 = ChaloThemeHelper.a().f;
                ChaloPadding chaloPadding2 = new ChaloPadding(f7, f7, f7, f7);
                UIShape.Rectangle rectangle2 = UIShape.c;
                return new ToolbarUIState(toolbarUiSpecs2, chaloTextUIState2, null, uiEventHandler, CollectionsKt.R(new ToolbarActionsUIState(uiEventHandler2, null, chaloTextUIState5, new ToolbarActionSpec(chaloPadding2, rectangle2, new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, rectangle2), 2), 2)), f2, dividerUIState2, white3, 4);
            }
        }
        return obj2;
        String str2 = (String) obj;
        if (str2 == null) {
            white = white2;
            str = "";
            white2 = white;
        } else {
            str = str2;
        }
        chaloTextUIState = new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new wg0(function2, 21));
        f = ChaloThemeHelper.a().f1916a;
        float f8 = ChaloThemeHelper.a().f;
        float f9 = ChaloThemeHelper.a().f;
        toolbarUiSpecs = new ToolbarUiSpecs(white2, new ChaloPadding(f9, f8, f8, f9), ChaloThemeHelper.a().g, 20);
        dividerUIState = new DividerUIState(0.0f, null, null, 7);
        uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new wg0(function2, 22));
        multiProductValidationUIStateFactory$toolbar$1.L$0 = white2;
        multiProductValidationUIStateFactory$toolbar$1.L$1 = chaloTextUIState;
        multiProductValidationUIStateFactory$toolbar$1.L$2 = uiEventHandler$Companion$fromLambda$1A;
        multiProductValidationUIStateFactory$toolbar$1.L$3 = toolbarUiSpecs;
        multiProductValidationUIStateFactory$toolbar$1.L$4 = dividerUIState;
        multiProductValidationUIStateFactory$toolbar$1.L$5 = uiEventHandler$Companion$fromLambda$1A2;
        multiProductValidationUIStateFactory$toolbar$1.F$0 = f;
        multiProductValidationUIStateFactory$toolbar$1.label = 2;
        objB = this.f10704a.b(StringEnum.HELP, new Object[0], multiProductValidationUIStateFactory$toolbar$1);
        if (objB != obj2) {
            white3 = white2;
            f2 = f;
            obj = objB;
            chaloTextUIState2 = chaloTextUIState;
            uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
            toolbarUiSpecs2 = toolbarUiSpecs;
            dividerUIState2 = dividerUIState;
            uiEventHandler2 = uiEventHandler$Companion$fromLambda$1A2;
            TextUIState.ChaloTextUIState chaloTextUIState6 = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            float f10 = ChaloThemeHelper.a().f;
            ChaloPadding chaloPadding3 = new ChaloPadding(f10, f10, f10, f10);
            UIShape.Rectangle rectangle3 = UIShape.c;
            return new ToolbarUIState(toolbarUiSpecs2, chaloTextUIState2, null, uiEventHandler, CollectionsKt.R(new ToolbarActionsUIState(uiEventHandler2, null, chaloTextUIState6, new ToolbarActionSpec(chaloPadding3, rectangle3, new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, rectangle3), 2), 2)), f2, dividerUIState2, white3, 4);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[PHI: r9 r10
      0x00d6: PHI (r9v15 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) = 
      (r9v6 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
      (r9v18 app.chalo.validationsdk.blevalidation.data.models.ProductValidationData)
     binds: [B:37:0x00d3, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r10v18 java.lang.Object) = (r10v13 java.lang.Object), (r10v1 java.lang.Object) binds: [B:37:0x00d3, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108 A[PHI: r10
      0x0108: PHI (r10v27 java.lang.Object) = (r10v22 java.lang.Object), (r10v1 java.lang.Object) binds: [B:47:0x0105, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011f, code lost:
    
        if (r10 == r1) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory.k(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(ContinuationImpl continuationImpl) {
        MultiProductValidationUIStateFactory$viewReceiptText$1 multiProductValidationUIStateFactory$viewReceiptText$1;
        ImageUIState imageUIState;
        if (continuationImpl instanceof MultiProductValidationUIStateFactory$viewReceiptText$1) {
            multiProductValidationUIStateFactory$viewReceiptText$1 = (MultiProductValidationUIStateFactory$viewReceiptText$1) continuationImpl;
            int i = multiProductValidationUIStateFactory$viewReceiptText$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProductValidationUIStateFactory$viewReceiptText$1.label = i - Integer.MIN_VALUE;
            } else {
                multiProductValidationUIStateFactory$viewReceiptText$1 = new MultiProductValidationUIStateFactory$viewReceiptText$1(this, continuationImpl);
            }
        } else {
            multiProductValidationUIStateFactory$viewReceiptText$1 = new MultiProductValidationUIStateFactory$viewReceiptText$1(this, continuationImpl);
        }
        Object objB = multiProductValidationUIStateFactory$viewReceiptText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiProductValidationUIStateFactory$viewReceiptText$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_RECEIPT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            multiProductValidationUIStateFactory$viewReceiptText$1.L$0 = imageUIState2;
            multiProductValidationUIStateFactory$viewReceiptText$1.label = 1;
            objB = this.f10704a.b(StringEnum.VIEW_DETAILS, new Object[0], multiProductValidationUIStateFactory$viewReceiptText$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            imageUIState = imageUIState2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ImageUIState imageUIState3 = (ImageUIState) multiProductValidationUIStateFactory$viewReceiptText$1.L$0;
            ResultKt.b(objB);
            imageUIState = imageUIState3;
        }
        return new TextWithLeftAndRightIconUIState(imageUIState, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, ChaloThemeHelper.a().e, null, 20);
    }
}
