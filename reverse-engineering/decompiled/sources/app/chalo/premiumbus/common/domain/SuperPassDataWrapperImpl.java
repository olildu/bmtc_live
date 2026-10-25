package app.chalo.premiumbus.common.domain;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/common/domain/SuperPassDataWrapperImpl;", "Lapp/chalo/premiumbus/data/SuperPassDataWrapper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassDataWrapperImpl implements SuperPassDataWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f6942a;
    public final TimeUtilsContract b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6943a;

        static {
            int[] iArr = new int[SuperPassSubTypes.values().length];
            try {
                iArr[SuperPassSubTypes.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassSubTypes.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassSubTypes.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6943a = iArr;
        }
    }

    public SuperPassDataWrapperImpl(SuperPassRepository superPassRepository, TimeUtilsContract timeUtilsContract) {
        this.f6942a = superPassRepository;
        this.b = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r13 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r13 == r1) goto L30;
     */
    @Override // app.chalo.premiumbus.data.SuperPassDataWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, app.chalo.models.SuperPassSubTypes r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl$fetchSuperPassTripPreferenceProperties$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl$fetchSuperPassTripPreferenceProperties$1 r0 = (app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl$fetchSuperPassTripPreferenceProperties$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl$fetchSuperPassTripPreferenceProperties$1 r0 = new app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl$fetchSuperPassTripPreferenceProperties$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.b(r13)
            goto L5c
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            kotlin.ResultKt.b(r13)
            goto L68
        L37:
            kotlin.ResultKt.b(r13)
            int[] r13 = app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl.WhenMappings.f6943a
            int r12 = r12.ordinal()
            r12 = r13[r12]
            app.chalo.superpass.data.repository.SuperPassRepository r13 = r10.f6942a
            if (r12 == r5) goto L5f
            if (r12 == r4) goto L53
            r11 = 3
            if (r12 != r11) goto L4d
            r13 = r3
            goto L6a
        L4d:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L53:
            r0.label = r4
            java.lang.Object r13 = r13.n(r11, r0)
            if (r13 != r1) goto L5c
            goto L67
        L5c:
            app.chalo.superpass.data.models.entities.SuperPass r13 = (app.chalo.superpass.data.models.entities.SuperPass) r13
            goto L6a
        L5f:
            r0.label = r5
            java.lang.Object r13 = r13.m(r11, r0)
            if (r13 != r1) goto L68
        L67:
            return r1
        L68:
            app.chalo.superpass.data.models.entities.SuperPass r13 = (app.chalo.superpass.data.models.entities.SuperPass) r13
        L6a:
            if (r13 != 0) goto L6d
            return r3
        L6d:
            app.chalo.superpass.data.models.entities.SuperPassTripPreferences r11 = r13.getF()
            java.lang.String r12 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r11, r12)
            java.lang.String r12 = r11.f9575a
            if (r12 == 0) goto L7e
            java.util.List r3 = kotlin.collections.CollectionsKt.R(r12)
        L7e:
            r9 = r3
            java.lang.String r5 = r11.b
            java.lang.String r6 = r11.c
            java.lang.String r7 = r11.d
            java.lang.String r8 = r11.e
            app.chalo.premiumbus.data.SuperPassTripPreferencesAppModel r4 = new app.chalo.premiumbus.data.SuperPassTripPreferencesAppModel
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl.a(java.lang.String, app.chalo.models.SuperPassSubTypes, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r2 == r4) goto L34;
     */
    @Override // app.chalo.premiumbus.data.SuperPassDataWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r28, app.chalo.models.SuperPassSubTypes r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl.b(java.lang.String, app.chalo.models.SuperPassSubTypes, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r2 == r4) goto L33;
     */
    @Override // app.chalo.premiumbus.data.SuperPassDataWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r23, app.chalo.models.SuperPassSubTypes r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl.c(java.lang.String, app.chalo.models.SuperPassSubTypes, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
