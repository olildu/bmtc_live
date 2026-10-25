package app.chalo.usecase;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FormatTimeInMillisToGivenFormatUseCaseKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10176a;

        static {
            int[] iArr = new int[ChaloCustomDateFormat.values().length];
            try {
                iArr[ChaloCustomDateFormat.DAY_NAME_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloCustomDateFormat.DAY_NAME_WITH_DATE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloCustomDateFormat.DAY_WITH_MONTH_YEAR_FORMAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloCustomDateFormat.TIME_IN_AM_PM_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloCustomDateFormat.DATE_AND_TIME_WITH_YEAR_MONTH_DAY_ORDER_FORMAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloCustomDateFormat.DAY_WITH_MONTH_YEAR_ABBREVIATED_FORMAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f10176a = iArr;
        }
    }
}
