package app.chalo.location;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.DataStoreLastKnownLocationStorage$write$2", f = "DataStoreLastKnownLocationStorage.kt", l = {33}, m = "invokeSuspend", v = 1)
final class DataStoreLastKnownLocationStorage$write$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Preferences>, Object> {
    final /* synthetic */ StoredLocation $location;
    int label;
    final /* synthetic */ DataStoreLastKnownLocationStorage this$0;

    /* JADX INFO: renamed from: app.chalo.location.DataStoreLastKnownLocationStorage$write$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.location.DataStoreLastKnownLocationStorage$write$2$1", f = "DataStoreLastKnownLocationStorage.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ StoredLocation $location;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StoredLocation storedLocation, Continuation continuation) {
            super(2, continuation);
            this.$location = storedLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$location, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((MutablePreferences) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
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
            Preferences.Key key = DataStoreLastKnownLocationStorage.c;
            mutablePreferences.set(DataStoreLastKnownLocationStorage.c, new Long(this.$location.c));
            mutablePreferences.set(DataStoreLastKnownLocationStorage.d, new Double(this.$location.f5160a));
            mutablePreferences.set(DataStoreLastKnownLocationStorage.e, new Double(this.$location.b));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreLastKnownLocationStorage$write$2(DataStoreLastKnownLocationStorage dataStoreLastKnownLocationStorage, StoredLocation storedLocation, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dataStoreLastKnownLocationStorage;
        this.$location = storedLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStoreLastKnownLocationStorage$write$2(this.this$0, this.$location, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreLastKnownLocationStorage$write$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
        DataStore dataStore = this.this$0.f5132a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$location, null);
        this.label = 1;
        Object objEdit = PreferencesKt.edit(dataStore, anonymousClass1, this);
        return objEdit == coroutineSingletons ? coroutineSingletons : objEdit;
    }
}
