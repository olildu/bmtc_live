package app.chalo.instantticket.config.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.extensions.DataStoreExtensionsKt;
import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.model.api.OndcTicketConfiguration;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/config/datastore/ProductBookingDataStoreImpl;", "Lapp/chalo/instantticket/config/datastore/ProductBookingDataStore;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingDataStoreImpl implements ProductBookingDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f3822a;
    public final CityProvider b;

    public ProductBookingDataStoreImpl(DataStore dataStore, CityProvider cityProvider) {
        this.f3822a = dataStore;
        this.b = cityProvider;
    }

    @Override // app.chalo.instantticket.config.datastore.ProductBookingDataStore
    public final Object a(ContinuationImpl continuationImpl) {
        final DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A = DataStoreExtensionsKt.a(this.f3822a, PreferencesKeys.stringKey("pay_for_ticket_config_".concat(e())), "");
        return FlowKt.v(new Flow<InstantTicketConfiguration>() { // from class: app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3824a;

                /* JADX INFO: renamed from: app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$1$2", f = "ProductBookingDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3824a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object objB;
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
                        String str = (String) obj;
                        try {
                            Json json = ChaloJson.b;
                            json.getClass();
                            objB = json.b(str, InstantTicketConfiguration.INSTANCE.serializer());
                        } catch (Exception unused) {
                            objB = null;
                        }
                        anonymousClass1.label = 1;
                        if (this.f3824a.emit(objB, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, continuationImpl);
    }

    @Override // app.chalo.instantticket.config.datastore.ProductBookingDataStore
    public final Object b(String str, ContinuationImpl continuationImpl) {
        Object objB = DataStoreExtensionsKt.b(this.f3822a, PreferencesKeys.stringKey("pay_for_ticket_config_".concat(e())), str, continuationImpl);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.instantticket.config.datastore.ProductBookingDataStore
    public final Object c(ContinuationImpl continuationImpl) {
        Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey("ondc_ticket_config_".concat(e()));
        OndcTicketConfiguration.INSTANCE.getClass();
        final DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A = DataStoreExtensionsKt.a(this.f3822a, keyStringKey, OndcTicketConfiguration.n);
        return FlowKt.v(new Flow<OndcTicketConfiguration>() { // from class: app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3826a;

                /* JADX INFO: renamed from: app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl$special$$inlined$map$2$2", f = "ProductBookingDataStore.kt", l = {50}, m = "emit", v = 1)
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
                    this.f3826a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object objB;
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
                        String str = (String) obj;
                        try {
                            Json json = ChaloJson.b;
                            json.getClass();
                            objB = json.b(str, OndcTicketConfiguration.INSTANCE.serializer());
                        } catch (Exception unused) {
                            objB = null;
                        }
                        OndcTicketConfiguration ondcTicketConfiguration = (OndcTicketConfiguration) objB;
                        if (ondcTicketConfiguration == null) {
                            OndcTicketConfiguration.INSTANCE.getClass();
                            ondcTicketConfiguration = OndcTicketConfiguration.m;
                        }
                        anonymousClass1.label = 1;
                        if (this.f3826a.emit(ondcTicketConfiguration, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, continuationImpl);
    }

    @Override // app.chalo.instantticket.config.datastore.ProductBookingDataStore
    public final Object d(String str, ContinuationImpl continuationImpl) {
        Object objB = DataStoreExtensionsKt.b(this.f3822a, PreferencesKeys.stringKey("ondc_ticket_config_".concat(e())), str, continuationImpl);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    public final String e() {
        String strB = CityProviderKt.b(this.b);
        if (strB == null) {
            return "";
        }
        String lowerCase = strB.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
