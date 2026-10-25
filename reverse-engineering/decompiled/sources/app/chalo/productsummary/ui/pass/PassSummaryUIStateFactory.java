package app.chalo.productsummary.ui.pass;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusSpec;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState;
import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen;
import app.chalo.productsummary.ui.pass.PassSummaryIntent;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.qm0;
import defpackage.sn0;
import defpackage.zf0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryUIStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassSummaryUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f8781a;
    public final TimeUtilsContract b;
    public final GetProductStatusUIForSummaryScreen c;
    public final CurrencyFeature d;
    public final BookingHelper e;
    public final BasicInfoContract f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8782a;

        static {
            int[] iArr = new int[SuperPassStatus.values().length];
            try {
                iArr[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassStatus.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperPassStatus.UNUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SuperPassStatus.USED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SuperPassStatus.EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SuperPassStatus.CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SuperPassStatus.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f8782a = iArr;
        }
    }

    public PassSummaryUIStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract, GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen, CurrencyFeature currencyFeature, BookingHelper bookingHelper, BasicInfoContract basicInfoContract) {
        this.f8781a = stringProvider;
        this.b = timeUtilsContract;
        this.c = getProductStatusUIForSummaryScreen;
        this.d = currencyFeature;
        this.e = bookingHelper;
        this.f = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(PassSummaryDataState passSummaryDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PassSummaryUIStateFactory$buildUIState$1 passSummaryUIStateFactory$buildUIState$1;
        PassSummaryScreenType passSummaryScreenType;
        LoadingDialogUIState loadingDialogUIState;
        PassSummaryScreenType passSummaryScreenType2;
        Function1 function2;
        PassSummaryScreenType passSummaryScreenType3;
        PassSummaryScreenType passSummaryScreenType4;
        ChaloTextStyleHelper chaloTextStyleHelper;
        PassSummaryDataState passSummaryDataState2 = passSummaryDataState;
        Function1 function3 = function1;
        if (continuationImpl instanceof PassSummaryUIStateFactory$buildUIState$1) {
            passSummaryUIStateFactory$buildUIState$1 = (PassSummaryUIStateFactory$buildUIState$1) continuationImpl;
            int i = passSummaryUIStateFactory$buildUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passSummaryUIStateFactory$buildUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                passSummaryUIStateFactory$buildUIState$1 = new PassSummaryUIStateFactory$buildUIState$1(this, continuationImpl);
            }
        } else {
            passSummaryUIStateFactory$buildUIState$1 = new PassSummaryUIStateFactory$buildUIState$1(this, continuationImpl);
        }
        Object objC = passSummaryUIStateFactory$buildUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passSummaryUIStateFactory$buildUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            passSummaryUIStateFactory$buildUIState$1.L$0 = passSummaryDataState2;
            passSummaryUIStateFactory$buildUIState$1.L$1 = function3;
            passSummaryUIStateFactory$buildUIState$1.label = 1;
            objC = c(passSummaryDataState2, function3, passSummaryUIStateFactory$buildUIState$1);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            Function1 function4 = (Function1) passSummaryUIStateFactory$buildUIState$1.L$1;
            PassSummaryDataState passSummaryDataState3 = (PassSummaryDataState) passSummaryUIStateFactory$buildUIState$1.L$0;
            ResultKt.b(objC);
            function3 = function4;
            passSummaryDataState2 = passSummaryDataState3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper2 = (ChaloTextStyleHelper) passSummaryUIStateFactory$buildUIState$1.L$3;
            passSummaryScreenType3 = (PassSummaryScreenType) passSummaryUIStateFactory$buildUIState$1.L$2;
            passSummaryScreenType4 = (PassSummaryScreenType) passSummaryUIStateFactory$buildUIState$1.L$1;
            function2 = (Function1) passSummaryUIStateFactory$buildUIState$1.L$0;
            ResultKt.b(objC);
            chaloTextStyleHelper = chaloTextStyleHelper2;
        }
        Function1 function5 = function2;
        passSummaryScreenType2 = passSummaryScreenType3;
        function3 = function5;
        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objC, ChaloColorToken.Black.f9759a, 0, null, null, null, null, 124));
        passSummaryScreenType = passSummaryScreenType4;
        return new PassSummaryViewState(passSummaryScreenType2, loadingDialogUIState, UiEventHandler.Companion.a(new zf0(24, function3, passSummaryScreenType)));
        passSummaryScreenType = (PassSummaryScreenType) objC;
        if (passSummaryDataState2.b) {
            passSummaryUIStateFactory$buildUIState$1.L$0 = function3;
            passSummaryUIStateFactory$buildUIState$1.L$1 = passSummaryScreenType;
            passSummaryUIStateFactory$buildUIState$1.L$2 = passSummaryScreenType;
            ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
            passSummaryUIStateFactory$buildUIState$1.L$3 = chaloTextStyleHelper3;
            passSummaryUIStateFactory$buildUIState$1.label = 2;
            Object objB = this.f8781a.b(StringEnum.LOADING, new Object[0], passSummaryUIStateFactory$buildUIState$1);
            if (objB != obj) {
                function2 = function3;
                passSummaryScreenType3 = passSummaryScreenType;
                passSummaryScreenType4 = passSummaryScreenType3;
                chaloTextStyleHelper = chaloTextStyleHelper3;
                objC = objB;
                Function1 function6 = function2;
                passSummaryScreenType2 = passSummaryScreenType3;
                function3 = function6;
                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objC, ChaloColorToken.Black.f9759a, 0, null, null, null, null, 124));
                passSummaryScreenType = passSummaryScreenType4;
            }
            return obj;
        }
        loadingDialogUIState = null;
        passSummaryScreenType2 = passSummaryScreenType;
        return new PassSummaryViewState(passSummaryScreenType2, loadingDialogUIState, UiEventHandler.Companion.a(new zf0(24, function3, passSummaryScreenType)));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0dd7  */
    /* JADX WARN: Code duplicated, block: B:106:0x0de6  */
    /* JADX WARN: Code duplicated, block: B:109:0x0e0d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0e15  */
    /* JADX WARN: Code duplicated, block: B:114:0x0e19  */
    /* JADX WARN: Code duplicated, block: B:117:0x0e3e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0e43  */
    /* JADX WARN: Code duplicated, block: B:122:0x0e68  */
    /* JADX WARN: Code duplicated, block: B:125:0x0e6f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0e82  */
    /* JADX WARN: Code duplicated, block: B:130:0x0f5e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0f61  */
    /* JADX WARN: Code duplicated, block: B:134:0x102f  */
    /* JADX WARN: Code duplicated, block: B:135:0x103e  */
    /* JADX WARN: Code duplicated, block: B:138:0x1054  */
    /* JADX WARN: Code duplicated, block: B:139:0x107a  */
    /* JADX WARN: Code duplicated, block: B:142:0x10b0  */
    /* JADX WARN: Code duplicated, block: B:143:0x10d4  */
    /* JADX WARN: Code duplicated, block: B:146:0x1116  */
    /* JADX WARN: Code duplicated, block: B:149:0x1154  */
    /* JADX WARN: Code duplicated, block: B:151:0x1215  */
    /* JADX WARN: Code duplicated, block: B:155:0x1257 A[LOOP:7: B:153:0x1251->B:155:0x1257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x12f2  */
    /* JADX WARN: Code duplicated, block: B:163:0x1335  */
    /* JADX WARN: Code duplicated, block: B:167:0x13cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x144f  */
    /* JADX WARN: Code duplicated, block: B:175:0x1505  */
    /* JADX WARN: Code duplicated, block: B:179:0x1549  */
    /* JADX WARN: Code duplicated, block: B:183:0x15c9 A[LOOP:6: B:181:0x15c3->B:183:0x15c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x162e  */
    /* JADX WARN: Code duplicated, block: B:187:0x1634  */
    /* JADX WARN: Code duplicated, block: B:190:0x163c  */
    /* JADX WARN: Code duplicated, block: B:191:0x163f  */
    /* JADX WARN: Code duplicated, block: B:195:0x1666  */
    /* JADX WARN: Code duplicated, block: B:199:0x1692  */
    /* JADX WARN: Code duplicated, block: B:211:0x174f  */
    /* JADX WARN: Code duplicated, block: B:215:0x1785  */
    /* JADX WARN: Code duplicated, block: B:219:0x17b9  */
    /* JADX WARN: Code duplicated, block: B:223:0x17e9  */
    /* JADX WARN: Code duplicated, block: B:227:0x1824  */
    /* JADX WARN: Code duplicated, block: B:231:0x1854  */
    /* JADX WARN: Code duplicated, block: B:234:0x1866  */
    /* JADX WARN: Code duplicated, block: B:237:0x188b  */
    /* JADX WARN: Code duplicated, block: B:240:0x1895 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:241:0x1897  */
    /* JADX WARN: Code duplicated, block: B:244:0x18bc  */
    /* JADX WARN: Code duplicated, block: B:246:0x18c1  */
    /* JADX WARN: Code duplicated, block: B:249:0x18e6  */
    /* JADX WARN: Code duplicated, block: B:252:0x18ed  */
    /* JADX WARN: Code duplicated, block: B:254:0x1900  */
    /* JADX WARN: Code duplicated, block: B:258:0x19d3  */
    /* JADX WARN: Code duplicated, block: B:261:0x1a79  */
    /* JADX WARN: Code duplicated, block: B:262:0x1a7c  */
    /* JADX WARN: Code duplicated, block: B:265:0x1b92  */
    /* JADX WARN: Code duplicated, block: B:266:0x1ba5  */
    /* JADX WARN: Code duplicated, block: B:269:0x1bbf  */
    /* JADX WARN: Code duplicated, block: B:270:0x1be5  */
    /* JADX WARN: Code duplicated, block: B:273:0x1c1b  */
    /* JADX WARN: Code duplicated, block: B:274:0x1c3f  */
    /* JADX WARN: Code duplicated, block: B:277:0x1c81  */
    /* JADX WARN: Code duplicated, block: B:280:0x1cc2  */
    /* JADX WARN: Code duplicated, block: B:283:0x1d82  */
    /* JADX WARN: Code duplicated, block: B:287:0x1dbf A[LOOP:5: B:285:0x1db9->B:287:0x1dbf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:291:0x1e63  */
    /* JADX WARN: Code duplicated, block: B:295:0x1ea5  */
    /* JADX WARN: Code duplicated, block: B:299:0x1f39  */
    /* JADX WARN: Code duplicated, block: B:303:0x1fcc  */
    /* JADX WARN: Code duplicated, block: B:307:0x208e  */
    /* JADX WARN: Code duplicated, block: B:311:0x20d6  */
    /* JADX WARN: Code duplicated, block: B:315:0x2149 A[LOOP:4: B:313:0x2143->B:315:0x2149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x21b0  */
    /* JADX WARN: Code duplicated, block: B:319:0x21b6  */
    /* JADX WARN: Code duplicated, block: B:322:0x21be  */
    /* JADX WARN: Code duplicated, block: B:323:0x21c1  */
    /* JADX WARN: Code duplicated, block: B:327:0x21e8  */
    /* JADX WARN: Code duplicated, block: B:342:0x22cc  */
    /* JADX WARN: Code duplicated, block: B:346:0x22fe  */
    /* JADX WARN: Code duplicated, block: B:349:0x2379  */
    /* JADX WARN: Code duplicated, block: B:351:0x2384  */
    /* JADX WARN: Code duplicated, block: B:353:0x23c5  */
    /* JADX WARN: Code duplicated, block: B:354:0x23c8  */
    /* JADX WARN: Code duplicated, block: B:359:0x244f  */
    /* JADX WARN: Code duplicated, block: B:362:0x24cd  */
    /* JADX WARN: Code duplicated, block: B:363:0x24dc  */
    /* JADX WARN: Code duplicated, block: B:366:0x24f6  */
    /* JADX WARN: Code duplicated, block: B:367:0x251c  */
    /* JADX WARN: Code duplicated, block: B:370:0x2553  */
    /* JADX WARN: Code duplicated, block: B:371:0x2574  */
    /* JADX WARN: Code duplicated, block: B:375:0x25cf A[LOOP:3: B:373:0x25c9->B:375:0x25cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:379:0x2670  */
    /* JADX WARN: Code duplicated, block: B:383:0x26ae  */
    /* JADX WARN: Code duplicated, block: B:387:0x2733  */
    /* JADX WARN: Code duplicated, block: B:391:0x27a8  */
    /* JADX WARN: Code duplicated, block: B:395:0x285f  */
    /* JADX WARN: Code duplicated, block: B:399:0x289a  */
    /* JADX WARN: Code duplicated, block: B:403:0x2915 A[LOOP:2: B:401:0x290f->B:403:0x2915, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:406:0x2968  */
    /* JADX WARN: Code duplicated, block: B:407:0x296e  */
    /* JADX WARN: Code duplicated, block: B:410:0x2976  */
    /* JADX WARN: Code duplicated, block: B:411:0x2978  */
    /* JADX WARN: Code duplicated, block: B:423:0x29e2  */
    /* JADX WARN: Code duplicated, block: B:427:0x2a46  */
    /* JADX WARN: Code duplicated, block: B:431:0x2ae5  */
    /* JADX WARN: Code duplicated, block: B:434:0x2b6b  */
    /* JADX WARN: Code duplicated, block: B:435:0x2b7a  */
    /* JADX WARN: Code duplicated, block: B:438:0x2b9c  */
    /* JADX WARN: Code duplicated, block: B:439:0x2bc6  */
    /* JADX WARN: Code duplicated, block: B:442:0x2bf3  */
    /* JADX WARN: Code duplicated, block: B:443:0x2c14  */
    /* JADX WARN: Code duplicated, block: B:447:0x2c6f A[LOOP:1: B:445:0x2c69->B:447:0x2c6f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:450:0x2ce5  */
    /* JADX WARN: Code duplicated, block: B:457:0x2cfc  */
    /* JADX WARN: Code duplicated, block: B:459:0x2cff  */
    /* JADX WARN: Code duplicated, block: B:462:0x2d24  */
    /* JADX WARN: Code duplicated, block: B:466:0x2d5f  */
    /* JADX WARN: Code duplicated, block: B:469:0x2db4  */
    /* JADX WARN: Code duplicated, block: B:472:0x2dcb A[LOOP:0: B:470:0x2dc5->B:472:0x2dcb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:473:0x2e06  */
    /* JADX WARN: Code duplicated, block: B:476:0x2e14  */
    /* JADX WARN: Code duplicated, block: B:480:0x2e21  */
    /* JADX WARN: Code duplicated, block: B:482:0x2e2a  */
    /* JADX WARN: Code duplicated, block: B:484:0x2e2e  */
    /* JADX WARN: Code duplicated, block: B:485:0x2e30  */
    /* JADX WARN: Code duplicated, block: B:503:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    /* JADX WARN: Code duplicated, block: B:84:0x0ce8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0d17  */
    /* JADX WARN: Code duplicated, block: B:92:0x0d4a A[PHI: r0 r1 r2 r3 r4 r5 r6 r7 r8 r9 r10 r13 r29 r33
      0x0d4a: PHI (r0v24 app.chalo.contract.BasicInfoContract) = (r0v23 app.chalo.contract.BasicInfoContract), (r0v25 app.chalo.contract.BasicInfoContract) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r1v10 boolean) = (r1v8 boolean), (r1v12 boolean) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r2v13 app.chalo.superpass.data.models.entities.MagicSuperPass) = 
      (r2v10 app.chalo.superpass.data.models.entities.MagicSuperPass)
      (r2v16 app.chalo.superpass.data.models.entities.MagicSuperPass)
     binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r3v14 java.util.List) = (r3v11 java.util.List), (r3v16 java.util.List) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r4v16 app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState) = 
      (r4v12 app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState)
      (r4v19 app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState)
     binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r5v15 kotlin.jvm.functions.Function0) = (r5v12 kotlin.jvm.functions.Function0), (r5v18 kotlin.jvm.functions.Function0) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r6v13 kotlin.jvm.functions.Function1) = (r6v9 kotlin.jvm.functions.Function1), (r6v16 kotlin.jvm.functions.Function1) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r7v15 kotlin.jvm.functions.Function0) = (r7v11 kotlin.jvm.functions.Function0), (r7v18 kotlin.jvm.functions.Function0) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r8v14 app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState) = 
      (r8v10 app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState)
      (r8v17 app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState)
     binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r9v16 java.lang.String) = (r9v13 java.lang.String), (r9v19 java.lang.String) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r10v26 java.lang.Object) = (r10v24 java.lang.Object), (r10v31 java.lang.Object) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r13v18 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking) = 
      (r13v16 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
      (r13v20 app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking)
     binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r29v4 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor) = 
      (r29v3 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor)
      (r29v0 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor)
     binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]
      0x0d4a: PHI (r33v4 app.chalo.uistate.text.ChaloTextStyleHelper) = (r15v1 app.chalo.uistate.text.ChaloTextStyleHelper), (r33v5 app.chalo.uistate.text.ChaloTextStyleHelper) binds: [B:90:0x0d46, B:70:0x0b88] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0d72  */
    /* JADX WARN: Code duplicated, block: B:99:0x0da8  */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x2212, code lost:
    
        if (r10 == r12) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v338 */
    /* JADX WARN: Type inference failed for: r2v339, types: [app.chalo.productsummary.ui.data.DashedLineUIState] */
    /* JADX WARN: Type inference failed for: r2v347 */
    /* JADX WARN: Type inference failed for: r4v307, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v308, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v309, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r55v0, types: [app.chalo.productsummary.ui.pass.PassSummaryUIStateFactory] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen r56, app.chalo.home.domain.ChaloUserBookingType.SuperPassBooking r57, boolean r58, java.lang.String r59, app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState r60, defpackage.wp0 r61, defpackage.sn0 r62, defpackage.sn0 r63, defpackage.wp0 r64, kotlin.coroutines.jvm.internal.ContinuationImpl r65) {
        /*
            Method dump skipped, instruction units count: 11982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.pass.PassSummaryUIStateFactory.b(app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen, app.chalo.home.domain.ChaloUserBookingType$SuperPassBooking, boolean, java.lang.String, app.chalo.productsummary.domain.DownloadInvoiceOptionVisibilityState, wp0, sn0, sn0, wp0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0134  */
    /* JADX WARN: Code duplicated, block: B:35:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x024b  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [wp0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [wp0] */
    public final Object c(final PassSummaryDataState passSummaryDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PassSummaryUIStateFactory$getProductSummaryScreenType$1 passSummaryUIStateFactory$getProductSummaryScreenType$1;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory;
        IconType iconType;
        int i;
        ChaloTextStyleHelper chaloTextStyleHelper;
        PassSummaryDataState passSummaryDataState2;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        IconType iconType2;
        int i2;
        String str;
        Object objB;
        String str2;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory2;
        IconType iconType3;
        String str3;
        Object objB2;
        String str4;
        IconType iconType4;
        Function1 function2;
        String str5;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory3;
        String str6;
        FullScreenImageUIState fullScreenImageUIState;
        String str7;
        Object objB3;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory4;
        IconType iconType5;
        String str8;
        String str9;
        String str10;
        IconType iconType6;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory5;
        Function1 function3;
        String str11;
        final Function1 function4 = function1;
        if (continuationImpl instanceof PassSummaryUIStateFactory$getProductSummaryScreenType$1) {
            passSummaryUIStateFactory$getProductSummaryScreenType$1 = (PassSummaryUIStateFactory$getProductSummaryScreenType$1) continuationImpl;
            int i3 = passSummaryUIStateFactory$getProductSummaryScreenType$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                passSummaryUIStateFactory$getProductSummaryScreenType$1.label = i3 - Integer.MIN_VALUE;
            } else {
                passSummaryUIStateFactory$getProductSummaryScreenType$1 = new PassSummaryUIStateFactory$getProductSummaryScreenType$1(this, continuationImpl);
            }
        } else {
            passSummaryUIStateFactory$getProductSummaryScreenType$1 = new PassSummaryUIStateFactory$getProductSummaryScreenType$1(this, continuationImpl);
        }
        PassSummaryUIStateFactory$getProductSummaryScreenType$1 passSummaryUIStateFactory$getProductSummaryScreenType$2 = passSummaryUIStateFactory$getProductSummaryScreenType$1;
        Object objB4 = passSummaryUIStateFactory$getProductSummaryScreenType$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = passSummaryUIStateFactory$getProductSummaryScreenType$2.label;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        StringProvider stringProvider = this.f8781a;
        switch (i4) {
            case 0:
                ResultKt.b(objB4);
                boolean z = passSummaryDataState.c;
                standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                if (z) {
                    iconType2 = IconType.IC_ERROR_IMAGE;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType2;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = 0;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 1;
                    objB4 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                    if (objB4 != coroutineSingletons) {
                        i2 = 0;
                        str = (String) objB4;
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory;
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType2;
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str;
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i2;
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 2;
                        objB = stringProvider.b(StringEnum.PRODUCT_DATA_FETCH_FAILED, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                        if (objB != coroutineSingletons) {
                            IconType iconType7 = iconType2;
                            str2 = str;
                            objB4 = objB;
                            standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                            iconType3 = iconType7;
                            str3 = (String) objB4;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory2;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType3;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str2;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4 = str3;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i2;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 3;
                            objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                            if (objB2 != coroutineSingletons) {
                                str4 = str2;
                                iconType4 = iconType3;
                                function2 = function4;
                                str5 = str3;
                                objB4 = objB2;
                                standardErrorScreenUIStateFactory3 = standardErrorScreenUIStateFactory2;
                                return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory3, iconType4, str4, str5, (String) objB4, new qm0(function2, 25), 2));
                            }
                        }
                    }
                } else {
                    boolean z2 = passSummaryDataState.f8768a;
                    ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
                    if (z2) {
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = chaloTextStyleHelper3;
                        passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 4;
                        objB4 = stringProvider.b(StringEnum.LOADING, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                        if (objB4 != coroutineSingletons) {
                            chaloTextStyleHelper2 = chaloTextStyleHelper3;
                            return new PassSummaryScreenType.Loading(new LoadingDialogUIState(ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) objB4, black, null, null, null, UITextOverflow.Ellipsis, 56)));
                        }
                    } else {
                        ChaloUserBookingType chaloUserBookingType = passSummaryDataState.e;
                        if (chaloUserBookingType instanceof ChaloUserBookingType.SuperPassBooking) {
                            ChaloUserBookingType.SuperPassBooking superPassBooking = (ChaloUserBookingType.SuperPassBooking) chaloUserBookingType;
                            String str12 = passSummaryDataState.f;
                            boolean z3 = str12 == null || str12.length() == 0;
                            String strB = this.b.b();
                            DownloadInvoiceOptionVisibilityState downloadInvoiceOptionVisibilityState = passSummaryDataState.g;
                            final int i5 = 0;
                            ?? r6 = new Function0() { // from class: wp0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            function4.invoke(new PassSummaryIntent.OnViewTripHistoryClickedIntent(((ChaloUserBookingType.SuperPassBooking) passSummaryDataState.e).f2987a));
                                            break;
                                        default:
                                            function4.invoke(new PassSummaryIntent.DownloadInvoiceBtnClicked(((ChaloUserBookingType.SuperPassBooking) passSummaryDataState.e).f2987a));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            sn0 sn0Var = new sn0(function4, 3);
                            sn0 sn0Var2 = new sn0(function4, 4);
                            final int i6 = 1;
                            ?? r9 = new Function0() { // from class: wp0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            function4.invoke(new PassSummaryIntent.OnViewTripHistoryClickedIntent(((ChaloUserBookingType.SuperPassBooking) passSummaryDataState.e).f2987a));
                                            break;
                                        default:
                                            function4.invoke(new PassSummaryIntent.DownloadInvoiceBtnClicked(((ChaloUserBookingType.SuperPassBooking) passSummaryDataState.e).f2987a));
                                            break;
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = passSummaryDataState;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = function4;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 5;
                            objB4 = b(this.c, superPassBooking, z3, strB, downloadInvoiceOptionVisibilityState, r6, sn0Var, sn0Var2, r9, passSummaryUIStateFactory$getProductSummaryScreenType$2);
                            if (objB4 != coroutineSingletons) {
                                passSummaryDataState2 = passSummaryDataState;
                                PassSummarySuccessScreenUIState passSummarySuccessScreenUIState = (PassSummarySuccessScreenUIState) objB4;
                                str6 = passSummaryDataState2.f;
                                if (str6 != null || str6.length() == 0) {
                                    fullScreenImageUIState = null;
                                } else {
                                    fullScreenImageUIState = new FullScreenImageUIState(new ImageUrlUIState(passSummaryDataState2.f, null, UIContentScale.Fit, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), new ImageUIState(IconType.IC_RED_CROSS, (String) null, ChaloColorToken.White.f9870a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new qm0(function4, 26)), 114), new ImageUIState(IconType.PROFILE_EMPTY, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                                }
                                return new PassSummaryScreenType.Success(passSummarySuccessScreenUIState, fullScreenImageUIState);
                            }
                        } else if ((chaloUserBookingType instanceof ChaloUserBookingType.TicketBooking) || (chaloUserBookingType instanceof ChaloUserBookingType.CardBooking)) {
                            iconType = IconType.IC_ERROR_IMAGE;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = 0;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 6;
                            objB4 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                            if (objB4 != coroutineSingletons) {
                                i = 0;
                                str7 = (String) objB4;
                                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory;
                                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType;
                                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str7;
                                passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i;
                                passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 7;
                                objB3 = stringProvider.b(StringEnum.PRODUCT_DATA_FETCH_FAILED, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                                if (objB3 != coroutineSingletons) {
                                    standardErrorScreenUIStateFactory4 = standardErrorScreenUIStateFactory;
                                    iconType5 = iconType;
                                    str8 = str7;
                                    objB4 = objB3;
                                    str9 = (String) objB4;
                                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory4;
                                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType5;
                                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str8;
                                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4 = str9;
                                    passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i;
                                    passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 8;
                                    objB4 = stringProvider.b(StringEnum.RETRY, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                                    if (objB4 != coroutineSingletons) {
                                        str10 = str8;
                                        iconType6 = iconType5;
                                        standardErrorScreenUIStateFactory5 = standardErrorScreenUIStateFactory4;
                                        function3 = function4;
                                        str11 = str9;
                                        return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory5, iconType6, str10, str11, (String) objB4, new qm0(function3, 27), 2));
                                    }
                                }
                            }
                        } else {
                            if (chaloUserBookingType != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = chaloTextStyleHelper3;
                            passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 9;
                            objB4 = stringProvider.b(StringEnum.LOADING, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                            if (objB4 != coroutineSingletons) {
                                chaloTextStyleHelper = chaloTextStyleHelper3;
                                return new PassSummaryScreenType.Loading(new LoadingDialogUIState(ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB4, black, null, null, null, UITextOverflow.Ellipsis, 56)));
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i2 = passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0;
                iconType2 = (IconType) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2;
                standardErrorScreenUIStateFactory = (StandardErrorScreenUIStateFactory) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1;
                Function1 function5 = (Function1) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                function4 = function5;
                str = (String) objB4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType2;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i2;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 2;
                objB = stringProvider.b(StringEnum.PRODUCT_DATA_FETCH_FAILED, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                if (objB != coroutineSingletons) {
                    IconType iconType8 = iconType2;
                    str2 = str;
                    objB4 = objB;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType3 = iconType8;
                    str3 = (String) objB4;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory2;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType3;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str2;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4 = str3;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i2;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 3;
                    objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                    if (objB2 != coroutineSingletons) {
                        str4 = str2;
                        iconType4 = iconType3;
                        function2 = function4;
                        str5 = str3;
                        objB4 = objB2;
                        standardErrorScreenUIStateFactory3 = standardErrorScreenUIStateFactory2;
                        return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory3, iconType4, str4, str5, (String) objB4, new qm0(function2, 25), 2));
                    }
                }
                return coroutineSingletons;
            case 2:
                i2 = passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0;
                str2 = (String) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3;
                iconType3 = (IconType) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2;
                standardErrorScreenUIStateFactory2 = (StandardErrorScreenUIStateFactory) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1;
                Function1 function6 = (Function1) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                function4 = function6;
                str3 = (String) objB4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory2;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType3;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str2;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4 = str3;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i2;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 3;
                objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                if (objB2 != coroutineSingletons) {
                    str4 = str2;
                    iconType4 = iconType3;
                    function2 = function4;
                    str5 = str3;
                    objB4 = objB2;
                    standardErrorScreenUIStateFactory3 = standardErrorScreenUIStateFactory2;
                    return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory3, iconType4, str4, str5, (String) objB4, new qm0(function2, 25), 2));
                }
                return coroutineSingletons;
            case 3:
                String str13 = (String) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4;
                String str14 = (String) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3;
                IconType iconType9 = (IconType) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2;
                StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory6 = (StandardErrorScreenUIStateFactory) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1;
                function2 = (Function1) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                str5 = str13;
                standardErrorScreenUIStateFactory3 = standardErrorScreenUIStateFactory6;
                str4 = str14;
                iconType4 = iconType9;
                return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory3, iconType4, str4, str5, (String) objB4, new qm0(function2, 25), 2));
            case 4:
                ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                chaloTextStyleHelper2 = chaloTextStyleHelper4;
                return new PassSummaryScreenType.Loading(new LoadingDialogUIState(ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) objB4, black, null, null, null, UITextOverflow.Ellipsis, 56)));
            case 5:
                Function1 function7 = (Function1) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1;
                passSummaryDataState2 = (PassSummaryDataState) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                function4 = function7;
                PassSummarySuccessScreenUIState passSummarySuccessScreenUIState2 = (PassSummarySuccessScreenUIState) objB4;
                str6 = passSummaryDataState2.f;
                if (str6 != null) {
                    fullScreenImageUIState = null;
                } else {
                    fullScreenImageUIState = null;
                }
                return new PassSummaryScreenType.Success(passSummarySuccessScreenUIState2, fullScreenImageUIState);
            case 6:
                i = passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0;
                iconType = (IconType) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2;
                standardErrorScreenUIStateFactory = (StandardErrorScreenUIStateFactory) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1;
                Function1 function8 = (Function1) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                function4 = function8;
                str7 = (String) objB4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str7;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 7;
                objB3 = stringProvider.b(StringEnum.PRODUCT_DATA_FETCH_FAILED, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                if (objB3 != coroutineSingletons) {
                    standardErrorScreenUIStateFactory4 = standardErrorScreenUIStateFactory;
                    iconType5 = iconType;
                    str8 = str7;
                    objB4 = objB3;
                    str9 = (String) objB4;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory4;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType5;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str8;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4 = str9;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i;
                    passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 8;
                    objB4 = stringProvider.b(StringEnum.RETRY, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                    if (objB4 != coroutineSingletons) {
                        str10 = str8;
                        iconType6 = iconType5;
                        standardErrorScreenUIStateFactory5 = standardErrorScreenUIStateFactory4;
                        function3 = function4;
                        str11 = str9;
                        return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory5, iconType6, str10, str11, (String) objB4, new qm0(function3, 27), 2));
                    }
                }
                return coroutineSingletons;
            case 7:
                i = passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0;
                str8 = (String) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3;
                iconType5 = (IconType) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2;
                standardErrorScreenUIStateFactory4 = (StandardErrorScreenUIStateFactory) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1;
                Function1 function9 = (Function1) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                function4 = function9;
                str9 = (String) objB4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0 = function4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1 = standardErrorScreenUIStateFactory4;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2 = iconType5;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3 = str8;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4 = str9;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.I$0 = i;
                passSummaryUIStateFactory$getProductSummaryScreenType$2.label = 8;
                objB4 = stringProvider.b(StringEnum.RETRY, new Object[0], passSummaryUIStateFactory$getProductSummaryScreenType$2);
                if (objB4 != coroutineSingletons) {
                    str10 = str8;
                    iconType6 = iconType5;
                    standardErrorScreenUIStateFactory5 = standardErrorScreenUIStateFactory4;
                    function3 = function4;
                    str11 = str9;
                    return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory5, iconType6, str10, str11, (String) objB4, new qm0(function3, 27), 2));
                }
                return coroutineSingletons;
            case 8:
                String str15 = (String) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$4;
                String str16 = (String) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$3;
                IconType iconType10 = (IconType) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$2;
                StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory7 = (StandardErrorScreenUIStateFactory) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$1;
                function3 = (Function1) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                str11 = str15;
                standardErrorScreenUIStateFactory5 = standardErrorScreenUIStateFactory7;
                str10 = str16;
                iconType6 = iconType10;
                return new PassSummaryScreenType.Error(StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory5, iconType6, str10, str11, (String) objB4, new qm0(function3, 27), 2));
            case 9:
                ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) passSummaryUIStateFactory$getProductSummaryScreenType$2.L$0;
                ResultKt.b(objB4);
                chaloTextStyleHelper = chaloTextStyleHelper5;
                return new PassSummaryScreenType.Loading(new LoadingDialogUIState(ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB4, black, null, null, null, UITextOverflow.Ellipsis, 56)));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(SuperPassStatus superPassStatus, ContinuationImpl continuationImpl) {
        PassSummaryUIStateFactory$getTicketStatusUIState$1 passSummaryUIStateFactory$getTicketStatusUIState$1;
        BusTicketStatusSpec busTicketStatusSpec;
        BusTicketStatusSpec busTicketStatusSpec2;
        BusTicketStatusSpec busTicketStatusSpec3;
        BusTicketStatusSpec busTicketStatusSpec4;
        BusTicketStatusSpec busTicketStatusSpec5;
        if (continuationImpl instanceof PassSummaryUIStateFactory$getTicketStatusUIState$1) {
            passSummaryUIStateFactory$getTicketStatusUIState$1 = (PassSummaryUIStateFactory$getTicketStatusUIState$1) continuationImpl;
            int i = passSummaryUIStateFactory$getTicketStatusUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passSummaryUIStateFactory$getTicketStatusUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                passSummaryUIStateFactory$getTicketStatusUIState$1 = new PassSummaryUIStateFactory$getTicketStatusUIState$1(this, continuationImpl);
            }
        } else {
            passSummaryUIStateFactory$getTicketStatusUIState$1 = new PassSummaryUIStateFactory$getTicketStatusUIState$1(this, continuationImpl);
        }
        Object obj = passSummaryUIStateFactory$getTicketStatusUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passSummaryUIStateFactory$getTicketStatusUIState$1.label;
        ChaloColorToken.AmountAddedText amountAddedText = ChaloColorToken.AmountAddedText.f9758a;
        ChaloColorToken.DarkRed darkRed = ChaloColorToken.DarkRed.f9786a;
        if (i2 != 0) {
            if (i2 == 1) {
                busTicketStatusSpec = (BusTicketStatusSpec) passSummaryUIStateFactory$getTicketStatusUIState$1.L$0;
                ResultKt.b(obj);
                return new BusTicketStatusUiState(busTicketStatusSpec, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
            }
            if (i2 == 2) {
                busTicketStatusSpec2 = (BusTicketStatusSpec) passSummaryUIStateFactory$getTicketStatusUIState$1.L$0;
                ResultKt.b(obj);
                return new BusTicketStatusUiState(busTicketStatusSpec2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
            }
            if (i2 == 3) {
                busTicketStatusSpec3 = (BusTicketStatusSpec) passSummaryUIStateFactory$getTicketStatusUIState$1.L$0;
                ResultKt.b(obj);
                return new BusTicketStatusUiState(busTicketStatusSpec3, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
            }
            if (i2 == 4) {
                busTicketStatusSpec4 = (BusTicketStatusSpec) passSummaryUIStateFactory$getTicketStatusUIState$1.L$0;
                ResultKt.b(obj);
                return new BusTicketStatusUiState(busTicketStatusSpec4, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            busTicketStatusSpec5 = (BusTicketStatusSpec) passSummaryUIStateFactory$getTicketStatusUIState$1.L$0;
            ResultKt.b(obj);
            return new BusTicketStatusUiState(busTicketStatusSpec5, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
        }
        ResultKt.b(obj);
        int i3 = WhenMappings.f8782a[superPassStatus.ordinal()];
        ChaloColorToken.GreenBase greenBase = ChaloColorToken.GreenBase.f9800a;
        ChaloColorToken.RedBase redBase = ChaloColorToken.RedBase.f9846a;
        StringProvider stringProvider = this.f8781a;
        switch (i3) {
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                BusTicketStatusSpec busTicketStatusSpec6 = new BusTicketStatusSpec(greenBase, 11);
                passSummaryUIStateFactory$getTicketStatusUIState$1.L$0 = busTicketStatusSpec6;
                passSummaryUIStateFactory$getTicketStatusUIState$1.label = 1;
                Object objB = stringProvider.b(StringEnum.ACTIVE, new Object[0], passSummaryUIStateFactory$getTicketStatusUIState$1);
                if (objB != coroutineSingletons) {
                    busTicketStatusSpec = busTicketStatusSpec6;
                    obj = objB;
                    return new BusTicketStatusUiState(busTicketStatusSpec, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
                }
                return coroutineSingletons;
            case 5:
                BusTicketStatusSpec busTicketStatusSpec7 = new BusTicketStatusSpec(greenBase, 11);
                passSummaryUIStateFactory$getTicketStatusUIState$1.L$0 = busTicketStatusSpec7;
                passSummaryUIStateFactory$getTicketStatusUIState$1.label = 2;
                Object objB2 = stringProvider.b(StringEnum.COMPLETED, new Object[0], passSummaryUIStateFactory$getTicketStatusUIState$1);
                if (objB2 != coroutineSingletons) {
                    busTicketStatusSpec2 = busTicketStatusSpec7;
                    obj = objB2;
                    return new BusTicketStatusUiState(busTicketStatusSpec2, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, amountAddedText, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_GREEN_TICK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                }
                return coroutineSingletons;
            case 6:
                BusTicketStatusSpec busTicketStatusSpec8 = new BusTicketStatusSpec(redBase, 11);
                passSummaryUIStateFactory$getTicketStatusUIState$1.L$0 = busTicketStatusSpec8;
                passSummaryUIStateFactory$getTicketStatusUIState$1.label = 3;
                Object objB3 = stringProvider.b(StringEnum.EXPIRED, new Object[0], passSummaryUIStateFactory$getTicketStatusUIState$1);
                if (objB3 != coroutineSingletons) {
                    busTicketStatusSpec3 = busTicketStatusSpec8;
                    obj = objB3;
                    return new BusTicketStatusUiState(busTicketStatusSpec3, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                }
                return coroutineSingletons;
            case 7:
                BusTicketStatusSpec busTicketStatusSpec9 = new BusTicketStatusSpec(redBase, 11);
                passSummaryUIStateFactory$getTicketStatusUIState$1.L$0 = busTicketStatusSpec9;
                passSummaryUIStateFactory$getTicketStatusUIState$1.label = 4;
                Object objB4 = stringProvider.b(StringEnum.CANCELLED, new Object[0], passSummaryUIStateFactory$getTicketStatusUIState$1);
                if (objB4 != coroutineSingletons) {
                    busTicketStatusSpec4 = busTicketStatusSpec9;
                    obj = objB4;
                    return new BusTicketStatusUiState(busTicketStatusSpec4, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                }
                return coroutineSingletons;
            case 8:
                BusTicketStatusSpec busTicketStatusSpec10 = new BusTicketStatusSpec(redBase, 11);
                passSummaryUIStateFactory$getTicketStatusUIState$1.L$0 = busTicketStatusSpec10;
                passSummaryUIStateFactory$getTicketStatusUIState$1.label = 5;
                Object objB5 = stringProvider.b(StringEnum.FAILED, new Object[0], passSummaryUIStateFactory$getTicketStatusUIState$1);
                if (objB5 != coroutineSingletons) {
                    busTicketStatusSpec5 = busTicketStatusSpec10;
                    obj = objB5;
                    return new BusTicketStatusUiState(busTicketStatusSpec5, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.TitleLarge, darkRed, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new ImageUIState(IconType.IC_RED_CROSS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254));
                }
                return coroutineSingletons;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
