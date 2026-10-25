package app.chalo.ncmc.domain;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FetchChaloCardInfoToShowUseCaseKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6228a;

        static {
            int[] iArr = new int[FetchLinkedChaloCardFailureReason.values().length];
            try {
                iArr[FetchLinkedChaloCardFailureReason.API_CALL_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchLinkedChaloCardFailureReason.NO_CARD_LINKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchLinkedChaloCardFailureReason.FETCH_NCMC_CARD_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchLinkedChaloCardFailureReason.FETCH_NCMC_CARD_TIMEOUT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6228a = iArr;
        }
    }
}
