package app.chalo.features.boostratings;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.contract.ProductInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getAllKeys$$inlined$map$1;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.SystemHelper;
import defpackage.m3;
import defpackage.vb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/boostratings/BoostRatingsFeatureImpl;", "Lapp/chalo/features/boostratings/IBoostRatingsFeature;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BoostRatingsFeatureImpl implements IBoostRatingsFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f2628a;
    public final LocalDataStore b;
    public final ChaloConfigFeature c;
    public final CrashlyticsLogger d;
    public final SystemHelper e;
    public final UserProfileDetailsProvider f;
    public final ProductInfoContract g;
    public final CityProvider h;
    public Set i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/features/boostratings/BoostRatingsFeatureImpl$Companion;", "", "", "SESSION_DATA_STORE", "Ljava/lang/String;", "LEGACY_SESSION_STORE_NAME", "BOOST_RATINGS_REMIND_LATER_TS", "BOOST_RATINGS_ASKED", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public BoostRatingsFeatureImpl(LocalDataStore localDataStore, LocalDataStore localDataStore2, ChaloConfigFeature chaloConfigFeature, CrashlyticsLogger crashlyticsLogger, SystemHelper systemHelper, UserProfileDetailsProvider userProfileDetailsProvider, ProductInfoContract productInfoContract, CityProvider cityProvider) {
        this.f2628a = localDataStore;
        this.b = localDataStore2;
        this.c = chaloConfigFeature;
        this.d = crashlyticsLogger;
        this.e = systemHelper;
        this.f = userProfileDetailsProvider;
        this.g = productInfoContract;
        this.h = cityProvider;
    }

    @Override // app.chalo.features.boostratings.IBoostRatingsFeature
    public final Object a(Continuation continuation) {
        Object objG = this.b.g(PreferencesKeys.stringKey("boostRatingsRemindLaterTS"), String.valueOf(this.e.j()), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088 A[PHI: r9 r11
      0x0088: PHI (r9v4 int) = (r9v3 int), (r9v9 int) binds: [B:35:0x0085, B:20:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v1 java.lang.Object) binds: [B:35:0x0085, B:20:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.boostratings.IBoostRatingsFeature
    public final Object b(CityAppModel cityAppModel, int i, ContinuationImpl continuationImpl) {
        BoostRatingsFeatureImpl$shouldAskForPositiveRatings$1 boostRatingsFeatureImpl$shouldAskForPositiveRatings$1;
        int i2;
        Object objH;
        if (continuationImpl instanceof BoostRatingsFeatureImpl$shouldAskForPositiveRatings$1) {
            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1 = (BoostRatingsFeatureImpl$shouldAskForPositiveRatings$1) continuationImpl;
            int i3 = boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = i3 - Integer.MIN_VALUE;
            } else {
                boostRatingsFeatureImpl$shouldAskForPositiveRatings$1 = new BoostRatingsFeatureImpl$shouldAskForPositiveRatings$1(this, continuationImpl);
            }
        } else {
            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1 = new BoostRatingsFeatureImpl$shouldAskForPositiveRatings$1(this, continuationImpl);
        }
        Object objG = boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label;
        boolean z = true;
        if (i4 == 0) {
            ResultKt.b(objG);
            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0 = i;
            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 1;
            objG = g(cityAppModel, boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
            if (objG != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            i = boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0;
            ResultKt.b(objG);
        } else {
            if (i4 == 2) {
                i2 = boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0;
                ResultKt.b(objG);
                if (!((Boolean) objG).booleanValue()) {
                    boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0 = i2;
                    boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 3;
                    objG = f(boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
                    if (objG != obj) {
                        if (((Boolean) objG).booleanValue()) {
                            z = false;
                        } else {
                            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0 = i2;
                            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 4;
                            objG = i(boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
                            if (objG != obj) {
                            }
                        }
                    }
                    return obj;
                }
                z = false;
                return Boolean.valueOf(z);
            }
            if (i4 == 3) {
                i2 = boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0;
                ResultKt.b(objG);
                if (((Boolean) objG).booleanValue()) {
                    boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0 = i2;
                    boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 4;
                    objG = i(boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
                    if (objG != obj) {
                    }
                    return obj;
                }
                z = false;
                return Boolean.valueOf(z);
            }
            if (i4 != 4) {
                if (i4 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objG);
                return objG;
            }
            i2 = boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0;
            ResultKt.b(objG);
        }
        if (!((Boolean) objG).booleanValue()) {
            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 5;
            objH = h(i2, boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
            if (objH != obj) {
                return obj;
            }
            return objH;
        }
        return Boolean.valueOf(z);
        if (!((Boolean) objG).booleanValue()) {
            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0 = i;
            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 2;
            objG = k(boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
            if (objG != obj) {
                i2 = i;
                if (!((Boolean) objG).booleanValue()) {
                    boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0 = i2;
                    boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 3;
                    objG = f(boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
                    if (objG != obj) {
                        if (((Boolean) objG).booleanValue()) {
                            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.I$0 = i2;
                            boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 4;
                            objG = i(boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
                            if (objG != obj) {
                                if (!((Boolean) objG).booleanValue()) {
                                    boostRatingsFeatureImpl$shouldAskForPositiveRatings$1.label = 5;
                                    objH = h(i2, boostRatingsFeatureImpl$shouldAskForPositiveRatings$1);
                                    if (objH != obj) {
                                        return objH;
                                    }
                                }
                            }
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
            }
            return obj;
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (j(r0) == r1) goto L21;
     */
    @Override // app.chalo.features.boostratings.IBoostRatingsFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.features.boostratings.BoostRatingsFeatureImpl$addSession$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.features.boostratings.BoostRatingsFeatureImpl$addSession$1 r0 = (app.chalo.features.boostratings.BoostRatingsFeatureImpl$addSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.features.boostratings.BoostRatingsFeatureImpl$addSession$1 r0 = new app.chalo.features.boostratings.BoostRatingsFeatureImpl$addSession$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r8)
            goto L56
        L36:
            kotlin.ResultKt.b(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            androidx.datastore.preferences.core.Preferences$Key r6 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r6)
            app.chalo.utils.SystemHelper r7 = r5.e
            long r7 = r7.j()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.label = r4
            app.chalo.datastore.LocalDataStore r8 = r5.f2628a
            java.lang.Object r6 = r8.g(r6, r7, r0)
            if (r6 != r1) goto L56
            goto L5e
        L56:
            r0.label = r3
            java.lang.Object r6 = r5.j(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.boostratings.BoostRatingsFeatureImpl.c(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r3.c(r7, r0) == r1) goto L21;
     */
    @Override // app.chalo.features.boostratings.IBoostRatingsFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.features.boostratings.BoostRatingsFeatureImpl$markBoostRatingsAsked$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.features.boostratings.BoostRatingsFeatureImpl$markBoostRatingsAsked$1 r0 = (app.chalo.features.boostratings.BoostRatingsFeatureImpl$markBoostRatingsAsked$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.features.boostratings.BoostRatingsFeatureImpl$markBoostRatingsAsked$1 r0 = new app.chalo.features.boostratings.BoostRatingsFeatureImpl$markBoostRatingsAsked$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.datastore.LocalDataStore r3 = r6.b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.b(r7)
            goto L4d
        L38:
            kotlin.ResultKt.b(r7)
            java.lang.String r7 = "boostRatingsAsked"
            androidx.datastore.preferences.core.Preferences$Key r7 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r7)
            r0.label = r5
            java.lang.String r2 = "true"
            java.lang.Object r7 = r3.g(r7, r2, r0)
            if (r7 != r1) goto L4d
            goto L5f
        L4d:
            java.lang.String r7 = "boostRatingsRemindLaterTS"
            androidx.datastore.preferences.core.Preferences$Key r7 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r7)
            java.util.List r7 = kotlin.collections.CollectionsKt.R(r7)
            r0.label = r4
            java.lang.Object r7 = r3.c(r7, r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.boostratings.BoostRatingsFeatureImpl.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        BoostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1 boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1;
        long j;
        if (continuationImpl instanceof BoostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1) {
            boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1 = (BoostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1) continuationImpl;
            int i = boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1.label = i - Integer.MIN_VALUE;
            } else {
                boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1 = new BoostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1(this, continuationImpl);
            }
        } else {
            boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1 = new BoostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1(this, continuationImpl);
        }
        Object objE = boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            long j2 = 86400000;
            boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1.J$0 = j2;
            boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1.label = 1;
            objE = this.c.e("sessionLastDaysThresholdForBoostRatings", boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = boostRatingsFeatureImpl$getSessionLastDaysThresholdInMillis$1.J$0;
            ResultKt.b(objE);
        }
        return new Long(((Number) objE).longValue() * j);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ContinuationImpl continuationImpl) {
        BoostRatingsFeatureImpl$hasPendingReminders$1 boostRatingsFeatureImpl$hasPendingReminders$1;
        Long lT0;
        long j;
        long j2;
        if (continuationImpl instanceof BoostRatingsFeatureImpl$hasPendingReminders$1) {
            boostRatingsFeatureImpl$hasPendingReminders$1 = (BoostRatingsFeatureImpl$hasPendingReminders$1) continuationImpl;
            int i = boostRatingsFeatureImpl$hasPendingReminders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostRatingsFeatureImpl$hasPendingReminders$1.label = i - Integer.MIN_VALUE;
            } else {
                boostRatingsFeatureImpl$hasPendingReminders$1 = new BoostRatingsFeatureImpl$hasPendingReminders$1(this, continuationImpl);
            }
        } else {
            boostRatingsFeatureImpl$hasPendingReminders$1 = new BoostRatingsFeatureImpl$hasPendingReminders$1(this, continuationImpl);
        }
        Object objV = boostRatingsFeatureImpl$hasPendingReminders$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = boostRatingsFeatureImpl$hasPendingReminders$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.b.e(PreferencesKeys.stringKey("boostRatingsRemindLaterTS"));
            boostRatingsFeatureImpl$hasPendingReminders$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, boostRatingsFeatureImpl$hasPendingReminders$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objV);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = boostRatingsFeatureImpl$hasPendingReminders$1.J$1;
            j2 = boostRatingsFeatureImpl$hasPendingReminders$1.J$0;
            ResultKt.b(objV);
        }
        boolean z = j2 < ((Number) objV).longValue() + j;
        return Boolean.valueOf(z);
        String str = (String) objV;
        if (str == null || (lT0 = StringsKt.t0(str)) == null) {
            return Boolean.FALSE;
        }
        long jLongValue = lT0.longValue();
        SystemHelper systemHelper = this.e;
        if (systemHelper.j() > jLongValue) {
            long j3 = systemHelper.j();
            boostRatingsFeatureImpl$hasPendingReminders$1.J$0 = j3;
            boostRatingsFeatureImpl$hasPendingReminders$1.J$1 = jLongValue;
            boostRatingsFeatureImpl$hasPendingReminders$1.label = 2;
            objV = this.c.e("nextReminderDurationForBoostRatings", boostRatingsFeatureImpl$hasPendingReminders$1);
            if (objV != coroutineSingletons) {
                j = jLongValue;
                j2 = j3;
                if (j2 < ((Number) objV).longValue() + j) {
                }
            }
            return coroutineSingletons;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(CityAppModel cityAppModel, ContinuationImpl continuationImpl) {
        BoostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1 boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1;
        String str;
        Set set;
        if (continuationImpl instanceof BoostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1) {
            boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1 = (BoostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1) continuationImpl;
            int i = boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.label = i - Integer.MIN_VALUE;
            } else {
                boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1 = new BoostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1(this, continuationImpl);
            }
        } else {
            boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1 = new BoostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1(this, continuationImpl);
        }
        Object obj = boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if ((cityAppModel != null ? cityAppModel.f8854a : null) == null) {
                return Boolean.TRUE;
            }
            String lowerCase = cityAppModel.f8854a.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            Set set2 = this.i;
            if (set2 != null) {
                return Boolean.valueOf(set2.contains(lowerCase));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.L$0 = lowerCase;
            boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.L$1 = linkedHashSet;
            boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.label = 1;
            Object objA = this.c.a("cityListForBoostRatingsDisabled", boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = lowerCase;
            set = linkedHashSet;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.L$1;
            str = (String) boostRatingsFeatureImpl$isBoostRatingsFeatureDisabledForCity$1.L$0;
            ResultKt.b(obj);
        }
        String str2 = (String) obj;
        if (str2.length() == 0) {
            return Boolean.FALSE;
        }
        try {
            JsonArray jsonArrayF = JsonElementKt.f(ChaloJson.b.f(str2));
            int size = jsonArrayF.f18186a.size();
            for (int i3 = 0; i3 < size; i3++) {
                String strK = JsonElementExtensionsKt.k(jsonArrayF, i3);
                if (strK != null && strK.length() != 0) {
                    set.add(strK);
                }
            }
        } catch (Exception e) {
            this.d.i(e);
        }
        this.i = set;
        return Boolean.valueOf(set.contains(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(int i, ContinuationImpl continuationImpl) {
        BoostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1 boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1;
        long j;
        if (continuationImpl instanceof BoostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1) {
            boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1 = (BoostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1) continuationImpl;
            int i2 = boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1.label = i2 - Integer.MIN_VALUE;
            } else {
                boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1 = new BoostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1(this, continuationImpl);
            }
        } else {
            boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1 = new BoostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1(this, continuationImpl);
        }
        Object obj = boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1.label;
        boolean z = false;
        if (i3 == 0) {
            ResultKt.b(obj);
            boolean zBooleanValue = ((Boolean) this.f.g().getValue()).booleanValue();
            CityAppModel cityAppModel = (CityAppModel) this.h.getE().getValue();
            if (cityAppModel == null) {
                return Boolean.FALSE;
            }
            boolean zA = this.g.a(ChaloTransitMode.BUS, cityAppModel);
            if (zBooleanValue && zA) {
                long j2 = i;
                boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1.J$0 = j2;
                boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1.label = 1;
                Object objE = this.c.e("txnThresholdForBoostRatings", boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objE;
                j = j2;
            }
            return Boolean.valueOf(z);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = boostRatingsFeatureImpl$isLoyalUserBasedOnBookings$1.J$0;
        ResultKt.b(obj);
        if (j >= ((Number) obj).longValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ContinuationImpl continuationImpl) {
        BoostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1 boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1;
        long jLongValue;
        Map map;
        ArrayList arrayList;
        long jLongValue2;
        List list;
        long j;
        Long lT0;
        if (continuationImpl instanceof BoostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1) {
            boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1 = (BoostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1) continuationImpl;
            int i = boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.label = i - Integer.MIN_VALUE;
            } else {
                boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1 = new BoostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1(this, continuationImpl);
            }
        } else {
            boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1 = new BoostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1(this, continuationImpl);
        }
        Object objE = boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objE);
            boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.label = 1;
            objE = this.c.e("sessionCountThresholdForBoostRatings", boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1);
            if (objE != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objE);
        } else {
            if (i2 == 2) {
                jLongValue = boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.J$0;
                ResultKt.b(objE);
                map = (Map) objE;
                if (map == null) {
                    return Boolean.FALSE;
                }
                if (map.size() != ((int) jLongValue)) {
                    return Boolean.FALSE;
                }
                arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    lT0 = StringsKt.t0((String) entry.getKey());
                    Long lT1 = StringsKt.t0(entry.getValue().toString());
                    if (lT0 == null && lT1 != null) {
                        arrayList.add(new Pair(lT0, lT1));
                    }
                }
                CollectionsKt.t0(arrayList, new vb(new m3(13), 2));
                if (jLongValue != 0 && jLongValue != 1) {
                    jLongValue2 = ((Number) ((Pair) CollectionsKt.F(arrayList)).e()).longValue();
                    boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.L$0 = arrayList;
                    boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.J$0 = jLongValue2;
                    boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.label = 3;
                    objE = e(boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1);
                    if (objE != obj) {
                        list = arrayList;
                        j = jLongValue2;
                    }
                    return obj;
                }
                return Boolean.valueOf(z);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.J$0;
            list = (List) boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.L$0;
            ResultKt.b(objE);
        }
        if (((Number) objE).longValue() + j < ((Number) ((Pair) CollectionsKt.P(list)).e()).longValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
        jLongValue = ((Number) objE).longValue();
        boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.J$0 = jLongValue;
        boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.label = 2;
        objE = this.f2628a.d(boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1);
        if (objE != obj) {
            map = (Map) objE;
            if (map == null) {
                return Boolean.FALSE;
            }
            if (map.size() != ((int) jLongValue)) {
                return Boolean.FALSE;
            }
            arrayList = new ArrayList();
            while (r11.hasNext()) {
                lT0 = StringsKt.t0((String) entry.getKey());
                Long lT2 = StringsKt.t0(entry.getValue().toString());
                if (lT0 == null) {
                }
            }
            CollectionsKt.t0(arrayList, new vb(new m3(13), 2));
            if (jLongValue != 0) {
                jLongValue2 = ((Number) ((Pair) CollectionsKt.F(arrayList)).e()).longValue();
                boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.L$0 = arrayList;
                boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.J$0 = jLongValue2;
                boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1.label = 3;
                objE = e(boostRatingsFeatureImpl$isLoyalUserBasedOnSessions$1);
                if (objE != obj) {
                    list = arrayList;
                    j = jLongValue2;
                    if (((Number) objE).longValue() + j < ((Number) ((Pair) CollectionsKt.P(list)).e()).longValue()) {
                        z = false;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00df A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0035, B:45:0x00df, B:47:0x00e7, B:21:0x0049, B:34:0x0076, B:36:0x0088, B:37:0x009b, B:39:0x00a1, B:42:0x00c1, B:43:0x00ca, B:22:0x004d, B:28:0x005e, B:31:0x0065, B:25:0x0054), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0035, B:45:0x00df, B:47:0x00e7, B:21:0x0049, B:34:0x0076, B:36:0x0088, B:37:0x009b, B:39:0x00a1, B:42:0x00c1, B:43:0x00ca, B:22:0x004d, B:28:0x005e, B:31:0x0065, B:25:0x0054), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e5 -> B:50:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0109 -> B:50:0x010c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.boostratings.BoostRatingsFeatureImpl.j(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(ContinuationImpl continuationImpl) {
        BoostRatingsFeatureImpl$wasAskedBefore$1 boostRatingsFeatureImpl$wasAskedBefore$1;
        Object next;
        if (continuationImpl instanceof BoostRatingsFeatureImpl$wasAskedBefore$1) {
            boostRatingsFeatureImpl$wasAskedBefore$1 = (BoostRatingsFeatureImpl$wasAskedBefore$1) continuationImpl;
            int i = boostRatingsFeatureImpl$wasAskedBefore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                boostRatingsFeatureImpl$wasAskedBefore$1.label = i - Integer.MIN_VALUE;
            } else {
                boostRatingsFeatureImpl$wasAskedBefore$1 = new BoostRatingsFeatureImpl$wasAskedBefore$1(this, continuationImpl);
            }
        } else {
            boostRatingsFeatureImpl$wasAskedBefore$1 = new BoostRatingsFeatureImpl$wasAskedBefore$1(this, continuationImpl);
        }
        Object objV = boostRatingsFeatureImpl$wasAskedBefore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = boostRatingsFeatureImpl$wasAskedBefore$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getAllKeys$$inlined$map$1 localDataStore$getAllKeys$$inlined$map$1 = new LocalDataStore$getAllKeys$$inlined$map$1(this.b.f2414a.getData());
            boostRatingsFeatureImpl$wasAskedBefore$1.label = 1;
            objV = FlowKt.v(localDataStore$getAllKeys$$inlined$map$1, boostRatingsFeatureImpl$wasAskedBefore$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Iterable iterable = (List) objV;
        if (iterable == null) {
            iterable = EmptyList.f17557a;
        }
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((Preferences.Key) next).getName(), "boostRatingsAsked"));
        return Boolean.valueOf(next != null);
    }
}
