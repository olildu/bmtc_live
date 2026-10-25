package app.chalo.premiumbus.domains;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.repository.SuperPassRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domains/CheckIfContinueWithBulkBookingFlowUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfContinueWithBulkBookingFlowUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f7263a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7264a;
        public static final /* synthetic */ int[] b;

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
            f7264a = iArr;
            int[] iArr2 = new int[SuperPassSubType.values().length];
            try {
                iArr2[SuperPassSubType.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SuperPassSubType.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public CheckIfContinueWithBulkBookingFlowUseCase(SuperPassRepository superPassRepository) {
        this.f7263a = superPassRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r8 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.superpass.data.models.entities.SuperPass r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$2
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$2 r0 = (app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$2 r0 = new app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$2
            r0.<init>(r6, r8)
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
            goto L70
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.ResultKt.b(r8)
            goto L82
        L36:
            kotlin.ResultKt.b(r8)
            app.chalo.superpass.data.models.entities.SuperPassTripPreferences r8 = r7.getI()
            java.lang.String r2 = r8.b
            java.lang.String r8 = r8.d
            app.chalo.superpass.data.models.entities.SuperPassProperties r7 = r7.f9560a
            java.lang.String r5 = r7.f9566a
            app.chalo.superpass.data.models.entities.SuperPassSubType r7 = r7.c
            if (r2 == 0) goto L94
            int r2 = r2.length()
            if (r2 != 0) goto L50
            goto L94
        L50:
            if (r8 == 0) goto L94
            int r8 = r8.length()
            if (r8 != 0) goto L59
            goto L94
        L59:
            int[] r8 = app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase.WhenMappings.b
            int r7 = r7.ordinal()
            r7 = r8[r7]
            app.chalo.superpass.data.repository.SuperPassRepository r8 = r6.f7263a
            if (r7 == r4) goto L79
            if (r7 != r3) goto L73
            r0.label = r3
            java.lang.Object r8 = r8.n(r5, r0)
            if (r8 != r1) goto L70
            goto L81
        L70:
            app.chalo.superpass.data.models.entities.SuperPass r8 = (app.chalo.superpass.data.models.entities.SuperPass) r8
            goto L84
        L73:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L79:
            r0.label = r4
            java.lang.Object r8 = r8.m(r5, r0)
            if (r8 != r1) goto L82
        L81:
            return r1
        L82:
            app.chalo.superpass.data.models.entities.SuperPass r8 = (app.chalo.superpass.data.models.entities.SuperPass) r8
        L84:
            if (r8 != 0) goto L89
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L89:
            app.chalo.superpass.data.models.entities.SuperPassValidationProperties r7 = r8.getB()
            boolean r7 = r7.k
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L94:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase.a(app.chalo.superpass.data.models.entities.SuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r8 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, app.chalo.models.SuperPassSubTypes r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$1 r0 = (app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$1 r0 = new app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase$invoke$1
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
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r8)
            goto L68
        L36:
            kotlin.ResultKt.b(r8)
            int[] r8 = app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase.WhenMappings.f7264a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            app.chalo.superpass.data.repository.SuperPassRepository r8 = r5.f7263a
            if (r7 == r4) goto L5f
            if (r7 == r3) goto L53
            r6 = 3
            if (r7 != r6) goto L4d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L53:
            r0.label = r3
            java.lang.Object r8 = r8.n(r6, r0)
            if (r8 != r1) goto L5c
            goto L67
        L5c:
            app.chalo.superpass.data.models.entities.SuperPass r8 = (app.chalo.superpass.data.models.entities.SuperPass) r8
            goto L6a
        L5f:
            r0.label = r4
            java.lang.Object r8 = r8.m(r6, r0)
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            app.chalo.superpass.data.models.entities.SuperPass r8 = (app.chalo.superpass.data.models.entities.SuperPass) r8
        L6a:
            if (r8 != 0) goto L6f
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L6f:
            app.chalo.superpass.data.models.entities.SuperPassTripPreferences r6 = r8.getI()
            java.lang.String r7 = r6.b
            java.lang.String r6 = r6.d
            if (r7 == 0) goto L94
            int r7 = r7.length()
            if (r7 != 0) goto L80
            goto L94
        L80:
            if (r6 == 0) goto L94
            int r6 = r6.length()
            if (r6 != 0) goto L89
            goto L94
        L89:
            app.chalo.superpass.data.models.entities.SuperPassValidationProperties r6 = r8.getB()
            boolean r6 = r6.k
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L94:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase.b(java.lang.String, app.chalo.models.SuperPassSubTypes, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
