package app.chalo.onboarding.cityprovider;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.location.LatLng;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1;
import app.chalo.onboarding.converters.CityResponseConverter;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ModeMapInfoAppModel;
import defpackage.q4;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityprovider/CityProviderImpl;", "Lapp/chalo/providers/cityprovider/CityProvider;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityProviderImpl implements CityProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityMetaPropsLocalDataSource f6608a;
    public final PolylineUtils b;
    public boolean c;
    public final StateFlow d;
    public final StateFlow e;

    public CityProviderImpl(CoroutineContextProvider coroutineContextProvider, CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource, PolylineUtils polylineUtils) {
        this.f6608a = cityMetaPropsLocalDataSource;
        this.b = polylineUtils;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        DataStore dataStore = cityMetaPropsLocalDataSource.b;
        final Flow data = dataStore.getData();
        Flow<Boolean> flow = new Flow<Boolean>() { // from class: app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$isMetaUpdated$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$isMetaUpdated$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6573a;

                /* JADX INFO: renamed from: app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$isMetaUpdated$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$isMetaUpdated$$inlined$map$1$2", f = "CityMetaPropsLocalDataSource.kt", l = {50}, m = "emit", v = 1)
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
                    this.f6573a = flowCollector;
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
                        Boolean boolValueOf = Boolean.valueOf(((Preferences) obj).get(PreferencesKeys.stringKey("key_is_meta_updated")) != null);
                        anonymousClass1.label = 1;
                        if (this.f6573a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
        Boolean bool = Boolean.FALSE;
        SharingStarted sharingStarted = SharingStarted.Companion.f17836a;
        this.d = FlowKt.G(flow, contextScopeA, sharingStarted, bool);
        final Flow flowM = FlowKt.m(new CityMetaPropsLocalDataSource$getCurrentSelectedCityId$$inlined$map$1(dataStore.getData()));
        this.e = FlowKt.G(new Flow<CityAppModel>() { // from class: app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6610a;
                public final /* synthetic */ CityProviderImpl b;

                /* JADX INFO: renamed from: app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1$2", f = "CityProviderImpl.kt", l = {51, 50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, CityProviderImpl cityProviderImpl) {
                    this.f6610a = flowCollector;
                    this.b = cityProviderImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
                
                    if (r7.emit(r8, r0) == r1) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1$2$1 r0 = (app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1$2$1 r0 = new app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3a
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.b(r8)
                        goto L68
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.ResultKt.b(r8)
                        goto L5c
                    L3a:
                        kotlin.ResultKt.b(r8)
                        java.lang.String r7 = (java.lang.String) r7
                        app.chalo.onboarding.cityprovider.CityProviderImpl r8 = r6.b
                        app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource r8 = r8.f6608a
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.f6610a
                        r0.L$0 = r2
                        r0.label = r4
                        androidx.datastore.core.DataStore r4 = r8.b
                        kotlinx.coroutines.flow.Flow r4 = r4.getData()
                        app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getCachedCityMetaPropsFromId$$inlined$map$1 r5 = new app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getCachedCityMetaPropsFromId$$inlined$map$1
                        r5.<init>(r4, r8, r7)
                        java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.v(r5, r0)
                        if (r8 != r1) goto L5b
                        goto L67
                    L5b:
                        r7 = r2
                    L5c:
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L68
                    L67:
                        return r1
                    L68:
                        kotlin.Unit r7 = kotlin.Unit.f17538a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.cityprovider.CityProviderImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowM.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, contextScopeA, sharingStarted, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.providers.cityprovider.CityProvider
    public final Object a(LatLng latLng, ContinuationImpl continuationImpl) {
        CityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1 cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1;
        if (continuationImpl instanceof CityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1) {
            cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1 = (CityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1) continuationImpl;
            int i = cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1 = new CityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1(this, continuationImpl);
            }
        } else {
            cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1 = new CityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1(this, continuationImpl);
        }
        Object objC = cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1.L$0 = latLng;
            cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1.label = 1;
            objC = c(cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            latLng = (LatLng) cityProviderImpl$getBasicCityInfoAppModelFromLocationIfAvailable$1.L$0;
            ResultKt.b(objC);
        }
        List list = (List) objC;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (this.b.b(latLng, ((BasicCityInfoAppModel) obj3).f)) {
                obj2 = obj3;
                break;
            }
        }
        return (BasicCityInfoAppModel) obj2;
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    /* JADX INFO: renamed from: b, reason: from getter */
    public final StateFlow getE() {
        return this.e;
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    public final Object c(ContinuationImpl continuationImpl) {
        final CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource = this.f6608a;
        final Flow data = cityMetaPropsLocalDataSource.b.getData();
        return FlowKt.v(new Flow<List<? extends BasicCityInfoAppModel>>() { // from class: app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getBasicCityInfoList$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getBasicCityInfoList$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6567a;

                /* JADX INFO: renamed from: app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getBasicCityInfoList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$getBasicCityInfoList$$inlined$map$1$2", f = "CityMetaPropsLocalDataSource.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource) {
                    this.f6567a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    List listV0;
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
                        Preferences preferences = (Preferences) obj;
                        try {
                            Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey("key_basic_city_info_list");
                            Json json = ChaloJson.b;
                            String str = (String) preferences.get(keyStringKey);
                            if (str == null) {
                                str = "";
                            }
                            listV0 = CollectionsKt.v0(new q4(3), CityResponseConverter.a(JsonElementKt.f(json.f(str))));
                        } catch (Exception unused) {
                            listV0 = null;
                        }
                        anonymousClass1.label = 1;
                        if (this.f6567a.emit(listV0, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = data.collect(new AnonymousClass2(flowCollector, cityMetaPropsLocalDataSource), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, continuationImpl);
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    public final void e() {
        this.c = true;
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    public final boolean f(LatLng location) {
        Intrinsics.i(location, "location");
        CityAppModel cityAppModel = (CityAppModel) this.e.getValue();
        if (cityAppModel != null) {
            return this.b.b(location, cityAppModel.t);
        }
        return false;
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    public final boolean g() {
        CityAppModel cityAppModel = (CityAppModel) this.e.getValue();
        return StringsKt.x(cityAppModel != null ? cityAppModel.f8854a : null, "kochi", true);
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    public final String h() {
        CityAppModel cityAppModel = (CityAppModel) this.e.getValue();
        if (cityAppModel != null) {
            return cityAppModel.f8854a;
        }
        return null;
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    /* JADX INFO: renamed from: i, reason: from getter */
    public final StateFlow getD() {
        return this.d;
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    public final Boolean j() {
        return Boolean.valueOf(CityProviderKt.c(this) && h() != null);
    }

    @Override // app.chalo.providers.cityprovider.CityProvider
    public final ArrayList k(ChaloTransitMode mode) {
        List list;
        Intrinsics.i(mode, "mode");
        CityAppModel cityAppModel = (CityAppModel) this.e.getValue();
        if (cityAppModel == null || (list = cityAppModel.h) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ModeMapInfoAppModel) obj).f8858a == mode) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((ModeMapInfoAppModel) obj2).c);
        }
        ArrayList arrayListI = CollectionsKt.I(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayListI, 10));
        int size2 = arrayListI.size();
        while (i < size2) {
            Object obj3 = arrayListI.get(i);
            i++;
            AgencyInfoAppModel agencyInfoAppModel = (AgencyInfoAppModel) obj3;
            String lowerCase = agencyInfoAppModel.f8852a.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            arrayList3.add(new AgencyInfoAppModel(lowerCase, agencyInfoAppModel.b, agencyInfoAppModel.c, agencyInfoAppModel.d, agencyInfoAppModel.e, agencyInfoAppModel.f, agencyInfoAppModel.g, agencyInfoAppModel.h, agencyInfoAppModel.i, agencyInfoAppModel.j));
        }
        return arrayList3;
    }
}
