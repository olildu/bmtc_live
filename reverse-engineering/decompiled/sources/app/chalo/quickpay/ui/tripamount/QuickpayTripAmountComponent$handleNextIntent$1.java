package app.chalo.quickpay.ui.tripamount;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handleNextIntent$1", f = "QuickpayTripAmountComponent.kt", l = {260, 263, 265, 272, 280, 281, 293, 314}, m = "invokeSuspend", v = 1)
final class QuickpayTripAmountComponent$handleNextIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ QuickpayTripAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountComponent$handleNextIntent$1(QuickpayTripAmountComponent quickpayTripAmountComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickpayTripAmountComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickpayTripAmountComponent$handleNextIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickpayTripAmountComponent$handleNextIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x027c A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c A[Catch: all -> 0x014c, PHI: r2 r8 r9
      0x011c: PHI (r2v15 java.lang.String) = (r2v11 java.lang.String), (r2v18 java.lang.String) binds: [B:48:0x0118, B:25:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r8v16 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v12 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v19 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:48:0x0118, B:25:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r9v15 java.lang.Object) = (r9v11 java.lang.Object), (r9v23 java.lang.Object) binds: [B:48:0x0118, B:25:0x007d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0124 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141 A[Catch: all -> 0x014c, PHI: r2 r8
      0x0141: PHI (r2v20 java.lang.String) = (r2v15 java.lang.String), (r2v23 java.lang.String) binds: [B:53:0x013d, B:22:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r8v21 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v16 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v24 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:53:0x013d, B:22:0x006b] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014f A[Catch: all -> 0x014c, PHI: r2 r8
      0x014f: PHI (r2v19 java.lang.String) = (r2v15 java.lang.String), (r2v20 java.lang.String) binds: [B:51:0x0122, B:55:0x0141] A[DONT_GENERATE, DONT_INLINE]
      0x014f: PHI (r8v20 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v16 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v21 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:51:0x0122, B:55:0x0141] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162 A[Catch: all -> 0x014c, PHI: r2 r8 r9
      0x0162: PHI (r2v24 java.lang.String) = (r2v19 java.lang.String), (r2v27 java.lang.String) binds: [B:58:0x015e, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r8v25 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v20 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v29 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:58:0x015e, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r9v28 java.lang.Object) = (r9v26 java.lang.Object), (r9v36 java.lang.Object) binds: [B:58:0x015e, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x016a A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x017d A[Catch: all -> 0x014c, PHI: r2 r8 r9
      0x017d: PHI (r2v28 java.lang.String) = (r2v24 java.lang.String), (r2v31 java.lang.String) binds: [B:63:0x0179, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r8v30 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v25 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v39 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:63:0x0179, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r9v37 java.lang.Object) = (r9v34 java.lang.Object), (r9v41 java.lang.Object) binds: [B:63:0x0179, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0183 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7 A[Catch: all -> 0x014c, PHI: r2 r3 r8 r9
      0x01e7: PHI (r2v32 java.lang.String) = (r2v28 java.lang.String), (r2v36 java.lang.String) binds: [B:76:0x01e4, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r3v9 java.lang.Object) = (r3v7 java.lang.Object), (r3v17 java.lang.Object) binds: [B:76:0x01e4, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r8v40 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v30 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v41 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:76:0x01e4, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r9v42 app.chalo.utils.ChaloUseCaseResult) = (r9v38 app.chalo.utils.ChaloUseCaseResult), (r9v44 app.chalo.utils.ChaloUseCaseResult) binds: [B:76:0x01e4, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ef A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f7 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0240 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0241 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0247 A[Catch: all -> 0x014c, TryCatch #2 {all -> 0x014c, blocks: (B:78:0x01e7, B:92:0x0212, B:81:0x01ef, B:83:0x01f7, B:85:0x01fb, B:87:0x0203, B:90:0x020c, B:91:0x0211, B:65:0x017d, B:67:0x0183, B:69:0x01c3, B:71:0x01c7, B:75:0x01d3, B:96:0x0241, B:97:0x0246, B:60:0x0162, B:62:0x016a, B:98:0x0247, B:99:0x0264, B:101:0x0271, B:55:0x0141, B:57:0x014f, B:50:0x011c, B:52:0x0124, B:41:0x00e4, B:43:0x00ec, B:47:0x00fa, B:103:0x027c, B:38:0x00d2), top: B:111:0x00d2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r8 == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r8 == null) goto L95;
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x004b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:76), block:B:16:0x004b */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handleNextIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
