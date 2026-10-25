package app.chalo.home.ui.base;

import app.chalo.superpass.data.models.entities.SuperPassApplication;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handleBottomSheetPositiveButtonClickIntent$1", f = "HomeComponent.kt", l = {1522, 1527, 1574, 1586}, m = "invokeSuspend", v = 1)
final class HomeComponent$handleBottomSheetPositiveButtonClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent $intent;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$handleBottomSheetPositiveButtonClickIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handleBottomSheetPositiveButtonClickIntent$1$1", f = "HomeComponent.kt", l = {1548}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent $intent;
        int label;
        final /* synthetic */ HomeComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeComponent homeComponent, HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent bottomSheetPositiveButtonClickIntent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = homeComponent;
            this.$intent = bottomSheetPositiveButtonClickIntent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$intent, continuation);
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
                HomeComponent homeComponent = this.this$0;
                SuperPassApplication superPassApplication = ((CommonBottomSheetType.SuperPassVerificationBottomSheet.Verified) this.$intent.f3210a).b;
                this.label = 1;
                if (HomeComponent.M0(homeComponent, superPassApplication, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$handleBottomSheetPositiveButtonClickIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handleBottomSheetPositiveButtonClickIntent$1$2", f = "HomeComponent.kt", l = {1554}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent $intent;
        int label;
        final /* synthetic */ HomeComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HomeComponent homeComponent, HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent bottomSheetPositiveButtonClickIntent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = homeComponent;
            this.$intent = bottomSheetPositiveButtonClickIntent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$intent, continuation);
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
                HomeComponent homeComponent = this.this$0;
                SuperPassApplication superPassApplication = ((CommonBottomSheetType.SuperPassVerificationBottomSheet.Rejected) this.$intent.f3210a).b;
                this.label = 1;
                if (HomeComponent.L0(homeComponent, superPassApplication, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$handleBottomSheetPositiveButtonClickIntent$1(HomeComponent homeComponent, HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent bottomSheetPositiveButtonClickIntent, Continuation continuation) {
        super(2, continuation);
        this.$intent = bottomSheetPositiveButtonClickIntent;
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$handleBottomSheetPositiveButtonClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$handleBottomSheetPositiveButtonClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x01de  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        if (r2.c(r4, r22) == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ec, code lost:
    
        if (r2.s(r3, r22) == r1) goto L88;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent$handleBottomSheetPositiveButtonClickIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
