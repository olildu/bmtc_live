package defpackage;

import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.window.area.WindowAreaController;
import androidx.window.layout.WindowInfoTracker;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletAllTransactionsArgs$$serializer;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletBalanceArgs$$serializer;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs$$serializer;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs$$serializer;
import app.chalo.scenes.args.WalletSceneArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs$$serializer;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.wallet.ui.moneyaddedbottomsheet.model.WalletMoneyAddedNavigationModel;
import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryNavigationModel;
import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.apimodel.request.QuickPayRequestApiModel$$serializer;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletSyncHistoryRequestApiModel;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.YearMonthJvmKt;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.IncompleteYearMonth;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.YearMonthFormat;
import kotlinx.datetime.format.YearMonthFormatKt;
import kotlinx.datetime.internal.format.AppendableFormatStructure;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15755a;

    public /* synthetic */ gp1(int i) {
        this.f15755a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15755a) {
            case 0:
                WalletMoneyAddedNavigationModel.Companion companion = WalletMoneyAddedNavigationModel.INSTANCE;
                return EnumsKt.b("app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus", LoadMoneyOrderStatus.values());
            case 1:
                WalletSceneArgs.Companion companion2 = WalletSceneArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.WalletSceneArgs", Reflection.a(WalletSceneArgs.class), new KClass[]{Reflection.a(WalletAllTransactionsArgs.class), Reflection.a(WalletBalanceArgs.class), Reflection.a(WalletLoadBalanceSuccessArgs.class), Reflection.a(WalletLoadMoneyArgs.class), Reflection.a(WalletTransactionSummaryArgs.class)}, new KSerializer[]{WalletAllTransactionsArgs$$serializer.f9344a, WalletBalanceArgs$$serializer.f9345a, WalletLoadBalanceSuccessArgs$$serializer.f9346a, WalletLoadMoneyArgs$$serializer.f9347a, WalletTransactionSummaryArgs$$serializer.f9348a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 2:
                WalletSetupConfiguration.Companion companion3 = WalletSetupConfiguration.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 3:
                WalletSyncHistoryRequestApiModel.Companion companion4 = WalletSyncHistoryRequestApiModel.Companion;
                return new ArrayListSerializer(QuickPayRequestApiModel$$serializer.f10968a);
            case 4:
                WalletTransactionSummaryNavigationModel.Companion companion5 = WalletTransactionSummaryNavigationModel.INSTANCE;
                return EnumsKt.b("app.chalo.walletframework.wallet.data.model.WalletTransactionType", WalletTransactionType.values());
            case 5:
                WalletTransactionUiModel.Companion companion6 = WalletTransactionUiModel.INSTANCE;
                return EnumsKt.b("app.chalo.walletframework.wallet.data.model.WalletTransactionType", WalletTransactionType.values());
            case 6:
                return DefaultWideNavigationRailOverride.INSTANCE;
            case 7:
                return DefaultModalWideNavigationRailOverride.INSTANCE;
            case 8:
                return UUID.randomUUID();
            case 9:
                return WindowAreaController.windowAreaController_delegate$lambda$1();
            case 10:
                return WindowInfoTracker.Companion.extensionBackend_delegate$lambda$2();
            case 11:
                IncompleteYearMonth incompleteYearMonth = YearMonthFormatKt.f17994a;
                YearMonthFormat.Builder builder = new YearMonthFormat.Builder(new AppendableFormatStructure());
                builder.t(Padding.ZERO);
                DateTimeFormatBuilderKt.b(builder, '-');
                builder.a(Padding.ZERO);
                return new YearMonthFormat(d.c(builder));
            default:
                Lazy lazy = YearMonthJvmKt.f17940a;
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
        }
    }
}
