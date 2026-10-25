package app.chalo.recent;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelperImpl", f = "RecentsAndFavMigrationsTrackingDatastoreHelperImpl.kt", l = {20}, m = "isFavAndRecentsMigrationCompletedForCity", v = 1)
final class RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentsAndFavMigrationsTrackingDatastoreHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1(RecentsAndFavMigrationsTrackingDatastoreHelperImpl recentsAndFavMigrationsTrackingDatastoreHelperImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentsAndFavMigrationsTrackingDatastoreHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1 recentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        final RecentsAndFavMigrationsTrackingDatastoreHelperImpl recentsAndFavMigrationsTrackingDatastoreHelperImpl = this.this$0;
        recentsAndFavMigrationsTrackingDatastoreHelperImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1 = this;
        } else {
            recentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1 = new RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1(recentsAndFavMigrationsTrackingDatastoreHelperImpl, this);
        }
        Object objV = recentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            final Flow data = recentsAndFavMigrationsTrackingDatastoreHelperImpl.f8925a.getData();
            Flow<Boolean> flow = new Flow<Boolean>() { // from class: app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f8927a;
                    public final /* synthetic */ RecentsAndFavMigrationsTrackingDatastoreHelperImpl b;

                    /* JADX INFO: renamed from: app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$$inlined$map$1$2", f = "RecentsAndFavMigrationsTrackingDatastoreHelperImpl.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, RecentsAndFavMigrationsTrackingDatastoreHelperImpl recentsAndFavMigrationsTrackingDatastoreHelperImpl) {
                        this.f8927a = flowCollector;
                        this.b = recentsAndFavMigrationsTrackingDatastoreHelperImpl;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.b(obj2);
                            this.b.getClass();
                            Object obj3 = ((Preferences) obj).get(PreferencesKeys.booleanKey("mark_migration_completed_null"));
                            anonymousClass1.label = 1;
                            if (this.f8927a.emit(obj3, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj2);
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = data.collect(new AnonymousClass2(flowCollector, recentsAndFavMigrationsTrackingDatastoreHelperImpl), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            };
            recentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1.label = 1;
            objV = FlowKt.v(flow, recentsAndFavMigrationsTrackingDatastoreHelperImpl$isFavAndRecentsMigrationCompletedForCity$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Boolean bool = (Boolean) objV;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
