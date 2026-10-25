package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResult;
import defpackage.bj0;
import java.util.LinkedHashMap;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent$closeFlow$1", f = "MinProfileUpdateComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class MinProfileUpdateComponent$closeFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MinProfileUpdateResult $result;
    int label;
    final /* synthetic */ MinProfileUpdateComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinProfileUpdateComponent$closeFlow$1(MinProfileUpdateComponent minProfileUpdateComponent, MinProfileUpdateResult minProfileUpdateResult, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minProfileUpdateComponent;
        this.$result = minProfileUpdateResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinProfileUpdateComponent$closeFlow$1(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MinProfileUpdateComponent$closeFlow$1 minProfileUpdateComponent$closeFlow$1 = (MinProfileUpdateComponent$closeFlow$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        minProfileUpdateComponent$closeFlow$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        MinProfileUpdateComponent minProfileUpdateComponent = this.this$0;
        MinProfileUpdateResult minProfileUpdateResult = this.$result;
        LinkedHashMap linkedHashMapL0 = minProfileUpdateComponent.L0();
        Intrinsics.i(minProfileUpdateResult, "<this>");
        if (minProfileUpdateResult.equals(MinProfileUpdateResult.Dismissed.f9057a)) {
            str = "dismissed";
        } else if (minProfileUpdateResult.equals(MinProfileUpdateResult.ProfileUpdated.f9058a)) {
            str = "profileUpdated";
        } else {
            if (!minProfileUpdateResult.equals(MinProfileUpdateResult.Skipped.f9059a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "skipped";
        }
        linkedHashMapL0.put("dismissType", str);
        AnalyticsContractImplKt.b(minProfileUpdateComponent.y, "minProfile back triggered", Source.MIN_PROFILE_UPDATE_SCREEN, linkedHashMapL0, false, 24);
        MinProfileUpdateComponent minProfileUpdateComponent2 = this.this$0;
        String str2 = minProfileUpdateComponent2.k.b;
        if (str2 != null) {
            minProfileUpdateComponent2.x.c(this.$result, str2);
        }
        MinProfileUpdateComponent minProfileUpdateComponent3 = this.this$0;
        minProfileUpdateComponent3.q0(new bj0(minProfileUpdateComponent3, 9));
        return Unit.f17538a;
    }
}
