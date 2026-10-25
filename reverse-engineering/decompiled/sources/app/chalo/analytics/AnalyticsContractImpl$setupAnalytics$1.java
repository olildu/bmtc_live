package app.chalo.analytics;

import app.chalo.analytics.senders.AnalyticsSender;
import app.chalo.features.language.data.Language;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import j$.time.ZoneId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.datetime.TimeZone;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.analytics.AnalyticsContractImpl$setupAnalytics$1", f = "AnalyticsContractImpl.kt", l = {152}, m = "invokeSuspend", v = 1)
final class AnalyticsContractImpl$setupAnalytics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AnalyticsContractImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsContractImpl$setupAnalytics$1(AnalyticsContractImpl analyticsContractImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = analyticsContractImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsContractImpl$setupAnalytics$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsContractImpl$setupAnalytics$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String locale;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsManager analyticsManager = this.this$0.f869a;
            this.label = 1;
            if (analyticsManager.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appVersionCode", String.valueOf(this.this$0.e.getE()));
        Language language = (Language) this.this$0.d.getE().getValue();
        if (language == null || (locale = language.getLocale()) == null) {
            locale = "";
        }
        linkedHashMap.put("selected language", locale);
        CityAppModel cityAppModel = (CityAppModel) this.this$0.c.getE().getValue();
        if (cityAppModel != null) {
            linkedHashMap.put("selectedCity", cityAppModel.f8854a);
        }
        TimeZone.INSTANCE.getClass();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.h(zoneIdSystemDefault, "systemDefault(...)");
        linkedHashMap.put("time zone", TimeZone.Companion.b(zoneIdSystemDefault).a());
        Iterator it = this.this$0.f869a.f870a.iterator();
        while (it.hasNext()) {
            ((AnalyticsSender) it.next()).h(linkedHashMap);
        }
        Iterator it2 = this.this$0.f869a.f870a.iterator();
        while (it2.hasNext()) {
            ((AnalyticsSender) it2.next()).c(linkedHashMap);
        }
        this.this$0.g.d(linkedHashMap);
        this.this$0.g.c(linkedHashMap);
        return Unit.f17538a;
    }
}
