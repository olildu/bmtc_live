package app.chalo.security.sync.data;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"security_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EncryptionKeySyncApiDataKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9385a;

        static {
            int[] iArr = new int[EncryptionKeysPurposeType.values().length];
            try {
                iArr[EncryptionKeysPurposeType.SEMI_CLOSED_WALLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EncryptionKeysPurposeType.CLOSED_LOOP_WALLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9385a = iArr;
        }
    }
}
