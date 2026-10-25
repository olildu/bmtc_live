package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.SuperPassTableMappers;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetailsRoom;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassRideDetailsRoom;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$getRideBasedSuperPassRideDetails$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$getRideBasedSuperPassRideDetails$2 extends SuspendLambda implements Function1<Continuation<? super RideBasedSuperPassRideDetailsRoom>, Object> {
    final /* synthetic */ String $passId;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.SuperPassDaoImpl$getRideBasedSuperPassRideDetails$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function7<String, List<? extends Long>, Boolean, Long, Boolean, Long, Long, RideBasedSuperPassRideDetailsRoom> {
        @Override // kotlin.jvm.functions.Function7
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            String p0 = (String) obj;
            List p1 = (List) obj2;
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            long jLongValue = ((Number) obj4).longValue();
            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
            long jLongValue2 = ((Number) obj6).longValue();
            long jLongValue3 = ((Number) obj7).longValue();
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            ((SuperPassTableMappers) this.receiver).getClass();
            return new RideBasedSuperPassRideDetailsRoom(p0, p1, zBooleanValue, jLongValue, zBooleanValue2, jLongValue2, jLongValue3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$getRideBasedSuperPassRideDetails$2(SuperPassDaoImpl superPassDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$getRideBasedSuperPassRideDetails$2(this.this$0, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$getRideBasedSuperPassRideDetails$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.d.X(this.$passId, new AnonymousClass1(7, SuperPassTableMappers.f2109a, SuperPassTableMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/util/List;ZJZJJ)Lapp/chalo/superpass/data/models/entities/RideBasedSuperPassRideDetailsRoom;", 0)).c();
    }
}
