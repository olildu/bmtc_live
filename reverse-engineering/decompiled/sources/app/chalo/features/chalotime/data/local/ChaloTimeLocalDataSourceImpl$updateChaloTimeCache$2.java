package app.chalo.features.chalotime.data.local;

import androidx.datastore.preferences.core.MutablePreferences;
import app.chalo.utils.ElapsedRealTimeClock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2", f = "ChaloTimeLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $chaloTime;
    final /* synthetic */ long $currentElapsedRealTime;
    final /* synthetic */ long $currentSystemTime;
    final /* synthetic */ ElapsedRealTimeClock $elapsedRealTimeLogic;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2(long j, long j2, long j3, ElapsedRealTimeClock elapsedRealTimeClock, Continuation continuation) {
        super(2, continuation);
        this.$chaloTime = j;
        this.$currentElapsedRealTime = j2;
        this.$currentSystemTime = j3;
        this.$elapsedRealTimeLogic = elapsedRealTimeClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2 chaloTimeLocalDataSourceImpl$updateChaloTimeCache$2 = new ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2(this.$chaloTime, this.$currentElapsedRealTime, this.$currentSystemTime, this.$elapsedRealTimeLogic, continuation);
        chaloTimeLocalDataSourceImpl$updateChaloTimeCache$2.L$0 = obj;
        return chaloTimeLocalDataSourceImpl$updateChaloTimeCache$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2 chaloTimeLocalDataSourceImpl$updateChaloTimeCache$2 = (ChaloTimeLocalDataSourceImpl$updateChaloTimeCache$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloTimeLocalDataSourceImpl$updateChaloTimeCache$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        mutablePreferences.set(ChaloTimeLocalDataSourceImpl.b, String.valueOf(this.$chaloTime));
        mutablePreferences.set(ChaloTimeLocalDataSourceImpl.c, String.valueOf(this.$currentElapsedRealTime));
        mutablePreferences.set(ChaloTimeLocalDataSourceImpl.d, String.valueOf(this.$currentSystemTime));
        mutablePreferences.set(ChaloTimeLocalDataSourceImpl.e, this.$elapsedRealTimeLogic.name());
        return Unit.f17538a;
    }
}
