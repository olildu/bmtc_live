package app.chalo.home.ui.history;

import app.zophop.homescreen.MyTicketsViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/zophop/homescreen/MyTicketsViewState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$convertToUiState$2", f = "MyTicketsComponent.kt", l = {3210, 3225, 3235, 3245, 3252, 3263, 3272, 3284, 3313, 3320, 3333, 3335, 3337, 3352, 3359, 3372, 3374, 3376, 3386, 3394, 3395, 3396, 3404, 3419, 3462, 3469, 3475}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$convertToUiState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MyTicketsViewState>, Object> {
    final /* synthetic */ MyTicketsDataState $dataState;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$18;
    Object L$19;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$convertToUiState$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<MyTicketsViewIntent, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, MyTicketsComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/history/MyTicketsViewIntent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MyTicketsViewIntent p0 = (MyTicketsViewIntent) obj;
            Intrinsics.i(p0, "p0");
            ((MyTicketsComponent) this.receiver).q1(p0);
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.history.MyTicketsComponent$convertToUiState$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<MyTicketsViewIntent, Unit> {
        public AnonymousClass3(Object obj) {
            super(1, obj, MyTicketsComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/history/MyTicketsViewIntent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MyTicketsViewIntent p0 = (MyTicketsViewIntent) obj;
            Intrinsics.i(p0, "p0");
            ((MyTicketsComponent) this.receiver).q1(p0);
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3396a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TicketsPassesTabType.values().length];
            try {
                iArr[TicketsPassesTabType.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketsPassesTabType.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3396a = iArr;
            int[] iArr2 = new int[TicketsPageAlertDialogType.values().length];
            try {
                iArr2[TicketsPageAlertDialogType.RECLAIM_PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TicketsPageAlertDialogType.PRODUCT_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TicketsPageAlertDialogType.PRODUCT_VALIDITY_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TicketsPageAlertDialogType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$convertToUiState$2(MyTicketsDataState myTicketsDataState, MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.$dataState = myTicketsDataState;
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$convertToUiState$2(this.$dataState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$convertToUiState$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0736  */
    /* JADX WARN: Code duplicated, block: B:101:0x0738  */
    /* JADX WARN: Code duplicated, block: B:108:0x0769  */
    /* JADX WARN: Code duplicated, block: B:110:0x076e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0792 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0796  */
    /* JADX WARN: Code duplicated, block: B:118:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:121:0x0804  */
    /* JADX WARN: Code duplicated, block: B:123:0x0818  */
    /* JADX WARN: Code duplicated, block: B:126:0x085c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0879  */
    /* JADX WARN: Code duplicated, block: B:132:0x087c  */
    /* JADX WARN: Code duplicated, block: B:133:0x087e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0881  */
    /* JADX WARN: Code duplicated, block: B:138:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:140:0x08df  */
    /* JADX WARN: Code duplicated, block: B:143:0x090e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0925  */
    /* JADX WARN: Code duplicated, block: B:148:0x0927  */
    /* JADX WARN: Code duplicated, block: B:152:0x095e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0973  */
    /* JADX WARN: Code duplicated, block: B:157:0x097e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0983  */
    /* JADX WARN: Code duplicated, block: B:163:0x099a  */
    /* JADX WARN: Code duplicated, block: B:166:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:168:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:171:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:175:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:177:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:185:0x0a8e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:192:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:196:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:198:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:201:0x0b26 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0b69  */
    /* JADX WARN: Code duplicated, block: B:214:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:216:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:218:0x0b7c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:223:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:227:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:231:0x0bd2  */
    /* JADX WARN: Code duplicated, block: B:236:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:239:0x0c19  */
    /* JADX WARN: Code duplicated, block: B:241:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:250:0x0c79  */
    /* JADX WARN: Code duplicated, block: B:252:0x0c80  */
    /* JADX WARN: Code duplicated, block: B:254:0x0c86  */
    /* JADX WARN: Code duplicated, block: B:255:0x0cb2  */
    /* JADX WARN: Code duplicated, block: B:257:0x0cb6  */
    /* JADX WARN: Code duplicated, block: B:260:0x0d33  */
    /* JADX WARN: Code duplicated, block: B:263:0x0d3e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0d47  */
    /* JADX WARN: Code duplicated, block: B:267:0x0d50  */
    /* JADX WARN: Code duplicated, block: B:269:0x0d5b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0d8f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0d92  */
    /* JADX WARN: Code duplicated, block: B:275:0x0d95  */
    /* JADX WARN: Code duplicated, block: B:276:0x0d98  */
    /* JADX WARN: Code duplicated, block: B:278:0x0d9b  */
    /* JADX WARN: Code duplicated, block: B:279:0x0da2  */
    /* JADX WARN: Code duplicated, block: B:281:0x0da7  */
    /* JADX WARN: Code duplicated, block: B:283:0x0dac  */
    /* JADX WARN: Code duplicated, block: B:286:0x0dc3  */
    /* JADX WARN: Code duplicated, block: B:289:0x0dff  */
    /* JADX WARN: Code duplicated, block: B:291:0x0e2b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0e55  */
    /* JADX WARN: Code duplicated, block: B:297:0x0eb7  */
    /* JADX WARN: Code duplicated, block: B:299:0x0ef7  */
    /* JADX WARN: Code duplicated, block: B:302:0x0f1f  */
    /* JADX WARN: Code duplicated, block: B:305:0x0f7f  */
    /* JADX WARN: Code duplicated, block: B:308:0x0fce  */
    /* JADX WARN: Code duplicated, block: B:311:0x0ffb  */
    /* JADX WARN: Code duplicated, block: B:312:0x0ffe  */
    /* JADX WARN: Code duplicated, block: B:315:0x100b  */
    /* JADX WARN: Code duplicated, block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x0604  */
    /* JADX WARN: Code duplicated, block: B:62:0x0676  */
    /* JADX WARN: Code duplicated, block: B:65:0x0687  */
    /* JADX WARN: Code duplicated, block: B:67:0x0692  */
    /* JADX WARN: Code duplicated, block: B:70:0x069d  */
    /* JADX WARN: Code duplicated, block: B:71:0x069f  */
    /* JADX WARN: Code duplicated, block: B:73:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:74:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:76:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:85:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0700  */
    /* JADX WARN: Code duplicated, block: B:93:0x0706  */
    /* JADX WARN: Code duplicated, block: B:98:0x0730  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x075e, code lost:
    
        if (r3 == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0a7b, code lost:
    
        if (r6 == r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0ab9, code lost:
    
        if (r6 == r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0b54, code lost:
    
        if (r6 == r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0ba6, code lost:
    
        if (r9 == r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0bcb, code lost:
    
        if (r9 == r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0bf0, code lost:
    
        if (r9 == r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0c63, code lost:
    
        if (r0 == r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x052c, code lost:
    
        if (r0 == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x05f2, code lost:
    
        if (r0 == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0727, code lost:
    
        if (r3 == r6) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 4174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.MyTicketsComponent$convertToUiState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
