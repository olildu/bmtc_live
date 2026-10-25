package app.chalo.notification.core;

import app.chalo.notification.managers.NotificationCentralProcessingManager;
import app.chalo.notification.models.AppNotification;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1", f = "GCMReceiverImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class GCMReceiverImpl$1$onPushNotificationWithPayloadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppNotification $appNotification;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GCMReceiverImpl this$0;

    /* JADX INFO: renamed from: app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1$1", f = "GCMReceiverImpl.kt", l = {86}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppNotification $appNotification;
        int label;
        final /* synthetic */ GCMReceiverImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GCMReceiverImpl gCMReceiverImpl, AppNotification appNotification, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gCMReceiverImpl;
            this.$appNotification = appNotification;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$appNotification, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                SharedFlowImpl sharedFlowImpl = this.this$0.i;
                AppNotification appNotification = this.$appNotification;
                this.label = 1;
                if (sharedFlowImpl.emit(appNotification, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1$2", f = "GCMReceiverImpl.kt", l = {90}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppNotification $appNotification;
        int label;
        final /* synthetic */ GCMReceiverImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GCMReceiverImpl gCMReceiverImpl, AppNotification appNotification, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gCMReceiverImpl;
            this.$appNotification = appNotification;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$appNotification, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                NotificationCentralProcessingManager notificationCentralProcessingManager = (NotificationCentralProcessingManager) this.this$0.f.getValue();
                AppNotification appNotification = this.$appNotification;
                this.label = 1;
                if (notificationCentralProcessingManager.a(appNotification, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1$3", f = "GCMReceiverImpl.kt", l = {94, 95}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppNotification $appNotification;
        int label;
        final /* synthetic */ GCMReceiverImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(GCMReceiverImpl gCMReceiverImpl, AppNotification appNotification, Continuation continuation) {
            super(2, continuation);
            this.this$0 = gCMReceiverImpl;
            this.$appNotification = appNotification;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$appNotification, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        
            if (r1.b(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.b(r5)
                goto L45
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                kotlin.ResultKt.b(r5)
                goto L34
            L1c:
                kotlin.ResultKt.b(r5)
                app.chalo.notification.core.GCMReceiverImpl r5 = r4.this$0
                kotlin.Lazy r5 = r5.g
                java.lang.Object r5 = r5.getValue()
                app.chalo.notification.managers.NotificationDisplayDataManager r5 = (app.chalo.notification.managers.NotificationDisplayDataManager) r5
                app.chalo.notification.models.AppNotification r1 = r4.$appNotification
                r4.label = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L34
                goto L44
            L34:
                app.chalo.notification.models.NotificationDisplayData r5 = (app.chalo.notification.models.NotificationDisplayData) r5
                if (r5 == 0) goto L45
                app.chalo.notification.core.GCMReceiverImpl r1 = r4.this$0
                app.chalo.notification.core.GCMReceiverDelegate r1 = r1.f6525a
                r4.label = r2
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r5 = kotlin.Unit.f17538a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.notification.core.GCMReceiverImpl$1$onPushNotificationWithPayloadData$1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMReceiverImpl$1$onPushNotificationWithPayloadData$1(GCMReceiverImpl gCMReceiverImpl, AppNotification appNotification, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gCMReceiverImpl;
        this.$appNotification = appNotification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GCMReceiverImpl$1$onPushNotificationWithPayloadData$1 gCMReceiverImpl$1$onPushNotificationWithPayloadData$1 = new GCMReceiverImpl$1$onPushNotificationWithPayloadData$1(this.this$0, this.$appNotification, continuation);
        gCMReceiverImpl$1$onPushNotificationWithPayloadData$1.L$0 = obj;
        return gCMReceiverImpl$1$onPushNotificationWithPayloadData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GCMReceiverImpl$1$onPushNotificationWithPayloadData$1 gCMReceiverImpl$1$onPushNotificationWithPayloadData$1 = (GCMReceiverImpl$1$onPushNotificationWithPayloadData$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        gCMReceiverImpl$1$onPushNotificationWithPayloadData$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$appNotification, null), 3);
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$appNotification, null), 3);
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass3(this.this$0, this.$appNotification, null), 3);
        return Unit.f17538a;
    }
}
