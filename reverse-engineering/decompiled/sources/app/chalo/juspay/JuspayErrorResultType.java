package app.chalo.juspay;

import defpackage.uc0;
import defpackage.vc0;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0011\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0002\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType;", "", "Companion", "Unavailable", "WrongBusinessLogic", "UserBackPress", "IntegrationError", "UserBasedError", "NoInternet", "TransactionStatusAwaiting", "SdkURLRedirectionError", "IncorrectDashboardConfiguration", "OtpLimitReached", "UnsupportedFeature", "ServerError", "TransactionFailedAtPg", "MultipleInitiateBeforeSdkTermination", "RequiredPermissionsNotAvailable", "Other", "Lapp/chalo/juspay/JuspayErrorResultType$IncorrectDashboardConfiguration;", "Lapp/chalo/juspay/JuspayErrorResultType$IntegrationError;", "Lapp/chalo/juspay/JuspayErrorResultType$MultipleInitiateBeforeSdkTermination;", "Lapp/chalo/juspay/JuspayErrorResultType$NoInternet;", "Lapp/chalo/juspay/JuspayErrorResultType$Other;", "Lapp/chalo/juspay/JuspayErrorResultType$OtpLimitReached;", "Lapp/chalo/juspay/JuspayErrorResultType$RequiredPermissionsNotAvailable;", "Lapp/chalo/juspay/JuspayErrorResultType$SdkURLRedirectionError;", "Lapp/chalo/juspay/JuspayErrorResultType$ServerError;", "Lapp/chalo/juspay/JuspayErrorResultType$TransactionFailedAtPg;", "Lapp/chalo/juspay/JuspayErrorResultType$TransactionStatusAwaiting;", "Lapp/chalo/juspay/JuspayErrorResultType$Unavailable;", "Lapp/chalo/juspay/JuspayErrorResultType$UnsupportedFeature;", "Lapp/chalo/juspay/JuspayErrorResultType$UserBackPress;", "Lapp/chalo/juspay/JuspayErrorResultType$UserBasedError;", "Lapp/chalo/juspay/JuspayErrorResultType$WrongBusinessLogic;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class JuspayErrorResultType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(23));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4044a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JuspayErrorResultType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<JuspayErrorResultType> serializer() {
            return (KSerializer) JuspayErrorResultType.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$IncorrectDashboardConfiguration;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class IncorrectDashboardConfiguration extends JuspayErrorResultType {
        public static final IncorrectDashboardConfiguration INSTANCE = new IncorrectDashboardConfiguration("JP_008", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IncorrectDashboardConfiguration);
        }

        public final int hashCode() {
            return -1186455674;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<IncorrectDashboardConfiguration> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "IncorrectDashboardConfiguration";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$IntegrationError;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class IntegrationError extends JuspayErrorResultType {
        public static final IntegrationError INSTANCE = new IntegrationError("JP_003", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(25));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IntegrationError);
        }

        public final int hashCode() {
            return -1781350475;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<IntegrationError> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "IntegrationError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$MultipleInitiateBeforeSdkTermination;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MultipleInitiateBeforeSdkTermination extends JuspayErrorResultType {
        public static final MultipleInitiateBeforeSdkTermination INSTANCE = new MultipleInitiateBeforeSdkTermination("JP_017", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(26));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MultipleInitiateBeforeSdkTermination);
        }

        public final int hashCode() {
            return -766532909;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<MultipleInitiateBeforeSdkTermination> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "MultipleInitiateBeforeSdkTermination";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$NoInternet;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NoInternet extends JuspayErrorResultType {
        public static final NoInternet INSTANCE = new NoInternet("JP_005", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(27));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoInternet);
        }

        public final int hashCode() {
            return -1147411453;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<NoInternet> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "NoInternet";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$Other;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Other extends JuspayErrorResultType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$Other$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/JuspayErrorResultType$Other;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Other> serializer() {
                return JuspayErrorResultType$Other$$serializer.f4045a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Other(int i, String str, String str2) {
            super(str);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(JuspayErrorResultType$Other$$serializer.f4045a.getDescriptor(), i, 3);
                throw null;
            }
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Other) && Intrinsics.d(this.c, ((Other) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return vo1.B("Other(code=", this.c, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(String code) {
            super(code, 0);
            Intrinsics.i(code, "code");
            this.c = code;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$OtpLimitReached;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OtpLimitReached extends JuspayErrorResultType {
        public static final OtpLimitReached INSTANCE = new OtpLimitReached("JP_009", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(28));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OtpLimitReached);
        }

        public final int hashCode() {
            return -351474527;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<OtpLimitReached> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "OtpLimitReached";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$RequiredPermissionsNotAvailable;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RequiredPermissionsNotAvailable extends JuspayErrorResultType {
        public static final RequiredPermissionsNotAvailable INSTANCE = new RequiredPermissionsNotAvailable("JP_018", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new uc0(29));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequiredPermissionsNotAvailable);
        }

        public final int hashCode() {
            return -177662982;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RequiredPermissionsNotAvailable> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "RequiredPermissionsNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$SdkURLRedirectionError;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SdkURLRedirectionError extends JuspayErrorResultType {
        public static final SdkURLRedirectionError INSTANCE = new SdkURLRedirectionError("JP_007", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(0));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SdkURLRedirectionError);
        }

        public final int hashCode() {
            return 294715922;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<SdkURLRedirectionError> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "SdkURLRedirectionError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$ServerError;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ServerError extends JuspayErrorResultType {
        public static final ServerError INSTANCE = new ServerError("JP_011", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(1));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ServerError);
        }

        public final int hashCode() {
            return 229786820;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ServerError> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "ServerError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$TransactionFailedAtPg;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TransactionFailedAtPg extends JuspayErrorResultType {
        public static final TransactionFailedAtPg INSTANCE = new TransactionFailedAtPg("JP_012", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(2));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TransactionFailedAtPg);
        }

        public final int hashCode() {
            return 1963927140;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TransactionFailedAtPg> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "TransactionFailedAtPg";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$TransactionStatusAwaiting;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TransactionStatusAwaiting extends JuspayErrorResultType {
        public static final TransactionStatusAwaiting INSTANCE = new TransactionStatusAwaiting("JP_006", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(3));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TransactionStatusAwaiting);
        }

        public final int hashCode() {
            return -1195138725;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TransactionStatusAwaiting> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "TransactionStatusAwaiting";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$Unavailable;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Unavailable extends JuspayErrorResultType {
        public static final Unavailable INSTANCE = new Unavailable("JP_000", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(4));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public final int hashCode() {
            return 346970255;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<Unavailable> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "Unavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$UnsupportedFeature;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UnsupportedFeature extends JuspayErrorResultType {
        public static final UnsupportedFeature INSTANCE = new UnsupportedFeature("JP_010", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(5));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnsupportedFeature);
        }

        public final int hashCode() {
            return 2018149858;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UnsupportedFeature> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "UnsupportedFeature";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$UserBackPress;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UserBackPress extends JuspayErrorResultType {
        public static final UserBackPress INSTANCE = new UserBackPress("JP_002", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(6));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserBackPress);
        }

        public final int hashCode() {
            return 1275747472;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UserBackPress> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "UserBackPress";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$UserBasedError;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UserBasedError extends JuspayErrorResultType {
        public static final UserBasedError INSTANCE = new UserBasedError("JP_004", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(7));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserBasedError);
        }

        public final int hashCode() {
            return -1784983647;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UserBasedError> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "UserBasedError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/juspay/JuspayErrorResultType$WrongBusinessLogic;", "Lapp/chalo/juspay/JuspayErrorResultType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class WrongBusinessLogic extends JuspayErrorResultType {
        public static final WrongBusinessLogic INSTANCE = new WrongBusinessLogic("JP_001", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(8));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WrongBusinessLogic);
        }

        public final int hashCode() {
            return -1042758222;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<WrongBusinessLogic> serializer() {
            return (KSerializer) c.getValue();
        }

        public final String toString() {
            return "WrongBusinessLogic";
        }
    }

    public /* synthetic */ JuspayErrorResultType(String str) {
        this.f4044a = str;
    }

    public JuspayErrorResultType(String str, int i) {
        this.f4044a = str;
    }
}
