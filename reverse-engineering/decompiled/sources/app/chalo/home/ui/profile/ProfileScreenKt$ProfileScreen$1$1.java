package app.chalo.home.ui.profile;

import androidx.compose.material3.SheetState;
import app.chalo.home.contract.HomeScreenInfoHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.profile.ProfileScreenKt$ProfileScreen$1$1", f = "ProfileScreen.kt", l = {32}, m = "invokeSuspend", v = 1)
final class ProfileScreenKt$ProfileScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProfileScreenComponent $component;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ HomeScreenInfoHelper $homeScreenInfoHelper;
    final /* synthetic */ SheetState $modalBottomSheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScreenKt$ProfileScreen$1$1(ProfileScreenComponent profileScreenComponent, CoroutineScope coroutineScope, SheetState sheetState, HomeScreenInfoHelper homeScreenInfoHelper, Continuation continuation) {
        super(2, continuation);
        this.$component = profileScreenComponent;
        this.$coroutineScope = coroutineScope;
        this.$modalBottomSheetState = sheetState;
        this.$homeScreenInfoHelper = homeScreenInfoHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileScreenKt$ProfileScreen$1$1(this.$component, this.$coroutineScope, this.$modalBottomSheetState, this.$homeScreenInfoHelper, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileScreenKt$ProfileScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowS0 = this.$component.s0();
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final SheetState sheetState = this.$modalBottomSheetState;
            final HomeScreenInfoHelper homeScreenInfoHelper = this.$homeScreenInfoHelper;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.profile.ProfileScreenKt$ProfileScreen$1$1.1

                /* JADX INFO: renamed from: app.chalo.home.ui.profile.ProfileScreenKt$ProfileScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.ui.profile.ProfileScreenKt$ProfileScreen$1$1$1$1", f = "ProfileScreen.kt", l = {36}, m = "invokeSuspend", v = 1)
                final class C01111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ ProfileScreenSideEffect $effect;
                    final /* synthetic */ HomeScreenInfoHelper $homeScreenInfoHelper;
                    final /* synthetic */ SheetState $modalBottomSheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01111(SheetState sheetState, HomeScreenInfoHelper homeScreenInfoHelper, ProfileScreenSideEffect profileScreenSideEffect, Continuation continuation) {
                        super(2, continuation);
                        this.$modalBottomSheetState = sheetState;
                        this.$homeScreenInfoHelper = homeScreenInfoHelper;
                        this.$effect = profileScreenSideEffect;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01111(this.$modalBottomSheetState, this.$homeScreenInfoHelper, this.$effect, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01111) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.b(obj);
                            SheetState sheetState = this.$modalBottomSheetState;
                            this.label = 1;
                            if (sheetState.hide(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj);
                        }
                        this.$homeScreenInfoHelper.d(((ProfileScreenSideEffect.HideBottomSheet) this.$effect).f3601a);
                        return Unit.f17538a;
                    }
                }

                /* JADX INFO: renamed from: app.chalo.home.ui.profile.ProfileScreenKt$ProfileScreen$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.ui.profile.ProfileScreenKt$ProfileScreen$1$1$1$2", f = "ProfileScreen.kt", l = {43}, m = "invokeSuspend", v = 1)
                final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ HomeScreenInfoHelper $homeScreenInfoHelper;
                    final /* synthetic */ SheetState $modalBottomSheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(SheetState sheetState, HomeScreenInfoHelper homeScreenInfoHelper, Continuation continuation) {
                        super(2, continuation);
                        this.$homeScreenInfoHelper = homeScreenInfoHelper;
                        this.$modalBottomSheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.$modalBottomSheetState, this.$homeScreenInfoHelper, continuation);
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
                            this.$homeScreenInfoHelper.d(false);
                            SheetState sheetState = this.$modalBottomSheetState;
                            this.label = 1;
                            if (sheetState.expand(this) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    ProfileScreenSideEffect profileScreenSideEffect = (ProfileScreenSideEffect) obj2;
                    boolean z = profileScreenSideEffect instanceof ProfileScreenSideEffect.HideBottomSheet;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    HomeScreenInfoHelper homeScreenInfoHelper2 = homeScreenInfoHelper;
                    SheetState sheetState2 = sheetState;
                    if (z) {
                        BuildersKt.d(coroutineScope2, null, null, new C01111(sheetState2, homeScreenInfoHelper2, profileScreenSideEffect, null), 3);
                    } else {
                        if (!Intrinsics.d(profileScreenSideEffect, ProfileScreenSideEffect.ShowBottomSheet.f3602a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BuildersKt.d(coroutineScope2, null, null, new AnonymousClass2(sheetState2, homeScreenInfoHelper2, null), 3);
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowS0.collect(flowCollector, this) == coroutineSingletons) {
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
