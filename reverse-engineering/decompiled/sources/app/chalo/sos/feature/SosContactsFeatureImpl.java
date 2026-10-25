package app.chalo.sos.feature;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getAllEntriesAsFlow$$inlined$map$1;
import app.chalo.location.ChaloLocationManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.sos.official.SosPhoneNumberNormalizer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/sos/feature/SosContactsFeatureImpl;", "Lapp/chalo/sos/feature/SosContactsFeature;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosContactsFeatureImpl implements SosContactsFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f9433a;
    public final CrashlyticsLogger b;
    public final StringProvider c;
    public final SosFeaturePlatformDelegateProvider d;
    public final ChaloLocationManager e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/sos/feature/SosContactsFeatureImpl$Companion;", "", "", "SOS_STORE_PREFS_KEY", "Ljava/lang/String;", "SOS_MSG_KEY", "LAST_SUCCESSFUL_SOS_TIMESTAMP_KEY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SosContactsFeatureImpl(LocalDataStore localDataStore, CrashlyticsLogger crashlyticsLogger, StringProvider stringProvider, SosFeaturePlatformDelegateProvider sosFeaturePlatformDelegateProvider, ChaloLocationManager chaloLocationManager, SosPhoneNumberNormalizer sosPhoneNumberNormalizer) {
        this.f9433a = localDataStore;
        this.b = crashlyticsLogger;
        this.c = stringProvider;
        this.d = sosFeaturePlatformDelegateProvider;
        this.e = chaloLocationManager;
    }

    @Override // app.chalo.sos.feature.SosContactsFeature
    public final Object a(Continuation continuation) {
        return this.d.getDelegate().a(continuation);
    }

    @Override // app.chalo.sos.feature.SosContactsFeature
    public final Object b(String str, Continuation continuation) {
        Object objH = this.f9433a.h("sos_message", str, (ContinuationImpl) continuation);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : Unit.f17538a;
    }

    @Override // app.chalo.sos.feature.SosContactsFeature
    public final SosContactsFeatureImpl$getAllSosContact$$inlined$map$1 c() {
        return new SosContactsFeatureImpl$getAllSosContact$$inlined$map$1(new LocalDataStore$getAllEntriesAsFlow$$inlined$map$1(this.f9433a.f2414a.getData()));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[PHI: r13 r14
      0x011c: PHI (r13v10 java.util.List) = (r13v9 java.util.List), (r13v12 java.util.List) binds: [B:51:0x0106, B:55:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r14v18 java.lang.String) = (r14v15 java.lang.String), (r14v22 java.lang.String) binds: [B:51:0x0106, B:55:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if (r14 == r1) goto L58;
     */
    @Override // app.chalo.sos.feature.SosContactsFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.feature.SosContactsFeatureImpl.d(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.sos.feature.SosContactsFeature
    public final Object e(SosContact sosContact, ContinuationImpl continuationImpl) {
        SosContactsFeatureImpl$addContact$1 sosContactsFeatureImpl$addContact$1;
        if (continuationImpl instanceof SosContactsFeatureImpl$addContact$1) {
            sosContactsFeatureImpl$addContact$1 = (SosContactsFeatureImpl$addContact$1) continuationImpl;
            int i = sosContactsFeatureImpl$addContact$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sosContactsFeatureImpl$addContact$1.label = i - Integer.MIN_VALUE;
            } else {
                sosContactsFeatureImpl$addContact$1 = new SosContactsFeatureImpl$addContact$1(this, continuationImpl);
            }
        } else {
            sosContactsFeatureImpl$addContact$1 = new SosContactsFeatureImpl$addContact$1(this, continuationImpl);
        }
        Object obj = sosContactsFeatureImpl$addContact$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sosContactsFeatureImpl$addContact$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                Json json = ChaloJson.b;
                json.getClass();
                String strA = json.a(SosContact.INSTANCE.serializer(), sosContact);
                LocalDataStore localDataStore = this.f9433a;
                String str = sosContact.f9431a;
                sosContactsFeatureImpl$addContact$1.label = 1;
                if (localDataStore.h(str, strA, sosContactsFeatureImpl$addContact$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Exception e) {
            this.b.i(e);
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.sos.feature.SosContactsFeature
    public final Object f(SosContact sosContact, Continuation continuation) {
        Object objC = this.f9433a.c(CollectionsKt.R(PreferencesKeys.stringKey(sosContact.f9431a)), (ContinuationImpl) continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.sos.feature.SosContactsFeature
    public final Object g(Continuation continuation) {
        return FlowKt.v(this.f9433a.e(PreferencesKeys.longKey("last_successful_sos_timestamp")), continuation);
    }

    @Override // app.chalo.sos.feature.SosContactsFeature
    public final SosContactsFeatureImpl$getSosMessage$$inlined$map$1 h() {
        return new SosContactsFeatureImpl$getSosMessage$$inlined$map$1(new LocalDataStore$getAllEntriesAsFlow$$inlined$map$1(this.f9433a.f2414a.getData()), this);
    }

    @Override // app.chalo.sos.feature.SosContactsFeature
    public final Object i(long j, Continuation continuation) {
        Object objG = this.f9433a.g(PreferencesKeys.longKey("last_successful_sos_timestamp"), new Long(j), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }
}
