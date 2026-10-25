package app.chalo.ncmc.domain;

import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/GetChaloCardPassDescriptionFromPassAttrUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetChaloCardPassDescriptionFromPassAttrUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f6237a;
    public final TimeUtilsContract b;

    public GetChaloCardPassDescriptionFromPassAttrUseCase(StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f6237a = stringProvider;
        this.b = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r13 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (r13 == r1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.ncmc.data.appmodel.ChaloCardActivePass r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase$invoke$1 r0 = (app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase$invoke$1 r0 = new app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase$invoke$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            app.chalo.providers.stringprovider.StringProvider r8 = r11.f6237a
            if (r2 == 0) goto L4b
            if (r2 == r7) goto L43
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            kotlin.ResultKt.b(r13)
            goto Lba
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            java.lang.Object r12 = r0.L$0
            app.chalo.ncmc.data.appmodel.ChaloCardActivePass r12 = (app.chalo.ncmc.data.appmodel.ChaloCardActivePass) r12
            kotlin.ResultKt.b(r13)
            goto L85
        L43:
            java.lang.Object r12 = r0.L$0
            app.chalo.ncmc.data.appmodel.ChaloCardActivePass r12 = (app.chalo.ncmc.data.appmodel.ChaloCardActivePass) r12
            kotlin.ResultKt.b(r13)
            goto L90
        L4b:
            kotlin.ResultKt.b(r13)
            if (r12 == 0) goto Lc0
            java.lang.Integer r13 = r12.getC()
            if (r13 != 0) goto L57
            goto L6d
        L57:
            int r2 = r13.intValue()
            r9 = -1
            if (r2 != r9) goto L6d
            app.chalo.providers.stringprovider.StringEnum r13 = app.chalo.providers.stringprovider.StringEnum.UNLIMITED
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.L$0 = r12
            r0.label = r7
            java.lang.Object r13 = r8.b(r13, r2, r0)
            if (r13 != r1) goto L90
            goto Lb9
        L6d:
            if (r13 != 0) goto L70
            goto L8c
        L70:
            int r13 = r13.intValue()
            if (r13 != 0) goto L8c
            app.chalo.providers.stringprovider.StringEnum r13 = app.chalo.providers.stringprovider.StringEnum.NO
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.L$0 = r12
            r0.label = r6
            java.lang.Object r13 = r8.b(r13, r2, r0)
            if (r13 != r1) goto L85
            goto Lb9
        L85:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = app.chalo.extensions.StringExtsKt.a(r13)
            goto L90
        L8c:
            java.lang.Integer r13 = r12.getC()
        L90:
            if (r13 != 0) goto L93
            r13 = r3
        L93:
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.CHALO_CARD_ACTIVE_PASS_DESCRIPTION
            java.lang.Long r12 = r12.getB()
            if (r12 == 0) goto La0
            long r9 = r12.longValue()
            goto La2
        La0:
            r9 = 0
        La2:
            app.chalo.utils.timeutil.TimeUtilsContract r12 = r11.b
            java.lang.String r12 = r12.j(r9)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r13
            r6[r7] = r12
            r12 = 0
            r0.L$0 = r12
            r0.label = r5
            java.lang.Object r13 = r8.b(r2, r6, r0)
            if (r13 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto Lbf
            goto Lc0
        Lbf:
            return r13
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.domain.GetChaloCardPassDescriptionFromPassAttrUseCase.a(app.chalo.ncmc.data.appmodel.ChaloCardActivePass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
