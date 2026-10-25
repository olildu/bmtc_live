package app.chalo.superpass.data.repository;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.parser.SuperPassJsonParser;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lapp/chalo/superpass/data/models/entities/MagicSuperPass;", "Lapp/chalo/superpass/data/models/entities/RideBasedSuperPass;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$insertOrUpdatePassInPassTable$2", f = "SuperPassRepository.kt", l = {TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO}, m = "invokeSuspend", v = 1)
final class SuperPassRepository$insertOrUpdatePassInPassTable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends MagicSuperPass, ? extends RideBasedSuperPass>>, Object> {
    final /* synthetic */ JsonObject $lPassesObject;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassRepository$insertOrUpdatePassInPassTable$2(JsonObject jsonObject, Continuation continuation) {
        super(2, continuation);
        this.$lPassesObject = jsonObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassRepository$insertOrUpdatePassInPassTable$2(this.$lPassesObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassRepository$insertOrUpdatePassInPassTable$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        SuperPassJsonParser superPassJsonParser = SuperPassJsonParser.f9587a;
        JsonObject jsonObject = this.$lPassesObject;
        this.label = 1;
        Serializable serializableK = superPassJsonParser.k(jsonObject, this);
        return serializableK == coroutineSingletons ? coroutineSingletons : serializableK;
    }
}
