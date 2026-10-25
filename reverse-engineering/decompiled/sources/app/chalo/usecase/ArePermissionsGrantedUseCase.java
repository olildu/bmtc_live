package app.chalo.usecase;

import app.chalo.permissions.handler.PermissionHandlerProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ArePermissionsGrantedUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArePermissionsGrantedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionHandlerProvider f10143a;

    public ArePermissionsGrantedUseCase(PermissionHandlerProvider permissionHandlerProvider) {
        this.f10143a = permissionHandlerProvider;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0090 -> B:23:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0094 -> B:25:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x008f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof app.chalo.usecase.ArePermissionsGrantedUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.usecase.ArePermissionsGrantedUseCase$invoke$1 r0 = (app.chalo.usecase.ArePermissionsGrantedUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.usecase.ArePermissionsGrantedUseCase$invoke$1 r0 = new app.chalo.usecase.ArePermissionsGrantedUseCase$invoke$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r10 = r0.L$5
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r2 = r0.L$4
            app.chalo.permissions.models.AppPermission r2 = (app.chalo.permissions.models.AppPermission) r2
            java.lang.Object r4 = r0.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$2
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.b(r11)
            goto L91
        L3f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L47:
            java.util.ArrayList r11 = defpackage.py.l(r11)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.v(r10, r5)
            r4.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
            r6 = r4
            r4 = r10
            r10 = r6
            r7 = r11
            r6 = r2
        L66:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Lac
            java.lang.Object r11 = r4.next()
            r2 = r11
            app.chalo.permissions.models.AppPermission r2 = (app.chalo.permissions.models.AppPermission) r2
            app.chalo.permissions.handler.PermissionHandlerProvider r11 = r9.f10143a
            app.chalo.permissions.handler.PermissionHandler r11 = r11.c()
            if (r11 == 0) goto L94
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r10
            r0.L$3 = r4
            r0.L$4 = r2
            r0.L$5 = r10
            r0.label = r3
            java.lang.Object r11 = r11.b(r2, r0)
            if (r11 != r1) goto L90
            return r1
        L90:
            r5 = r10
        L91:
            app.chalo.permissions.models.PermissionState r11 = (app.chalo.permissions.models.PermissionState) r11
            goto L96
        L94:
            r11 = 0
            r5 = r10
        L96:
            app.chalo.permissions.models.PermissionState r8 = app.chalo.permissions.models.PermissionState.GRANTED
            if (r11 != r8) goto L9f
            boolean r11 = r7.add(r2)
            goto La3
        L9f:
            boolean r11 = r6.add(r2)
        La3:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.add(r11)
            r10 = r5
            goto L66
        Lac:
            java.util.List r10 = (java.util.List) r10
            app.chalo.location.AppPermissionRequest r10 = new app.chalo.location.AppPermissionRequest
            r10.<init>(r7, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.ArePermissionsGrantedUseCase.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
