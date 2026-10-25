package app.chalo.wallet.ui.access;

import androidx.compose.material3.SheetState;
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
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1", f = "WalletAccessBaseScreen.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invokeSuspend", v = 1)
final class WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $bottomSheetState;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ WalletAccessBaseContract $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1(WalletAccessBaseContract walletAccessBaseContract, CoroutineScope coroutineScope, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$vm = walletAccessBaseContract;
        this.$scope = coroutineScope;
        this.$bottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1(this.$vm, this.$scope, this.$bottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow n = this.$vm.getN();
            final CoroutineScope coroutineScope = this.$scope;
            final SheetState sheetState = this.$bottomSheetState;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.wallet.ui.access.WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1.1

                /* JADX INFO: renamed from: app.chalo.wallet.ui.access.WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1$1$1", f = "WalletAccessBaseScreen.kt", l = {63}, m = "invokeSuspend", v = 1)
                final class C01491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SheetState $bottomSheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01491(SheetState sheetState, Continuation continuation) {
                        super(2, continuation);
                        this.$bottomSheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01491(this.$bottomSheetState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01491) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.b(obj);
                            SheetState sheetState = this.$bottomSheetState;
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

                /* JADX INFO: renamed from: app.chalo.wallet.ui.access.WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1$1$2", f = "WalletAccessBaseScreen.kt", l = {EACTags.DISPLAY_IMAGE}, m = "invokeSuspend", v = 1)
                final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ SheetState $bottomSheetState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(SheetState sheetState, Continuation continuation) {
                        super(2, continuation);
                        this.$bottomSheetState = sheetState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.$bottomSheetState, continuation);
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
                            SheetState sheetState = this.$bottomSheetState;
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
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    WalletAccessSideEffect walletAccessSideEffect = (WalletAccessSideEffect) obj2;
                    boolean zD = Intrinsics.d(walletAccessSideEffect, WalletAccessSideEffect.ShowBottomSheet.f10809a);
                    CoroutineScope coroutineScope2 = coroutineScope;
                    SheetState sheetState2 = sheetState;
                    if (zD) {
                        BuildersKt.d(coroutineScope2, null, null, new C01491(sheetState2, null), 3);
                    } else {
                        if (!Intrinsics.d(walletAccessSideEffect, WalletAccessSideEffect.CloseBottomSheet.f10808a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BuildersKt.d(coroutineScope2, null, null, new AnonymousClass2(sheetState2, null), 3);
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (n.collect(flowCollector, this) == coroutineSingletons) {
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
