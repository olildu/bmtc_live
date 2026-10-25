package app.chalo.kyc.min.domain;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.kyc.min.data.exceptions.ErrorMessageToStringMapper;
import app.chalo.kyc.min.data.repository.MinKycRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/domain/SubmitKycUseCase;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubmitKycUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4112a;
    public final StringProvider b;
    public final MinKycRepository c;
    public final UserProfileDetailsProvider d;
    public final CrashlyticsLogger e;

    public SubmitKycUseCase(CityProvider cityProvider, StringProvider stringProvider, MinKycRepository minKycRepository, UserProfileDetailsProvider userProfileDetailsProvider, ErrorMessageToStringMapper errorMessageToStringMapper, CrashlyticsLogger crashlyticsLogger) {
        this.f4112a = cityProvider;
        this.b = stringProvider;
        this.c = minKycRepository;
        this.d = userProfileDetailsProvider;
        this.e = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d5 A[Catch: Exception -> 0x0047, ChaloLocalException -> 0x004a, SubmitKycApiException -> 0x004d, TryCatch #2 {SubmitKycApiException -> 0x004d, ChaloLocalException -> 0x004a, Exception -> 0x0047, blocks: (B:14:0x0042, B:78:0x0179, B:23:0x0056, B:84:0x019f, B:88:0x01a8, B:26:0x0073, B:70:0x0154, B:72:0x0158, B:75:0x015d, B:80:0x0181, B:29:0x0086, B:60:0x0123, B:64:0x012c, B:32:0x0091, B:48:0x00ef, B:52:0x00f8, B:35:0x00a5, B:42:0x00d1, B:44:0x00d5, B:54:0x0101, B:56:0x0109, B:66:0x0135, B:38:0x00b1), top: B:118:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[Catch: Exception -> 0x0047, ChaloLocalException -> 0x004a, SubmitKycApiException -> 0x004d, TryCatch #2 {SubmitKycApiException -> 0x004d, ChaloLocalException -> 0x004a, Exception -> 0x0047, blocks: (B:14:0x0042, B:78:0x0179, B:23:0x0056, B:84:0x019f, B:88:0x01a8, B:26:0x0073, B:70:0x0154, B:72:0x0158, B:75:0x015d, B:80:0x0181, B:29:0x0086, B:60:0x0123, B:64:0x012c, B:32:0x0091, B:48:0x00ef, B:52:0x00f8, B:35:0x00a5, B:42:0x00d1, B:44:0x00d5, B:54:0x0101, B:56:0x0109, B:66:0x0135, B:38:0x00b1), top: B:118:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0109 A[Catch: Exception -> 0x0047, ChaloLocalException -> 0x004a, SubmitKycApiException -> 0x004d, TryCatch #2 {SubmitKycApiException -> 0x004d, ChaloLocalException -> 0x004a, Exception -> 0x0047, blocks: (B:14:0x0042, B:78:0x0179, B:23:0x0056, B:84:0x019f, B:88:0x01a8, B:26:0x0073, B:70:0x0154, B:72:0x0158, B:75:0x015d, B:80:0x0181, B:29:0x0086, B:60:0x0123, B:64:0x012c, B:32:0x0091, B:48:0x00ef, B:52:0x00f8, B:35:0x00a5, B:42:0x00d1, B:44:0x00d5, B:54:0x0101, B:56:0x0109, B:66:0x0135, B:38:0x00b1), top: B:118:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135 A[Catch: Exception -> 0x0047, ChaloLocalException -> 0x004a, SubmitKycApiException -> 0x004d, TryCatch #2 {SubmitKycApiException -> 0x004d, ChaloLocalException -> 0x004a, Exception -> 0x0047, blocks: (B:14:0x0042, B:78:0x0179, B:23:0x0056, B:84:0x019f, B:88:0x01a8, B:26:0x0073, B:70:0x0154, B:72:0x0158, B:75:0x015d, B:80:0x0181, B:29:0x0086, B:60:0x0123, B:64:0x012c, B:32:0x0091, B:48:0x00ef, B:52:0x00f8, B:35:0x00a5, B:42:0x00d1, B:44:0x00d5, B:54:0x0101, B:56:0x0109, B:66:0x0135, B:38:0x00b1), top: B:118:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158 A[Catch: Exception -> 0x0047, ChaloLocalException -> 0x004a, SubmitKycApiException -> 0x004d, TryCatch #2 {SubmitKycApiException -> 0x004d, ChaloLocalException -> 0x004a, Exception -> 0x0047, blocks: (B:14:0x0042, B:78:0x0179, B:23:0x0056, B:84:0x019f, B:88:0x01a8, B:26:0x0073, B:70:0x0154, B:72:0x0158, B:75:0x015d, B:80:0x0181, B:29:0x0086, B:60:0x0123, B:64:0x012c, B:32:0x0091, B:48:0x00ef, B:52:0x00f8, B:35:0x00a5, B:42:0x00d1, B:44:0x00d5, B:54:0x0101, B:56:0x0109, B:66:0x0135, B:38:0x00b1), top: B:118:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181 A[Catch: Exception -> 0x0047, ChaloLocalException -> 0x004a, SubmitKycApiException -> 0x004d, TryCatch #2 {SubmitKycApiException -> 0x004d, ChaloLocalException -> 0x004a, Exception -> 0x0047, blocks: (B:14:0x0042, B:78:0x0179, B:23:0x0056, B:84:0x019f, B:88:0x01a8, B:26:0x0073, B:70:0x0154, B:72:0x0158, B:75:0x015d, B:80:0x0181, B:29:0x0086, B:60:0x0123, B:64:0x012c, B:32:0x0091, B:48:0x00ef, B:52:0x00f8, B:35:0x00a5, B:42:0x00d1, B:44:0x00d5, B:54:0x0101, B:56:0x0109, B:66:0x0135, B:38:0x00b1), top: B:118:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a7  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d9, code lost:
    
        if (r0 == r3) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0216, code lost:
    
        if (r0 == r3) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, java.lang.String r22, java.lang.String r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.domain.SubmitKycUseCase.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
