package app.chalo.plotline;

import androidx.autofill.HintConstants;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import so.plotline.plotline_kmp.Plotline;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.plotline.PlotlineContractImpl$trackEvent$1", f = "PlotlineContractImpl.kt", l = {242, 165}, m = "invokeSuspend", v = 1)
final class PlotlineContractImpl$trackEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $eventName;
    final /* synthetic */ Map<String, Object> $properties;
    final /* synthetic */ String $source;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PlotlineContractImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlotlineContractImpl$trackEvent$1(PlotlineContractImpl plotlineContractImpl, Map map, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = plotlineContractImpl;
        this.$properties = map;
        this.$source = str;
        this.$eventName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlotlineContractImpl$trackEvent$1(this.this$0, this.$properties, this.$source, this.$eventName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlotlineContractImpl$trackEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:7:0x0025, B:30:0x00ca, B:32:0x00ce, B:35:0x00d4, B:36:0x00ee, B:38:0x00f4, B:40:0x0109, B:43:0x010e, B:44:0x0112, B:45:0x0116), top: B:52:0x0025 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map<String, Object> map;
        Mutex mutex;
        String str;
        String str2;
        PlotlineContractImpl plotlineContractImpl;
        Mutex mutex2;
        LinkedHashMap linkedHashMapU;
        String str3;
        String str4;
        Map map2;
        Map map3;
        UserProfileAppModel userProfileAppModel;
        String str5;
        LinkedHashMap linkedHashMap;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                PlotlineContractImpl plotlineContractImpl2 = this.this$0;
                MutexImpl mutexImpl = plotlineContractImpl2.s;
                map = this.$properties;
                String str6 = this.$source;
                String str7 = this.$eventName;
                this.L$0 = mutexImpl;
                this.L$1 = map;
                this.L$2 = plotlineContractImpl2;
                this.L$3 = str6;
                this.L$4 = str7;
                this.label = 1;
                if (mutexImpl.a(this) != coroutineSingletons) {
                    mutex = mutexImpl;
                    str = str7;
                    str2 = str6;
                    plotlineContractImpl = plotlineContractImpl2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map2 = (Map) this.L$5;
                str4 = (String) this.L$4;
                map3 = (Map) this.L$3;
                str3 = (String) this.L$2;
                plotlineContractImpl = (PlotlineContractImpl) this.L$1;
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.b(obj);
                    userProfileAppModel = (UserProfileAppModel) obj;
                    if (userProfileAppModel != null || (str5 = userProfileAppModel.e) == null) {
                        str5 = "";
                    }
                    map2.put(str4, str5);
                    linkedHashMap = new LinkedHashMap(MapsKt.g(map3.size()));
                    for (Object obj2 : map3.entrySet()) {
                        Object key = ((Map.Entry) obj2).getKey();
                        value = ((Map.Entry) obj2).getValue();
                        if (!(value instanceof String) && !(value instanceof Integer)) {
                            value = value.toString();
                        }
                        linkedHashMap.put(key, value);
                    }
                    Plotline.b(plotlineContractImpl.j.b(), str3, linkedHashMap);
                    mutex2.e(null);
                    return Unit.f17538a;
                } catch (Throwable th) {
                    th = th;
                    mutex2.e(null);
                    throw th;
                }
            }
            str = (String) this.L$4;
            str2 = (String) this.L$3;
            plotlineContractImpl = (PlotlineContractImpl) this.L$2;
            map = (Map) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
            if (map != null) {
                linkedHashMapU = MapsKt.u(map);
                for (Map.Entry entry : plotlineContractImpl.q.entrySet()) {
                    linkedHashMapU.put(entry.getKey(), entry.getValue());
                }
            } else {
                linkedHashMapU = MapsKt.u(plotlineContractImpl.q);
            }
            linkedHashMapU.put("source", str2);
            UserProfileDetailsProvider userProfileDetailsProvider = plotlineContractImpl.c;
            this.L$0 = mutex;
            this.L$1 = plotlineContractImpl;
            this.L$2 = str;
            this.L$3 = linkedHashMapU;
            this.L$4 = HintConstants.AUTOFILL_HINT_PHONE;
            this.L$5 = linkedHashMapU;
            this.label = 2;
            Object objL = userProfileDetailsProvider.l(this);
            if (objL != coroutineSingletons) {
                str3 = str;
                str4 = HintConstants.AUTOFILL_HINT_PHONE;
                map2 = linkedHashMapU;
                mutex2 = mutex;
                obj = objL;
                map3 = map2;
                userProfileAppModel = (UserProfileAppModel) obj;
                if (userProfileAppModel != null) {
                    str5 = "";
                } else {
                    str5 = "";
                }
                map2.put(str4, str5);
                linkedHashMap = new LinkedHashMap(MapsKt.g(map3.size()));
                while (r0.hasNext()) {
                    Object key2 = ((Map.Entry) obj2).getKey();
                    value = ((Map.Entry) obj2).getValue();
                    if (!(value instanceof String)) {
                        value = value.toString();
                    }
                    linkedHashMap.put(key2, value);
                }
                Plotline.b(plotlineContractImpl.j.b(), str3, linkedHashMap);
                mutex2.e(null);
                return Unit.f17538a;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }
}
