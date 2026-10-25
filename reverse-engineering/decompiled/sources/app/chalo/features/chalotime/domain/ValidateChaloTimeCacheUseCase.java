package app.chalo.features.chalotime.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.constants.Source;
import app.chalo.features.chalotime.data.ChaloTimeRepository;
import app.chalo.features.chalotime.data.model.config.ChaloTimeConfig;
import app.chalo.utils.SystemHelper;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/domain/ValidateChaloTimeCacheUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateChaloTimeCacheUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTimeRepository f2681a;
    public final SystemHelper b;
    public final GetChaloTimeFetchConfigUseCase c;
    public final ChaloBuildConfig d;
    public final AnalyticsContract e;
    public ChaloTimeConfig f;

    public ValidateChaloTimeCacheUseCase(ChaloTimeRepository chaloTimeRepository, SystemHelper systemHelper, GetChaloTimeFetchConfigUseCase getChaloTimeFetchConfigUseCase, ChaloBuildConfig chaloBuildConfig, AnalyticsContract analyticsContract) {
        this.f2681a = chaloTimeRepository;
        this.b = systemHelper;
        this.c = getChaloTimeFetchConfigUseCase;
        this.d = chaloBuildConfig;
        this.e = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, long j2, ContinuationImpl continuationImpl) {
        ValidateChaloTimeCacheUseCase$areApproximatelyEqual$1 validateChaloTimeCacheUseCase$areApproximatelyEqual$1;
        long jAbs;
        if (continuationImpl instanceof ValidateChaloTimeCacheUseCase$areApproximatelyEqual$1) {
            validateChaloTimeCacheUseCase$areApproximatelyEqual$1 = (ValidateChaloTimeCacheUseCase$areApproximatelyEqual$1) continuationImpl;
            int i = validateChaloTimeCacheUseCase$areApproximatelyEqual$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateChaloTimeCacheUseCase$areApproximatelyEqual$1.label = i - Integer.MIN_VALUE;
            } else {
                validateChaloTimeCacheUseCase$areApproximatelyEqual$1 = new ValidateChaloTimeCacheUseCase$areApproximatelyEqual$1(this, continuationImpl);
            }
        } else {
            validateChaloTimeCacheUseCase$areApproximatelyEqual$1 = new ValidateChaloTimeCacheUseCase$areApproximatelyEqual$1(this, continuationImpl);
        }
        Object objB = validateChaloTimeCacheUseCase$areApproximatelyEqual$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateChaloTimeCacheUseCase$areApproximatelyEqual$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            jAbs = Math.abs(j - j2);
            validateChaloTimeCacheUseCase$areApproximatelyEqual$1.J$0 = jAbs;
            validateChaloTimeCacheUseCase$areApproximatelyEqual$1.label = 1;
            objB = b(validateChaloTimeCacheUseCase$areApproximatelyEqual$1);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jAbs = validateChaloTimeCacheUseCase$areApproximatelyEqual$1.J$0;
            ResultKt.b(objB);
        }
        return Boolean.valueOf(jAbs <= ((ChaloTimeConfig) objB).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        ValidateChaloTimeCacheUseCase$chaloTimeConfig$1 validateChaloTimeCacheUseCase$chaloTimeConfig$1;
        if (continuationImpl instanceof ValidateChaloTimeCacheUseCase$chaloTimeConfig$1) {
            validateChaloTimeCacheUseCase$chaloTimeConfig$1 = (ValidateChaloTimeCacheUseCase$chaloTimeConfig$1) continuationImpl;
            int i = validateChaloTimeCacheUseCase$chaloTimeConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateChaloTimeCacheUseCase$chaloTimeConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                validateChaloTimeCacheUseCase$chaloTimeConfig$1 = new ValidateChaloTimeCacheUseCase$chaloTimeConfig$1(this, continuationImpl);
            }
        } else {
            validateChaloTimeCacheUseCase$chaloTimeConfig$1 = new ValidateChaloTimeCacheUseCase$chaloTimeConfig$1(this, continuationImpl);
        }
        Object objA = validateChaloTimeCacheUseCase$chaloTimeConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateChaloTimeCacheUseCase$chaloTimeConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ChaloTimeConfig chaloTimeConfig = this.f;
            if (chaloTimeConfig != null) {
                return chaloTimeConfig;
            }
            validateChaloTimeCacheUseCase$chaloTimeConfig$1.label = 1;
            objA = this.c.a(validateChaloTimeCacheUseCase$chaloTimeConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloTimeConfig chaloTimeConfig2 = (ChaloTimeConfig) objA;
        this.f = chaloTimeConfig2;
        return chaloTimeConfig2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r3.c(r8, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase$invoke$1 r0 = (app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase$invoke$1 r0 = new app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase$invoke$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.features.chalotime.data.ChaloTimeRepository r3 = r7.f2681a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.b(r8)
            goto L6f
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.ResultKt.b(r8)
            goto L5c
        L3b:
            kotlin.ResultKt.b(r8)
            goto L4b
        L3f:
            kotlin.ResultKt.b(r8)
            r0.label = r6
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r1) goto L4b
            goto L6e
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5c
            r0.label = r5
            java.lang.Object r8 = r3.b(r0)
            if (r8 != r1) goto L5c
            goto L6e
        L5c:
            app.chalo.buildconfig.ChaloBuildConfig r8 = r7.d
            int r8 = r8.e()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r0.label = r4
            java.lang.Object r8 = r3.c(r8, r0)
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d A[PHI: r1 r2 r4 r9 r11
      0x005d: PHI (r1v29 java.lang.Object) = (r1v28 java.lang.Object), (r1v1 java.lang.Object) binds: [B:53:0x0146, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r2v25 java.lang.Long) = (r2v22 java.lang.Long), (r2v28 java.lang.Long) binds: [B:53:0x0146, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r4v8 java.lang.Long) = (r4v5 java.lang.Long), (r4v11 java.lang.Long) binds: [B:53:0x0146, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r9v7 long) = (r9v5 long), (r9v9 long) binds: [B:53:0x0146, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r11v7 long) = (r11v5 long), (r11v8 long) binds: [B:53:0x0146, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[PHI: r1 r2 r9 r11
      0x007d: PHI (r1v23 java.lang.Object) = (r1v22 java.lang.Object), (r1v1 java.lang.Object) binds: [B:46:0x0118, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r2v16 java.lang.Long) = (r2v13 java.lang.Long), (r2v21 java.lang.Long) binds: [B:46:0x0118, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r9v3 long) = (r9v1 long), (r9v4 long) binds: [B:46:0x0118, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r11v3 long) = (r11v1 long), (r11v4 long) binds: [B:46:0x0118, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0 A[PHI: r1
      0x00c0: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v1 java.lang.Object) binds: [B:31:0x00bc, B:25:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[PHI: r1 r2
      0x00d0: PHI (r1v10 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:34:0x00cc, B:24:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r2v7 java.lang.Long) = (r2v6 java.lang.Long), (r2v9 java.lang.Long) binds: [B:34:0x00cc, B:24:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00df A[PHI: r1 r2
      0x00df: PHI (r1v13 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:37:0x00db, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r2v10 java.lang.Long) = (r2v7 java.lang.Long), (r2v12 java.lang.Long) binds: [B:37:0x00db, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[PHI: r1 r2 r9 r11
      0x0109: PHI (r1v20 java.lang.Object) = (r1v18 java.lang.Object), (r1v1 java.lang.Object) binds: [B:43:0x0105, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r2v13 java.lang.Long) = (r2v10 java.lang.Long), (r2v15 java.lang.Long) binds: [B:43:0x0105, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r9v1 long) = (r9v0 long), (r9v2 long) binds: [B:43:0x0105, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r11v1 long) = (r11v0 long), (r11v2 long) binds: [B:43:0x0105, B:22:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e0 A[PHI: r1
      0x01e0: PHI (r1v41 java.lang.Object) = (r1v32 java.lang.Object), (r1v1 java.lang.Object) binds: [B:85:0x01dd, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a2, code lost:
    
        if (r1 == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ea, code lost:
    
        if (r1 == r6) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, long j2, ContinuationImpl continuationImpl) {
        ValidateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1 validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1;
        long j3;
        if (continuationImpl instanceof ValidateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1) {
            validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1 = (ValidateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1) continuationImpl;
            int i = validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1.label = i - Integer.MIN_VALUE;
            } else {
                validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1 = new ValidateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1(this, continuationImpl);
            }
        } else {
            validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1 = new ValidateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1(this, continuationImpl);
        }
        Object objB = validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            j3 = j - j2;
            validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1.J$0 = j3;
            validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1.label = 1;
            objB = b(validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = validateChaloTimeCacheUseCase$isCacheExpiryDurationExceeded$1.J$0;
            ResultKt.b(objB);
        }
        return Boolean.valueOf(j3 > ((ChaloTimeConfig) objB).e);
    }

    public final void f(String str, String str2) {
        Source source = Source.UNKNOWN;
        AnalyticsContractImplKt.a(this.e, str, source, source, vo1.s("event description", str2), 48);
    }
}
