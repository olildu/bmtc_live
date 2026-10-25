package app.chalo.chalobususerprofile.data.local;

import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.model.SurveyStep;
import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import defpackage.z40;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/data/local/PBUserProfileSurveyPreferenceDataStoreImpl;", "Lapp/chalo/chalobususerprofile/data/local/PBUserProfileSurveyPreferenceDataStore;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PBUserProfileSurveyPreferenceDataStoreImpl implements PBUserProfileSurveyPreferenceDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f1191a;

    public PBUserProfileSurveyPreferenceDataStoreImpl(LocalDataStore localDataStore) {
        this.f1191a = localDataStore;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl$isSurveyCompleted$$inlined$map$1] */
    @Override // app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStore
    public final PBUserProfileSurveyPreferenceDataStoreImpl$isSurveyCompleted$$inlined$map$1 a(String userId, String str) {
        Intrinsics.i(userId, "userId");
        final Flow flowB = b(userId, str);
        return new Flow<Boolean>() { // from class: app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl$isSurveyCompleted$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl$isSurveyCompleted$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f1193a;

                /* JADX INFO: renamed from: app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl$isSurveyCompleted$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStoreImpl$isSurveyCompleted$$inlined$map$1$2", f = "PBUserProfileSurveyPreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f1193a = flowCollector;
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
                        Set setB = ((PBUserProfileSurveyPreference) obj).b();
                        SurveyStep.INSTANCE.getClass();
                        Boolean boolValueOf = Boolean.valueOf(setB.containsAll(SurveyStep.ORDERED));
                        anonymousClass1.label = 1;
                        if (this.f1193a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
                Object objCollect = ((AbstractFlow) flowB).collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStore
    public final Flow b(String userId, String cityId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        return FlowKt.y(new PBUserProfileSurveyPreferenceDataStoreImpl$getPbUserProfileSurveyPreference$1(this, userId, cityId, null));
    }

    @Override // app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStore
    public final Object c(String str, String str2, PBUserProfileSurveyPreference pBUserProfileSurveyPreference, ContinuationImpl continuationImpl) {
        Object objH = this.f1191a.h(z40.g("premium_bus_user_profile_survey_preference_", str, "_", str2), ChaloJson.b.a(PBUserProfileSurveyPreference.INSTANCE.serializer(), pBUserProfileSurveyPreference), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (objH != coroutineSingletons) {
            objH = unit;
        }
        return objH == coroutineSingletons ? objH : unit;
    }
}
