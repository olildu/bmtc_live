package app.chalo.login.ui.otp;

import app.chalo.login.domain.SendOtpForLoginErrorReason;
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
@DebugMetadata(c = "app.chalo.login.ui.otp.LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1", f = "LoginOtpEnterComponent.kt", l = {266, 272, 284, 294, 325}, m = "invokeSuspend", v = 1)
final class LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $countryCode;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $refNo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginOtpEnterComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5328a;

        static {
            int[] iArr = new int[SendOtpForLoginErrorReason.values().length];
            try {
                iArr[SendOtpForLoginErrorReason.SERVER_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.UNKNOWN_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.INVALID_REF_NO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.OTP_STATUS_FALSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.PARSE_EXCEPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SendOtpForLoginErrorReason.PREVIOUS_OTP_EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f5328a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1(LoginOtpEnterComponent loginOtpEnterComponent, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.$phoneNumber = str;
        this.$countryCode = str2;
        this.this$0 = loginOtpEnterComponent;
        this.$refNo = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1 loginOtpEnterComponent$handleOnResendOtpClickedIntent$1 = new LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1(this.this$0, this.$phoneNumber, this.$countryCode, this.$refNo, continuation);
        loginOtpEnterComponent$handleOnResendOtpClickedIntent$1.L$0 = obj;
        return loginOtpEnterComponent$handleOnResendOtpClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0132  */
    /* JADX WARN: Code duplicated, block: B:43:0x0146  */
    /* JADX WARN: Code duplicated, block: B:45:0x014a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0150  */
    /* JADX WARN: Code duplicated, block: B:50:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        if (r12 == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a6, code lost:
    
        if (r12 == r0) goto L54;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.otp.LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
