package app.chalo.vault.vault;

import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import app.chalo.vault.Chalo_pay_tableQueries;
import app.chalo.vault.ConfigQueries;
import app.chalo.vault.KeystorageQueries;
import app.chalo.vault.Load_money_tableQueries;
import app.chalo.vault.Quick_pay_receipt_tableQueries;
import app.chalo.vault.Quick_pay_tableQueries;
import app.chalo.vault.Wallet_tableQueries;
import app.chalo.vault.Wallet_transaction_tableQueries;
import app.chalo.vault.chalo_vault;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/vault/chalo_vaultImpl;", "Lapp/cash/sqldelight/TransacterImpl;", "Lapp/chalo/vault/chalo_vault;", "Schema", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class chalo_vaultImpl extends TransacterImpl implements chalo_vault {
    public final Chalo_pay_tableQueries b;
    public final ConfigQueries c;
    public final KeystorageQueries d;
    public final Load_money_tableQueries e;
    public final Quick_pay_receipt_tableQueries f;
    public final Quick_pay_tableQueries g;
    public final Wallet_tableQueries h;
    public final Wallet_transaction_tableQueries i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lapp/chalo/vault/vault/chalo_vaultImpl$Schema;", "Lapp/cash/sqldelight/db/SqlSchema;", "Lapp/cash/sqldelight/db/QueryResult$Value;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Schema implements SqlSchema<QueryResult.Value<Unit>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Schema f10767a = new Schema();

        public static void c(SqlDriver sqlDriver, long j, long j2) {
            if (j <= 1 && j2 > 1) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS quick_pay_table (\n    status TEXT NOT NULL,\n    transactionId TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    qrCode TEXT,\n    soundTone TEXT,\n    activationTimeStamp INTEGER NOT NULL,\n    activationDuration INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    orderId TEXT NOT NULL,\n    punchTime INTEGER,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS load_money_table (\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    transactionId TEXT NOT NULL,\n    status TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_table (\n    userId TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    walletStatus TEXT NOT NULL,\n    balance INTEGER NOT NULL,\n    remainingLoadLimit INTEGER NOT NULL,\n    PRIMARY KEY(userId)\n)", null);
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_transaction_table (\n    transactionId TEXT NOT NULL,\n    transactionType TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionStatus TEXT NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
            }
            if (j <= 2 && j2 > 2) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS quick_pay_table_backup (\n    status TEXT NOT NULL,\n    transactionId TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    qrCode TEXT,\n    soundTone TEXT,\n    expiryTime INTEGER NOT NULL,\n    activationDuration INTEGER,\n    amount INTEGER NOT NULL,\n    orderId TEXT NOT NULL,\n    punchTime INTEGER,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
                sqlDriver.A0(null, "INSERT INTO quick_pay_table_backup SELECT status, transactionId, paymentMode, qrCode, soundTone, activationTimeStamp + activationDuration, activationDuration, amount, orderId, punchTime FROM quick_pay_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS quick_pay_table", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_table_backup RENAME TO quick_pay_table", null);
            }
            if (j <= 3 && j2 > 3) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS load_money_table_backup (\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    transactionId TEXT NOT NULL,\n    status TEXT NOT NULL,\n    paymentMode TEXT,\n    userId TEXT NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
                sqlDriver.A0(null, "INSERT INTO load_money_table_backup SELECT orderId, amount, transactionTime, transactionId, status, paymentMode, userId FROM load_money_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS load_money_table", null);
                sqlDriver.A0(null, "ALTER TABLE load_money_table_backup RENAME TO load_money_table", null);
            }
            if (j <= 4 && j2 > 4) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS keystorage (\n    validFrom INTEGER NOT NULL,\n    validTo INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    PRIMARY KEY(validFrom)\n)", null);
            }
            if (j <= 5 && j2 > 5) {
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN productReceiptPassengerDetails TEXT", null);
            }
            if (j <= 6 && j2 > 6) {
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN endStopId TEXT NOT NULL DEFAULT ''", null);
            }
            if (j <= 7 && j2 > 7) {
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN via TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN routeNamingScheme TEXT NOT NULL DEFAULT ''", null);
            }
            if (j <= 8 && j2 > 8) {
                sqlDriver.A0(null, "UPDATE quick_pay_receipt_table SET routeNamingScheme = 'DEFAULT' WHERE routeNamingScheme = ''", null);
            }
            if (j <= 9 && j2 > 9) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS chalo_pay_table (\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    transactionId TEXT NOT NULL,\n    status TEXT NOT NULL,\n    productType TEXT,\n    productName TEXT,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
            }
            if (j <= 10 && j2 > 10) {
                sqlDriver.A0(null, "ALTER TABLE wallet_table ADD COLUMN walletReclaimTime INTEGER", null);
            }
            if (j <= 11 && j2 > 11) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_table_backup (\n    userId TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    agency TEXT NOT NULL,\n    type TEXT NOT NULL,\n    walletStatus TEXT NOT NULL,\n    balance INTEGER NOT NULL,\n    remainingLoadLimit INTEGER NOT NULL,\n    walletReclaimTime INTEGER,\n    PRIMARY KEY(userId, type, agency)\n)", null);
                sqlDriver.A0(null, "INSERT INTO wallet_table_backup (\n    userId,\n    walletId,\n    agency,\n    type,\n    walletStatus,\n    balance,\n    remainingLoadLimit,\n    walletReclaimTime\n)\nSELECT\n    userId,\n    walletId,\n    '',\n    'SEMI_CLOSED',\n    walletStatus,\n    balance,\n    remainingLoadLimit,\n    walletReclaimTime\nFROM wallet_table", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS wallet_table", null);
                sqlDriver.A0(null, "ALTER TABLE wallet_table_backup RENAME TO wallet_table", null);
                sqlDriver.A0(null, "CREATE INDEX IF NOT EXISTS wallet_txn_order_type_time_idx\nON wallet_transaction_table(orderId, transactionType, transactionTime DESC)", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_table ADD COLUMN walletId TEXT NOT NULL DEFAULT ''", null);
                sqlDriver.A0(null, "UPDATE quick_pay_table\nSET walletId = COALESCE(\n    (\n        SELECT wallet_transaction_table.walletId\n        FROM wallet_transaction_table\n        WHERE wallet_transaction_table.orderId = quick_pay_table.orderId\n        AND wallet_transaction_table.transactionType = 'QUICK_PAY'\n        ORDER BY wallet_transaction_table.transactionTime DESC\n        LIMIT 1\n    ),\n    ''\n)", null);
                sqlDriver.A0(null, "ALTER TABLE load_money_table ADD COLUMN walletId TEXT NOT NULL DEFAULT ''", null);
                sqlDriver.A0(null, "UPDATE load_money_table\nSET walletId = COALESCE(\n    (\n        SELECT wallet_transaction_table.walletId\n        FROM wallet_transaction_table\n        WHERE wallet_transaction_table.orderId = load_money_table.orderId\n        AND wallet_transaction_table.transactionType = 'LOAD_MONEY'\n        ORDER BY wallet_transaction_table.transactionTime DESC\n        LIMIT 1\n    ),\n    ''\n)", null);
                sqlDriver.A0(null, "ALTER TABLE chalo_pay_table ADD COLUMN walletId TEXT NOT NULL DEFAULT ''", null);
                sqlDriver.A0(null, "UPDATE chalo_pay_table\nSET walletId = COALESCE(\n    (\n        SELECT wallet_transaction_table.walletId\n        FROM wallet_transaction_table\n        WHERE wallet_transaction_table.orderId = chalo_pay_table.orderId\n        AND wallet_transaction_table.transactionType = 'CHALO_PAY'\n        ORDER BY wallet_transaction_table.transactionTime DESC\n        LIMIT 1\n    ),\n    ''\n)", null);
                sqlDriver.A0(null, "DROP INDEX IF EXISTS wallet_txn_order_type_time_idx", null);
            }
            if (j <= 12 && j2 > 12) {
                sqlDriver.A0(null, "CREATE TABLE IF NOT EXISTS keystorage_backup (\n    validFrom INTEGER NOT NULL,\n    validTo INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    agency TEXT NOT NULL,\n    PRIMARY KEY(validFrom, agency)\n)", null);
                sqlDriver.A0(null, "INSERT INTO keystorage_backup (\n    validFrom,\n    validTo,\n    key,\n    agency\n)\nSELECT\n    validFrom,\n    validTo,\n    key,\n    ''\nFROM keystorage", null);
                sqlDriver.A0(null, "DROP TABLE IF EXISTS keystorage", null);
                sqlDriver.A0(null, "ALTER TABLE keystorage_backup RENAME TO keystorage", null);
            }
            if (j <= 13 && j2 > 13) {
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN depotName TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN etimGeneratedTicketId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN scheduleNumber TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN routeServiceType TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN driverId TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN waybillNo TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN etimVersion TEXT", null);
                sqlDriver.A0(null, "ALTER TABLE quick_pay_receipt_table ADD COLUMN receiptFareBreakup TEXT", null);
            }
            QueryResult.f706a.getClass();
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value a(SqlDriver driver, long j, long j2, AfterVersion[] callbacks) {
            Intrinsics.i(driver, "driver");
            Intrinsics.i(callbacks, "callbacks");
            ArrayList arrayList = new ArrayList();
            for (AfterVersion afterVersion : callbacks) {
                afterVersion.getClass();
                if (j <= 0 && 0 < j2) {
                    arrayList.add(afterVersion);
                }
            }
            Iterator it = CollectionsKt.v0(new chalo_vaultImpl$Schema$migratezeHU3Mk$$inlined$sortedBy$1(), arrayList).iterator();
            if (it.hasNext()) {
                ((AfterVersion) it.next()).getClass();
                c(driver, j, 1L);
                throw null;
            }
            if (j < j2) {
                c(driver, j, j2);
            }
            QueryResult.f706a.getClass();
            return new QueryResult.Value(Unit.f17538a);
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final QueryResult.Value b(SqlDriver driver) {
            Intrinsics.i(driver, "driver");
            driver.A0(null, "CREATE TABLE IF NOT EXISTS chalo_pay_table (\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionId TEXT NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    status TEXT NOT NULL,\n    productType TEXT,\n    productName TEXT,\n    walletId TEXT NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS config (\n    key TEXT NOT NULL,\n    value TEXT NOT NULL,\n    PRIMARY KEY(key)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS keystorage (\n    validFrom INTEGER NOT NULL,\n    validTo INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    agency TEXT NOT NULL,\n    PRIMARY KEY(validFrom, agency)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS load_money_table (\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    transactionId TEXT NOT NULL,\n    status TEXT NOT NULL,\n    paymentMode TEXT,\n    userId TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS quick_pay_receipt_table (\n    transactionId TEXT NOT NULL,\n    orderId TEXT NOT NULL,\n    punchTime INTEGER NOT NULL,\n    amount INTEGER NOT NULL,\n    vehicleNo TEXT NOT NULL,\n    conductorId TEXT NOT NULL,\n    startStop TEXT NOT NULL,\n    endStop TEXT NOT NULL,\n    routeName TEXT NOT NULL,\n    endStopId TEXT NOT NULL,\n    productReceiptPassengerDetails TEXT,\n    via TEXT,\n    routeNamingScheme TEXT NOT NULL,\n    depotName TEXT,\n    etimGeneratedTicketId TEXT,\n    scheduleNumber TEXT,\n    routeServiceType TEXT,\n    driverId TEXT,\n    waybillNo TEXT,\n    etimVersion TEXT,\n    receiptFareBreakup TEXT,\n    PRIMARY KEY(transactionId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS quick_pay_table (\n    status TEXT NOT NULL,\n    transactionId TEXT NOT NULL,\n    paymentMode TEXT NOT NULL,\n    qrCode TEXT,\n    soundTone TEXT,\n    expiryTime INTEGER NOT NULL,\n    activationDuration INTEGER,\n    amount INTEGER NOT NULL,\n    orderId TEXT NOT NULL,\n    punchTime INTEGER,\n    walletId TEXT NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_table (\n    userId TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    agency TEXT NOT NULL,\n    type TEXT NOT NULL,\n    walletStatus TEXT NOT NULL,\n    balance INTEGER NOT NULL,\n    remainingLoadLimit INTEGER NOT NULL,\n    walletReclaimTime INTEGER,\n    PRIMARY KEY(userId, type, agency)\n)", null);
            driver.A0(null, "CREATE TABLE IF NOT EXISTS wallet_transaction_table (\n    transactionId TEXT NOT NULL,\n    transactionType TEXT NOT NULL,\n    walletId TEXT NOT NULL,\n    userId TEXT NOT NULL,\n    orderId TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    transactionStatus TEXT NOT NULL,\n    transactionTime INTEGER NOT NULL,\n    PRIMARY KEY(transactionId, orderId)\n)", null);
            QueryResult.f706a.getClass();
            return new QueryResult.Value(Unit.f17538a);
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public final long getVersion() {
            return 14L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chalo_vaultImpl(SqlDriver driver) {
        super(driver);
        Intrinsics.i(driver, "driver");
        this.b = new Chalo_pay_tableQueries(driver);
        this.c = new ConfigQueries(driver);
        this.d = new KeystorageQueries(driver);
        this.e = new Load_money_tableQueries(driver);
        this.f = new Quick_pay_receipt_tableQueries(driver);
        this.g = new Quick_pay_tableQueries(driver);
        this.h = new Wallet_tableQueries(driver);
        this.i = new Wallet_transaction_tableQueries(driver);
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: J, reason: from getter */
    public final Chalo_pay_tableQueries getB() {
        return this.b;
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: L, reason: from getter */
    public final Wallet_transaction_tableQueries getI() {
        return this.i;
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: R, reason: from getter */
    public final Load_money_tableQueries getE() {
        return this.e;
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Quick_pay_receipt_tableQueries getF() {
        return this.f;
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: n, reason: from getter */
    public final KeystorageQueries getD() {
        return this.d;
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: q, reason: from getter */
    public final ConfigQueries getC() {
        return this.c;
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: r, reason: from getter */
    public final Wallet_tableQueries getH() {
        return this.h;
    }

    @Override // app.chalo.vault.chalo_vault
    /* JADX INFO: renamed from: u, reason: from getter */
    public final Quick_pay_tableQueries getG() {
        return this.g;
    }
}
