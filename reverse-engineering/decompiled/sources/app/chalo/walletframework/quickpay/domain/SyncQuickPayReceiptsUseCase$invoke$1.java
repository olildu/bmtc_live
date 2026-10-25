package app.chalo.walletframework.quickpay.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.quickpay.domain.SyncQuickPayReceiptsUseCase", f = "SyncQuickPayReceiptsUseCase.kt", l = {26, 27, 38}, m = "invoke", v = 1)
final class SyncQuickPayReceiptsUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SyncQuickPayReceiptsUseCase this$0;

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: QuickPayReceiptFetchFailedException -> 0x0026, Exception -> 0x00ac, PHI: r0 r9
      0x006c: PHI (r0v9 java.util.List) = (r0v6 java.util.List), (r0v17 java.util.List) binds: [B:29:0x0069, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r9v14 java.lang.Object) = (r9v10 java.lang.Object), (r9v0 java.lang.Object) binds: [B:29:0x0069, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {QuickPayReceiptFetchFailedException -> 0x0026, Exception -> 0x00ac, blocks: (B:8:0x0021, B:41:0x009e, B:15:0x0035, B:31:0x006c, B:34:0x0077, B:35:0x007b, B:37:0x0081, B:38:0x008f, B:18:0x003d, B:26:0x0058, B:28:0x005f, B:21:0x0044, B:23:0x004d), top: B:48:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[Catch: QuickPayReceiptFetchFailedException -> 0x0026, Exception -> 0x00ac, TryCatch #2 {QuickPayReceiptFetchFailedException -> 0x0026, Exception -> 0x00ac, blocks: (B:8:0x0021, B:41:0x009e, B:15:0x0035, B:31:0x006c, B:34:0x0077, B:35:0x007b, B:37:0x0081, B:38:0x008f, B:18:0x003d, B:26:0x0058, B:28:0x005f, B:21:0x0044, B:23:0x004d), top: B:48:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0081 A[Catch: QuickPayReceiptFetchFailedException -> 0x0026, Exception -> 0x00ac, LOOP:0: B:35:0x007b->B:37:0x0081, LOOP_END, TryCatch #2 {QuickPayReceiptFetchFailedException -> 0x0026, Exception -> 0x00ac, blocks: (B:8:0x0021, B:41:0x009e, B:15:0x0035, B:31:0x006c, B:34:0x0077, B:35:0x007b, B:37:0x0081, B:38:0x008f, B:18:0x003d, B:26:0x0058, B:28:0x005f, B:21:0x0044, B:23:0x004d), top: B:48:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (r3.k(r0, r8) == r1) goto L40;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r8.result = r9
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r8.label = r0
            app.chalo.walletframework.quickpay.domain.SyncQuickPayReceiptsUseCase r2 = r8.this$0
            app.chalo.walletframework.quickpay.data.repository.QuickPayRepository r3 = r2.f10943a
            int r0 = r0 - r1
            r8.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L41
            if (r0 == r6) goto L39
            if (r0 == r5) goto L31
            if (r0 != r4) goto L29
            java.lang.Object r0 = r8.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.b(r9)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            goto L9e
        L26:
            r9 = move-exception
            goto Lb4
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            java.lang.Object r0 = r8.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.b(r9)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            goto L6c
        L39:
            java.lang.Object r0 = r8.L$0
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r0 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r0
            kotlin.ResultKt.b(r9)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            goto L58
        L41:
            kotlin.ResultKt.b(r9)
            app.chalo.providers.UserProfileDetailsProvider r9 = r2.b     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            java.lang.String r9 = r9.m()     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r0 = 0
            if (r9 == 0) goto L5e
            r8.L$0 = r0     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r8.label = r6     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            java.io.Serializable r9 = r3.o(r9, r8)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            if (r9 != r1) goto L58
            goto L9d
        L58:
            java.util.List r9 = (java.util.List) r9     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r7 = r0
            r0 = r9
            r9 = r7
            goto L5f
        L5e:
            r9 = r0
        L5f:
            app.chalo.walletframework.wallet.domain.GetWalletIdUseCase r2 = r2.c     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r8.L$0 = r0     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r8.label = r5     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            java.lang.Object r9 = r2.a(r9, r8)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            if (r9 != r1) goto L6c
            goto L9d
        L6c:
            java.lang.String r9 = (java.lang.String) r9     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r2.<init>()     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            if (r9 == 0) goto La4
            if (r0 == 0) goto L8f
            java.util.Iterator r0 = r0.iterator()     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
        L7b:
            boolean r5 = r0.hasNext()     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r0.next()     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayReceiptAppModel r5 = (app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayReceiptAppModel) r5     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt r5 = app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayReceiptAppModelKt.a(r5, r9)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r2.add(r5)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            goto L7b
        L8f:
            java.util.List r0 = kotlin.collections.CollectionsKt.D0(r2)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r8.L$0 = r0     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r8.label = r4     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            java.lang.Object r9 = r3.k(r0, r8)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            if (r9 != r1) goto L9e
        L9d:
            return r1
        L9e:
            app.chalo.utils.ChaloUseCaseResult$Success r9 = new app.chalo.utils.ChaloUseCaseResult$Success     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            r9.<init>(r0)     // Catch: app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException -> L26 java.lang.Exception -> Lac
            return r9
        La4:
            app.chalo.utils.ChaloUseCaseResult$Failure r9 = new app.chalo.utils.ChaloUseCaseResult$Failure
            java.lang.String r0 = ""
            r9.<init>(r0)
            return r9
        Lac:
            app.chalo.utils.ChaloUseCaseResult$Failure r9 = new app.chalo.utils.ChaloUseCaseResult$Failure
            java.lang.String r0 = "Something went wrong"
            r9.<init>(r0)
            goto Lbe
        Lb4:
            app.chalo.utils.ChaloUseCaseResult$Failure r0 = new app.chalo.utils.ChaloUseCaseResult$Failure
            java.lang.String r9 = r9.getMsg()
            r0.<init>(r9)
            r9 = r0
        Lbe:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.quickpay.domain.SyncQuickPayReceiptsUseCase$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
