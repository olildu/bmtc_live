package app.chalo.domain;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.features.boostratings.IBoostRatingsFeature;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import app.chalo.utils.SystemHelper;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/domain/FireAppOpenEventIfRequiredUseCase;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FireAppOpenEventIfRequiredUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f2488a;
    public final LocalDataStore b;
    public final IBoostRatingsFeature c;
    public final ChaloTimeProvider d;
    public final SystemHelper e;
    public final BasicInfoContract f;
    public final CoroutineContextProvider g;
    public final UserProfilingHooksRuleEngine h;
    public final ContextScope i;
    public boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/domain/FireAppOpenEventIfRequiredUseCase$Companion;", "", "", "APP_OPEN_EVENT_SOURCE", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FireAppOpenEventIfRequiredUseCase(AnalyticsContract analyticsContract, LocalDataStore localDataStore, IBoostRatingsFeature iBoostRatingsFeature, ChaloTimeProvider chaloTimeProvider, SystemHelper systemHelper, BasicInfoContract basicInfoContract, CoroutineContextProvider coroutineContextProvider, UserProfilingHooksRuleEngine userProfilingHooksRuleEngine) {
        this.f2488a = analyticsContract;
        this.b = localDataStore;
        this.c = iBoostRatingsFeature;
        this.d = chaloTimeProvider;
        this.e = systemHelper;
        this.f = basicInfoContract;
        this.g = coroutineContextProvider;
        this.h = userProfilingHooksRuleEngine;
        this.i = CoroutineScopeKt.a(coroutineContextProvider.getDefault());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object a(FireAppOpenEventIfRequiredUseCase fireAppOpenEventIfRequiredUseCase, String str, ContinuationImpl continuationImpl) {
        FireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1 fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1;
        String str2;
        String str3;
        String str4 = str;
        fireAppOpenEventIfRequiredUseCase.getClass();
        if (continuationImpl instanceof FireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) {
            fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1 = (FireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) continuationImpl;
            int i = fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1 = new FireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1(fireAppOpenEventIfRequiredUseCase, continuationImpl);
            }
        } else {
            fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1 = new FireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1(fireAppOpenEventIfRequiredUseCase, continuationImpl);
        }
        Object obj = fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!fireAppOpenEventIfRequiredUseCase.j) {
                fireAppOpenEventIfRequiredUseCase.f2488a.e("app open", str4 == null ? "" : str4, MapsKt.i(new Pair("isChaloConfigMigrated", Boolean.TRUE), new Pair("src", "onboarding")), AnalyticsFrequency.Always.b, true);
                fireAppOpenEventIfRequiredUseCase.j = true;
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0 = str4;
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label = 1;
                if (fireAppOpenEventIfRequiredUseCase.d(fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) != obj2) {
                }
                return obj2;
            }
            return unit;
        }
        if (i2 == 1) {
            str4 = (String) fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i2 == 2) {
                str4 = (String) fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0;
                ResultKt.b(obj);
                if (str4 == null) {
                    str2 = "";
                } else {
                    str2 = str4;
                }
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0 = str4;
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label = 3;
                if (fireAppOpenEventIfRequiredUseCase.b(str2, fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) != obj2) {
                }
                return obj2;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            str4 = (String) fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0;
            ResultKt.b(obj);
        }
        str3 = str4 != null ? str4 : "";
        fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0 = null;
        fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label = 4;
        if (fireAppOpenEventIfRequiredUseCase.c(str3, fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) != obj2) {
            return obj2;
        }
        return unit;
        UserProfilingHooksRuleEngine userProfilingHooksRuleEngine = fireAppOpenEventIfRequiredUseCase.h;
        fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0 = str4;
        fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label = 2;
        if (userProfilingHooksRuleEngine.c(fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) != obj2) {
            if (str4 == null) {
                str2 = "";
            } else {
                str2 = str4;
            }
            fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0 = str4;
            fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label = 3;
            if (fireAppOpenEventIfRequiredUseCase.b(str2, fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) != obj2) {
                if (str4 != null) {
                }
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.L$0 = null;
                fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1.label = 4;
                if (fireAppOpenEventIfRequiredUseCase.c(str3, fireAppOpenEventIfRequiredUseCase$fireAppOpenEventIfRequired$1) != obj2) {
                    return unit;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        FireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1 fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1;
        String str2;
        Long l;
        boolean zBooleanValue;
        AnalyticsContract analyticsContract;
        if (continuationImpl instanceof FireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1) {
            fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1 = (FireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1) continuationImpl;
            int i = fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1 = new FireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1(this, continuationImpl);
            }
        } else {
            fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1 = new FireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1(this, continuationImpl);
        }
        Object objB = fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.label;
        ChaloTimeProvider chaloTimeProvider = this.d;
        if (i2 == 0) {
            ResultKt.b(objB);
            fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.L$0 = str;
            fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.label = 1;
            objB = chaloTimeProvider.b(fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = (Long) fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.L$1;
            String str3 = (String) fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.L$0;
            ResultKt.b(objB);
            str2 = str3;
        }
        zBooleanValue = ((Boolean) objB).booleanValue();
        analyticsContract = this.f2488a;
        if (zBooleanValue || l == null) {
            AnalyticsContractImplKt.b(analyticsContract, "chaloTime not available", Source.SPLASH_SCREEN, null, false, 28);
        } else {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "chaloTime available", str2, MapsKt.h(new Pair("difference", new Long(l.longValue() - this.e.j()))), null, false, 24);
        }
        return Unit.f17538a;
        Long l2 = (Long) objB;
        fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.L$0 = str;
        fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.L$1 = l2;
        fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1.label = 2;
        Object objC = chaloTimeProvider.c(fireAppOpenEventIfRequiredUseCase$checkAndRaiseChaloTimeAvailabilityEvent$1);
        if (objC != coroutineSingletons) {
            str2 = str;
            l = l2;
            objB = objC;
            zBooleanValue = ((Boolean) objB).booleanValue();
            analyticsContract = this.f2488a;
            if (zBooleanValue) {
                AnalyticsContractImplKt.b(analyticsContract, "chaloTime not available", Source.SPLASH_SCREEN, null, false, 28);
            } else {
                AnalyticsContractImplKt.b(analyticsContract, "chaloTime not available", Source.SPLASH_SCREEN, null, false, 28);
            }
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        FireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1 fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1;
        String strValueOf;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (continuationImpl instanceof FireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1) {
            fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1 = (FireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1) continuationImpl;
            int i = fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1 = new FireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1(this, continuationImpl);
            }
        } else {
            fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1 = new FireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1(this, continuationImpl);
        }
        Object objV = fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label;
        AnalyticsContract analyticsContract = this.f2488a;
        LocalDataStore localDataStore = this.b;
        if (i2 == 0) {
            ResultKt.b(objV);
            strValueOf = String.valueOf(this.f.h());
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = localDataStore.e(PreferencesKeys.stringKey("keyCachedAppVersionCode"));
            str2 = str;
            fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0 = str2;
            fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1 = strValueOf;
            fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            strValueOf = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1;
            str2 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0;
            ResultKt.b(objV);
        } else {
            if (i2 == 2) {
                String str7 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$2;
                String str8 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1;
                str2 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0;
                ResultKt.b(objV);
                str3 = str7;
                strValueOf = str8;
                if (str3 != null || str3.length() == 0) {
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0 = str2;
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1 = strValueOf;
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$2 = str3;
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label = 3;
                    if (localDataStore.h("installStatus", "freshInstall", fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1) != coroutineSingletons) {
                        str4 = str3;
                        str5 = str2;
                        AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo app updated or installed", str5, vo1.s("current app version", strValueOf), null, false, 24);
                        str6 = strValueOf;
                    }
                } else {
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0 = strValueOf;
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1 = str3;
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$2 = null;
                    fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label = 4;
                    if (localDataStore.h("installStatus", "existingInstall", fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1) != coroutineSingletons) {
                        str4 = str3;
                        str6 = strValueOf;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                str4 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$2;
                strValueOf = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1;
                String str9 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0;
                ResultKt.b(objV);
                str5 = str9;
                AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo app updated or installed", str5, vo1.s("current app version", strValueOf), null, false, 24);
                str6 = strValueOf;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1;
                str6 = (String) fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0;
                ResultKt.b(objV);
            }
        }
        if (!StringsKt.x(str6, str4, true)) {
            AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo app updated", Source.SPLASH_SCREEN.getSourceName(), MapsKt.i(new Pair("previous app version", String.valueOf(str4)), new Pair("current app version", str6)), null, false, 24);
        }
        return Unit.f17538a;
        str3 = (String) objV;
        fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0 = str2;
        fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1 = strValueOf;
        fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$2 = str3;
        fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label = 2;
        if (localDataStore.h("keyCachedAppVersionCode", strValueOf, fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1) != coroutineSingletons) {
            if (str3 != null) {
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0 = str2;
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1 = strValueOf;
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$2 = str3;
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label = 3;
                if (localDataStore.h("installStatus", "freshInstall", fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1) != coroutineSingletons) {
                    str4 = str3;
                    str5 = str2;
                    AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo app updated or installed", str5, vo1.s("current app version", strValueOf), null, false, 24);
                }
            } else {
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$0 = str2;
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$1 = strValueOf;
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.L$2 = str3;
                fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1.label = 3;
                if (localDataStore.h("installStatus", "freshInstall", fireAppOpenEventIfRequiredUseCase$checkIfAppUpdatedAndFireEvent$1) != coroutineSingletons) {
                    str4 = str3;
                    str5 = str2;
                    AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo app updated or installed", str5, vo1.s("current app version", strValueOf), null, false, 24);
                }
            }
            str6 = strValueOf;
            if (!StringsKt.x(str6, str4, true)) {
                AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo app updated", Source.SPLASH_SCREEN.getSourceName(), MapsKt.i(new Pair("previous app version", String.valueOf(str4)), new Pair("current app version", str6)), null, false, 24);
            }
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r11.c.c(r2, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof app.chalo.domain.FireAppOpenEventIfRequiredUseCase$incrementAppSessionCount$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.domain.FireAppOpenEventIfRequiredUseCase$incrementAppSessionCount$1 r0 = (app.chalo.domain.FireAppOpenEventIfRequiredUseCase$incrementAppSessionCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.domain.FireAppOpenEventIfRequiredUseCase$incrementAppSessionCount$1 r0 = new app.chalo.domain.FireAppOpenEventIfRequiredUseCase$incrementAppSessionCount$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "appSessionCount"
            app.chalo.datastore.LocalDataStore r4 = r11.b
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L43
            if (r2 == r7) goto L3f
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            kotlin.ResultKt.b(r12)
            goto L80
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L39:
            long r2 = r0.J$0
            kotlin.ResultKt.b(r12)
            goto L75
        L3f:
            kotlin.ResultKt.b(r12)
            goto L57
        L43:
            kotlin.ResultKt.b(r12)
            androidx.datastore.preferences.core.Preferences$Key r12 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r3)
            app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 r12 = r4.e(r12)
            r0.label = r7
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.v(r12, r0)
            if (r12 != r1) goto L57
            goto L7f
        L57:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L60
            long r7 = java.lang.Long.parseLong(r12)
            goto L62
        L60:
            r7 = 0
        L62:
            r9 = 1
            long r7 = r7 + r9
            java.lang.String r12 = java.lang.String.valueOf(r7)
            r0.J$0 = r7
            r0.label = r6
            java.lang.Object r12 = r4.h(r3, r12, r0)
            if (r12 != r1) goto L74
            goto L7f
        L74:
            r2 = r7
        L75:
            r0.label = r5
            app.chalo.features.boostratings.IBoostRatingsFeature r12 = r11.c
            java.lang.Object r12 = r12.c(r2, r0)
            if (r12 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.domain.FireAppOpenEventIfRequiredUseCase.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void e(String str) {
        BuildersKt.d(this.i, null, null, new FireAppOpenEventIfRequiredUseCase$invoke$1(this, str, null), 3);
    }
}
