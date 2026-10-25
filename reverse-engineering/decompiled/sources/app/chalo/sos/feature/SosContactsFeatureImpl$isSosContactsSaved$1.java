package app.chalo.sos.feature;

import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.sos.feature.SosContactsFeatureImpl", f = "SosContactsFeatureImpl.kt", l = {127}, m = "isSosContactsSaved", v = 1)
final class SosContactsFeatureImpl$isSosContactsSaved$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SosContactsFeatureImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SosContactsFeatureImpl$isSosContactsSaved$1(SosContactsFeatureImpl sosContactsFeatureImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = sosContactsFeatureImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SosContactsFeatureImpl$isSosContactsSaved$1 sosContactsFeatureImpl$isSosContactsSaved$1;
        Object objB;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        SosContactsFeatureImpl sosContactsFeatureImpl = this.this$0;
        sosContactsFeatureImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            sosContactsFeatureImpl$isSosContactsSaved$1 = this;
        } else {
            sosContactsFeatureImpl$isSosContactsSaved$1 = new SosContactsFeatureImpl$isSosContactsSaved$1(sosContactsFeatureImpl, this);
        }
        Object objD = sosContactsFeatureImpl$isSosContactsSaved$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sosContactsFeatureImpl$isSosContactsSaved$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objD);
            LocalDataStore localDataStore = sosContactsFeatureImpl.f9433a;
            sosContactsFeatureImpl$isSosContactsSaved$1.label = 1;
            objD = localDataStore.d(sosContactsFeatureImpl$isSosContactsSaved$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        Map map = (Map) objD;
        if (map == null) {
            return Boolean.FALSE;
        }
        if (map.isEmpty()) {
            z = false;
        } else {
            for (Map.Entry entry : map.entrySet()) {
                ChaloJson chaloJson = ChaloJson.f6455a;
                String string = entry.getValue().toString();
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(string, SosContact.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                if (((SosContact) objB) != null) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
