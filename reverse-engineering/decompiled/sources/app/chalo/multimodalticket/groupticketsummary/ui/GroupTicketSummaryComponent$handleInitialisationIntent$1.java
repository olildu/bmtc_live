package app.chalo.multimodalticket.groupticketsummary.ui;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import defpackage.e40;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryComponent$handleInitialisationIntent$1", f = "GroupTicketSummaryComponent.kt", l = {131}, m = "invokeSuspend", v = 1)
final class GroupTicketSummaryComponent$handleInitialisationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupTicketSummaryViewIntent.InitialisationIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ GroupTicketSummaryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTicketSummaryComponent$handleInitialisationIntent$1(GroupTicketSummaryComponent groupTicketSummaryComponent, GroupTicketSummaryViewIntent.InitialisationIntent initialisationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = groupTicketSummaryComponent;
        this.$intent = initialisationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GroupTicketSummaryComponent$handleInitialisationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GroupTicketSummaryComponent$handleInitialisationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GroupTicketSummaryComponent.Companion.InvalidScreenArgType invalidScreenArgType;
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GroupTicketSummaryComponent groupTicketSummaryComponent = this.this$0;
            GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs = this.$intent.f5903a;
            groupTicketSummaryComponent.getClass();
            if (StringsKt.F(groupTicketBookingSummaryArgs.b)) {
                invalidScreenArgType = GroupTicketSummaryComponent.Companion.InvalidScreenArgType.INVALID_JOURNEY_CONFIG_ID;
            } else if (StringsKt.F(groupTicketBookingSummaryArgs.c)) {
                invalidScreenArgType = GroupTicketSummaryComponent.Companion.InvalidScreenArgType.INVALID_TRANSACTION_ID;
            } else if (StringsKt.F(groupTicketBookingSummaryArgs.g)) {
                invalidScreenArgType = GroupTicketSummaryComponent.Companion.InvalidScreenArgType.INVALID_AGENCY;
            } else {
                invalidScreenArgType = groupTicketBookingSummaryArgs.e.size() < 2 ? GroupTicketSummaryComponent.Companion.InvalidScreenArgType.INVALID_LEGS_COUNT : null;
            }
            GroupTicketSummaryComponent.Companion.ScreenDataValidity.Valid valid = GroupTicketSummaryComponent.Companion.ScreenDataValidity.Valid.f5901a;
            Object invalid = invalidScreenArgType != null ? new GroupTicketSummaryComponent.Companion.ScreenDataValidity.Invalid(invalidScreenArgType) : valid;
            if (invalid instanceof GroupTicketSummaryComponent.Companion.ScreenDataValidity.Invalid) {
                GroupTicketSummaryComponent groupTicketSummaryComponent2 = this.this$0;
                KotlinToastManager kotlinToastManager2 = groupTicketSummaryComponent2.o;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = groupTicketSummaryComponent2.n.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            } else {
                if (!invalid.equals(valid)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.E0(new e40(this.$intent, 6));
                GroupTicketSummaryComponent groupTicketSummaryComponent3 = this.this$0;
                if (!groupTicketSummaryComponent3.s) {
                    groupTicketSummaryComponent3.s = true;
                    BuildersKt.d(groupTicketSummaryComponent3.j, null, null, new GroupTicketSummaryComponent$startFetchPriceDetails$1(groupTicketSummaryComponent3, null), 3);
                }
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        ChaloNavigationManagerKt.c(this.this$0.p);
        return Unit.f17538a;
    }
}
