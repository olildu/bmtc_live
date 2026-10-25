package app.chalo.recent;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2", f = "RecentsAndFavMigrationsTrackingDatastoreHelperImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecentsAndFavMigrationsTrackingDatastoreHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2(RecentsAndFavMigrationsTrackingDatastoreHelperImpl recentsAndFavMigrationsTrackingDatastoreHelperImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = recentsAndFavMigrationsTrackingDatastoreHelperImpl;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RecentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2 recentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2 = new RecentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2(this.this$0, this.$cityId, continuation);
        recentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2.L$0 = obj;
        return recentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RecentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2 recentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2 = (RecentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2) create((MutablePreferences) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        recentsAndFavMigrationsTrackingDatastoreHelperImpl$markFavAndRecentsMigrationCompletedForCity$2.invokeSuspend(unit);
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
        RecentsAndFavMigrationsTrackingDatastoreHelperImpl recentsAndFavMigrationsTrackingDatastoreHelperImpl = this.this$0;
        String str = this.$cityId;
        recentsAndFavMigrationsTrackingDatastoreHelperImpl.getClass();
        mutablePreferences.set(PreferencesKeys.booleanKey("mark_migration_completed_" + str), Boolean.TRUE);
        return Unit.f17538a;
    }
}
