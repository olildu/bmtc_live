package app.chalo.home.helper;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.utils.ProductUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/helper/MandatoryFirstHistoryCallGuardImpl;", "Lapp/chalo/helper/MandatoryFirstHistoryCallGuard;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MandatoryFirstHistoryCallGuardImpl implements MandatoryFirstHistoryCallGuard {
    public final LocalDataStore b;
    public final UserProfileDetailsProvider c;
    public final ProductUtils d;
    public final CityProvider e;
    public final AnalyticsContract f;

    public MandatoryFirstHistoryCallGuardImpl(LocalDataStore localDataStore, UserProfileDetailsProvider userProfileDetailsProvider, ProductUtils productUtils, CityProvider cityProvider, AnalyticsContract analyticsContract) {
        this.b = localDataStore;
        this.c = userProfileDetailsProvider;
        this.d = productUtils;
        this.e = cityProvider;
        this.f = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.MandatoryFirstHistoryCallGuard
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        MandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1 mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1;
        if (continuationImpl instanceof MandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1) {
            mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1 = (MandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1) continuationImpl;
            int i = mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1 = new MandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1(this, continuationImpl);
            }
        } else {
            mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1 = new MandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1(this, continuationImpl);
        }
        Object obj = mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (z) {
                MandatoryFirstHistoryCallGuard.f2839a.getClass();
                Preferences.Key key = MandatoryFirstHistoryCallGuard.Companion.b;
                Boolean bool = Boolean.FALSE;
                mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1.label = 1;
                if (this.b.g(key, bool, mandatoryFirstHistoryCallGuardImpl$markHistoryCallStatus$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.f.a(MapsKt.h(new Pair("migrationRequired", "false")));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[PHI: r12
      0x00c6: PHI (r12v24 java.lang.Object) = (r12v22 java.lang.Object), (r12v1 java.lang.Object) binds: [B:47:0x00c3, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.MandatoryFirstHistoryCallGuard
    public final Object b(Continuation continuation) {
        MandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1 mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1;
        CityAppModel cityAppModel;
        boolean zB;
        Object objG;
        Object objC;
        if (continuation instanceof MandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1) {
            mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1 = (MandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1) continuation;
            int i = mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = i - Integer.MIN_VALUE;
            } else {
                mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1 = new MandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1(this, continuation);
            }
        } else {
            mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1 = new MandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1(this, continuation);
        }
        Object objC2 = mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label;
        Object obj2 = Unit.f17538a;
        MandatoryFirstHistoryCallGuard.Companion companion = MandatoryFirstHistoryCallGuard.f2839a;
        LocalDataStore localDataStore = this.b;
        if (i2 == 0) {
            ResultKt.b(objC2);
            mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 1;
            objC2 = c(mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
            if (objC2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objC2);
        } else {
            if (i2 == 2) {
                ResultKt.b(objC2);
                mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 3;
                cityAppModel = (CityAppModel) this.e.b().getValue();
                if (cityAppModel == null) {
                    objC2 = Boolean.TRUE;
                } else {
                    ChaloTransitMode chaloTransitMode = ChaloTransitMode.BUS;
                    zB = ProductUtils.b(chaloTransitMode, cityAppModel);
                    boolean zC = CityAppModelKt.c(ChaloTransitMode.METRO, cityAppModel);
                    boolean zC2 = CityAppModelKt.c(chaloTransitMode, cityAppModel);
                    if (!zB || zC || zC2) {
                        objC2 = Boolean.TRUE;
                    } else {
                        objC2 = this.d.a(cityAppModel, mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                    }
                }
                if (objC2 != obj) {
                    if (((Boolean) objC2).booleanValue()) {
                        mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 4;
                        companion.getClass();
                        objG = localDataStore.g(MandatoryFirstHistoryCallGuard.Companion.b, Boolean.FALSE, mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                        if (objG == obj) {
                            obj2 = objG;
                        }
                        if (obj2 != obj) {
                        }
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                ResultKt.b(objC2);
                if (((Boolean) objC2).booleanValue()) {
                    mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 4;
                    companion.getClass();
                    objG = localDataStore.g(MandatoryFirstHistoryCallGuard.Companion.b, Boolean.FALSE, mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                    if (objG == obj) {
                        obj2 = objG;
                    }
                    if (obj2 != obj) {
                    }
                }
                return obj;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC2);
                return objC2;
            }
            ResultKt.b(objC2);
        }
        mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 5;
        objC = c(mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
        if (objC == obj) {
            return obj;
        }
        return objC;
        if (!((Boolean) objC2).booleanValue()) {
            return Boolean.FALSE;
        }
        if (((Boolean) this.c.g().getValue()).booleanValue()) {
            mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 3;
            cityAppModel = (CityAppModel) this.e.b().getValue();
            if (cityAppModel == null) {
                objC2 = Boolean.TRUE;
            } else {
                ChaloTransitMode chaloTransitMode2 = ChaloTransitMode.BUS;
                zB = ProductUtils.b(chaloTransitMode2, cityAppModel);
                boolean zC3 = CityAppModelKt.c(ChaloTransitMode.METRO, cityAppModel);
                boolean zC4 = CityAppModelKt.c(chaloTransitMode2, cityAppModel);
                if (zB) {
                    objC2 = Boolean.TRUE;
                } else {
                    objC2 = Boolean.TRUE;
                }
            }
            if (objC2 != obj) {
                if (((Boolean) objC2).booleanValue()) {
                    mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 5;
                    objC = c(mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                    if (objC == obj) {
                        return objC;
                    }
                } else {
                    mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 4;
                    companion.getClass();
                    objG = localDataStore.g(MandatoryFirstHistoryCallGuard.Companion.b, Boolean.FALSE, mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                    if (objG == obj) {
                        obj2 = objG;
                    }
                    if (obj2 != obj) {
                        mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 5;
                        objC = c(mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                        if (objC == obj) {
                            return objC;
                        }
                    }
                }
            }
        } else {
            mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 2;
            companion.getClass();
            Object objG2 = localDataStore.g(MandatoryFirstHistoryCallGuard.Companion.b, Boolean.FALSE, mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
            if (objG2 != obj) {
                objG2 = obj2;
            }
            if (objG2 != obj) {
                mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 3;
                cityAppModel = (CityAppModel) this.e.b().getValue();
                if (cityAppModel == null) {
                    objC2 = Boolean.TRUE;
                } else {
                    ChaloTransitMode chaloTransitMode3 = ChaloTransitMode.BUS;
                    zB = ProductUtils.b(chaloTransitMode3, cityAppModel);
                    boolean zC5 = CityAppModelKt.c(ChaloTransitMode.METRO, cityAppModel);
                    boolean zC6 = CityAppModelKt.c(chaloTransitMode3, cityAppModel);
                    if (zB) {
                        objC2 = Boolean.TRUE;
                    } else {
                        objC2 = Boolean.TRUE;
                    }
                }
                if (objC2 != obj) {
                    if (((Boolean) objC2).booleanValue()) {
                        mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 4;
                        companion.getClass();
                        objG = localDataStore.g(MandatoryFirstHistoryCallGuard.Companion.b, Boolean.FALSE, mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                        if (objG == obj) {
                            obj2 = objG;
                        }
                        if (obj2 != obj) {
                            mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 5;
                            objC = c(mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                            if (objC == obj) {
                                return objC;
                            }
                        }
                    } else {
                        mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1.label = 5;
                        objC = c(mandatoryFirstHistoryCallGuardImpl$requireMandatoryHistoryCall$1);
                        if (objC == obj) {
                            return objC;
                        }
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        MandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1 mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1;
        if (continuationImpl instanceof MandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1) {
            mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1 = (MandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1) continuationImpl;
            int i = mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1.label = i - Integer.MIN_VALUE;
            } else {
                mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1 = new MandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1(this, continuationImpl);
            }
        } else {
            mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1 = new MandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1(this, continuationImpl);
        }
        Object objV = mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            MandatoryFirstHistoryCallGuard.f2839a.getClass();
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.b.e(MandatoryFirstHistoryCallGuard.Companion.b);
            mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, mandatoryFirstHistoryCallGuardImpl$shouldWaitForFirstHistoryCall$1);
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
        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
    }
}
