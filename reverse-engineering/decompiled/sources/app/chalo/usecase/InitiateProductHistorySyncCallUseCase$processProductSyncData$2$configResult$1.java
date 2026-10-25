package app.chalo.usecase;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.productsync.error.ProductHistorySyncException;
import app.chalo.utils.MobileTicketingConverters;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$configResult$1", f = "InitiateProductHistorySyncCallUseCase.kt", l = {245}, m = "invokeSuspend", v = 1)
final class InitiateProductHistorySyncCallUseCase$processProductSyncData$2$configResult$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonObject $configurationJsonObject;
    int label;
    final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateProductHistorySyncCallUseCase$processProductSyncData$2$configResult$1(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, JsonObject jsonObject, Continuation continuation) {
        super(1, continuation);
        this.this$0 = initiateProductHistorySyncCallUseCase;
        this.$configurationJsonObject = jsonObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new InitiateProductHistorySyncCallUseCase$processProductSyncData$2$configResult$1(this.this$0, this.$configurationJsonObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((InitiateProductHistorySyncCallUseCase$processProductSyncData$2$configResult$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ProductHistorySyncException.ProductConfigNotAvailable {
        Object objI;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
        JsonObject jsonObject = this.$configurationJsonObject;
        this.label = 1;
        MobileTicketingConverters mobileTicketingConverters = initiateProductHistorySyncCallUseCase.k;
        Map mapD = null;
        if (jsonObject != null) {
            try {
                JsonArray jsonArrayO = JsonElementExtensionsKt.o(jsonObject, "products");
                if (jsonArrayO == null) {
                    mapD = MapsKt.d();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = jsonArrayO.f18186a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArrayO, i2);
                        String strS = JsonElementExtensionsKt.s(jsonObjectF, "id", "");
                        if (strS.length() > 0) {
                            linkedHashMap.put(strS, jsonObjectF.toString());
                        }
                    }
                    mapD = linkedHashMap;
                }
            } catch (Exception e) {
                mobileTicketingConverters.b.i(e);
            }
        }
        if (mapD == null) {
            throw new ProductHistorySyncException.ProductConfigNotAvailable();
        }
        if (mapD.isEmpty()) {
            objI = unit;
        } else {
            ArrayList arrayList = new ArrayList(mapD.size());
            for (Map.Entry entry : mapD.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), (String) entry.getValue()));
            }
            objI = initiateProductHistorySyncCallUseCase.m.i(arrayList, this);
            if (objI != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objI = unit;
            }
        }
        return objI == coroutineSingletons ? coroutineSingletons : unit;
    }
}
