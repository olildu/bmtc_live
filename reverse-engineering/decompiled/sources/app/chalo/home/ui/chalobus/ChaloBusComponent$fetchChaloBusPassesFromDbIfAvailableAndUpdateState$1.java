package app.chalo.home.ui.chalobus;

import app.chalo.features.productsync.constants.SuperPassStatus;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import defpackage.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1", f = "ChaloBusComponent.kt", l = {1826, 1912}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/home/ui/chalobus/ChaloBusPassHistory;", "magicPassList", "Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", "rideBasedPassList", "Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$1", f = "ChaloBusComponent.kt", l = {1828, 1839, 1842, 1863, 1866}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function3<List<? extends MagicSuperPass>, List<? extends RideBasedSuperPass>, Continuation<? super List<? extends ChaloBusPassHistory>>, Object> {
        int I$0;
        long J$0;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ ChaloBusComponent this$0;

        /* JADX INFO: renamed from: app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3236a;
            public static final /* synthetic */ int[] b;

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
                    iArr[BannerStatus.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BannerStatus.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f3236a = iArr;
                int[] iArr2 = new int[SuperPassStatus.values().length];
                try {
                    iArr2[SuperPassStatus.EXPIRED.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[SuperPassStatus.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[SuperPassStatus.UNUSED.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[SuperPassStatus.USED.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[SuperPassStatus.PAYMENT_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[SuperPassStatus.PAYMENT_PROCESSING.ordinal()] = 6;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[SuperPassStatus.CANCELLED.ordinal()] = 7;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr2[SuperPassStatus.FAILED.ordinal()] = 8;
                } catch (NoSuchFieldError unused12) {
                }
                b = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
            super(3, continuation);
            this.this$0 = chaloBusComponent;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.L$0 = (List) obj;
            anonymousClass1.L$1 = (List) obj2;
            return anonymousClass1.invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:131:0x0166 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:? A[LOOP:2: B:24:0x0154->B:133:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:26:0x015a  */
        /* JADX WARN: Code duplicated, block: B:31:0x0198  */
        /* JADX WARN: Code duplicated, block: B:35:0x01c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x01c7 -> B:15:0x00cf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x029a -> B:10:0x0052). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instruction units count: 918
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ChaloBusComponent f3238a;

        public AnonymousClass2(ChaloBusComponent chaloBusComponent) {
            this.f3238a = chaloBusComponent;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List list, Continuation continuation) {
            ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1 chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1;
            if (continuation instanceof ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1) {
                chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1 = (ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1) continuation;
                int i = chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1 = new ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1(this, continuation);
                }
            } else {
                chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1 = new ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1(this, continuation);
            }
            ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1 chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$2 = chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$1;
            Object objS0 = chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$2.result;
            Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$2.label;
            if (i2 == 0) {
                ResultKt.b(objS0);
                chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$2.L$0 = list;
                chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$2.label = 1;
                objS0 = ChaloBusComponent.S0(this.f3238a, null, null, false, null, null, chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$2, 31);
                if (objS0 == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) chaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2$emit$2.L$0;
                ResultKt.b(objS0);
            }
            this.f3238a.E0(new f(20, list, (List) objS0));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r4.collect(r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L61
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            kotlin.ResultKt.b(r7)
            goto L40
        L20:
            kotlin.ResultKt.b(r7)
            app.chalo.home.ui.chalobus.ChaloBusComponent r7 = r6.this$0
            app.chalo.superpass.data.repository.SuperPassRepository r7 = r7.D
            app.chalo.superpass.data.dao.SuperPassDao r1 = r7.b
            java.lang.String r7 = r7.k()
            app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1 r1 = r1.g(r7)
            app.chalo.home.ui.chalobus.ChaloBusComponent r7 = r6.this$0
            app.chalo.superpass.data.repository.SuperPassRepository r7 = r7.D
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.h(r6)
            if (r7 != r0) goto L40
            goto L60
        L40:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$1 r3 = new app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$1
            app.chalo.home.ui.chalobus.ChaloBusComponent r4 = r6.this$0
            r5 = 0
            r3.<init>(r4, r5)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 r4 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            r4.<init>(r1, r7, r3)
            app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2 r7 = new app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$2
            app.chalo.home.ui.chalobus.ChaloBusComponent r1 = r6.this$0
            r7.<init>(r1)
            r6.L$0 = r5
            r6.label = r2
            java.lang.Object r7 = r4.collect(r7, r6)
            if (r7 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
