package app.chalo.base;

import app.chalo.Device;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ModeMapInfoAppModel;
import app.chalo.utils.SystemHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/base/BasicInfoContractImpl;", "Lapp/chalo/contract/BasicInfoContract;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BasicInfoContractImpl implements BasicInfoContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Device f995a;
    public final SystemHelper b;
    public final ChaloBuildConfig c;
    public final ChaloTimeProvider d;
    public final PermissionHandlerProvider e;
    public final int f;
    public final String g;

    public BasicInfoContractImpl(Device device, SystemHelper systemHelper, ChaloBuildConfig chaloBuildConfig, ChaloTimeProvider chaloTimeProvider, PermissionHandlerProvider permissionHandlerProvider) {
        this.f995a = device;
        this.b = systemHelper;
        this.c = chaloBuildConfig;
        this.d = chaloTimeProvider;
        this.e = permissionHandlerProvider;
        this.f = chaloBuildConfig.b();
        this.g = chaloBuildConfig.j();
    }

    @Override // app.chalo.contract.BasicInfoContract
    public final boolean a(ChaloTransitMode mode, CityAppModel city) {
        Intrinsics.i(mode, "mode");
        Intrinsics.i(city, "city");
        Iterator it = city.h.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            ModeMapInfoAppModel modeMapInfoAppModel = (ModeMapInfoAppModel) it.next();
            if (modeMapInfoAppModel.f8858a == mode) {
                ArrayList arrayList = modeMapInfoAppModel.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((AgencyInfoAppModel) obj).c) {
                        return true;
                    }
                }
            }
        }
    }

    @Override // app.chalo.contract.BasicInfoContract
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.contract.BasicInfoContract
    public final Object c(Continuation continuation) {
        BasicInfoContractImpl$getTrueTime$1 basicInfoContractImpl$getTrueTime$1;
        if (continuation instanceof BasicInfoContractImpl$getTrueTime$1) {
            basicInfoContractImpl$getTrueTime$1 = (BasicInfoContractImpl$getTrueTime$1) continuation;
            int i = basicInfoContractImpl$getTrueTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                basicInfoContractImpl$getTrueTime$1.label = i - Integer.MIN_VALUE;
            } else {
                basicInfoContractImpl$getTrueTime$1 = new BasicInfoContractImpl$getTrueTime$1(this, continuation);
            }
        } else {
            basicInfoContractImpl$getTrueTime$1 = new BasicInfoContractImpl$getTrueTime$1(this, continuation);
        }
        Object objB = basicInfoContractImpl$getTrueTime$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = basicInfoContractImpl$getTrueTime$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            basicInfoContractImpl$getTrueTime$1.label = 1;
            objB = this.d.b(basicInfoContractImpl$getTrueTime$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        Long l = (Long) objB;
        return new Long(l != null ? l.longValue() : this.b.j());
    }

    @Override // app.chalo.contract.BasicInfoContract
    public final boolean d() {
        return this.d.a();
    }

    @Override // app.chalo.contract.BasicInfoContract
    public final long e() {
        return this.b.j();
    }

    @Override // app.chalo.contract.BasicInfoContract
    public final boolean f() {
        return this.c.n();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[PHI: r2 r5
      0x005e: PHI (r2v6 app.chalo.permissions.handler.PermissionHandler) = (r2v2 app.chalo.permissions.handler.PermissionHandler), (r2v7 app.chalo.permissions.handler.PermissionHandler) binds: [B:23:0x0059, B:30:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r5v6 java.util.Iterator) = (r5v3 java.util.Iterator), (r5v7 java.util.Iterator) binds: [B:23:0x0059, B:30:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0074 -> B:29:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.contract.BasicInfoContract
    public final java.lang.Object g(app.chalo.permissions.models.AppPermission[] r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof app.chalo.base.BasicInfoContractImpl$hasPermissions$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.base.BasicInfoContractImpl$hasPermissions$1 r0 = (app.chalo.base.BasicInfoContractImpl$hasPermissions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.base.BasicInfoContractImpl$hasPermissions$1 r0 = new app.chalo.base.BasicInfoContractImpl$hasPermissions$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r2 = r0.L$0
            app.chalo.permissions.handler.PermissionHandler r2 = (app.chalo.permissions.handler.PermissionHandler) r2
            kotlin.ResultKt.b(r6)
            goto L77
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.b(r6)
            app.chalo.permissions.handler.PermissionHandlerProvider r6 = r4.e
            app.chalo.permissions.handler.PermissionHandler r6 = r6.c()
            if (r6 != 0) goto L45
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L45:
            java.util.List r5 = kotlin.collections.ArraysKt.h0(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r2 = r5 instanceof java.util.Collection
            if (r2 == 0) goto L59
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            goto L80
        L59:
            java.util.Iterator r5 = r5.iterator()
            r2 = r6
        L5e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L80
            java.lang.Object r6 = r5.next()
            app.chalo.permissions.models.AppPermission r6 = (app.chalo.permissions.models.AppPermission) r6
            r0.L$0 = r2
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r2.b(r6, r0)
            if (r6 != r1) goto L77
            return r1
        L77:
            app.chalo.permissions.models.PermissionState r6 = (app.chalo.permissions.models.PermissionState) r6
            boolean r6 = app.chalo.permissions.models.PermissionStateKt.a(r6)
            if (r6 != 0) goto L5e
            r3 = 0
        L80:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.base.BasicInfoContractImpl.g(app.chalo.permissions.models.AppPermission[], kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.contract.BasicInfoContract
    public final String getDeviceId() {
        return this.f995a.getDeviceId();
    }

    @Override // app.chalo.contract.BasicInfoContract
    public final int h() {
        return this.c.e();
    }

    @Override // app.chalo.contract.BasicInfoContract
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Override // app.chalo.contract.BasicInfoContract
    public final long j() {
        return ((Number) BuildersKt.e(EmptyCoroutineContext.f17583a, new BasicInfoContractImpl$getTrueTimeBlocking$1(this, null))).longValue();
    }
}
