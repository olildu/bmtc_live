package app.chalo.core.database.dao;

import app.chalo.superpass.data.models.entities.SuperPassApplication;
import defpackage.sf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$insertSuperPassApplicationsList$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$insertSuperPassApplicationsList$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SuperPassApplication> $superPassApplicationList;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$insertSuperPassApplicationsList$2(SuperPassDaoImpl superPassDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$superPassApplicationList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$insertSuperPassApplicationsList$2(this.this$0, this.$superPassApplicationList, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        SuperPassDaoImpl$insertSuperPassApplicationsList$2 superPassDaoImpl$insertSuperPassApplicationsList$2 = (SuperPassDaoImpl$insertSuperPassApplicationsList$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        superPassDaoImpl$insertSuperPassApplicationsList$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        SuperPassDaoImpl superPassDaoImpl = this.this$0;
        superPassDaoImpl.c.V(new sf1(this.$superPassApplicationList, superPassDaoImpl, 3));
        return Unit.f17538a;
    }
}
